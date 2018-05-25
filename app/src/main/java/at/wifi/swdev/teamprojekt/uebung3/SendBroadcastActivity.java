package at.wifi.swdev.teamprojekt.uebung3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import at.wifi.swdev.teamprojekt.MainActivity;
import at.wifi.swdev.teamprojekt.R;

public class SendBroadcastActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_broadcast);
    }

    public void zurückMain(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void sendBroadcast(View view) {
        Intent intent = new Intent();
        intent.setAction("at.wifi.swdev.teamprojekt.uebung3");
        intent.addFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES);
        sendBroadcast(intent);
    }
}
