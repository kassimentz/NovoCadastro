package com.project.kassimentz.novocadastro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goTo(View v){
        Intent intent =  new Intent(MainActivity.this, VoltarActivity.class);
        startActivity(intent);
    }

    public void cadastrar(View v){
        Intent cadastro =  new Intent(MainActivity.this, NovoCadastro.class);
        startActivity(cadastro);
    }
}
