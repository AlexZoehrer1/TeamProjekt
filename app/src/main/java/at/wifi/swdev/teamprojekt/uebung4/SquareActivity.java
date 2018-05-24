package at.wifi.swdev.teamprojekt.uebung4;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import at.wifi.swdev.teamprojekt.MainActivity;
import at.wifi.swdev.teamprojekt.R;
import at.wifi.swdev.teamprojekt.uebung4.Square2Activity;

public class SquareActivity extends AppCompatActivity {
    String ergebnis;
    int ergebnisSQA;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_square);
    }

    public void startSquare2(View view) {
        Intent intent = new Intent(this, Square2Activity.class);
        startActivityForResult(intent, 123);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 123) {
            if (resultCode == Activity.RESULT_OK) {
                ergebnis = data.getStringExtra("ergebnis");
                ergebnisSQA = (Integer.valueOf(ergebnis)) * (Integer.valueOf(ergebnis));
                TextView ergebnisTV = findViewById(R.id.textView3);
                ergebnisTV.setText(String.valueOf(ergebnisSQA));
            }
        }

    }

    public void zurückMain(View view) {
        Intent intent =new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
