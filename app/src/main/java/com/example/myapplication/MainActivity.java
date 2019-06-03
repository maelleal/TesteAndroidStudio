package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Button button = (Button) findViewById(R.id.button);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                setContentView(R.layout.activity_jogos);
//            }
//        });

    }

    public void CliqueEntrar(View view){
//        EditText editText = (EditText) findViewById(R.id.editText);
//        EditText campoSenha = (EditText) findViewById(R.id.camposenha);
//        TextView textView = (TextView) findViewById(R.id.textView);
        Intent intent = new Intent(this, HomePage.class);
        startActivity(intent);
    }

    public void proximoJogo(View view){

    }

    public void classificacao(View view){

    }

    public void ultimoResutado(View view){

    }

    public void localPartidas(View view){

    }

    public void sobreAEquipe(View view){

    }
}
