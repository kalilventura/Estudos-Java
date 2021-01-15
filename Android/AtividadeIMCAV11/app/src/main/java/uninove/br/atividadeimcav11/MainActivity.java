package uninove.br.atividadeimcav11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.ems.imcatividade01.SegundaActivity;

public class MainActivity extends AppCompatActivity {

        EditText objPeso, objAltura;
        Button btCalcular;
        Integer peso;
        Float altura;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            objPeso = findViewById(R.id.editPeso);
            objAltura = findViewById(R.id.editAltura);

            btCalcular = findViewById(R.id.btCalcular);

            btCalcular.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    peso = Integer.parseInt(objPeso.getText().toString());
                    altura = Float.parseFloat(objAltura.getText().toString());

                    Intent it = new Intent(getApplicationContext(), SegundaActivity.class);

                    Bundle dados = new Bundle();
                    dados.putFloat("peso",peso);
                    dados.putDouble("altura",altura);

                    it.putExtras(dados);
                    startActivity(it);
                }
            });
        }
}
