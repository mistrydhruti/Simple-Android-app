package com.example.dhrutiarunmistry.details;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class asianpaints extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asianpaints);
        findViewById(R.id.textView3).setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                clicked_btn("https://www.asianpaints.com");
            }
        });
    }

    private void clicked_btn(String url) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }


}
