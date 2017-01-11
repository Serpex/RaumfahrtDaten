package de.jasperzevering.raumfahrt.raumfahrtdaten.planetendaten;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import de.jasperzevering.raumfahrt.raumfahrtdaten.R;

public class pdatenmenue extends AppCompatActivity {

    Button bSonne, bMerkur, bVenus, bErde, bMond, bMars, bJupiter, bSaturn, bUranus, bNeptun, bPluto, bZurueck;
    ImageView psystem;


    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pdaten);

        bSonne = (Button) findViewById(R.id.bSonne);
        bSonne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(pdatenmenue.this, pdatenansicht.class);
                i.putExtra("planetx", "Sonne");
                startActivity(i);
            }
        });
        bMerkur = (Button) findViewById(R.id.bMerkur);
        bMerkur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(pdatenmenue.this, pdatenansicht.class);
                i.putExtra("planetx", "Merkur");
                startActivity(i);
            }
        });
        bVenus = (Button) findViewById(R.id.bVenus);
        bVenus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(pdatenmenue.this, pdatenansicht.class);
                i.putExtra("planetx", "Venus");
                startActivity(i);
            }
        });

        bErde = (Button) findViewById(R.id.bErde);
        bErde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(pdatenmenue.this, pdatenansicht.class);
                i.putExtra("planetx", "Erde");
                startActivity(i);
            }
        });
        bMond = (Button) findViewById(R.id.bMond);
        bMond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(pdatenmenue.this, pdatenansicht.class);
                i.putExtra("planetx", "Mond");
                startActivity(i);
            }
        });
        bMars = (Button) findViewById(R.id.bMars);
        bMars.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(pdatenmenue.this, pdatenansicht.class);
                i.putExtra("planetx", "Mars");
                startActivity(i);
            }
        });

        bJupiter = (Button) findViewById(R.id.bJupiter);
        bJupiter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(pdatenmenue.this, pdatenansicht.class);
                i.putExtra("planetx", "Jupiter");
                startActivity(i);
            }
        });
        bSaturn = (Button) findViewById(R.id.bSaturn);
        bSaturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(pdatenmenue.this, pdatenansicht.class);
                i.putExtra("planetx", "Saturn");
                startActivity(i);
            }
        });
        bUranus = (Button) findViewById(R.id.bUranus);
        bUranus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(pdatenmenue.this, pdatenansicht.class);
                i.putExtra("planetx", "Uranus");
                startActivity(i);
            }
        });
        bNeptun = (Button) findViewById(R.id.bUranus);
        bNeptun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(pdatenmenue.this, pdatenansicht.class);
                i.putExtra("planetx", "Neptun");
                startActivity(i);
            }
        });
        bPluto = (Button) findViewById(R.id.bPluto);
        bPluto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(pdatenmenue.this, pdatenansicht.class);
                i.putExtra("planetx", "Pluto");
                startActivity(i);
                
            }
        });



        bZurueck = (Button) findViewById(R.id.bZurueck);
        bZurueck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        psystem=(ImageView) findViewById(R.id.pdatenPsystemfoto);
        psystem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(pdatenmenue.this, psystemFoto.class);

                startActivity(i);
            }
        });

    }


}
