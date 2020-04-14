package com.example.basicapp

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.os.BatteryManager
import android.util.Log
import android.widget.Toast

class PowerConnectionReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        Log.i("PCR", intent.toString())

        // https://developer.android.com/reference/android/os/BatteryManager
        val chargePlug: Int = intent?.getIntExtra(BatteryManager.EXTRA_PLUGGED, -1) ?: -1

        val msg = if (chargePlug == 0) "On Battery" else "Plugged In";
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();

    }
}