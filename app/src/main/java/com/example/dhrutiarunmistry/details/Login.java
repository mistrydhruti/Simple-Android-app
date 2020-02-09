package com.example.dhrutiarunmistry.details;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
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

public class Login extends AppCompatActivity {
    EditText email1,pass;
    Button login;
    TextView regist;
    private FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        email1 = (EditText) findViewById(R.id.email1);
        pass = (EditText) findViewById(R.id.pass);
        regist = (TextView) findViewById(R.id.regist);
        login = (Button) findViewById(R.id.login);
        auth = FirebaseAuth.getInstance();
    }

    public void login(View view) {
        String semail = email1.getText().toString();
        String spassword = pass.getText().toString();
        auth.signInWithEmailAndPassword(semail,spassword)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful())
                        {
                            Toast.makeText(Login.this,"Login successful",Toast.LENGTH_SHORT).show();
                            Intent rt = new Intent(Login.this,SecondActivity.class);
                            startActivity(rt);
                        }
                        else
                        {
                            Toast.makeText(Login.this,"Login unsuccessful",Toast.LENGTH_SHORT).show();
                        }
                    }
                });

    }

    public void regist(View view) {
        Intent register = new Intent(Login.this,Registration.class);
        startActivity(register);
    }
}
