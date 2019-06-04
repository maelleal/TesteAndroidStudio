package com.example.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.tabs.TabLayout;

import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;


import com.example.myapplication.ui.main.SectionsPagerAdapter;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);

    }

    public void noticiaOne(View view){
        String url = "https://www.espn.com.br/nba/artigo/_/id/5690379/warriors-calam-toronto-e-empatam-finais-contra-os-raptors-em-dia-de-les%C3%A3o-de-klay-thompson";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }

    public void noticiaTwo(View view){
        String url = "https://www.espn.com.br/nba/artigo/_/id/5679460/quanto-toronto-raptors-e-golden-state-warriors-gastaram-para-chegar-%C3%A0s-finais-da-nba";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }

    public void noticiaThree(View view){
        String url = "https://www.gazetaesportiva.com/campeonatos/nba/kawhi-prega-jogo-coletivo-dos-raptors-antes-do-jogo-2-das-finais-da-nba/";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }

    public void noticiaFour(View view){
        String url = "https://portalrapmais.com/nike-air-max-90-toronto-raptors/";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }

    public void noticiaFive(View view){
        String url = "https://esporte.uol.com.br/basquete/ultimas-noticias/2019/06/02/drake-quebra-acordo-e-comportamento-em-quadra-vira-problema-para-nba.htm";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }


}