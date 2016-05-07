package com.project.kassimentz.novocadastro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class VisualizarCadastro extends AppCompatActivity {

    TextView nome;
    TextView telefone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visualizar_cadastro);

        nome = (TextView) findViewById(R.id.txtNome);
        telefone = (TextView) findViewById(R.id.txtTelefone);

        String dataNome = getIntent().getExtras().getString("nome");
        String dataFone = getIntent().getExtras().getString("telefone");

        nome.setText(dataNome);
        telefone.setText(dataFone);

    }

    public void visualizandoFinish(View v){
        this.finish();
    }
}
