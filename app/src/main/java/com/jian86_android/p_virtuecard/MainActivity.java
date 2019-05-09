package com.jian86_android.p_virtuecard;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;


import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int luckNum;
    AdView ad ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MobileAds.initialize(this, "ca-app-pub-5057186068100524~3716567744");

        getSupportActionBar().hide();
        Random rand = new Random();
        luckNum =rand.nextInt(52);
        ad = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        ad.loadAd(adRequest);


    }//onCreate


    public void clickBtn(View view) {

        Intent intent = new Intent(this,DescActivity.class);
        intent.putExtra("luckNum", luckNum);
        startActivity(intent);

    }//clickBtn
}//MainActivity
