package com.example.scorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.scorekeeper.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    int pointA = 0;
    int PointB = 0;
    private ActivityMainBinding a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActivityMainBinding a = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(a.getRoot());
        a.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pointA += 3;
                a.textView3.setText(pointA + "");
            }
        });
        a.button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pointA += 2;
                a.textView3.setText(pointA + "");
            }
        });
        a.button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pointA += 1;
                a.textView3.setText(pointA + "");
            }
        });
        a.button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PointB += 3;
                a.textView4.setText(PointB + "");
            }
        });
        a.button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PointB += 2;
                a.textView4.setText(PointB + "");
            }
        });
        a.button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PointB += 1;
                a.textView4.setText(PointB + "");
            }
        });
        a.button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showWinner();
            }
        });

    }

    public void showWinner() {
        int scoreDiff = pointA - PointB;
        TextView WinTeam=findViewById(R.id.textView5);
        if (scoreDiff > 0) {
            WinTeam.setText("Team A"+" wins by " + scoreDiff+" points ");
        }
        else if(scoreDiff==0){
            WinTeam.setText("Match tied");
        }
        else {
            WinTeam.setText("Team B"+" wins by " + Math.abs(scoreDiff)+" points ");
        }
    }

}