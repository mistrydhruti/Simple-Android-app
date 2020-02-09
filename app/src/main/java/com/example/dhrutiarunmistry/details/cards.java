package com.example.dhrutiarunmistry.details;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.GridLayout;

public class cards extends AppCompatActivity {
    GridLayout maingrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cards);

        maingrid = (GridLayout) findViewById(R.id.maingrid);
        setSingleEvent(maingrid);
    }


    private void setSingleEvent(GridLayout maingrid) {
        for (int i = 0; i < maingrid.getChildCount(); i++) {
            CardView cardView = (CardView) maingrid.getChildAt(i);
            final int FinalI = i;
            if (i == 0) {
                cardView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent(cards.this,asianpaints.class);
                        startActivity(intent);
                    }

                });
            }
            else if (i == 1) {
                cardView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent(cards.this,avalon.class);
                        startActivity(intent);
                    }

                });
            }

            else if (i == 2) {
                cardView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent(cards.this,bluestar.class);
                        startActivity(intent);
                    }

                });
            }
            else if (i == 3) {
                cardView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent(cards.this,capitalfirst.class);
                        startActivity(intent);
                    }

                });
            }
            else if (i == 4) {
                cardView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent(cards.this,citi.class);
                        startActivity(intent);
                    }

                });
            }
            else if (i == 5) {
                cardView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent(cards.this,indiabulls.class);
                        startActivity(intent);
                    }

                });
            }

        }
    }

}


