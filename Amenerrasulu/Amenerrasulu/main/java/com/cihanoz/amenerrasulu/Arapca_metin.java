package com.cihanoz.amenerrasulu;


import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class Arapca_metin extends AppCompatActivity {
    TextView tv_arapca;
    String arapca_metin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arapca_metin);

        tv_arapca=(TextView)findViewById(R.id.tv_arapca_metin);
        arapca_metin=

                "بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ" +



                " \n  اٰمَنَ الرَّسُولُ بِمَٓا اُنْزِلَ اِلَيْهِ مِنْ رَبِّه۪ وَالْمُؤْمِنُونَۜ كُلٌّ اٰمَنَ بِاللّٰهِ وَمَلٰٓئِكَتِه۪ وَكُتُبِه۪ وَرُسُلِه۪ۜ لَا نُفَرِّقُ بَيْنَ اَحَدٍ مِنْ رُسُلِه۪۠ وَقَالُوا سَمِعْنَا وَاَطَعْنَا غُفْرَانَكَ رَبَّنَا وَاِلَيْكَ الْمَص۪يرُ ﴿285﴾ لَا يُكَلِّفُ اللّٰهُ نَفْسًا اِلَّا وُسْعَهَاۜ لَهَا مَا كَسَبَتْ وَعَلَيْهَا مَا اكْتَسَبَتْۜ رَبَّنَا لَا تُؤَاخِذْنَٓا اِنْ نَس۪ينَٓا اَوْ اَخْطَأْنَاۚ رَبَّنَا وَلَا تَحْمِلْ عَلَيْنَٓا اِصْرًا كَمَا حَمَلْتَهُ عَلَى الَّذ۪ينَ مِنْ قَبْلِنَاۚ رَبَّنَا وَلَا تُحَمِّلْنَا مَا لَا طَاقَةَ لَنَا بِه۪ۚ وَاعْفُ عَنَّا۠ وَاغْفِرْ لَنَا۠ وَارْحَمْنَا۠ اَنْتَ مَوْلٰينَا فَانْصُرْنَا عَلَى الْقَوْمِ الْكَافِر۪ينَ ﴿286﴾  ";



        tv_arapca.setTextSize(40);
        String Path2font = "trado.ttf";
        Typeface tf = Typeface.createFromAsset(getAssets(), Path2font);
        tv_arapca.setTypeface(tf);
        tv_arapca.setText(arapca_metin);

        Button play,pause;
        final MediaPlayer mediaPlayer=MediaPlayer.create(getApplicationContext(),R.raw.dua);
        play=(Button)findViewById(R.id.btn_play_a);
        pause=(Button)findViewById(R.id.btn_pause_a);


        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();

            }
        });
        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.pause();

            }
        });


        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }
}

