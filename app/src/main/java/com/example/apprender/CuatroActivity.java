package com.example.apprender;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;

public class CuatroActivity extends AppCompatActivity {
    Button volver3;
    Button btnregistrar;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuatro);

        volver3 = findViewById(R.id.volver3);
        volver3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pantalla4 = new Intent(CuatroActivity.this, TresActivity.class) ;
                startActivity(pantalla4);
                finish();
            }
        });
    }
}
