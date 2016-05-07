package com.project.kassimentz.novocadastro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class NovoCadastro extends AppCompatActivity {

    TextView nome;
    TextView telefone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_novo_cadastro);
    }

    public void visualizarCadastro(View v){

        nome = (TextView) findViewById(R.id.txtNome);
        telefone = (TextView) findViewById(R.id.txtTelefone);

        Intent intent = new Intent(NovoCadastro.this, VisualizarCadastro.class);
        intent.putExtra("nome", nome.getText().toString());
        intent.putExtra("telefone", telefone.getText().toString());

        startActivity(intent);

    }
}
