package com.axiom.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.Timer;

public class CpuActivity extends Board {
    private int playerTurn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playerTurn = getIntent().getIntExtra("PL_TURN", TicTacToe.RED);

        initCpu();
    }


    @Override
    protected void onClick(int ID,int position){
        super.onClick(ID,position);
        if(playerTurn == ttt.side){
            setImage(ID,ttt.updateBoard(position));
            if(!checkEnd()){
                int cpu = ttt.randomCpu();
                setImage(boardIDs[cpu], ttt.updateBoard(cpu));
                checkEnd();
            }
        }
    }

    protected void resetBoard(){
        super.resetBoard();
        initCpu();
    }

    private void initCpu(){
        if(playerTurn == TicTacToe.BLUE){
            int cpu = ttt.randomCpu();
            setImage(boardIDs[cpu], ttt.updateBoard(cpu));
        }
    }
}