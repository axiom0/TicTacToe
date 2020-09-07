package com.axiom.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
    }

    public void startOffline(View view){
        Intent intent = new Intent(getApplicationContext(), OfflineActivity.class);
        startActivity(intent);
    }
    public void startCPU(View view){
        Intent intent = new Intent(getApplicationContext(), CpuActivity.class);
        startActivity(intent);
    }
    public void startOnline(View view){
        Intent intent = new Intent(getApplicationContext(), OnlineActivity.class);
        startActivity(intent);
    }
}