package com.example.cantospeakmastery;


import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class course_conversation_exchange extends AppCompatActivity {

    ListView listView;
    MediaPlayer mediaPlayer = new MediaPlayer();
    MediaPlayer cex1, cex2, cex3, cex4, cex5, cex6, cex7, cex8, cex9, cex10;

    String[] lvItems = new String[]{"我可以把這些換成港幣嗎？",
            "我可以在這裡換旅行支票嗎?",
            "可以告訴我現在港幣的匯率是多少嗎？",
            "一塊港幣能換多少人民幣?",
            "我想要把大鈔換成零錢可以嗎？",
            "請給我5張100元和1張500元。",
            "你們換匯會額外收手續費嗎？",
            "為我要小面額的錢",
            "這些100元鈔票太破舊了",
            "請問貨幣兌換櫃檯在哪裡?",
    };
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            Toast.makeText(this, "返回情境會話選單", Toast.LENGTH_SHORT).show();
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_conversation_exchange);
        ActionBar actionBar=getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        listView = findViewById(R.id.exchange_listview);
        final List<String> airplanList = new ArrayList<String>(Arrays.asList(lvItems));
        listView.setAdapter(new ArrayAdapter<String>(
                this, android.R.layout.simple_list_item_1, airplanList){
            public View getView(int position, View convertView, ViewGroup parent) {

                // Return the GridView current item as a View
                View view = super.getView(position,convertView,parent);

                // Convert the view as a TextView widget
                TextView tv = (TextView) view;
                tv.setTextSize(25);
                tv.setTextColor(getResources().getColor(R.color.maintext));
                // Set the TextView text (GridView item text)
                tv.setText(airplanList.get(position));

                return tv;
            }
        });
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(getApplicationContext(),
                        "" + lvItems[position],
                        Toast.LENGTH_SHORT).show();
            }
        });

        cex1 = mediaPlayer.create(course_conversation_exchange.this, R.raw.cex1);
        cex2 = mediaPlayer.create(course_conversation_exchange.this, R.raw.cex2);
        cex3 = mediaPlayer.create(course_conversation_exchange.this, R.raw.cex3);
        cex4 = mediaPlayer.create(course_conversation_exchange.this, R.raw.cex4);
        cex5 = mediaPlayer.create(course_conversation_exchange.this, R.raw.cex5);
        cex6 = mediaPlayer.create(course_conversation_exchange.this, R.raw.cex6);
        cex7 = mediaPlayer.create(course_conversation_exchange.this, R.raw.cex7);
        cex8 = mediaPlayer.create(course_conversation_exchange.this, R.raw.cex8);
        cex9 = mediaPlayer.create(course_conversation_exchange.this, R.raw.cex9);
        cex10 = mediaPlayer.create(course_conversation_exchange.this, R.raw.cex10);



        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (mediaPlayer != null){mediaPlayer.release();}
                switch (position) {

                    case 0:
                        cex1.start();
                        break;
                    case 1:
                        cex2.start();
                        break;
                    case 2:
                        cex3.start();
                        break;
                    case 3:
                        cex4.start();
                        break;
                    case 4:
                        cex5.start();
                        break;
                    case 5:
                        cex6.start();
                        break;
                    case 6:
                        cex7.start();
                        break;
                    case 7:
                        cex8.start();
                        break;
                    case 8:
                        cex9.start();
                        break;
                    case 9:
                        cex10.start();
                        break;


                }
                return;
            }
        });
    }
}
