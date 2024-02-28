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


public class course_conversation_greetings extends AppCompatActivity {

    ListView listView;
    MediaPlayer mediaPlayer = new MediaPlayer();
    MediaPlayer cg1, cg2, cg3, cg4, cg5, cg6;

    String[] lvItems = new String[]{"你好",
            "很高興認識你",
            "妳的名字是",
            "我的名字是",
            "保持聯絡",
            "你從哪裡來",

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
        setContentView(R.layout.activity_course_conversation_greetings);
        ActionBar actionBar=getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        listView = findViewById(R.id.greetings_listview);
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

        cg1 = mediaPlayer.create(course_conversation_greetings.this, R.raw.cg1);
        cg2 = mediaPlayer.create(course_conversation_greetings.this, R.raw.cg2);
        cg3 = mediaPlayer.create(course_conversation_greetings.this, R.raw.cg3);
        cg4 = mediaPlayer.create(course_conversation_greetings.this, R.raw.cg4);
        cg5 = mediaPlayer.create(course_conversation_greetings.this, R.raw.cg5);
        cg6 = mediaPlayer.create(course_conversation_greetings.this, R.raw.cg6);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (mediaPlayer != null){mediaPlayer.release();}
                switch (position) {

                    case 0:
                        cg1.start();
                        break;
                    case 1:
                        cg2.start();
                        break;
                    case 2:
                        cg3.start();
                        break;
                    case 3:
                        cg4.start();
                        break;
                    case 4:
                        cg5.start();
                        break;
                    case 5:
                        cg6.start();
                        break;

                }
                return;
            }
        });
    }
}
