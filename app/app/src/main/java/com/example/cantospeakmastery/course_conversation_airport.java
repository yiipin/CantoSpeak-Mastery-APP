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


public class course_conversation_airport extends AppCompatActivity {

    ListView listView;

    MediaPlayer ca1, ca2, ca3, ca4, ca5, ca6, ca7, ca8, ca9, ca10;
    MediaPlayer mediaPlayer = new MediaPlayer();

    String[] lvItems = new String[]{"我要預訂8月7日的機位。",
            "我想要靠窗邊的位置",
            "我想要靠走道的位置",
            "我的機票號碼是...",
            "這班飛機要到哪一個登機門登機？",
            "請問87號登機門在哪裡？",
            "這班飛機幾點登機？",
            "請問轉機大廳在哪裡？",
            "我行李超重了需要加收多少錢?",
            "我的信用卡可以進入機場貴賓室嗎?"
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
        setContentView(R.layout.activity_course_conversation_airport);
        ActionBar actionBar=getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        listView = findViewById(R.id.airport_listview);
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


        ca1 = mediaPlayer.create(course_conversation_airport.this, R.raw.ca1);
        ca2 = mediaPlayer.create(course_conversation_airport.this, R.raw.ca2);
        ca3 = mediaPlayer.create(course_conversation_airport.this, R.raw.ca3);
        ca4 = mediaPlayer.create(course_conversation_airport.this, R.raw.ca4);
        ca5 = mediaPlayer.create(course_conversation_airport.this, R.raw.ca5);
        ca6 = mediaPlayer.create(course_conversation_airport.this, R.raw.ca6);
        ca7 = mediaPlayer.create(course_conversation_airport.this, R.raw.ca7);
        ca8 = mediaPlayer.create(course_conversation_airport.this, R.raw.ca8);
        ca9 = mediaPlayer.create(course_conversation_airport.this, R.raw.ca9);
        ca10 = mediaPlayer.create(course_conversation_airport.this, R.raw.ca10);



        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (mediaPlayer != null){mediaPlayer.release();}

                switch (position) {

                    case 0:
                        ca1.start();
                        break;
                    case 1:
                        ca2.start();
                        break;
                    case 2:
                        ca3.start();
                        break;
                    case 3:
                        ca4.start();
                        break;
                    case 4:
                        ca5.start();
                        break;
                    case 5:
                        ca6.start();
                        break;
                    case 6:
                        ca7.start();
                        break;
                    case 7:
                        ca8.start();
                        break;
                    case 8:
                        ca9.start();
                        break;
                    case 9:
                        ca10.start();
                        break;

                }
                return;
            }
        });
    }
}
