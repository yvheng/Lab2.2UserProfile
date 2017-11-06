package com.example.taruc.lab22userprofile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final int REQUEST_PROFILE_UPDATE = 1;
    public static final String USER_ID = "MainActivity.ID";
    public static final String USER_EMAIL = "MainActivity.EMAIL";
    private TextView textViewID, textViewEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewID = (TextView)findViewById(R.id.textViewID);
        textViewEmail = (TextView)findViewById(R.id.textViewEmail);
    }

    public void editProfile(View v){
        Intent intent = new Intent(this, ProfileActivity.class);
        startActivityForResult(intent, REQUEST_PROFILE_UPDATE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == REQUEST_PROFILE_UPDATE){
            String userID, email;
            userID = data.getStringExtra(USER_ID);
            email = data.getStringExtra(USER_EMAIL);

            textViewID.setText(getString(R.string.userid)+" "+userID);
            textViewEmail.setText(getString(R.string.email)+" "+email);
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MainActivity","onPause");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MainActivity","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MainActivity","onResume");
    }
}
