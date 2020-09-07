package com.axiom.tictactoe;

import android.os.Bundle;
import android.util.Log;

public class OfflineActivity extends Board {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    protected void onClick(int ID, int position){
        super.onClick(ID,position);
        setImage(ID,ttt.updateBoard(position));
        checkEnd();
    }
}