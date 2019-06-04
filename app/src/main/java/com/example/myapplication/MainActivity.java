package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void CliqueEntrar(View view){

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
