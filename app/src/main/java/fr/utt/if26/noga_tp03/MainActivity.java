package fr.utt.if26.noga_tp03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /**on modifier uniquement le message texte*/
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tx = (TextView) findViewById(R.id.message);
        String mes = "Bonjour IF26 !";
        tx.setText(mes);


    }
}
