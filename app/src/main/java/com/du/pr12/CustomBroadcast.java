package com.du.pr12;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.ContentView;

public class CustomBroadcast extends BroadcastReceiver {
    TextView status;

    public CustomBroadcast(){}

    public CustomBroadcast(TextView status){
        super();
        this.status = status;
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        if(intent.getAction().equals("com.du.pr12.customBroadcast")) {
            Toast.makeText(context,"You just received a Custom Broadcast",Toast.LENGTH_SHORT).show();
        }
    }
}