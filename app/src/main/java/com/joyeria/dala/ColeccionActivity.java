package com.joyeria.dala;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class ColeccionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coleccion);

        TextView tvTitulo = findViewById(R.id.tvTituloColeccion);
        TextView tvContenido = findViewById(R.id.tvContenidoColeccion);
        Button btnSolicitar = findViewById(R.id.btnSolicitarAsesoria);
        Button btnVolver = findViewById(R.id.btnVolver);

        // Recibir los datos enviados desde MainActivity
        String titulo = getIntent().getStringExtra("TITULO_COLECCION");
        String contenido = getIntent().getStringExtra("CONTENIDO_COLECCION");

        if (titulo != null) tvTitulo.setText(titulo.toUpperCase());
        if (contenido != null) tvContenido.setText(contenido);

        // Botón de interacción
        btnSolicitar.setOnClickListener(v ->
                Toast.makeText(this, "Conectando con un asesor para " + titulo, Toast.LENGTH_SHORT).show()
        );

        // Botón para cerrar la pantalla y regresar al menú
        btnVolver.setOnClickListener(v -> finish());
    }
}