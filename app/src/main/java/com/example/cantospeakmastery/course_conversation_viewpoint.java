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


public class course_conversation_viewpoint extends AppCompatActivity {

    ListView listView;
    MediaPlayer mediaPlayer = new MediaPlayer();
    MediaPlayer cv1, cv2, cv3, cv4, cv5, cv6, cv7, cv8;

    String[] lvItems = new String[]{"門票多少錢",
            "去這要多久時間",
            "我能在這裡照相嗎",
            "請問遊客服務中心在哪裡",
            "我不能做什麼",
            "能幫我照張相嗎",
            "我想要地圖",
            "這裡的風景很漂亮",
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
        setContentView(R.layout.activity_course_conversation_viewpoint);
        ActionBar actionBar=getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        listView = findViewById(R.id.viewpoint_listview);
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

        cv1 = mediaPlayer.create(course_conversation_viewpoint.this, R.raw.cv1);
        cv2 = mediaPlayer.create(course_conversation_viewpoint.this, R.raw.cv2);
        cv3 = mediaPlayer.create(course_conversation_viewpoint.this, R.raw.cv3);
        cv4 = mediaPlayer.create(course_conversation_viewpoint.this, R.raw.cv4);
        cv5 = mediaPlayer.create(course_conversation_viewpoint.this, R.raw.cv5);
        cv6 = mediaPlayer.create(course_conversation_viewpoint.this, R.raw.cv6);
        cv7 = mediaPlayer.create(course_conversation_viewpoint.this, R.raw.cv7);
        cv8 = mediaPlayer.create(course_conversation_viewpoint.this, R.raw.cv8);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (mediaPlayer != null){mediaPlayer.release();}
                switch (position) {

                    case 0:
                        cv1.start();
                        break;
                    case 1:
                        cv2.start();
                        break;
                    case 2:
                        cv3.start();
                        break;
                    case 3:
                        cv4.start();
                        break;
                    case 4:
                        cv5.start();
                        break;
                    case 5:
                        cv6.start();
                        break;
                    case 6:
                        cv7.start();
                        break;
                    case 7:
                        cv8.start();
                        break;

                }
                return;
            }
        });
    }
}
