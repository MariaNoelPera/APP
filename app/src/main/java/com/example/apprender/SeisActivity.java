package com.example.apprender;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SeisActivity extends AppCompatActivity {
    Button volverpant6;
    Button cerrarses;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seis);

        volverpant6= (Button) findViewById(R.id.salir);
        cerrarses= (Button) findViewById(R.id.button16);
        volverpant6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent volpant6= new Intent(SeisActivity.this, CincoActivity.class);
                startActivity(volpant6);
                finish();
            }
        });
        cerrarses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pant6cerrar= new Intent(SeisActivity.this, MainActivity.class);
                startActivity(pant6cerrar);
                finish();
            }
        });
    }
}
