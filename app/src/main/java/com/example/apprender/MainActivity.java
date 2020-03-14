package com.example.apprender;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import javax.security.auth.PrivateCredentialPermission;

public class MainActivity extends AppCompatActivity {
    Button botoninicio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        botoninicio = (Button) findViewById(R.id.button);

        botoninicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pantalla = new Intent(MainActivity.this, Dos.class) ;
                startActivity(pantalla);
                finish();
            }
        });

    }
}
