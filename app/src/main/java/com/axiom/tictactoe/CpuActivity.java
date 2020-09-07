package com.axiom.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class CpuActivity extends Board {
    private int playerTurn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playerTurn = getIntent().getIntExtra("PL_TURN", TicTacToe.RED);
    }


    @Override
    protected void onClick(int ID,int position){
        super.onClick(ID,position);


    }
}