package com.example.eneida.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText numero1edt;
    EditText numero2edt;
    TextView resultadotv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numero1edt = (EditText)findViewById(R.id.numero1edt);
        numero2edt = (EditText)findViewById(R.id.numero2edt);
        resultadotv = (TextView) findViewById(R.id.resultadotv);
    }

    public void sumar(View view) {


        int numero1 = Integer.parseInt(numero1edt.getText().toString());
        int numero2 = Integer.parseInt(numero2edt.getText().toString());

        int resultado = numero1+numero2;
        resultadotv.setText(resultado+"");
    }

    public void restar(View view) {
        int numero1 = Integer.parseInt(numero1edt.getText().toString());
        int numero2 = Integer.parseInt(numero2edt.getText().toString());

        int resultado = numero1-numero2;
        resultadotv.setText(resultado+"");
    }

    public void multiplicar(View view) {
        int numero1 = Integer.parseInt(numero1edt.getText().toString());
        int numero2 = Integer.parseInt(numero2edt.getText().toString());

        int resultado = numero1*numero2;
        resultadotv.setText(resultado+"");
    }

    public void dividir(View view) {
        int numero1 = Integer.parseInt(numero1edt.getText().toString());
        int numero2 = Integer.parseInt(numero2edt.getText().toString());

        int resultado = numero1/numero2;
        resultadotv.setText(resultado+"");
    }

    public void limpiar(View view) {
        String numero1 = numero1edt.getText().toString();
        String numero2 = numero2edt.getText().toString();
        numero1edt.setText("");
        numero2edt.setText("");
        resultadotv.setText("");
    }
}
