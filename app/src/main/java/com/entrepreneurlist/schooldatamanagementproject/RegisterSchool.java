package com.entrepreneurlist.schooldatamanagementproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class RegisterSchool extends AppCompatActivity {
    private Button loginSchoolButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_school);
        loginSchoolButton = (Button)findViewById(R.id.bt_register_as_school_id);

    }
}
