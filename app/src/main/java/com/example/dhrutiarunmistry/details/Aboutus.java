package com.example.dhrutiarunmistry.details;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Aboutus extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutus);

    }



   /* public void button3(View view) {
        Intent tew = new Intent(Aboutus.this,cards.class);
        startActivity(tew);
        finish();

    }}*/
   public void onBackPressed()
   {
       Intent ty =  new Intent(Aboutus.this,SecondActivity.class);
       startActivity(ty);
       finish();
   }
}


