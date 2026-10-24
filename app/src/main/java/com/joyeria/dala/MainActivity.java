package com.joyeria.dala;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnAnillos = findViewById(R.id.btnAnillos);
        Button btnCadenas = findViewById(R.id.btnCadenas);
        Button btnTopos = findViewById(R.id.btnTopos);
        Button btnVerCatalogo = findViewById(R.id.btnVerCatalogo);

        btnAnillos.setOnClickListener(v -> abrirPantallaColeccion(
                "Colección Anillos de Compromiso",
                "• Solitario en Oro 18K con Diamante Central\n  Precio: $2.450.000 COP\n\n" +
                        "• Anillo Esmeralda Colombiana de Muzo\n  Precio: $3.800.000 COP\n\n" +
                        "• Churumbela en Oro Rosado con Gemas\n  Precio: $1.950.000 COP\n\n" +
                        "Todas nuestras piezas incluyen certificado de autenticidad y estuche de lujo."
        ));

        btnCadenas.setOnClickListener(v -> abrirPantallaColeccion(
                "Cadenas & Pulseras Finas",
                "• Cadena Tejido Escalera Oro 18K (50cm)\n  Precio: $2.850.000 COP\n\n" +
                        "• Pulsera Tejido Barbado Delgado\n  Precio: $1.400.000 COP\n\n" +
                        "• Dije Medalla San Benito Oro Pulido\n  Precio: $780.000 COP\n\n" +
                        "Garantía de por vida en la ley del metal (18 Kilates)."
        ));

        btnTopos.setOnClickListener(v -> abrirPantallaColeccion(
                "Topos, Aretes & Candongas",
                "• Topos Diamante Natural 0.30 Ct\n  Precio: $2.100.000 COP\n\n" +
                        "• Candongas Lisas en Oro Amarillo 18K\n  Precio: $890.000 COP\n\n" +
                        "• Aretes Filigrana con Perla Cultivada\n  Precio: $1.250.000 COP\n\n" +
                        "Cierre con tuerca de rosca antialérgica de seguridad."
        ));

        btnVerCatalogo.setOnClickListener(v -> abrirPantallaColeccion(
                "Diseños Personalizados & Asesoría",
                "Servicios del Atelier Joyería Dala:\n\n" +
                        "1. Modelado 3D y renderizado previo de la joya.\n" +
                        "2. Selección de piedras preciosas certificadas.\n" +
                        "3. Grabados personalizados en láser.\n\n" +
                        "Solicita una consulta directa para iniciar tu proyecto."
        ));
    }

    private void abrirPantallaColeccion(String titulo, String contenido) {
        Intent intent = new Intent(MainActivity.this, ColeccionActivity.class);
        intent.putExtra("TITULO_COLECCION", titulo);
        intent.putExtra("CONTENIDO_COLECCION", contenido);
        startActivity(intent);
    }
}