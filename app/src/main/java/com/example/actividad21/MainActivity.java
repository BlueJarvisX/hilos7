package com.example.actividad21;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button btnHilosSensores;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnHilosSensores = findViewById(R.id.btnHilosSensores);
        btnHilosSensores.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, HilosSensoresActivity.class);
            startActivity(intent);
        });

        Button btnHacerFoto = findViewById(R.id.btnHacerFoto);
        btnHacerFoto.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, InicioActivity.class);
            startActivity(intent);
        });
    }
}
