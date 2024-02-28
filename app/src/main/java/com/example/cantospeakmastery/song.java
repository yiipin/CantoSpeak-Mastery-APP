package com.example.cantospeakmastery;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;

import android.content.Intent;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class song extends AppCompatActivity {

    private ImageButton Button_playlist1;
    private ImageButton Button_playlist2;
    private ImageButton Button_playlist3;
    private ImageButton Button_playlist4;
    private ImageButton Button_playlist5;
    private ImageButton Button_playlist6;
    private ImageButton Button_playlist7;
    private ImageButton Button_playlist8;
    private ImageButton Button_playlist9;
    private ImageButton Button_playlist10;


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            Toast.makeText(this, "返回主選單", Toast.LENGTH_SHORT).show();
            finish();
        }
        return super.onOptionsItemSelected(item);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song);
        ActionBar actionBar=getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        Button_playlist1 = (ImageButton) findViewById(R.id.button_playlist1);
        Button_playlist1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.youtube.com/playlist?list=PLHOetF9otEj4oC7mJcDy-GLgpTJNfg7nz");//ALL OUT 70s
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        Button_playlist2 = (ImageButton) findViewById(R.id.button_playlist2);
        Button_playlist2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.youtube.com/playlist?list=PLHOetF9otEj6TMMoecpUnm0I6zVKP7IwV");//ALL OUT 80s
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        Button_playlist3 = (ImageButton) findViewById(R.id.button_playlist3);
        Button_playlist3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.youtube.com/playlist?list=PLHOetF9otEj7CA6GYIBxF20a43hjoafDL");//ALL OUT 90s
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        Button_playlist4 = (ImageButton) findViewById(R.id.button_playlist4);
        Button_playlist4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.youtube.com/playlist?list=PLHOetF9otEj76Yg8W2B0Kq3cgl_ueVhwS");//ALL OUT 00s
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });



        Button_playlist7 = (ImageButton) findViewById(R.id.button_playlist7);
        Button_playlist7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.youtube.com/playlist?list=PLHOetF9otEj7WvW_RVxNjEGEkcNhK9Y-B");//hithop
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        Button_playlist8 = (ImageButton) findViewById(R.id.button_playlist8);
        Button_playlist8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.youtube.com/playlist?list=PLHOetF9otEj5k1fDdkddA1lAW_U6gEfdp");//最佳情歌
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        Button_playlist9 = (ImageButton) findViewById(R.id.button_playlist9);
        Button_playlist9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.youtube.com/playlist?list=PLHOetF9otEj7Fq_Ceh4hpXGd8NU2WZJpp");//10s the best
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        Button_playlist10 = (ImageButton) findViewById(R.id.button_playlist10);
        Button_playlist10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Uri uri = Uri.parse("https://www.youtube.com/playlist?list=PLHOetF9otEj796MqtGjVM6r344BkqJr82");//最hit粵語榜
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);

            }
        });

    }

}
