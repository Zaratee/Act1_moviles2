package com.example.zarate.act1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText num1, num2;
    Button operacion;
    TextView resultado,tipo;
    int num=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText) findViewById(R.id.etxt_num1);
        num2 = (EditText) findViewById(R.id.etxt_num2);
        operacion = (Button) findViewById(R.id.btn_operacion);
        resultado = (TextView) findViewById(R.id.txtV_resultado);
        tipo = (TextView) findViewById(R.id.txtV_tipo);

        operacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num++;
                int numero1 =Integer.parseInt(num1.getText().toString());
                int numero2 =Integer.parseInt(num2.getText().toString());
                int respuesta;

                switch(num) {
                    case 1:
                        respuesta = numero1 + numero2;
                        resultado.setText(""+respuesta);
                        tipo.setText("Suma");
                        break;

                    case 2:
                        respuesta = numero1 - numero2;
                        resultado.setText(""+respuesta);
                        tipo.setText("Resta");
                        break;

                    case 3:
                        respuesta = numero1*numero2;
                        resultado.setText(""+respuesta);
                        tipo.setText("Multiplicacion");
                        num=0;
                        break;
                }
                }

        });
    }
}
