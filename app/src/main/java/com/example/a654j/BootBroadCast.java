package com.example.a654j;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class BootBroadCast extends BroadcastReceiver {


    @Override
    public void onReceive(Context context, Intent intent) {
        if (Intent.ACTION_BOOT_COMPLETED.equals(intent.getAction())) {
            Intent intents = new Intent(context, MainActivity.class);
            intents.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(intents);
            Toast.makeText(context, "BOOT", Toast.LENGTH_SHORT).show();
        }
    }
}
