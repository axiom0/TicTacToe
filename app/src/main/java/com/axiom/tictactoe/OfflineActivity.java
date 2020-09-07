package com.axiom.tictactoe;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class OfflineActivity extends AppCompatActivity {
    private String TAG = "LOG-D";
    private int[] boardIDs = {  R.id.board00,R.id.board01,R.id.board02,
                                R.id.board10,R.id.board11,R.id.board12,
                                R.id.board20,R.id.board21,R.id.board22  };
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
        builder.show();
    }

    private void resetBoard(){
        ttt = new TicTacToe();
        ((TextView)findViewById(R.id.countLabal)).setText(R.string.sideRed);
        for(int i=0;i<9;i++){
            ((ImageView)findViewById(boardIDs[i])).setImageResource(R.drawable.empty);
        }
    }


    /*onClick methods 00 to 22 */
    public void onClick00(View view){
        Log.d(TAG, "OfflineActivity/onClick00");
        int position = 0;
        setImage(R.id.board00,ttt.updateBoard(position));
    }

    public void onClick01(View view){
        Log.d(TAG, "OfflineActivity/onClick01");
        int position = 1;
        setImage(R.id.board01,ttt.updateBoard(position));
    }
    public void onClick02(View view){
        Log.d(TAG, "OfflineActivity/onClick02");
        int position = 2;
        setImage(R.id.board02,ttt.updateBoard(position));
    }
    public void onClick10(View view){
        Log.d(TAG, "OfflineActivity/onClick10");
        int position = 3;
        setImage(R.id.board10,ttt.updateBoard(position));
    }
    public void onClick11(View view){
        Log.d(TAG, "OfflineActivity/onClick11");
        int position = 4;
        setImage(R.id.board11,ttt.updateBoard(position));
    }
    public void onClick12(View view){
        Log.d(TAG, "OfflineActivity/onClick12");
        int position = 5;
        setImage(R.id.board12,ttt.updateBoard(position));
    }
    public void onClick20(View view){
        Log.d(TAG, "OfflineActivity/onClick20");
        int position = 6;
        setImage(R.id.board20,ttt.updateBoard(position));
    }
    public void onClick21(View view){
        Log.d(TAG, "OfflineActivity/onClick21");
        int position = 7;
        setImage(R.id.board21,ttt.updateBoard(position));
    }
    public void onClick22(View view){
        Log.d(TAG, "OfflineActivity/onClick22");
        int position = 8;
        setImage(R.id.board22,ttt.updateBoard(position));
    }


}