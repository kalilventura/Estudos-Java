package com.example.aplicattionone;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityStatus extends Activity {

    TextView mensagem;
    Button voltar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_status);

        mensagem = findViewById(R.id.tv_mensagem);
        voltar = findViewById(R.id.btn_voltar);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String status = (bundle.getString("mensagemStatus"));
        mensagem.setText(status);

        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavigationUtil.changeActivity(getApplicationContext(),MainActivity.class);
            }
        });
    }

}
