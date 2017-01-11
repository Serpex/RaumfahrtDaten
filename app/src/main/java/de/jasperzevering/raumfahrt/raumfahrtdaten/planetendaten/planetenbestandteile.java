package de.jasperzevering.raumfahrt.raumfahrtdaten.planetendaten;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import de.jasperzevering.raumfahrt.raumfahrtdaten.R;


public class planetenbestandteile extends AppCompatActivity {
    TextView bestandteile;
    Button bZurueck;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.planetenbestandteile);

       final String planetuebergabe = getIntent().getStringExtra("planetx");
        planetdatenintern planetx = new planetdatenintern(planetuebergabe);


        bestandteile = (TextView) findViewById(R.id.bestandteile);
        bestandteile.setText(planetuebergabe+"\n \n"+planetx.getBestandteile());


        bZurueck = (Button) findViewById(R.id.bzurueckbestandteile);
        bZurueck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
}


}
