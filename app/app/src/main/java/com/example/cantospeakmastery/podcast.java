package com.example.cantospeakmastery;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.content.Intent;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import android.widget.Toast;


public class podcast extends AppCompatActivity {
    private long lastClickTime = 0L;
    // 两次点击间隔不能少于1000ms
    private static final int FAST_CLICK_DELAY_TIME = 2000;
    Button podcastinfob,podcastinfof,enter,enter2;


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            Toast.makeText(this, "返回主畫面", Toast.LENGTH_SHORT).show();
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_podcast);
        ActionBar actionBar=getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        podcastinfob = findViewById(R.id.podcastinfob);
        podcastinfof = findViewById(R.id.podcastinfof);
        enter = findViewById(R.id.enter);
        enter2 = findViewById(R.id.enter2);
        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (System.currentTimeMillis() - lastClickTime >= FAST_CLICK_DELAY_TIME) {
                    //下面进行其他操作，比如跳转等
                    openpodcast_playlist1();
                    lastClickTime = System.currentTimeMillis();
                }

            }
        });



        enter2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (System.currentTimeMillis() - lastClickTime >= FAST_CLICK_DELAY_TIME) {
                    //下面进行其他操作，比如跳转等
                    openpodcast_playlist2();
                    lastClickTime = System.currentTimeMillis();
                }
            }
        });

        podcastinfob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialoginfob();
            }
        });
        podcastinfof.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialoginfof();
            }
        });
    }
    private void openDialoginfob() {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(podcast.this);
        alertDialog.setTitle("個人簡介");
        alertDialog.setMessage("大在播｜廣東話podcast\n" +
                "大大Diana\n" +
                "愛好\n" +
                "大在播\uD83C\uDFA7｜大大正在廣播\uD83C\uDF99️\n" +
                "一位夢想成為DJ的小女孩\uD83D\uDCFB\n" +
                "希望透過podcast分享生活日常\uD83C\uDF88\n" +
                "談夢想\uD83D\uDCAD 談想法\uD83D\uDD06 談愛情\uD83D\uDC95 談生活\uD83D\uDCDA\n" +
                "IG: daijoibor\n");
        alertDialog.setPositiveButton("確定", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        alertDialog.setCancelable(false);
        alertDialog.show();
    }
    private void openDialoginfof() {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(podcast.this);
        alertDialog.setTitle("個人簡介");
        alertDialog.setMessage("富都播客噏乜都得，一個以粵語為主嘅馬來西亞播客，每一集都會誠邀各領域奇才，嘉賓老友上嚟鳩吹一番，務求要大家聽得過癮，嗒得輕鬆，Chill住嚟同大家傾計講故事，探討人生意義。\n" +
                "Subscribe Youtube : Fudo Records  FB & IG : Fudo Records\n");
        alertDialog.setPositiveButton("確定", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        alertDialog.setCancelable(false);
        alertDialog.show();
    }


    public void openpodcast_playlist1(){
        Intent intent = new Intent(this, podcast_1.class);
        startActivity(intent);
    }
    public void openpodcast_playlist2(){
        Intent intent = new Intent(this, podcast_2.class);
        startActivity(intent);
    }




}
