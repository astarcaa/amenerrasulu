package com.cihanoz.amenerrasulu;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class Meali extends AppCompatActivity {
    TextView tv_meal;
    String meal_metni;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meali);

        tv_meal=(TextView)findViewById(R.id.tv_meali);
        meal_metni="Rahmân ve Rahîm olan Allah'ın Adıyla\t\t\n" +
                "\t\t\n" +
                "\n" +
                "Peygamber, Rabbinden kendisine indirilene iman etti, mü’minler de (iman ettiler). Her biri; Allah’a, meleklerine, kitaplarına ve peygamberlerine iman ettiler ve şöyle dediler: “Onun peygamberlerinden hiçbirini (diğerinden) ayırt etmeyiz.” Şöyle de dediler: “İşittik ve itaat ettik. Ey Rabbimiz! Senden bağışlama dileriz. Sonunda dönüş yalnız sanadır.” Bakara 285\n" +
                "Allah bir kimseyi ancak gücünün yettiği şeyle yükümlü kılar. Onun kazandığı iyilik kendi yararına, kötülük de kendi zararınadır. (Şöyle diyerek dua ediniz): “Ey Rabbimiz! Unutur, ya da yanılırsak bizi sorumlu tutma! Ey Rabbimiz! Bize, bizden öncekilere yüklediğin gibi ağır yük yükleme. Ey Rabbimiz! Bize gücümüzün yetmediği şeyleri yükleme! Bizi affet, bizi bağışla, bize acı! Sen bizim Mevlâmızsın. Kâfirler topluluğuna karşı bize yardım et.” Bakara 286.\n" +

                " \t\n" +

                               "\n";
        tv_meal.setText(meal_metni);

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

    }
}
