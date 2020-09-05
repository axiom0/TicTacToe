package com.axiom.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private String TAG = "LOG-D";
    public TicTacToe ttt = new TicTacToe();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void setImage(int boardID, int side){
        if(side == TicTacToe.RED){
            ((ImageView)findViewById(boardID)).setImageResource(R.drawable.circle);
        }else if(side == TicTacToe.BLUE){
            ((ImageView)findViewById(boardID)).setImageResource(R.drawable.cross);
        }else{
            ((ImageView)findViewById(boardID)).setImageResource(R.drawable.empty);
        }
        int flag = ttt.checkBoardFlag();
        if(flag==TicTacToe.WIN_RED || flag==TicTacToe.WIN_BLUE || flag == TicTacToe.DRAW){
            showResult(flag);
        }
        if(ttt.turns%2==0){
            ((TextView)findViewById(R.id.countLabal)).setText(R.string.sideRed);
        }else{
            ((TextView)findViewById(R.id.countLabal)).setText(R.string.sideBlue);
        }
    }

    private void showResult(int flag){
        Log.d(TAG, "Result: "+flag);
    }


    /*onClick methods 00 to 22 */
    public void onClick00(View view){
        Log.d(TAG, "MainActivity/onClick00");
        int position = 0;
        setImage(R.id.board00,ttt.updateBoard(position));
    }

    public void onClick01(View view){
        Log.d(TAG, "MainActivity/onClick01");
        int position = 1;
        setImage(R.id.board01,ttt.updateBoard(position));
    }
    public void onClick02(View view){
        Log.d(TAG, "MainActivity/onClick02");
        int position = 2;
        setImage(R.id.board02,ttt.updateBoard(position));
    }
    public void onClick10(View view){
        Log.d(TAG, "MainActivity/onClick10");
        int position = 3;
        setImage(R.id.board10,ttt.updateBoard(position));
    }
    public void onClick11(View view){
        Log.d(TAG, "MainActivity/onClick11");
        int position = 4;
        setImage(R.id.board11,ttt.updateBoard(position));
    }
    public void onClick12(View view){
        Log.d(TAG, "MainActivity/onClick12");
        int position = 5;
        setImage(R.id.board12,ttt.updateBoard(position));
    }
    public void onClick20(View view){
        Log.d(TAG, "MainActivity/onClick20");
        int position = 6;
        setImage(R.id.board20,ttt.updateBoard(position));
    }
    public void onClick21(View view){
        Log.d(TAG, "MainActivity/onClick21");
        int position = 7;
        setImage(R.id.board21,ttt.updateBoard(position));
    }
    public void onClick22(View view){
        Log.d(TAG, "MainActivity/onClick22");
        int position = 8;
        setImage(R.id.board22,ttt.updateBoard(position));
    }


}