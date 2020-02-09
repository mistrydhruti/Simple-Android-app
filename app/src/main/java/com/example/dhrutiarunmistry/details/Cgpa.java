package com.example.dhrutiarunmistry.details;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Cgpa extends AppCompatActivity {
    EditText sem1, sem2, sem3, sem4, sem5, sem6;
    Button calculate;
    double marks = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cgpa);

        sem1 = (EditText) findViewById(R.id.sem1);
        sem2 = (EditText) findViewById(R.id.sem2);
        sem3 = (EditText) findViewById(R.id.sem3);
        sem4 = (EditText) findViewById(R.id.sem4);
        sem5 = (EditText) findViewById(R.id.sem5);
        sem6 = (EditText) findViewById(R.id.sem6);
        calculate = (Button) findViewById(R.id.calculate);
    }

    public void calculate(View view) {

        double a = Double.parseDouble(sem1.getText().toString());
        double b =  Double.parseDouble(sem2.getText().toString());
        double c =  Double.parseDouble(sem3.getText().toString());
        double d =  Double.parseDouble(sem4.getText().toString());
        double e =  Double.parseDouble(sem5.getText().toString());
        double f =  Double.parseDouble(sem6.getText().toString());


        String aaa = check(a);
        String bbb = check(b);
        String ccc = check(c);
        String ddd = check(d);
        String eee = check(e);
        String fff = check(f);

        if (aaa.equals("F") || bbb.equals("F") || ccc.equals("F") || ddd.equals("F") || eee.equals("F") || fff.equals("F")) {
            Toast.makeText(Cgpa.this, "Reapperance required", Toast.LENGTH_SHORT).show();

        } else {
            Toast.makeText(Cgpa.this, "congratulations you cleared all subjects", Toast.LENGTH_SHORT).show();

        }

        marks = (a + b + c + d + e + f) / 7;
        Toast.makeText(Cgpa.this, "your average cgpa is" + marks, Toast.LENGTH_LONG).show();
        Intent pre = new Intent(Cgpa.this,Aboutus.class);
        startActivity(pre);

    }


    private String check(Double n) {
        if (n >= 3.75 && n <= 4.0) {
            return "O";
        }
        if (n >= 3.5 && n <= 3.60) {
            return "A";
        }
        if (n >= 2.0 && n <= 3.4) {
            return "B";
        }
        if (n >= 1.5 && n < 2.0) {
            return "C";
        }
        if (n >= 1.0 && n < 1.5) {
            return "D";
        }
        if (n < 1.0) {
            return "F";
        }
        return "n";

    }
}