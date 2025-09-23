package com.example.actividad21;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class InicioActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        Button btnAceptar = findViewById(R.id.BTAceptar);
        EditText etNombre = findViewById(R.id.ETNombreFoto);

        btnAceptar.setOnClickListener(v -> {
            String nombreFoto = etNombre.getText().toString().trim();

            if (nombreFoto.isEmpty()) {
                Toast.makeText(this, "Ingresa un nombre para la foto", Toast.LENGTH_SHORT).show();
                return;
            }

            Intent intent = new Intent(InicioActivity.this, AResultadoActivity.class);
            intent.putExtra("NOMBRE_FOTO", nombreFoto);
            startActivity(intent);
        });
    }
}