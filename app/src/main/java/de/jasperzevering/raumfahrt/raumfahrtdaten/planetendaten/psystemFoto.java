package de.jasperzevering.raumfahrt.raumfahrtdaten.planetendaten;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import de.jasperzevering.raumfahrt.raumfahrtdaten.R;


public class psystemFoto extends AppCompatActivity {


Button bzurueck;



    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.psystemfoto);



        bzurueck=(Button) findViewById(R.id.bZuruckpsystemFoto);
        bzurueck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


}}
