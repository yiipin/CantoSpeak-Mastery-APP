package com.example.cantospeakmastery;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;


import android.content.Intent;
import android.view.KeyEvent;

import android.view.View;

import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Toast;


import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.Timer;
import java.util.TimerTask;


public class MainActivity extends AppCompatActivity {
    private long lastClickTime = 0L;
    // 两次点击间隔不能少于1000ms
    private static final int FAST_CLICK_DELAY_TIME = 2000;
    private ImageButton Button1;
    private ImageButton Button2;
    private ImageButton Button3;
    private ImageButton Button4;
    private ImageButton Button5;
    BottomNavigationView bottomNavigationView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Toolbar toolbar = findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);



        LinearLayout Button1 =  findViewById(R.id.buttoncourse);
        Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (System.currentTimeMillis() - lastClickTime >= FAST_CLICK_DELAY_TIME) {
                    //下面进行其他操作，比如跳转等
                    opencourse();
                    lastClickTime = System.currentTimeMillis();
                }
            }
        });

        LinearLayout Button2 =  findViewById(R.id.buttonsong);
        Button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (System.currentTimeMillis() - lastClickTime >= FAST_CLICK_DELAY_TIME) {
                    //下面进行其他操作，比如跳转等
                    opensong();
                    lastClickTime = System.currentTimeMillis();
                }
            }
        });

        LinearLayout Button3 =  findViewById(R.id.buttonradio);
        Button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (System.currentTimeMillis() - lastClickTime >= FAST_CLICK_DELAY_TIME) {
                    //下面进行其他操作，比如跳转等
                    openradio();
                    lastClickTime = System.currentTimeMillis();
                }
            }
        });

        LinearLayout Button4 =  findViewById(R.id.buttonexam);
        Button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (System.currentTimeMillis() - lastClickTime >= FAST_CLICK_DELAY_TIME) {
                    //下面进行其他操作，比如跳转等
                    openexam();
                    lastClickTime = System.currentTimeMillis();
                }
            }
        });

        LinearLayout Button5 =  findViewById(R.id.buttonpodcast);
        Button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (System.currentTimeMillis() - lastClickTime >= FAST_CLICK_DELAY_TIME) {
                    //下面进行其他操作，比如跳转等
                    openpodcast();
                    lastClickTime = System.currentTimeMillis();
                }
            }
        });

    }


    public void opencourse(){
        Intent intent = new Intent(this, course.class);
        startActivity(intent);
    }
    public void opensong(){
        Intent intent = new Intent(this, song.class);
        startActivity(intent);
    }
    public void openradio(){
        Intent intent = new Intent(this, Videomenu.class);
        startActivity(intent);
    }
    public void openexam(){
        Intent intent = new Intent(this, exam_menu.class);
        startActivity(intent);
    }
    public void openpodcast(){
        Intent intent = new Intent(this, podcast.class);
        startActivity(intent);
    }

    private static Boolean isExit = false;
    private static Boolean hasTask = false;




    Timer timerExit = new Timer();
    TimerTask task = new TimerTask() {

        @Override

        public void run() {

            isExit = false;

            hasTask = true;

        }

    };



    @Override

    public boolean onKeyDown(int keyCode, KeyEvent event) {


        // 判斷是否按下Back
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            // 是否要退出
            if(isExit == false ) {

                isExit = true; //記錄下一次要退出

                Toast.makeText(this, "再按一次Back以退出APP"

                        , Toast.LENGTH_SHORT).show();

                // 如果超過兩秒則恢復預設值
                if(!hasTask) {

                    timerExit.schedule(task, 2000);

                }

            } else {
                finish(); // 離開程式

                System.exit(0);

            }

        }

        return false;

    }

}