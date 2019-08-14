package com.entrepreneurlist.schooldatamanagementproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class studentProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_profile);
    }

    public static class RegisterSchool extends AppCompatActivity {
        private Button registerSchool;
        private Button loginSchoolButton;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_register_school);
            loginSchoolButton = (Button)findViewById(R.id.bt_login_school_button_id);

            loginSchoolButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    loginSchoolbt();
                }
            });




                }

        private void loginSchoolbt() {
            Intent intentTakeToResults = new Intent(this,schoolLogin.class);
            startActivity(intentTakeToResults);
        }


    }
}
