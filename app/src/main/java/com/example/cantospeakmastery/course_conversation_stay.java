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


public class course_conversation_stay extends AppCompatActivity  {

    ListView listView;
    MediaPlayer mediaPlayer = new MediaPlayer();
    MediaPlayer cst1, cst2, cst3, cst4, cst5, cst6, cst7, cst8, cst9, cst10, cst11;

    String[] lvItems = new String[]{"我想要在8月7日訂一間雙人房",
            "請問現在還有空房嗎?",
            "請問有提供衛浴用品供我們使用嗎?",
            "客房可容納的最多人數包括兒童嗎?",
            "最晚該何時退房呢?",
            "同住一個房間的兒童需要額外付費嗎？",
            "訂房可以到現場再付款嗎？",
            "臨時無法去旅行，可以申請退費嗎?",
            "請問你們有提供加床服務嗎?",
            "寄放行李最多可以放幾天呢?",
            "你們房間有提供免費WIFI嗎?",
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
        setContentView(R.layout.activity_course_conversation_stay);
        ActionBar actionBar=getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        listView = findViewById(R.id.stay_listview);
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

        cst1 = mediaPlayer.create(course_conversation_stay.this, R.raw.cst1);
        cst2 = mediaPlayer.create(course_conversation_stay.this, R.raw.cst2);
        cst3 = mediaPlayer.create(course_conversation_stay.this, R.raw.cst3);
        cst4 = mediaPlayer.create(course_conversation_stay.this, R.raw.cst4);
        cst5 = mediaPlayer.create(course_conversation_stay.this, R.raw.cst5);
        cst6 = mediaPlayer.create(course_conversation_stay.this, R.raw.cst6);
        cst7 = mediaPlayer.create(course_conversation_stay.this, R.raw.cst7);
        cst8 = mediaPlayer.create(course_conversation_stay.this, R.raw.cst8);
        cst9 = mediaPlayer.create(course_conversation_stay.this, R.raw.cst9);
        cst10 = mediaPlayer.create(course_conversation_stay.this, R.raw.cst10);
        cst11 = mediaPlayer.create(course_conversation_stay.this, R.raw.cst11);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (mediaPlayer != null){mediaPlayer.release();}
                switch (position) {

                    case 0:
                        cst1.start();
                        break;
                    case 1:
                        cst2.start();
                        break;
                    case 2:
                        cst3.start();
                        break;
                    case 3:
                        cst4.start();
                        break;
                    case 4:
                        cst5.start();
                        break;
                    case 5:
                        cst6.start();
                        break;
                    case 6:
                        cst7.start();
                        break;
                    case 7:
                        cst8.start();
                        break;
                    case 8:
                        cst9.start();
                        break;
                    case 9:
                        cst10.start();
                        break;
                    case 10:
                        cst11.start();
                        break;

                }
                return;
            }
        });
    }
}
