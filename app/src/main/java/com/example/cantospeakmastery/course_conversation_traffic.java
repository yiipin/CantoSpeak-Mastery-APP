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


public class course_conversation_traffic extends AppCompatActivity {

    ListView listView;
    MediaPlayer mediaPlayer = new MediaPlayer();
    MediaPlayer ct1, ct2, ct3, ct4, ct5, ct6, ct7, ct8, ct9, ct10;

    String[] lvItems = new String[]{"請問這裡可以叫的到Uber嗎?",
            "到地鐵站需要花多長時間？",
            "想請問87號公車站牌在哪裡?",
            "搭計程車或公車會比較快嗎?",
            "公車站 / 計程車招呼站在哪裡 ？",
            "搭計程車到車站需要多少錢？",
            "請載我去機場",
            "請在這裡停車。",
            "我可以用信用卡付車資嗎？",
            "你可以在地圖上指給我看嗎?",
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
        setContentView(R.layout.activity_course_conversation_traffic);
        ActionBar actionBar=getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        listView = findViewById(R.id.traffic_listview);
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

        ct1 = mediaPlayer.create(course_conversation_traffic.this, R.raw.ct1);
        ct2 = mediaPlayer.create(course_conversation_traffic.this, R.raw.ct2);
        ct3 = mediaPlayer.create(course_conversation_traffic.this, R.raw.ct3);
        ct4 = mediaPlayer.create(course_conversation_traffic.this, R.raw.ct4);
        ct5 = mediaPlayer.create(course_conversation_traffic.this, R.raw.ct5);
        ct6 = mediaPlayer.create(course_conversation_traffic.this, R.raw.ct6);
        ct7 = mediaPlayer.create(course_conversation_traffic.this, R.raw.ct7);
        ct8 = mediaPlayer.create(course_conversation_traffic.this, R.raw.ct8);
        ct9 = mediaPlayer.create(course_conversation_traffic.this, R.raw.ct9);
        ct10 = mediaPlayer.create(course_conversation_traffic.this, R.raw.ct10);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (mediaPlayer != null){mediaPlayer.release();}
                switch (position) {

                    case 0:
                        ct1.start();
                        break;
                    case 1:
                        ct2.start();
                        break;
                    case 2:
                        ct3.start();
                        break;
                    case 3:
                        ct4.start();
                        break;
                    case 4:
                        ct5.start();
                        break;
                    case 5:
                        ct6.start();
                        break;
                    case 6:
                        ct7.start();
                        break;
                    case 7:
                        ct8.start();
                        break;
                    case 8:
                        ct9.start();
                        break;
                    case 9:
                        ct10.start();
                        break;


                }
                return;
            }
        });
    }
}
