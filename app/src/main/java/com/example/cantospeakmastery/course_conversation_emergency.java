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


public class course_conversation_emergency extends AppCompatActivity {

    ListView listView;
    MediaPlayer mediaPlayer = new MediaPlayer();
    MediaPlayer ce1, ce2, ce3, ce4, ce5, ce6, ce7, ce8, ce9, ce10 ;

    String[] lvItems = new String[]{"能幫助我嗎",
            "我弄丟我的錢包了",
            "我的包包被偷了",
            "我有一些麻煩",
            "這附近有廁所嗎",
            "我手機掉了",
            "請盡快過來",
            "請問最近的警察局在哪裡?",
            "剛才有人偷摸我！",
            "我遇到扒手了！",
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
        setContentView(R.layout.activity_course_conversation_emergency);
        ActionBar actionBar=getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        listView = findViewById(R.id.emergency_listview);
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

        ce1 = mediaPlayer.create(course_conversation_emergency.this, R.raw.ce1);
        ce2 = mediaPlayer.create(course_conversation_emergency.this, R.raw.ce2);
        ce3 = mediaPlayer.create(course_conversation_emergency.this, R.raw.ce3);
        ce4 = mediaPlayer.create(course_conversation_emergency.this, R.raw.ce4);
        ce5 = mediaPlayer.create(course_conversation_emergency.this, R.raw.ce5);
        ce6 = mediaPlayer.create(course_conversation_emergency.this, R.raw.ce6);
        ce7 = mediaPlayer.create(course_conversation_emergency.this, R.raw.ce7);
        ce8 = mediaPlayer.create(course_conversation_emergency.this, R.raw.ce8);
        ce9 = mediaPlayer.create(course_conversation_emergency.this, R.raw.ce9);
        ce10 = mediaPlayer.create(course_conversation_emergency.this, R.raw.ce10);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (mediaPlayer != null){mediaPlayer.release();}
                switch (position) {

                    case 0:
                        ce1.start();
                        break;
                    case 1:
                        ce2.start();
                        break;
                    case 2:
                        ce3.start();
                        break;
                    case 3:
                        ce4.start();
                        break;
                    case 4:
                        ce5.start();
                        break;
                    case 5:
                        ce6.start();
                        break;
                    case 6:
                        ce7.start();
                        break;
                    case 7:
                        ce8.start();
                        break;
                    case 8:
                        ce9.start();
                        break;
                    case 9:
                        ce10.start();
                        break;


                }
                return;
            }
        });
    }
}
