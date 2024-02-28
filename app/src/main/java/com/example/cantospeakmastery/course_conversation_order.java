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


public class course_conversation_order extends AppCompatActivity {

    ListView listView;
    MediaPlayer mediaPlayer = new MediaPlayer();
    MediaPlayer co1, co2, co3, co4, co5, co6, co7, co8, co9, co10, co11;

    String[] lvItems = new String[]{"我想要一份三分熟的牛排",
            "請問有提供吸管嗎?",
            "請問餐具在哪裡?",
            "這裡的餐點有提供素食嗎?",
            "可以幫我拿一張衛生紙嗎，謝謝!",
            "請問這間餐廳的招牌特餐是什麼?",
            "請問洗手間在哪裡?",
            "請問可以使用信用卡付費嗎?",
            "服務生，可以幫我加火鍋湯嗎?",
            "可以請你們經理出來一下嗎?",
            "紅茶拿鐵半糖去冰",
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
        setContentView(R.layout.activity_course_conversation_order);
        ActionBar actionBar=getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        listView = findViewById(R.id.order_listview);
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

        co1 = mediaPlayer.create(course_conversation_order.this, R.raw.co1);
        co2 = mediaPlayer.create(course_conversation_order.this, R.raw.co2);
        co3 = mediaPlayer.create(course_conversation_order.this, R.raw.co3);
        co4 = mediaPlayer.create(course_conversation_order.this, R.raw.co4);
        co5 = mediaPlayer.create(course_conversation_order.this, R.raw.co5);
        co6 = mediaPlayer.create(course_conversation_order.this, R.raw.co6);
        co7 = mediaPlayer.create(course_conversation_order.this, R.raw.co7);
        co8 = mediaPlayer.create(course_conversation_order.this, R.raw.co8);
        co9 = mediaPlayer.create(course_conversation_order.this, R.raw.co9);
        co10 = mediaPlayer.create(course_conversation_order.this, R.raw.co10);
        co11 = mediaPlayer.create(course_conversation_order.this, R.raw.co11);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (mediaPlayer != null){mediaPlayer.release();}
                switch (position) {

                    case 0:
                        co1.start();
                        break;
                    case 1:
                        co2.start();
                        break;
                    case 2:
                        co3.start();
                        break;
                    case 3:
                        co4.start();
                        break;
                    case 4:
                        co5.start();
                        break;
                    case 5:
                        co6.start();
                        break;
                    case 6:
                        co7.start();
                        break;
                    case 7:
                        co8.start();
                        break;
                    case 8:
                        co9.start();
                        break;
                    case 9:
                        co10.start();
                        break;
                    case 10:
                        co11.start();
                        break;

                }
                return;
            }
        });
    }
}
