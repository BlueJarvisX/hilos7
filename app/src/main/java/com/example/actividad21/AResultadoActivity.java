package com.example.actividad21;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class AResultadoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aresultado);

        TextView tvResultado = findViewById(R.id.tvResultado);
        Button btnVolver = findViewById(R.id.btnVolver);

        String nombreFoto = getIntent().getStringExtra("NOMBRE_FOTO");
        tvResultado.setText("Foto guardada como:\n" + nombreFoto);

        btnVolver.setOnClickListener(v -> {
            Intent intent = new Intent(AResultadoActivity.this, MainActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
            startActivity(intent);
            finish();
        });
    }
}