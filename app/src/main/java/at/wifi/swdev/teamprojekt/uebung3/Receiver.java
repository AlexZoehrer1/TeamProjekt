package at.wifi.swdev.teamprojekt.uebung3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class Receiver extends BroadcastReceiver {
    public Receiver(){

    }

    @Override
    public void onReceive(Context SendBroadcastActivity, Intent intent) {

        Toast.makeText(SendBroadcastActivity,"Execise done",Toast.LENGTH_LONG).show();
    }
}
