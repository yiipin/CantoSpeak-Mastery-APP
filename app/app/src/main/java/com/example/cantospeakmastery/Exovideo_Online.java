package com.example.cantospeakmastery;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import android.widget.Button;

import android.widget.Toast;




public class Exovideo_Online extends AppCompatActivity {

    private View wrapper;
    private Button map, mapyes, mapno, car, wakeup, nowakeup, help, nohelp;


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            Toast.makeText(this, "返回情境影片選單", Toast.LENGTH_SHORT).show();
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.activity_exovideo__online);
        wrapper = findViewById(R.id.wrapper);
        map = findViewById(R.id.map);
        mapno = findViewById(R.id.mapno);
        mapyes = findViewById(R.id.mapyes);
        car = findViewById(R.id.car);
        wakeup = findViewById(R.id.wakeup);
        nowakeup = findViewById(R.id.nowakeup);
        help = findViewById(R.id.help);
        nohelp = findViewById(R.id.nohelp);
    }
}




