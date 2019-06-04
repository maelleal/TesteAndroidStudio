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

    public void jogo2Gt(View view){
        String url = "https://www.youtube.com/embed/M3wCD7yCkiw";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);

    }public void jogo1Gt(View view){
        String url = "https://www.youtube.com/watch?v=qPkX85yzlUc&feature=onebox";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);

    }public void jogo6Mb(View view){
        String url = "https://www.youtube.com/watch?v=-YB0APx6fmo&feature=onebox";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);

    }public void jogo5Mb(View view){
        String url = "https://www.youtube.com/watch?v=C7CVTpaRa7g&t=1s";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);

    }public void jogo4Mb(View view){
        String url = "https://www.youtube.com/watch?v=F2vZSkb8Spw&feature=onebox";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }
    public void estadioRaptors(View view){
        Uri uri = Uri.parse("geo:0,0?q=" + "Scotiabank Arena" + ", " + "40 Bay St, Toronto, ON M5J 2X2, Canadá");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, uri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);
    }

    public void estadioGolden(View view){
        Uri uri = Uri.parse("geo:0,0?q=" + "Oracle Arena" + ", " + "7000 Coliseum Way, Oakland, CA 94621, EUA");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, uri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);
    }
    public void equipeRaptors(View view) {
        String url = "https://pt.wikipedia.org/wiki/Toronto_Raptors";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }
    public void equipeGS(View view) {
        String url = "https://pt.wikipedia.org/wiki/Golden_State_Warriors";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }
    public void equipeBucks(View view) {
        String url = "https://pt.wikipedia.org/wiki/Milwaukee_Bucks";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }

    public void memberPascalSiakam(View view) {
        String url = "https://pt.wikipedia.org/wiki/Pascal_Siakam";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }
    public void memberKawhiLeonard(View view) {
        String url = "https://pt.wikipedia.org/wiki/Kawhi_Leonard";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }
    public void memberKyleLowry(View view) {
        String url = "https://pt.wikipedia.org/wiki/Kyle_Lowry";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }
    public void memberMarcGasol(View view) {
        String url = "https://pt.wikipedia.org/wiki/Marc_Gasol";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }

}