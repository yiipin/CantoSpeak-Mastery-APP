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


public class course_conversation_chat extends AppCompatActivity {

    ListView listView;
    MediaPlayer mediaPlayer = new MediaPlayer();
    MediaPlayer cc1, cc2, cc3, cc4, cc5, cc6, cc7, cc8, cc9, cc10, cc11, cc12 ;

    String[] lvItems = new String[]{"你好，我是台灣人",
            "請問你的興趣是什麼?",
            "你喜歡吃中餐還是西餐?",
            "我家裡有會後空翻的貓，要來看看嗎?",
            "請問你在哪裡高就呢?",
            "我很喜歡妳的笑容!",
            "你真是個好人!",
            "為什麼不理我呢?",
            "有家餐廳還不錯吃，要不要一起去?",
            "這個餅乾很好吃，你要試試嗎?",
            "你好可愛！可以認識一下嗎?",
            "我的手錶有冷光功能，要不要來我床上看看?",
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
        setContentView(R.layout.activity_course_conversation_chat);
        ActionBar actionBar=getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        listView = findViewById(R.id.chat_listview);
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

        cc1 = mediaPlayer.create(course_conversation_chat.this, R.raw.cc1);
        cc2 = mediaPlayer.create(course_conversation_chat.this, R.raw.cc2);
        cc3 = mediaPlayer.create(course_conversation_chat.this, R.raw.cc3);
        cc4 = mediaPlayer.create(course_conversation_chat.this, R.raw.cc4);
        cc5 = mediaPlayer.create(course_conversation_chat.this, R.raw.cc5);
        cc6 = mediaPlayer.create(course_conversation_chat.this, R.raw.cc6);
        cc7 = mediaPlayer.create(course_conversation_chat.this, R.raw.cc7);
        cc8 = mediaPlayer.create(course_conversation_chat.this, R.raw.cc8);
        cc9 = mediaPlayer.create(course_conversation_chat.this, R.raw.cc9);
        cc10 = mediaPlayer.create(course_conversation_chat.this, R.raw.cc10);
        cc11 = mediaPlayer.create(course_conversation_chat.this, R.raw.cc11);
        cc12 = mediaPlayer.create(course_conversation_chat.this, R.raw.cc12);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (mediaPlayer != null){mediaPlayer.release();}

                switch (position) {

                    case 0:
                        cc1.start();
                        break;
                    case 1:
                        cc2.start();
                        break;
                    case 2:
                        cc3.start();
                        break;
                    case 3:
                        cc4.start();
                        break;
                    case 4:
                        cc5.start();
                        break;
                    case 5:
                        cc6.start();
                        break;
                    case 6:
                        cc7.start();
                        break;
                    case 7:
                        cc8.start();
                        break;
                    case 8:
                        cc9.start();
                        break;
                    case 9:
                        cc10.start();
                        break;
                    case 10:
                        cc11.start();
                        break;
                    case 11:
                        cc12.start();
                        break;

                }
                return;
            }
        });
    }
}
