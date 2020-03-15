package com.example.apprender;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Cuatro extends AppCompatActivity {
    Button volver3;
    Button registrarse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuatro2);

        volver3 = findViewById(R.id.volver3);
        registrarse = findViewById(R.id.button5);
        volver3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pantalla4 = new Intent(Cuatro.this, TresActivity.class) ;
                startActivity(pantalla4);
                finish();
            }
        });
        registrarse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pantallainicio = new Intent(Cuatro.this, Dos.class);
                startActivity(pantallainicio);
                finish();

            }
        });
    }
}
