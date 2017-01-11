package de.jasperzevering.raumfahrt.raumfahrtdaten;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import de.jasperzevering.raumfahrt.raumfahrtdaten.planetendaten.pdatenmenue;

public class main extends AppCompatActivity {
    Button bpdaten,bBeenden;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        bpdaten=(Button)findViewById(R.id.bpdaten);
        bpdaten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent( main.this,pdatenmenue.class);
                startActivity(i);
            }
        });

        bBeenden=(Button)findViewById(R.id.bBeenden);
        bBeenden.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);

            }
        });

    }

}
