package at.wifi.swdev.teamprojekt.uebung4;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import at.wifi.swdev.teamprojekt.R;

public class Square2Activity extends AppCompatActivity {
    String zahl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_square2);
    }

    public void startBerechnung(View view) {

        EditText zahlET = findViewById(R.id.eingabeet);
        zahl = zahlET.getText().toString();
        if (zahl == null)
            Toast.makeText(Square2Activity.this, "Bitte eine Zahl eingeben", Toast.LENGTH_LONG).show();

        else{
            Intent returnIntent = new Intent();
            returnIntent.putExtra("ergebnis",zahl);
            setResult(Activity.RESULT_OK,returnIntent);
            finish();
        }
    }
}
