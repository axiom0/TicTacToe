package com.axiom.tictactoe;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Board extends AppCompatActivity {
    protected String TAG = "LOG-D";
    protected int[] boardIDs = {  R.id.board00,R.id.board01,R.id.board02,
            R.id.board10,R.id.board11,R.id.board12,
            R.id.board20,R.id.board21,R.id.board22  };
    protected TicTacToe ttt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ttt = new TicTacToe();
    }

    protected void setImage(int boardID, int side) {
        if (side == TicTacToe.RED) {
            ((ImageView) findViewById(boardID)).setImageResource(R.drawable.circle);
        } else if (side == TicTacToe.BLUE) {
            ((ImageView) findViewById(boardID)).setImageResource(R.drawable.cross);
        } else {
            ((ImageView) findViewById(boardID)).setImageResource(R.drawable.empty);
        }
    }


    protected boolean checkEnd(){
        boolean end = false;
        int flag = ttt.checkBoardFlag();
        if(flag==TicTacToe.WIN_RED || flag==TicTacToe.WIN_BLUE || flag == TicTacToe.DRAW){
            showResult(flag);
            end = true;
        }
        if(ttt.turnCount%2==0){
            ((TextView)findViewById(R.id.countLabal)).setText(R.string.sideRed);
        }else{
            ((TextView)findViewById(R.id.countLabal)).setText(R.string.sideBlue);
        }
        return end;
    }

    protected void showResult(int flag){
        Log.d(TAG, "Result: "+flag);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        if(flag==TicTacToe.WIN_RED){
            builder.setMessage(R.string.result_message_red);
        }else if(flag==TicTacToe.WIN_BLUE){
            builder.setMessage(R.string.result_message_blue);
        }else{
            builder.setMessage(R.string.result_message_draw);
        }
        builder.setPositiveButton(R.string.new_game, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int j) {
                resetBoard();
            }
        });
        builder.setNegativeButton(R.string.back2menu, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int j) {
                moveToStart();
            }
        });
        builder.show();
    }

    protected void resetBoard(){
        ttt = new TicTacToe();
        ((TextView)findViewById(R.id.countLabal)).setText(R.string.sideRed);
        for(int i=0;i<9;i++){
            ((ImageView)findViewById(boardIDs[i])).setImageResource(R.drawable.empty);
        }
    }

    private void moveToStart(){
        Intent intent = new Intent(getApplicationContext(), StartActivity.class);
        startActivity(intent);
    }


    protected void onClick(int ID, int position){
        Log.d(TAG, "Board/onClick" + position);
    }

    /*onClick methods 00 to 22 */
    public void onClick00(View view){
        onClick(R.id.board00,0);
    }

    public void onClick01(View view){
        onClick(R.id.board01,1);
    }
    public void onClick02(View view){
        onClick(R.id.board02,2);
    }
    public void onClick10(View view){
        onClick(R.id.board10,3);
    }
    public void onClick11(View view){
        onClick(R.id.board11,4);
    }
    public void onClick12(View view){
        onClick(R.id.board12,5);
    }
    public void onClick20(View view){
        onClick(R.id.board20,6);
    }
    public void onClick21(View view){
        onClick(R.id.board21,7);
    }
    public void onClick22(View view){
        onClick(R.id.board22,8);
    }


}