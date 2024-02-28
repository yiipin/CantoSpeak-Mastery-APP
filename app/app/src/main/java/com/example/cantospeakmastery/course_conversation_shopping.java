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


public class course_conversation_shopping extends AppCompatActivity {

    ListView listView;
    MediaPlayer mediaPlayer = new MediaPlayer();
    MediaPlayer cs1, cs2, cs3, cs4, cs5, cs6, cs7, cs8, cs9, cs10;

    String[] lvItems = new String[]{"這個多少錢",
            "哪裡有免稅店",
            "這個很好看",
            "我想要退貨",
            "這衣服是什麼材質做的",
            "什麼時候開門",
            "這尺寸有哪些",
            "有大一點的尺寸嗎",
            "可以用行動支付嗎?",
            "有收美金嗎?",
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
        setContentView(R.layout.activity_course_conversation_shopping);
        ActionBar actionBar=getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        listView = findViewById(R.id.shopping_listview);
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

        cs1 = mediaPlayer.create(course_conversation_shopping.this, R.raw.cs1);
        cs2 = mediaPlayer.create(course_conversation_shopping.this, R.raw.cs2);
        cs3 = mediaPlayer.create(course_conversation_shopping.this, R.raw.cs3);
        cs4 = mediaPlayer.create(course_conversation_shopping.this, R.raw.cs4);
        cs5 = mediaPlayer.create(course_conversation_shopping.this, R.raw.cs5);
        cs6 = mediaPlayer.create(course_conversation_shopping.this, R.raw.cs6);
        cs7 = mediaPlayer.create(course_conversation_shopping.this, R.raw.cs7);
        cs8 = mediaPlayer.create(course_conversation_shopping.this, R.raw.cs8);
        cs9 = mediaPlayer.create(course_conversation_shopping.this, R.raw.cs9);
        cs10 = mediaPlayer.create(course_conversation_shopping.this, R.raw.cs10);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (mediaPlayer != null){mediaPlayer.release();}
                switch (position) {

                    case 0:
                        cs1.start();
                        break;
                    case 1:
                        cs2.start();
                        break;
                    case 2:
                        cs3.start();
                        break;
                    case 3:
                        cs4.start();
                        break;
                    case 4:
                        cs5.start();
                        break;
                    case 5:
                        cs6.start();
                        break;
                    case 6:
                        cs7.start();
                        break;
                    case 7:
                        cs8.start();
                        break;
                    case 8:
                        cs9.start();
                        break;
                    case 9:
                        cs10.start();
                        break;

                }
                return;
            }
        });
    }
}
