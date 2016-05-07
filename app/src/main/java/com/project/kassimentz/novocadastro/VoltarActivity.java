package com.project.kassimentz.novocadastro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class VoltarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_voltar);
    }

    public void destruir(View v){
        this.finish();
    }
}
