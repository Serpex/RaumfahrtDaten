package de.jasperzevering.raumfahrt.raumfahrtdaten.planetendaten;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import de.jasperzevering.raumfahrt.raumfahrtdaten.R;


public class planetenatmo extends AppCompatActivity{

    Button bZurueck;
    TextView name,druck,tmax,tmitttel,tmin;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.planetenatmos);

        final String planetuebergabe = getIntent().getStringExtra("planetx");
        planetdatenintern planetaktuell = new planetdatenintern(planetuebergabe);

        name = (TextView) findViewById(R.id.patmoname) ;
        name.setText(planetuebergabe);

        druck = (TextView) findViewById(R.id.patmodruck);
        druck.setText(planetaktuell.getDruck());

        tmax = (TextView) findViewById(R.id.patmoTmax);
        tmax.setText(planetaktuell.getTmax());

        tmin = (TextView) findViewById(R.id.patmoTmin);
        tmin.setText(planetaktuell.getTmin());

        tmitttel = (TextView) findViewById(R.id.patmoTmittel);
        tmitttel.setText(planetaktuell.getTmittel());



        bZurueck = (Button) findViewById(R.id.pzurueckAtmo);
        bZurueck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }



}
