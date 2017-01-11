package de.jasperzevering.raumfahrt.raumfahrtdaten.planetendaten;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import de.jasperzevering.raumfahrt.raumfahrtdaten.R;


public class planetenorbitdaten extends AppCompatActivity {
    TextView A,E,i,V, Apohel,Perihel,Apogaeum,Perigaeum,synodischT,siderischT;
    TextView name;
    Button bZurueck;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.planetenorbit);

       final String planetuebergabe = getIntent().getStringExtra("planetx");
        planetdatenintern planetx = new planetdatenintern(planetuebergabe);

        name = (TextView)findViewById(R.id.planetenorbitname);
        name.setText(planetuebergabe);

        A = (TextView) findViewById(R.id.porbitA);
        A.setText(planetx.getA());

        E = (TextView) findViewById(R.id.porbitE);
        E.setText(planetx.getE());

        i = (TextView) findViewById(R.id.porbiti);
        i.setText(planetx.geti());

        V = (TextView) findViewById(R.id.porbitv);
        V.setText(planetx.getA());

        Apohel = (TextView) findViewById(R.id.porbitapohel);
        Apohel.setText(planetx.getAphel());

        Apogaeum = (TextView) findViewById(R.id.porbitapogaeum);
        Apogaeum.setText(planetx.getApogaeum());

        Perigaeum = (TextView) findViewById(R.id.porbitperigaeum);
        Perigaeum.setText(planetx.getPerigaeum());

        Perihel = (TextView) findViewById(R.id.porbitperihel);
        Perihel.setText(planetx.getPerihel());

        synodischT = (TextView) findViewById(R.id.porbitsynodisch);
        synodischT.setText(planetx.getSynodisch());

        siderischT = (TextView) findViewById(R.id.porbitsiderisch);
        siderischT.setText(planetx.getSiderisch());


        bZurueck = (Button) findViewById(R.id.bzurueckorbitdaten);
        bZurueck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
