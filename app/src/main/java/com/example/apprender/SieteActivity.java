package com.example.apprender;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SieteActivity extends AppCompatActivity {
    Button volver7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_siete);

        volver7 = findViewById(R.id.volver3);
        volver7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pantvolv= new Intent(SieteActivity.this, TresActivity.class);
                startActivity(pantvolv);
                finish();
            }
        });
    }
}
