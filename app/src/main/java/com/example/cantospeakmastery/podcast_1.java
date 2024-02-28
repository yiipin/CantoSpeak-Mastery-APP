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




public class podcast_1 extends AppCompatActivity {
    private long lastClickTime = 0L;
    // 两次点击间隔不能少于1000ms
    private static final int FAST_CLICK_DELAY_TIME = 2000;


    Button podcastb01,podcastb02,podcastb03,podcastb04,podcastb05,
            podcastb06,podcastb07,podcastb08,podcastb09,podcastb10;

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
        setContentView(R.layout.activity_podcast_1);
        ActionBar actionBar=getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);



        CardView pt1 = (CardView ) findViewById(R.id.pt1);
        pt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (System.currentTimeMillis() - lastClickTime >= FAST_CLICK_DELAY_TIME) {
                    //下面进行其他操作，比如跳转等
                    Intent intent = new Intent(podcast_1.this,podcasttest01.class);     //创建Intent
                    intent.putExtra("detail_name","EP1");  //将要传递的信息放入Intent
                    intent.putExtra("detail_img",R.drawable.podcast_img_big1);
                    intent.putExtra("detail_song",R.raw.pb01);
                    startActivity(intent);
                }


            }
        });
        CardView pt2 = findViewById(R.id.pt2);
        pt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (System.currentTimeMillis() - lastClickTime >= FAST_CLICK_DELAY_TIME) {
                    //下面进行其他操作，比如跳转等
                    Intent intent = new Intent(podcast_1.this, podcasttest01.class);     //创建Intent
                    intent.putExtra("detail_name", "EP2");  //将要传递的信息放入Intent
                    intent.putExtra("detail_img", R.drawable.podcast_img_big2);
                    intent.putExtra("detail_song", R.raw.pb02);
                    startActivity(intent);
                }
            }
        });
        CardView pt3 = findViewById(R.id.pt3);
        pt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (System.currentTimeMillis() - lastClickTime >= FAST_CLICK_DELAY_TIME) {
                    //下面进行其他操作，比如跳转等
                    Intent intent = new Intent(podcast_1.this, podcasttest01.class);     //创建Intent
                    intent.putExtra("detail_name", "EP3");  //将要传递的信息放入Intent
                    intent.putExtra("detail_img", R.drawable.podcast_img_big3);
                    intent.putExtra("detail_song", R.raw.pb03);
                    startActivity(intent);
                }
            }
        });
        CardView pt4 = findViewById(R.id.pt4);
        pt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (System.currentTimeMillis() - lastClickTime >= FAST_CLICK_DELAY_TIME) {
                    //下面进行其他操作，比如跳转等
                    Intent intent = new Intent(podcast_1.this, podcasttest01.class);     //创建Intent
                    intent.putExtra("detail_name", "EP4");  //将要传递的信息放入Intent
                    intent.putExtra("detail_img", R.drawable.podcast_img_big4);
                    intent.putExtra("detail_song", R.raw.pb04);
                    startActivity(intent);
                }
            }
        });
        CardView pt5 = findViewById(R.id.pt5);
        pt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (System.currentTimeMillis() - lastClickTime >= FAST_CLICK_DELAY_TIME) {
                    //下面进行其他操作，比如跳转等
                    Intent intent = new Intent(podcast_1.this, podcasttest01.class);     //创建Intent
                    intent.putExtra("detail_name", "EP5");  //将要传递的信息放入Intent
                    intent.putExtra("detail_img", R.drawable.podcast_img_big5);
                    intent.putExtra("detail_song", R.raw.pb05);
                    startActivity(intent);
                }
            }
        });
        CardView pt6 = findViewById(R.id.pt6);
        pt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (System.currentTimeMillis() - lastClickTime >= FAST_CLICK_DELAY_TIME) {
                    //下面进行其他操作，比如跳转等
                    Intent intent = new Intent(podcast_1.this, podcasttest01.class);     //创建Intent
                    intent.putExtra("detail_name", "EP6");  //将要传递的信息放入Intent
                    intent.putExtra("detail_img", R.drawable.podcast_img_big6);
                    intent.putExtra("detail_song", R.raw.pb06);
                    startActivity(intent);
                }
            }
        });
        CardView pt7 = findViewById(R.id.pt7);
        pt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (System.currentTimeMillis() - lastClickTime >= FAST_CLICK_DELAY_TIME) {
                    //下面进行其他操作，比如跳转等
                    Intent intent = new Intent(podcast_1.this, podcasttest01.class);     //创建Intent
                    intent.putExtra("detail_name", "EP7");  //将要传递的信息放入Intent
                    intent.putExtra("detail_img", R.drawable.podcast_img_big7);
                    intent.putExtra("detail_song", R.raw.pb07);
                    startActivity(intent);
                }
            }
        });
        CardView pt8 = findViewById(R.id.pt8);
        pt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (System.currentTimeMillis() - lastClickTime >= FAST_CLICK_DELAY_TIME) {
                    //下面进行其他操作，比如跳转等
                    Intent intent = new Intent(podcast_1.this, podcasttest01.class);     //创建Intent
                    intent.putExtra("detail_name", "EP8");  //将要传递的信息放入Intent
                    intent.putExtra("detail_img", R.drawable.podcast_img_big8);
                    intent.putExtra("detail_song", R.raw.pb08);
                    startActivity(intent);
                }
            }
        });
        CardView pt9 = findViewById(R.id.pt9);
        pt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (System.currentTimeMillis() - lastClickTime >= FAST_CLICK_DELAY_TIME) {
                    //下面进行其他操作，比如跳转等
                    Intent intent = new Intent(podcast_1.this, podcasttest01.class);     //创建Intent
                    intent.putExtra("detail_name", "EP9");  //将要传递的信息放入Intent
                    intent.putExtra("detail_img", R.drawable.podcast_img_big9);
                    intent.putExtra("detail_song", R.raw.pb09);
                    startActivity(intent);
                }
            }
        });
        CardView pt10 = findViewById(R.id.pt10);
        pt10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (System.currentTimeMillis() - lastClickTime >= FAST_CLICK_DELAY_TIME) {
                    //下面进行其他操作，比如跳转等
                    Intent intent = new Intent(podcast_1.this, podcasttest01.class);     //创建Intent
                    intent.putExtra("detail_name", "EP10");  //将要传递的信息放入Intent
                    intent.putExtra("detail_img", R.drawable.podcast_img_big10);
                    intent.putExtra("detail_song", R.raw.pb10);
                    startActivity(intent);
                }
            }
        });




        podcastb01 =(Button) findViewById(R.id.podcastb01);
        podcastb01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialogb1();
            }
        });
        podcastb02 =(Button) findViewById(R.id.podcastb02);
        podcastb02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialogb2();
            }
        });
        podcastb03 =(Button) findViewById(R.id.podcastb03);
        podcastb03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialogb3();
            }
        });
        podcastb04 =(Button) findViewById(R.id.podcastb04);
        podcastb04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialogb4();
            }
        });
        podcastb05 =(Button) findViewById(R.id.podcastb05);
        podcastb05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialogb5();
            }
        });
        podcastb06 =(Button) findViewById(R.id.podcastb06);
        podcastb06.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialogb6();
            }
        });
        podcastb07 =(Button) findViewById(R.id.podcastb07);
        podcastb07.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialogb7();
            }
        });
        podcastb08 =(Button) findViewById(R.id.podcastb08);
        podcastb08.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialogb8();
            }
        });
        podcastb09 =(Button) findViewById(R.id.podcastb09);
        podcastb09.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialogb9();
            }
        });
        podcastb10 =(Button) findViewById(R.id.podcastb10);
        podcastb10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialogb10();
            }
        });


    }




    private void openDialogb1() {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(podcast_1.this);
        alertDialog.setTitle("EP01 老土自我介紹");
        alertDialog.setMessage("第一次做podcast 請大家多多包涵&鼓勵～ \n" +
                "很老套地 第一集當然是自我介紹 哈哈～ \n" +
                "開始podcast 的原因是因為自己想做一個電台主持 \n" +
                "或者podcast 會是一個新的平台讓我可以實現夢想吧！ \n" +
                "希望自己會持之以恆，亦希望大家會enjoy啦！\n");
        alertDialog.setPositiveButton("返回", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        alertDialog.setCancelable(false);
        alertDialog.show();
    }

    private void openDialogb2() {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(podcast_1.this);
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

    private void openDialogb3() {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(podcast_1.this);
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

    private void openDialogb4() {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(podcast_1.this);
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

    private void openDialogb5() {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(podcast_1.this);
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

    private void openDialogb6() {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(podcast_1.this);
        alertDialog.setTitle("EP06 你上癮了嗎？社交媒體的影響");
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

    private void openDialogb7() {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(podcast_1.this);
        alertDialog.setTitle("EP07 我的澳洲Working Holiday (上)");
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

    private void openDialogb8() {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(podcast_1.this);
        alertDialog.setTitle("EP08 我的澳洲Working Holiday (下) Road Trip!");
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

    private void openDialogb9() {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(podcast_1.this);
        alertDialog.setTitle("EP09 工作的意義");
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

    private void openDialogb10() {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(podcast_1.this);
        alertDialog.setTitle("EP10 #班門弄FOOL 我是解夢分析師");
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



    @Override
    protected void onDestroy(){
        super.onDestroy();

        return;
    }






}