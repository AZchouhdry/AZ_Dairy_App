package com.example.azdairyapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Activity_Signup extends AppCompatActivity {


    EditText pass;
    EditText email;
    private Button buton;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__signup);

        //yhn idea mngwain hn
        email = findViewById(R.id.emal);
        pass = findViewById(R.id.pass);
        buton = findViewById(R.id.appcrashnakrwa);
        buton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String emailtext = email.getText().toString();
                String passtext = pass.getText().toString();

                FirebaseAuth.getInstance().createUserWithEmailAndPassword(emailtext, passtext).addOnCompleteListener(Activity_Signup.this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful())
                        {
                            Toast.makeText(Activity_Signup.this, "Succesfully Registered", Toast.LENGTH_SHORT).show();
                        }
                        else
                        {
                            Toast.makeText(Activity_Signup.this, "Registeration Failed", Toast.LENGTH_SHORT).show();
                        }
                    }
                });


            }
        });
        //ye sign up wala button ki working h bc app crash krwa rha h




        //aakhri text wala area h ye
        txt = findViewById(R.id.textView3);
        txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_Signup.this, LoginActivity .class);
                startActivity(intent);
            }

        });

    }
}