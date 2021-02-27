package com.example.azdairyapp;

import androidx.appcompat.app.AppCompatActivity;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button logn;
    private Button sign;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i("MainActivity","onCreate called MainActivity");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("MainActivity","view done");
        logn = findViewById(R.id.loginBtn);
        Log.i("MainActivity","onCreate login button");
        logn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("MainActivity","onCreate-> onClick listerner");
                Intent intent= new Intent(MainActivity.this, LoginActivity.class);
                Log.i("MainActivity","onCreate -> intent created" +
                        "");
                startActivity(intent);
            }
        });

        sign = findViewById(R.id.signBtn);
        Log.i("MainActivity","onCreate login button");
        sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("MainActivity","onCreate-> onClick listerner");
                Intent intent= new Intent(MainActivity.this, Activity_Signup.class);
                Log.i("MainActivity","onCreate -> intent created" +
                        "");
                startActivity(intent);
            }
        });
    }
}
