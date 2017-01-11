package de.jasperzevering.raumfahrt.raumfahrtdaten.planetendaten;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import de.jasperzevering.raumfahrt.raumfahrtdaten.R;


public class planetenfotoeinzeln extends AppCompatActivity {
Button zurueck;
    ImageView foto;
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.planetenfotoseinzeln);
        final String planetuebergabe = getIntent().getStringExtra("planetx");
        planetdatenintern planetaktuell = new planetdatenintern(planetuebergabe);

        foto=(ImageView) findViewById(R.id.planetenfotoeinzeln);
        foto.setImageResource(planetaktuell.getFoto());


        zurueck=(Button) findViewById(R.id.bzurueckfotoeinzekn);
        zurueck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });




}}
