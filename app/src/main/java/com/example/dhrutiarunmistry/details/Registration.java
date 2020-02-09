package com.example.dhrutiarunmistry.details;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthException;

public class Registration extends AppCompatActivity {
    private FirebaseAuth auth;
    EditText em, pass1,nm;
    Button reg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        auth = FirebaseAuth.getInstance();
        em = (EditText) findViewById(R.id.em);
        pass1 = (EditText) findViewById(R.id.pass1);
        nm = (EditText) findViewById(R.id.nm);
        reg = (Button) findViewById(R.id.reg);
    }

    public void reg(View view) {
        auth.createUserWithEmailAndPassword(em.getText().toString(),pass1.getText().toString())
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            Toast.makeText(Registration.this, "user created succesfully", Toast.LENGTH_SHORT).show();
                            Intent ut = new Intent(Registration.this,Login.class);
                            startActivity(ut);
                        } else
                        {
                            Toast.makeText(Registration.this, "signUp unsuccesful", Toast.LENGTH_SHORT).show();
                            FirebaseAuthException e = (FirebaseAuthException )task.getException();
                            Toast.makeText(Registration.this, "Failed Registration: "+e.getMessage(), Toast.LENGTH_SHORT).show();
                            Log.e("LoginActivity", "Failed Registration", e);
                        }

                    }


                });
    }
}
