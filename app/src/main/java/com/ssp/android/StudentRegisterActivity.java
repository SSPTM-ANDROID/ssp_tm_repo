package com.ssp.android;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.ToggleButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class StudentRegisterActivity extends AppCompatActivity {
    CheckBox cricket, chess, carrom;
    ToggleButton genderToggle;
    RadioGroup reservationRadioGroup;
    RadioButton selectedReservationRadioBtn;
    Button submitStudentRegisterBtn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.student_register_actvitiy);
        cricket = findViewById(R.id.cricket);
        chess = findViewById(R.id.chess);
        carrom = findViewById(R.id.carrams);
        genderToggle = findViewById(R.id.studnetGender);
        reservationRadioGroup = findViewById(R.id.studnetReservation);
        submitStudentRegisterBtn = findViewById(R.id.studentRegBtn);

        //Listener creation
        cricket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Job of your listner
                if (cricket.isChecked()) {
                    Toast checkBoxToast = Toast.makeText(getApplicationContext(), "Your Hobby Is :" + cricket.getText(), Toast.LENGTH_SHORT);
                    checkBoxToast.show();
                }

            }
        });

        //listener creation for gender
        genderToggle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (genderToggle.getText().equals("YES")) {
                    Toast taggleToast = Toast.makeText(getApplicationContext(), "Hi Sir!", Toast.LENGTH_SHORT);
                    taggleToast.show();
                } else {
                    Toast taggleToast = Toast.makeText(getApplicationContext(), "Hi MAM!", Toast.LENGTH_SHORT);
                    taggleToast.show();
                }

            }
        });


        reservationRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                System.out.println("Entered into : reservationRadioGroup");
                int reservationId = reservationRadioGroup.getCheckedRadioButtonId();
                selectedReservationRadioBtn = findViewById(reservationId);
                Toast reservationToast = Toast.makeText(getApplicationContext(), "Your Reservation Is" + selectedReservationRadioBtn.getText(), Toast.LENGTH_LONG);
                reservationToast.show();

            }
        });

        submitStudentRegisterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent confirmationPage = new Intent(getApplicationContext(), StudentConfirmationActivity.class);
                startActivity(confirmationPage);
            }
        });
    }
}
