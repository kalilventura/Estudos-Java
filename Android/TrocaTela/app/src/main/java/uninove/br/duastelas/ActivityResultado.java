package uninove.br.duastelas;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;


public class ActivityResultado extends Activity {

    TextView nomeCompleto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        nomeCompleto = (TextView) findViewById(R.id.tv_resultado);

        // Recebe os dados que foram enviados da outra tela
        Intent intent = getIntent();

        Bundle bundle = intent.getExtras();
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder
                .append(bundle.getString("nome"))
                .append(" ")
                .append(bundle.getString("sobrenome"));

        nomeCompleto.setText(stringBuilder.toString());
    }
}
