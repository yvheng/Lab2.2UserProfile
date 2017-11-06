package com.example.taruc.lab22userprofile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ProfileActivity extends AppCompatActivity {
    private EditText editTextID, editTextEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        editTextID = (EditText)findViewById(R.id.editTextID);
        editTextEmail = (EditText)findViewById(R.id.editTextEmail);
    }

    public void saveButton(View v){
        Intent intent = new Intent();
        String userID, email;

        userID = editTextID.getText().toString();
        email = editTextEmail.getText().toString();

        intent.putExtra(MainActivity.USER_ID, userID);
        intent.putExtra(MainActivity.USER_EMAIL, email);

        setResult(MainActivity.REQUEST_PROFILE_UPDATE, intent);
        finish();
    }
}
