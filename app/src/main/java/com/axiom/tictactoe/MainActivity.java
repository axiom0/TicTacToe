package com.axiom.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private String TAG = "LOG-D";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick00(View view){
        Log.d(TAG, "MainActivity/onClick00");
    }

    public void onClick01(View view){
        Log.d(TAG, "MainActivity/onClick01");

    }
    public void onClick02(View view){
        Log.d(TAG, "MainActivity/onClick02");

    }
    public void onClick10(View view){
        Log.d(TAG, "MainActivity/onClick10");

    }
    public void onClick11(View view){
        Log.d(TAG, "MainActivity/onClick11");

    }
    public void onClick12(View view){
        Log.d(TAG, "MainActivity/onClick12");

    }
    public void onClick20(View view){
        Log.d(TAG, "MainActivity/onClick20");

    }
    public void onClick21(View view){
        Log.d(TAG, "MainActivity/onClick21");

    }
    public void onClick22(View view){
        Log.d(TAG, "MainActivity/onClick22");

    }


}