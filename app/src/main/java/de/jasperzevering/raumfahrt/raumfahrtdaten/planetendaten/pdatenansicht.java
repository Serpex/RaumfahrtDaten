package de.jasperzevering.raumfahrt.raumfahrtdaten.planetendaten;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import de.jasperzevering.raumfahrt.raumfahrtdaten.R;


public class pdatenansicht extends AppCompatActivity {

    TextView Masse,Durchmesser,MittlereDichte,Fallbeschleunigung,Fluchtgeschwindigkeit,Albedo,Rotationsperiode,Name;
    Button Bestandteile,Foto, Atmosphaere,Orbitdaten, Zurueck;


    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pdatenansicht);
        final String planetuebergabe = getIntent().getStringExtra("planetx");
         planetdatenintern planetx = new planetdatenintern(planetuebergabe);

        Name = (TextView) findViewById(R.id.Planetname);
        Name.setText(planetuebergabe);

        Masse = (TextView) findViewById(R.id.masse);
        Masse.setText(planetx.getMasse());

        Durchmesser = (TextView) findViewById(R.id.durchmesser);
        Durchmesser.setText(planetx.getDurchmesser());

        MittlereDichte = (TextView) findViewById(R.id.mDichte);
        MittlereDichte.setText(planetx.getDichte());

        Fallbeschleunigung = (TextView) findViewById(R.id.fallbeschleunigung);
        Fallbeschleunigung.setText(planetx.getFallbeschleunigung());

        Fluchtgeschwindigkeit = (TextView) findViewById(R.id.Fluchtgeschwindigkeit);
        Fluchtgeschwindigkeit.setText(planetx.getFluchtgeschwindigkeit());

        Albedo = (TextView) findViewById(R.id.Albedo);
        Albedo.setText(planetx.getAlbedo());

        Rotationsperiode = (TextView) findViewById(R.id.Rotationsperiode);
        Rotationsperiode.setText(planetx.getRotationsperiode());




        Zurueck= (Button) findViewById(R.id.bpdzurueck);
        Zurueck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();

            }
        });

        Bestandteile= (Button) findViewById(R.id.bBestandteile);
        Bestandteile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(pdatenansicht.this, planetenbestandteile.class);
                String uebergabe = planetuebergabe;
                i.putExtra("planetx", uebergabe);
                startActivity(i);

            }
        });

        Orbitdaten= (Button) findViewById(R.id.bOrbitdaten);
        Orbitdaten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(pdatenansicht.this, planetenorbitdaten.class);
                String uebergabe1 = planetuebergabe;
                i.putExtra("planetx", uebergabe1);
                startActivity(i);

            }
        });

        Atmosphaere= (Button) findViewById(R.id.bAtmosphaere);
        Atmosphaere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(pdatenansicht.this, planetenatmo.class);
                String uebergabe1 = planetuebergabe;
                i.putExtra("planetx", uebergabe1);
                startActivity(i);

            }
        });

        Foto= (Button) findViewById(R.id.bBild);
        Foto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(pdatenansicht.this, planetenfotoeinzeln.class);
                String uebergabe1 = planetuebergabe;
                i.putExtra("planetx", uebergabe1);
                startActivity(i);

            }
        });






    }




}
