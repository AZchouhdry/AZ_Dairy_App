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

public class LoginActivity extends AppCompatActivity {

    EditText logmal;
    EditText logpass;
    TextView txt;
    Button lgtodash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //logmal = findViewById(R.id.lognam);
        //logpass = findViewById(R.id.logpass);

        lgtodash = findViewById(R.id.btn);
        lgtodash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //String emailtext = logmal.getText().toString();
                //String passtext = logpass.getText().toString();

                //FirebaseAuth.getInstance().signInWithEmailAndPassword(emailtext,passtext).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                  //  @Override
                   // public void onComplete(@NonNull Task<AuthResult> task) {
                     //   if(task.isSuccessful())
                      //  {
                      //      Toast.makeText(LoginActivity.this, "Succesfully Registered", Toast.LENGTH_SHORT).show();
                      //  }
                      //  else
                      //  {
                      ///      Toast.makeText(LoginActivity.this, "Registeration Failed", Toast.LENGTH_SHORT).show();
                      //  }
                  //  }
               // });

                Intent intent= new Intent(LoginActivity.this, Dashboard.class);
                startActivity(intent);
            }
        });

        //ye wo text wala h
        txt = findViewById(R.id.textView4);
        txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, Activity_Signup.class);
                startActivity(intent);
            }
        });
    }
}