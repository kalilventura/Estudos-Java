package uninove.br.duastelas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import javax.xml.transform.Result;

public class MainActivity extends AppCompatActivity {

    Button mudarTela;
    EditText nome, sobrenome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nome = (EditText) findViewById(R.id.et_nome);
        sobrenome = (EditText) findViewById(R.id.et_sobrenome);
        mudarTela = (Button) findViewById(R.id.btn_concatena);
        mudarTela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Transporta um objeto de uma Activity para outra
                Intent intent = new Intent(getApplicationContext(), ActivityResultado.class);

                // Objeto responsavel pelo transporte de dados
                Bundle bundle = new Bundle();

                // Guardando os valores para o transporte
                bundle.putString("nome",nome.getText().toString());
                bundle.putString("sobrenome",sobrenome.getText().toString());

                // Colocar os dados que serão enviados na intent
                intent.putExtras(bundle);

                // Envia os dados para a nova Activity
                startActivity(intent);
            }
        });
    }
}
