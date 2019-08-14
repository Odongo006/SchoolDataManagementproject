package com.entrepreneurlist.schooldatamanagementproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class schoolLogin extends AppCompatActivity {
    private Button schoolLogin2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_school_login2);
        schoolLogin2 = (Button)findViewById(R.id.bt_login_as_school2_id);
        schoolLogin2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                takeToEnterResults();
            }
        });
    }

    private void takeToEnterResults() {
        Intent intentTakeToEnterResults = new Intent(this, studentResulsts.class);
        startActivity(intentTakeToEnterResults);
    }
}
