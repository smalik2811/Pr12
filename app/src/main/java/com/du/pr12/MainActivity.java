package com.du.pr12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button sendBroadcast;
    private CustomBroadcast customBroadcast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sendBroadcast = findViewById(R.id.sendBroadcast);
        sendBroadcast.setOnClickListener(this);
        customBroadcast = new CustomBroadcast();
        registerReceiver(customBroadcast, new IntentFilter("com.du.pr12.customBroadcast"));
    }

    @Override
    protected void onStop() {
        super.onStop();
        unregisterReceiver(customBroadcast);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent("com.du.pr12.customBroadcast");
        sendBroadcast(intent);
    }
}