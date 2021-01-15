package com.example.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button somar, subtrair, dividir, multiplicar;
    EditText numero1, numero2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.onCreateComponents();
        this.onButtonListeners();
    }

    public void onCreateComponents(){
        somar = (Button) findViewById(R.id.btn_soma);
        subtrair = (Button) findViewById(R.id.btn_subtrair);
        dividir = (Button) findViewById(R.id.btn_dividir);
        multiplicar = (Button) findViewById(R.id.btn_multiplicar);
        numero1 = (EditText) findViewById(R.id.et_numero1);
        numero2 = (EditText) findViewById(R.id.et_numero2);
    }

    public void onButtonListeners() {
        somar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int result = MathOperations.somar(Integer.parseInt(numero1.getText().toString()), Integer.parseInt(numero2.getText().toString()));
                resultCalc(result);
            }
        });

        subtrair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int result = MathOperations.subtrair(Integer.parseInt(numero1.getText().toString()), Integer.parseInt(numero2.getText().toString()));
                resultCalc(result);
            }
        });

        multiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int result = MathOperations.multiplicar(Integer.parseInt(numero1.getText().toString()), Integer.parseInt(numero2.getText().toString()));
                resultCalc(result);
            }
        });

        dividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int result = MathOperations.dividir(Integer.parseInt(numero1.getText().toString()), Integer.parseInt(numero2.getText().toString()));
                resultCalc(result);
            }
        });
    }

    public void resultCalc(int result){
        Toast.makeText(this,Integer.toString(result),Toast.LENGTH_LONG).show();
    }

}
