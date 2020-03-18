package com.example.apprender;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CincoActivity extends AppCompatActivity {
    Button volver5;
    Button miperfil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cinco);
        volver5 = (Button) findViewById(R.id.salir);
        miperfil = (Button) findViewById(R.id.button4);
        volver5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pantvolver5 = new Intent(CincoActivity.this, MainActivity.class);
                startActivity(pantvolver5);
                finish();
            }
        });

        miperfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pantallamiperf= new Intent(CincoActivity.this, SeisActivity.class);
                startActivity(pantallamiperf);
                finish();
            }
        });
    }
}
