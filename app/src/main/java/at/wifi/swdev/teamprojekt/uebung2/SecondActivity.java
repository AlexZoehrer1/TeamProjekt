package at.wifi.swdev.teamprojekt.uebung2;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import at.wifi.swdev.teamprojekt.MainActivity;
import at.wifi.swdev.teamprojekt.R;

public class SecondActivity extends AppCompatActivity {

    String url = "http://www.google.com";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void zurückMain(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void startExpliciterIntent(View view) {
        Intent intent = new Intent(this,ThirdActivity.class);
        startActivity(intent);
    }

    public void startImpliziterIntent(View view) {
        Intent intent =new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        this.startActivity(intent);
    }
}
