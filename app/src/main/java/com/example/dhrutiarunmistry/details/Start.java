package com.example.dhrutiarunmistry.details;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class Start extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

    }

    public void avalon(View view) {
        Intent ui =new Intent(Start.this,Aboutus.class);
        startActivity(ui);

    }

    public void asian(View view) {

    }

    public void citi(View view) {

    }

    public void india(View view) {

    }

    public void jet(View view) {

    }

    public void cap(View view) {

    }
}
