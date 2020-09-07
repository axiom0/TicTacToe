package com.axiom.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class CpuActivity extends Board {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    protected void onClick(int ID,int position){
        super.onClick(ID,position);

    }
}