package com.example.apprender;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TresActivity extends AppCompatActivity {
Button bnuevo;
Button volver2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tres);
        volver2 = (Button) findViewById(R.id.volver2);
        volver2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pantalla3 = new Intent(TresActivity.this, Dos.class) ;
                startActivity(pantalla3);
                finish();

            }
        });
    }
}
