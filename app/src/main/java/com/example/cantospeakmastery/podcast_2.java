package com.example.cantospeakmastery;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class podcast_2 extends AppCompatActivity {
    private long lastClickTime = 0L;
    // 两次点击间隔不能少于1000ms
    private static final int FAST_CLICK_DELAY_TIME = 2000;


    Button podcastf01,podcastf02,podcastf03,podcastf04,podcastf05;

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            Toast.makeText(this, "返回播客選單", Toast.LENGTH_SHORT).show();
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_podcast_2);
        ActionBar actionBar=getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);



        CardView pt1 = (CardView ) findViewById(R.id.podcastsong1);
        pt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 if (System.currentTimeMillis() - lastClickTime >= FAST_CLICK_DELAY_TIME) {
                     //下面进行其他操作，比如跳转等
                     Intent intent = new Intent(podcast_2.this, podcasttest01.class);     //创建Intent
                     intent.putExtra("detail_name", "EP1");  //将要传递的信息放入Intent
                     intent.putExtra("detail_img", R.drawable.podcast_img_fudo1);
                     intent.putExtra("detail_song", R.raw.pf01);
                     startActivity(intent);
                 }

            }
        });
        CardView pt2 = findViewById(R.id.podcastsong2);
        pt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 if (System.currentTimeMillis() - lastClickTime >= FAST_CLICK_DELAY_TIME) {
                     //下面进行其他操作，比如跳转等
                     Intent intent = new Intent(podcast_2.this, podcasttest01.class);     //创建Intent
                     intent.putExtra("detail_name", "EP2");  //将要传递的信息放入Intent
                     intent.putExtra("detail_img", R.drawable.podcast_img_fudo2);
                     intent.putExtra("detail_song", R.raw.pf02);
                     startActivity(intent);
                 }
            }
        });
        CardView pt3 = findViewById(R.id.podcastsong3);
        pt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 if (System.currentTimeMillis() - lastClickTime >= FAST_CLICK_DELAY_TIME) {
                     //下面进行其他操作，比如跳转等
                     Intent intent = new Intent(podcast_2.this, podcasttest01.class);     //创建Intent
                     intent.putExtra("detail_name", "EP3");  //将要传递的信息放入Intent
                     intent.putExtra("detail_img", R.drawable.podcast_img_fudo3);
                     intent.putExtra("detail_song", R.raw.pf03);
                     startActivity(intent);
                 }
            }
        });
        CardView pt4 = findViewById(R.id.podcastsong4);
        pt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 if (System.currentTimeMillis() - lastClickTime >= FAST_CLICK_DELAY_TIME) {
                     //下面进行其他操作，比如跳转等
                     Intent intent = new Intent(podcast_2.this, podcasttest01.class);     //创建Intent
                     intent.putExtra("detail_name", "EP4");  //将要传递的信息放入Intent
                     intent.putExtra("detail_img", R.drawable.podcast_img_fudo4);
                     intent.putExtra("detail_song", R.raw.pf04);
                     startActivity(intent);
                 }
            }
        });
        CardView pt5 = findViewById(R.id.podcastsong5);
        pt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 if (System.currentTimeMillis() - lastClickTime >= FAST_CLICK_DELAY_TIME) {
                     //下面进行其他操作，比如跳转等
                     Intent intent = new Intent(podcast_2.this, podcasttest01.class);     //创建Intent
                     intent.putExtra("detail_name", "EP5");  //将要传递的信息放入Intent
                     intent.putExtra("detail_img", R.drawable.podcast_img_fudo5);
                     intent.putExtra("detail_song", R.raw.pf05);
                     startActivity(intent);
                 }
            }
        });






        podcastf01 =(Button) findViewById(R.id.podcastf01);
        podcastf01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialogf1();
            }
        });

        podcastf02 =(Button) findViewById(R.id.podcastf02);
        podcastf02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialogf2();
            }
        });

        podcastf03 =(Button) findViewById(R.id.podcastf03);
        podcastf03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialogf3();
            }
        });

        podcastf04 =(Button) findViewById(R.id.podcastf04);
        podcastf04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialogf4();
            }
        });
        podcastf05 =(Button) findViewById(R.id.podcastf05);
        podcastf05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialogf5();
            }
        });



    }


   
    private void openDialogf1() {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(podcast_2.this);
        alertDialog.setTitle("大馬探靈第一人以自然科學證實靈體存在 | FUDO PODCAST《富都播客》- EP1 Geink Noise aka 鬼黃陀 (粤语)");
        alertDialog.setMessage("『Geink Noise aka 鬼黃陀』單人匹馬探究最猛鬼之地，大馬最Indie探靈王以誠意與儀器同靈體直接溝通，以工業用儀器，超聲波，磁場探測器，以知識理論追尋自然真相，以實驗心態，一個人一部機記錄低與古魂對話過程。" +
                "#GeinkNoise #鬼黃陀 #靈異錄 #探靈王 #026  #別人可能說他很瘋癲 #但只能說人類實在太膚淺" );
        alertDialog.setPositiveButton("返回", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        alertDialog.setCancelable(false);
        alertDialog.show();
    }

    private void openDialogf2() {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(podcast_2.this);
        alertDialog.setTitle("EP02 夢想起跑線");
        alertDialog.setMessage("繼續行老土路線～\uD83D\uDE48 \n" +
                "今集講夢想\uD83D\uDCAD \n" +
                "唔知你有無夢想呢\uD83D\uDE1B \n" +
                "你又如何看待自己的夢想呢\uD83D\uDE09 \n" +
                "這個podcast 就是我的夢想起跑線，你會支持我嗎？☺️\n");
        alertDialog.setPositiveButton("返回", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });

        alertDialog.setCancelable(false);
        alertDialog.show();
    }

    private void openDialogf3() {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(podcast_2.this);
        alertDialog.setTitle("EP03 疫情下的線上體驗");
        alertDialog.setMessage("疫情下，不知道大家有沒有做了什麼特別的事呢？ \n" +
                "大大就找了不同的海外線上體驗！ \n" +
                "跟很多來自不同國家的主持跟我分享他們的生活及智慧～ \n" +
                "一個podcast 就可以跳出自己的國家聽別人的故事～\n");
        alertDialog.setPositiveButton("返回", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });

        alertDialog.setCancelable(false);
        alertDialog.show();
    }

    private void openDialogf4() {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(podcast_2.this);
        alertDialog.setTitle("EP04 怦然心動的人生整理魔法");
        alertDialog.setMessage("雖然大大是處女座\uD83D\uDE48\n" +
                "大大就找了不同的海外線上體驗！ \n" +
                "跟很多來自不同國家的主持跟我分享他們的生活及智慧～ \n" +
                "一個podcast 就可以跳出自己的國家聽別人的故事～\n");
        alertDialog.setPositiveButton("返回", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });

        alertDialog.setCancelable(false);
        alertDialog.show();
    }

    private void openDialogf5() {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(podcast_2.this);
        alertDialog.setTitle("EP05 給27歲的我");
        alertDialog.setMessage("疫情下，不知道大家有沒有做了什麼特別的事呢？ \n" +
                "大大就找了不同的海外線上體驗！ \n" +
                "跟很多來自不同國家的主持跟我分享他們的生活及智慧～ \n" +
                "一個podcast 就可以跳出自己的國家聽別人的故事～\n");
        alertDialog.setPositiveButton("返回", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });

        alertDialog.setCancelable(false);
        alertDialog.show();
    }






}