package com.example.apprender;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.example.apprender.R.layout.activity_dos;

public class Dos extends AppCompatActivity {
    Button  botonvolver;
    Button   bnuevo;
    Button ingresar;

 @Override
    protected  void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_dos);

        botonvolver = (Button) findViewById(R.id.salir);
        bnuevo = (Button) findViewById(R.id.button3);
        ingresar = (Button) findViewById(R.id.button2);
        bnuevo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pantalla3 = new Intent(Dos.this, TresActivity.class);
                startActivity(pantalla3);
            }
        });


        botonvolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pantalla1 = new Intent(Dos.this, MainActivity.class) ;
                startActivity(pantalla1);
                finish();

                        }
        });

        ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pnatallaingresar = new Intent(Dos.this, CincoActivity.class);
                startActivity(pnatallaingresar);
                finish();
            }
        });





            }




 }









