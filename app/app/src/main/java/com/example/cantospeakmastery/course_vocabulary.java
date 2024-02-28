package com.example.cantospeakmastery;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;

import java.util.ArrayList;


import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;

public class course_vocabulary extends AppCompatActivity {

    int[] ids={R.raw.b01,R.raw.b02,R.raw.b03,R.raw.b04,R.raw.b05,R.raw.b06,R.raw.b07,R.raw.b08,R.raw.b09,
            R.raw.b10,R.raw.b11,R.raw.b12,R.raw.b13,R.raw.b14,R.raw.b15,R.raw.b16,R.raw.b17,R.raw.b18,R.raw.b19,
            R.raw.b20,R.raw.b21,R.raw.b22,R.raw.b23,R.raw.b24,R.raw.b25,R.raw.b26,R.raw.b27,R.raw.b28,R.raw.b29,
            R.raw.b30,R.raw.b31,R.raw.b32,R.raw.b33,R.raw.b34,R.raw.b35,R.raw.b36,R.raw.b37,R.raw.b38,R.raw.b39};
    MediaPlayer player = new MediaPlayer();


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            Toast.makeText(this, "返回日常用語選單", Toast.LENGTH_SHORT).show();
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_vocabulary);
        ActionBar actionBar=getSupportActionBar();//顯示返回
        actionBar.setDisplayHomeAsUpEnabled(true);//顯示返回

        ArrayList<SearchResults> searchResults = GetSearchResults();

        final ListView lv = (ListView) findViewById(R.id.srListView);
        lv.setAdapter(new MyCustomBaseAdapter(this, searchResults));

        lv.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> a, View v, int position, long id) {
                if (player != null){player.release();}

                player = MediaPlayer.create(course_vocabulary.this,ids[position]);
                player.start();

            }
        });
    }

    private ArrayList<SearchResults> GetSearchResults(){
        ArrayList<SearchResults> results = new ArrayList<SearchResults>();

        //1
        SearchResults sr = new SearchResults();
        sr.setvocabulary("唔該");
        sr.setChinese("請、勞駕、麻煩你、謝謝");
        sr.setspelling("m4 goi1");
        results.add(sr);

        //2
        sr = new SearchResults();
        sr.setvocabulary("埋單");
        sr.setChinese("結帳");
        sr.setspelling("maai4 daan1");
        results.add(sr);

        //3
        sr = new SearchResults();
        sr.setvocabulary("落單");
        sr.setChinese("點菜");
        sr.setspelling("lok6 daan1");
        results.add(sr);

        //4
        sr = new SearchResults();
        sr.setvocabulary("加水");
        sr.setChinese("添水");
        sr.setspelling("gaa1 seoi2");
        results.add(sr);

        //5
        sr = new SearchResults();
        sr.setvocabulary("斟水");
        sr.setChinese("倒水");
        sr.setspelling("zam1 seoi2");
        results.add(sr);

        //6
        sr = new SearchResults();
        sr.setvocabulary("開門");
        sr.setChinese("開門");
        sr.setspelling("hoi1 mun4");
        results.add(sr);

        //7
        sr = new SearchResults();
        sr.setvocabulary("閂門");
        sr.setChinese("關門");
        sr.setspelling("saan1 mun4");
        results.add(sr);

        //8
        sr = new SearchResults();
        sr.setvocabulary("熄燈");
        sr.setChinese("關燈");
        sr.setspelling("sik1 dang1");
        results.add(sr);

        //9
        sr = new SearchResults();
        sr.setvocabulary("靜啲");
        sr.setChinese("安靜點");
        sr.setspelling("zing6 di1");
        results.add(sr);

        //10
        sr = new SearchResults();
        sr.setvocabulary("前面");
        sr.setChinese("前面");
        sr.setspelling("cin4 min6");
        results.add(sr);

        //11
        sr = new SearchResults();
        sr.setvocabulary("巴士站");
        sr.setChinese("公車站");
        sr.setspelling("baa1 si2 zaam6");
        results.add(sr);

        //12
        sr = new SearchResults();
        sr.setvocabulary("街市");
        sr.setChinese("菜市場");
        sr.setspelling("gaai1 si5");
        results.add(sr);

        //13
        sr = new SearchResults();
        sr.setvocabulary("火車站");
        sr.setChinese("火車站");
        sr.setspelling("fo2 ce1 zaam6");
        results.add(sr);

        //14
        sr = new SearchResults();
        sr.setvocabulary("地鐵站");
        sr.setChinese("地鐵站");
        sr.setspelling("dei6 tit3 zaam6");
        results.add(sr);

        //15
        sr = new SearchResults();
        sr.setvocabulary("轉彎");
        sr.setChinese("拐彎");
        sr.setspelling("zyun3 waan1");
        results.add(sr);

        //16
        sr = new SearchResults();
        sr.setvocabulary("多謝");
        sr.setChinese("謝謝");
        sr.setspelling("do1 ze6");
        results.add(sr);

        //17
        sr = new SearchResults();
        sr.setvocabulary("睇戲");
        sr.setChinese("看電影");
        sr.setspelling("tai2 hei3");
        results.add(sr);

        //18
        sr = new SearchResults();
        sr.setvocabulary("去旅行");
        sr.setChinese("去旅行");
        sr.setspelling("heoi3 leoi5 hang4");
        results.add(sr);

        //19
        sr = new SearchResults();
        sr.setvocabulary("唱K");
        sr.setChinese("唱卡拉ＯＫ");
        sr.setspelling("coeng3 kei1");
        results.add(sr);

        //20
        sr = new SearchResults();
        sr.setvocabulary("照顧");
        sr.setChinese("照顧");
        sr.setspelling("ziu3 gu3");
        results.add(sr);

        //21
        sr = new SearchResults();
        sr.setvocabulary("體諒");
        sr.setChinese("體諒");
        sr.setspelling("tai2 loeng6");
        results.add(sr);

        //22
        sr = new SearchResults();
        sr.setvocabulary("英文");
        sr.setChinese("英文");
        sr.setspelling("Jing1 Man2");
        results.add(sr);

        //23
        sr = new SearchResults();
        sr.setvocabulary("飲咩果汁");
        sr.setChinese("喝甚麼果汁");
        sr.setspelling("jam2 me1 gwo2 zap1");
        results.add(sr);

        //24
        sr = new SearchResults();
        sr.setvocabulary("咩零食");
        sr.setChinese("甚麼小吃/零嘴");
        sr.setspelling("me1 ling4 sik6");
        results.add(sr);

        //25
        sr = new SearchResults();
        sr.setvocabulary("點");
        sr.setChinese("怎麼樣 / 怎麼");
        sr.setspelling("dim2");
        results.add(sr);

        //26
        sr = new SearchResults();
        sr.setvocabulary("早晨");
        sr.setChinese("早安");
        sr.setspelling("Zou2 san4");
        results.add(sr);

        //27
        sr = new SearchResults();
        sr.setvocabulary("午安");
        sr.setChinese("午安");
        sr.setspelling("ng5 ngon1");
        results.add(sr);

        //28
        sr = new SearchResults();
        sr.setvocabulary("早唞");
        sr.setChinese("晚安");
        sr.setspelling("Zou2 tau2");
        results.add(sr);

        //29
        sr = new SearchResults();
        sr.setvocabulary("多謝");
        sr.setChinese("謝謝");
        sr.setspelling("ze6 ze6");
        results.add(sr);

        //30
        sr = new SearchResults();
        sr.setvocabulary("對唔住");
        sr.setChinese("對不起");
        sr.setspelling("deoi3 m4 zyu6");
        results.add(sr);

        //31
        sr = new SearchResults();
        sr.setvocabulary("你好");
        sr.setChinese("你好");
        sr.setspelling("nei5 hou2");
        results.add(sr);

        //32
        sr = new SearchResults();
        sr.setvocabulary("洗手間");
        sr.setChinese("廁所");
        sr.setspelling("sai2 sau2 gaan1");
        results.add(sr);

        //33
        sr = new SearchResults();
        sr.setvocabulary("餐廳");
        sr.setChinese("餐廳");
        sr.setspelling("caan1 teng1");
        results.add(sr);

        //34
        sr = new SearchResults();
        sr.setvocabulary("停車場");
        sr.setChinese("停車場");
        sr.setspelling("ting4 ce1 coeng4");
        results.add(sr);

        //35
        sr = new SearchResults();
        sr.setvocabulary("講畀我知");
        sr.setChinese("告訴我");
        sr.setspelling("gong2 bei2 ngo5 zi1");
        results.add(sr);

        //36
        sr = new SearchResults();
        sr.setvocabulary("最好");
        sr.setChinese("最好");
        sr.setspelling("zeoi3 hou2");
        results.add(sr);

        //37
        sr = new SearchResults();
        sr.setvocabulary("一定要");
        sr.setChinese("一定要");
        sr.setspelling("jat1 ding6 jiu3");
        results.add(sr);

        //38
        sr = new SearchResults();
        sr.setvocabulary("介唔介意");
        sr.setChinese("介不介意");
        sr.setspelling("gaai3 m4 gaai3 ji3");
        results.add(sr);

        //39
        sr = new SearchResults();
        sr.setvocabulary("方唔方便");
        sr.setChinese("方不方便");
        sr.setspelling("fong1 m4 fong1 bin6");
        results.add(sr);

        return results;
    }
}
