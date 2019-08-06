package com.entrepreneurlist.schooldatamanagementproject;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private de.hdodenhof.circleimageview.CircleImageView mProfileImage;
    private Button chooseImageButton;
    private EditText Name;
    private EditText Surname;
    private EditText NameOfSchool;
    private EditText SchoolCode;
    private EditText StudentsAdmissionNumber;
    private EditText userName;
    private EditText password;
    private EditText confirmPassword;
    private CheckBox termsAndCondition;
    private Button signUp;
    private Button login1;
    final static int PICK_IMAGE_REQUEST_CODE = 1;
    private Uri imageUri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    mProfileImage = (de .hdodenhof.circleimageview.CircleImageView)findViewById(R.id.iv_mProfile_id);
   chooseImageButton =(Button)findViewById(R.id.bt_choose_image_id);
    chooseImageButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            chooseImage();
        }
    });


    login1 = (Button)findViewById(R.id.bt_login_1_id);
    login1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Login();
        }
    });


   }

    private void Login() {
        Intent  loginIntent =  new Intent(this, LoginActivity.class);
        startActivity(loginIntent);
    }

    private void chooseImage() {
        Intent intentChooseImage = new Intent();
        intentChooseImage.setType("image/*");
        intentChooseImage.setAction(intentChooseImage.ACTION_GET_CONTENT);
        startActivityForResult(intentChooseImage, PICK_IMAGE_REQUEST_CODE);


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == PICK_IMAGE_REQUEST_CODE && resultCode == RESULT_OK && data !=null && data.getData() !=null);
        imageUri = data.getData();
        mProfileImage.setImageURI(imageUri);


    }


}
