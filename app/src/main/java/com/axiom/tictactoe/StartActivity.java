package com.axiom.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

public class StartActivity extends AppCompatActivity {
    private String playerTurnStr;
    private String[] sideArray = getResources().getStringArray(R.array.side_array);
    private int playerTurn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        Spinner spinner = findViewById(R.id.spinner);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                playerTurnStr = (String)adapterView.getItemAtPosition(i);
                if(playerTurnStr.equals(sideArray[0])){
                    playerTurn = TicTacToe.RED;
                }else if(playerTurnStr.equals(sideArray[1])){
                    playerTurn = TicTacToe.BLUE;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    public void startOffline(View view){
        Intent intent = new Intent(getApplicationContext(), OfflineActivity.class);
        startActivity(intent);
    }
    public void startCPU(View view){
        Intent intent = new Intent(getApplicationContext(), CpuActivity.class);
        intent.putExtra("PL_TURN", playerTurn);
        startActivity(intent);
    }
    public void startOnline(View view){
        Intent intent = new Intent(getApplicationContext(), OnlineActivity.class);
        startActivity(intent);
    }
}