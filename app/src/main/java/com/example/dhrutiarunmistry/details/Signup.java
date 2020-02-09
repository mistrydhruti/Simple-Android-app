package com.example.dhrutiarunmistry.details;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.List;

public class Signup extends AppCompatActivity {
    EditText name, mobile, email, dob, uid, address;
    Button button;
    private Student student;
    FirebaseDatabase database;
    DatabaseReference ref;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        name = (EditText) findViewById(R.id.name);
        mobile = (EditText) findViewById(R.id.mobile);
        email = (EditText) findViewById(R.id.email);
        dob = (EditText) findViewById(R.id.dob);
        uid = (EditText) findViewById(R.id.uid);
        address = (EditText) findViewById(R.id.address);

        student = new Student();
        database =FirebaseDatabase.getInstance();
        ref = database.getReference().child("Student");



    }

    public void button(View view) {

        EditText[] allFields = { name, mobile, email, dob,uid,address};
        List<EditText> ErrorFields =new ArrayList<EditText>();//empty Edit text arraylist
        for(EditText edit : allFields){
            if(TextUtils.isEmpty(edit.getText())){

                // EditText was empty
                ErrorFields.add(edit);//add empty Edittext only in this ArayList
                for(int i = 0; i < ErrorFields.size(); i++)
                {
                    EditText currentField = ErrorFields.get(i);
                    currentField.setError("this field required");
                    currentField.requestFocus();
                }
            }
        }
        student.setName(name.getText().toString());
        student.setMobile(mobile.getText().toString());
        student.setEmail(email.getText().toString());
        student.setDob(dob.getText().toString());
        student.setUid(uid.getText().toString());
        student.setAddress(address.getText().toString());


            ref.child(student.getUid()).setValue(student).addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {
                if(TextUtils.isEmpty(name.getText()) || TextUtils.isEmpty(email.getText()) || TextUtils.isEmpty(mobile.getText()) || TextUtils.isEmpty(dob.getText()) || TextUtils.isEmpty(uid.getText()) || TextUtils.isEmpty(address.getText()))
                {
                    Toast.makeText(Signup.this, "please enter your details", Toast.LENGTH_SHORT).show();
                }

                else if(task.isSuccessful())
                {
                    Toast.makeText(Signup.this, "registered successfully", Toast.LENGTH_SHORT).show();
                    Intent next = new Intent(Signup.this, Cgpa.class);
                    startActivity(next);

                }
                else
                {
                    Toast.makeText(Signup.this,"please try again",Toast.LENGTH_SHORT).show();

                }
            }
        });


    }


    public void onBackPressed() {
        super.onBackPressed();
        this.finish();
    }


}
