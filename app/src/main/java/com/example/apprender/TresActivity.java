package com.example.apprender;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class TresActivity extends AppCompatActivity {
    Button volver2;
    Button estudiante;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tres);

        volver2 = findViewById(R.id.volver2);
        estudiante = findViewById(R.id.button6);
        volver2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pantalla3 = new Intent(TresActivity.this, Dos.class) ;
                startActivity(pantalla3);
                finish();

            }
        });

        estudiante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pantalla4 = new Intent(TresActivity.this, Cuatro.class);
                startActivity(pantalla4);
                finish();

            }
        });




    }

}