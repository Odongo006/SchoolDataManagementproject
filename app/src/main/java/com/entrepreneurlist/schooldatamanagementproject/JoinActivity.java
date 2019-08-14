package com.entrepreneurlist.schooldatamanagementproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class JoinActivity extends AppCompatActivity {
    private Button asSchool;
    private Button asParent;
    private Button asStudent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join);

        asSchool = (Button)findViewById(R.id.bt_register_as_school_id);
        asSchool.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                registerAsSchool();
            }
        });

        asParent = (Button)findViewById(R.id.bt_register_as_parent);
        asParent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                registerAsParent();
            }
        });
        asStudent = (Button)findViewById(R.id.bt_register_as_student_id);
        asStudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                registerAsStudent();
            }
        });

    }

    private void registerAsStudent() {
        Intent intentRegisterAsStudent = new Intent(this,MainActivity.class);
        startActivity(intentRegisterAsStudent);
    }

    private void registerAsParent() {
        Intent intentRegisterAsParent = new Intent(this, RegisterAsParent.class);
        startActivity(intentRegisterAsParent);
    }

    private void registerAsSchool() {
        Intent intentRegisterSchool = new Intent(this, studentProfileActivity.RegisterSchool.class);
        startActivity(intentRegisterSchool);
    }

}
