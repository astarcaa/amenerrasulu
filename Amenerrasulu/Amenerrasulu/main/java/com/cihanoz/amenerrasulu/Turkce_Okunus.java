package com.cihanoz.amenerrasulu;


import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class Turkce_Okunus extends AppCompatActivity {
    TextView tv_turkce_okunus;
    String turkce_okunus_metin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turkce__okunus);

        tv_turkce_okunus=(TextView)findViewById(R.id.tv_turkce_okunus);
        turkce_okunus_metin="Amenerrasulü bima ünzile ileyhi mirrabbihi vel mü'minun, küllün amene billahi vemelaiketihi ve kütübihi ve rusülih, la nüferriku beyne ehadin min rusülih, ve kalu semi'na ve ata'na gufraneke rabbena ve ileykelmesir. La yükellifullahü nefsenilla vüs'aha, leha ma kesebet ve aleyha, mektesebet, rabbena latüahızna innesiyna ev ahta'na, rabbena vela tahmil aleyna ısran kema hameltehü alelleziyne min gablina, rabbena vela tühammilna, mala takatelena bih, va'fü anna, vağfirlena, verhamna, ente mevlana fensurna alel gavmil kafiriyn.\n\t\n" +
                "\n";
        tv_turkce_okunus.setText(turkce_okunus_metin);


        Button play,pause;
        final MediaPlayer mediaPlayer=MediaPlayer.create(getApplicationContext(),R.raw.dua);
        play=(Button)findViewById(R.id.btn_play_o);
        pause=(Button)findViewById(R.id.btn_pause_o);


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
