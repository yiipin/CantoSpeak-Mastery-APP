package com.example.cantospeakmastery;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;

import android.os.Build;
import android.os.Bundle;

import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import android.widget.Button;

import android.widget.Toast;



public class Exovideo_Online2 extends AppCompatActivity {

    private View wrapper;
    private Button gossip,album,ticket,party,date,movie;


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
        ActionBar actionBar=getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.activity_exovideo__online2);
        wrapper = findViewById(R.id.wrapper);
        gossip = findViewById(R.id.gossip);
        album = findViewById(R.id.album);
        ticket = findViewById(R.id.ticket);
        party = findViewById(R.id.party);
        date = findViewById(R.id.date);
        movie = findViewById(R.id.moive);


    }
}
