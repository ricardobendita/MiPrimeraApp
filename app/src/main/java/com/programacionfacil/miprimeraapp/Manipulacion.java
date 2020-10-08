package com.programacionfacil.miprimeraapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Manipulacion extends AppCompatActivity {
    EditText edtnombre;
    EditText edtmonto;
    TextView txtresultado;
    Button btnejecutar;
    Button btnocultar;
    boolean showTextButton = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manipulacion);
        edtnombre=findViewById(R.id.edtnombre);
        edtmonto=findViewById(R.id.edtmonto);
        txtresultado=findViewById(R.id.txtResultado);
        btnejecutar=findViewById(R.id.btncambiar);
        btnocultar = findViewById(R.id.btnocultar);

        btnejecutar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double cambio;
                cambio=Double.parseDouble(edtmonto.getText().toString())*3.3;
                txtresultado.setText(edtnombre.getText() + " el monto de "+ edtmonto.getText()+
                        " dolares equivale a " + cambio.toString() + "Soles");
            }
        });
    }

    public void ocultar(View view) {
/*        btnocultar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {*/
                if(showTextButton == true) {
                    btnejecutar.setVisibility(View.GONE);
                    btnocultar.setText("Mostrar");
                    showTextButton = false;
                }
                else {
                    btnejecutar.setVisibility(View.VISIBLE);
                    btnocultar.setText("Ocultar");
                    showTextButton = true;
                }
            }
/*        });
    }*/
}