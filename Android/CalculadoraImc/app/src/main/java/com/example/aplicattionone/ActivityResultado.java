package com.example.aplicattionone;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityResultado extends Activity {

    TextView resultado;
    Button statusImc, voltar;
    double imcResolvido;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        resultado = findViewById(R.id.editResultado);
        statusImc = findViewById(R.id.btn_status);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        imcResolvido = (bundle.getDouble("imcResolvido"));

        resultado.setText(String.valueOf(imcResolvido));

        statusImc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String statusImc = StatusImc(imcResolvido);
                Bundle bundle = new Bundle();
                bundle.putString("mensagemStatus",statusImc);

                NavigationUtil.changeActivity(getApplicationContext(), ActivityStatus.class, bundle);
            }
        });

        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavigationUtil.changeActivity(getApplicationContext(), ActivityStatus.class);
            }
        });
    }

    public String StatusImc(double imc) {
        if(imc < 18.5)
            return "Magreza";
        else if(imc >= 18.5 && imc < 24.9)
            return "Normal";
        else if(imc >= 25 && imc < 29.9)
            return "Sobrepeso";
        else if(imc >= 30 && imc < 39.9)
            return "Obesidade";
        else
            return "Obesidade Grave";
    }
}
