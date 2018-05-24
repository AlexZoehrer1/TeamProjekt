package at.wifi.swdev.teamprojekt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import at.wifi.swdev.teamprojekt.uebung1.WifiActivity;
import at.wifi.swdev.teamprojekt.uebung2.SecondActivity;
import at.wifi.swdev.teamprojekt.uebung4.SquareActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void startUe4(View view) {
        Intent intent =new Intent(this,SquareActivity.class);
        startActivity(intent);
    }

    public void startUe1(View view) {
        Intent intent =new Intent(this,WifiActivity.class);
        startActivity(intent);
    }

    public void startUe2(View view) {
        Intent intent =new Intent(this,SecondActivity.class);
        startActivity(intent);
    }
}
