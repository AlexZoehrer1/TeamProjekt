package at.wifi.swdev.teamprojekt.uebung1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import at.wifi.swdev.teamprojekt.MainActivity;
import at.wifi.swdev.teamprojekt.R;

public class WifiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wifi);
    }

    public void zurückMain(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void goGoogle(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
        startActivity(intent);
    }

    public void goWifi(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.stmk.wifi.at/"));
        startActivity(intent);
    }
}
