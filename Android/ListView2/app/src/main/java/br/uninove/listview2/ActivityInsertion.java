package br.uninove.listview2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityInsertion extends Activity {

    Button btAdicionar, btVoltar;
    TextView edRA, edName, edCurso, edCampus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insertion);

        btAdicionar = findViewById(R.id.btAdicionar);
        btVoltar = findViewById(R.id.btVoltar);
        edRA = findViewById(R.id.edRa);
        edName = findViewById(R.id.edName);
        edCurso = findViewById(R.id.edCurso);
        edCampus = findViewById(R.id.edCampus);

        btVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        String ra = (String) edRA;

        btAdicionar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Aluno a = new Aluno();
            }
        });








    }
}




