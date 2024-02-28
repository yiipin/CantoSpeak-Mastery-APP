package com.example.cantospeakmastery;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;


import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import android.widget.TextView;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class IntroActivity extends AppCompatActivity {
    private String sname, msg;
    private SharedPreferences preference;

    private ViewPager screenPager;
    IntroViewPageAdapter introViewPageAdapter ;
    TabLayout tabIndicator;
    Button btnNext;
    int position = 0 ;
    Button btnGetStarted;
    Animation btnAnim ;
    TextView tvSkip;
    String abc = "hello";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);



        setContentView(R.layout.activity_intro);

        getSupportActionBar() . hide();

        btnNext = findViewById(R.id.btn_next);
        btnGetStarted = findViewById(R.id.btn_get_started);
        tabIndicator = findViewById(R.id.tab_indicator);
        btnAnim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.button_animation);
        tvSkip = findViewById(R.id.tv_skip);
        preference=getSharedPreferences("preFile", MODE_PRIVATE); //建立儲存檔
        sname=preference.getString("name", ""); //讀取資料

        if(sname == "" ) {

        }
        else {
            Intent mainActivity = new Intent(getApplicationContext(),MainActivity.class);
            startActivity(mainActivity);
            finish();
        }

        final List<ScreenItem> mList = new ArrayList<>();
        mList.add(new ScreenItem("清新簡約的設計風格","打開闖粵憑交道\n" +
                "你會感受到一種輕鬆愉悅的氣氛\n" +
                "無論是柔和悅目的主畫面\n" +
                "還是趣味十足的對話章節\n" +
                "都打破了嚴陣以待的緊張感\n",R.drawable.img1));
        mList.add(new ScreenItem("內容精簡 注重應用場景","根據應用場景進行單字分類\n" +
                "是我們的一大特色\n" +
                "99+的主題覆蓋了日常生活的大部分場景\n" +
                "實用而基礎\n",R.drawable.img2));
        mList.add(new ScreenItem("每次10分鐘\n" +
                "有效率的學會粵語\n",
                "無論快樂還是痛苦\n" +
                "學習語言都是一個漫長的過程\n" +
                "而闖粵憑交道名稱由來\n" +
                "即「闖入粵語的世界 憑藉著新的第二外語\n" +
                "和更多人進行不一樣的交流」。\n" +
                "在粵語的學習過程中\n" +
                "願你能體會到學習一門語言\n" +
                "更深層次的樂趣\n" +
                "並打開認知上的另一扇大門\n",R.drawable.img3));

        screenPager = findViewById(R.id.screen_viewpager);
        introViewPageAdapter = new IntroViewPageAdapter(this,mList);
        screenPager.setAdapter(introViewPageAdapter);

        tabIndicator.setupWithViewPager(screenPager);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                position = screenPager.getCurrentItem();
                if (position < mList.size()) {

                    position++;
                    screenPager.setCurrentItem(position);
                }

                if (position == mList.size()-1) {

                    loadLastScreen();
                }
            }
        });

        tabIndicator.addOnTabSelectedListener(new TabLayout.BaseOnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

                if (tab.getPosition() == mList.size()-1) {

                    loadLastScreen();

                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }


        });

        btnGetStarted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainActivity = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(mainActivity);
                finish();
            }
        });

        tvSkip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screenPager.setCurrentItem(mList.size());
            }
        });



    }




    private void loadLastScreen() {

        btnNext.setVisibility(View.INVISIBLE);
        btnGetStarted.setVisibility(View.VISIBLE);
        tvSkip.setVisibility(View.INVISIBLE);
        tabIndicator.setVisibility(View.INVISIBLE);
        btnGetStarted.setAnimation(btnAnim);

    }
    protected void onStop(){
        super.onStop();
        if(sname.equals("")) { //如果未建立資料就將輸入值存檔
            preference.edit()
                    .putString("name", abc)
                    .commit();
        }

    }


}