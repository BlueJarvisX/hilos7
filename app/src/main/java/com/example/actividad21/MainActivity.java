package com.example.actividad21;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnHacerFoto = findViewById(R.id.btnHacerFoto);
        btnHacerFoto.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, InicioActivity.class);
            startActivity(intent);
        });
    }
}