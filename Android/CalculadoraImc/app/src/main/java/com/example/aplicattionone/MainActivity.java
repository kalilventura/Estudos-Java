package com.example.aplicattionone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.applicationone.models.Imc;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    Button calcular;
    EditText peso, altura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        altura = (EditText) findViewById(R.id.editAltura);
        peso = (EditText) findViewById(R.id.editPeso);
        calcular = (Button) findViewById(R.id.buttonCalcular);

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double dAltura, dPeso;
                dAltura = Double.parseDouble(altura.getText().toString());
                dPeso = Double.parseDouble(peso.getText().toString());

                Imc imc = new Imc(dPeso, dAltura);

                calcularImc(imc);
            }
        });
    }

    public void calcularImc(Imc imc){
        double calcImc;
        try {
            Bundle bundle = new Bundle();

            if(imc.imcEhValido()) {
                calcImc = imc.calcularImc();
                bundle.putDouble("imcResolvido", calcImc);
                NavigationUtil.changeActivity(getApplicationContext(), ActivityResultado.class, bundle);
            }
            else
                Toast.makeText(this,"Peso ou altura invalidos.",Toast.LENGTH_SHORT).show();
        }
        catch (Exception err){
            Toast.makeText(this,err.getMessage(),Toast.LENGTH_SHORT).show();
        }
    }
}
