package com.example.cantospeakmastery;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;


import android.content.Context;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


import java.util.ArrayList;

import java.util.List;

public class course_application_number extends AppCompatActivity {

    private GroupListAdapter adapter = null;
    private ListView listView = null;
    private List<String> list = new ArrayList<String>();
    private List<String> listTag = new ArrayList<String>();
    private int can1,can2,can3,can4,can5,can6,can7,can8,can9,can10,
    can11,can12,can13,can14,can15,can16,can17,can18,can19,can20,
    can21,can22,can23,can24,can25,can26,can27,can28,can29,can30,
    can31,can32,can33,can34,can35,can36,can37,can38,can39,can40,
    can41,can43,can44,can45,can46,can47,can48,can49,can50,can51,can52;
    private SoundPool soundPool;
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            Toast.makeText(this, "返回日常用語選單", Toast.LENGTH_SHORT).show();
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_application_number);
        ActionBar actionBar=getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        soundPool = new SoundPool(102, AudioManager.STREAM_MUSIC, 5);
        setData();
        adapter = new GroupListAdapter(this, list, listTag);
        listView = (ListView)findViewById(R.id.group_list);
        listView.setAdapter(adapter);


        can1 = soundPool.load(this, R.raw.can1, 1);
        can2 = soundPool.load(this, R.raw.can2, 1);
        can3 = soundPool.load(this, R.raw.can3, 1);
        can4 = soundPool.load(this, R.raw.can4, 1);
        can5 = soundPool.load(this, R.raw.can5, 1);
        can6 = soundPool.load(this, R.raw.can6, 1);
        can7 = soundPool.load(this, R.raw.can7, 1);
        can8 = soundPool.load(this, R.raw.can8, 1);
        can9 = soundPool.load(this, R.raw.can9, 1);
        can10 = soundPool.load(this, R.raw.can10, 1);
        can11 = soundPool.load(this, R.raw.can11, 1);
        can12 = soundPool.load(this, R.raw.can12, 1);
        can13 = soundPool.load(this, R.raw.can13, 1);
        can14 = soundPool.load(this, R.raw.can14, 1);
        can15 = soundPool.load(this, R.raw.can15, 1);
        can16 = soundPool.load(this, R.raw.can16, 1);
        can17 = soundPool.load(this, R.raw.can17, 1);
        can18 = soundPool.load(this, R.raw.can18, 1);
        can19 = soundPool.load(this, R.raw.can19, 1);
        can20 = soundPool.load(this, R.raw.can20, 1);
        can21 = soundPool.load(this, R.raw.can21, 1);
        can22 = soundPool.load(this, R.raw.can22, 1);
        can23 = soundPool.load(this, R.raw.can23, 1);
        can24 = soundPool.load(this, R.raw.can24, 1);
        can25 = soundPool.load(this, R.raw.can25, 1);
        can26 = soundPool.load(this, R.raw.can26, 1);
        can27 = soundPool.load(this, R.raw.can27, 1);
        can28 = soundPool.load(this, R.raw.can28, 1);
        can29 = soundPool.load(this, R.raw.can29, 1);
        can30 = soundPool.load(this, R.raw.can30, 1);
        can31 = soundPool.load(this, R.raw.can31, 1);
        can32 = soundPool.load(this, R.raw.can32, 1);
        can33 = soundPool.load(this, R.raw.can33, 1);
        can34 = soundPool.load(this, R.raw.can34, 1);
        can35 = soundPool.load(this, R.raw.can35, 1);
        can36 = soundPool.load(this, R.raw.can36, 1);
        can37 = soundPool.load(this, R.raw.can37, 1);
        can38 = soundPool.load(this, R.raw.can38, 1);
        can39 = soundPool.load(this, R.raw.can39, 1);
        can40 = soundPool.load(this, R.raw.can40, 1);
        can41 = soundPool.load(this, R.raw.can41, 1);
        can43 = soundPool.load(this, R.raw.can43, 1);
        can44 = soundPool.load(this, R.raw.can44, 1);
        can45 = soundPool.load(this, R.raw.can45, 1);
        can46 = soundPool.load(this, R.raw.can46, 1);
        can47 = soundPool.load(this, R.raw.can47, 1);
        can48 = soundPool.load(this, R.raw.can48, 1);
        can49 = soundPool.load(this, R.raw.can49, 1);
        can50 = soundPool.load(this, R.raw.can50, 1);
        can51 = soundPool.load(this, R.raw.can51, 1);
        can52 = soundPool.load(this, R.raw.can52, 1);





        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                switch (position) {

                    case 0://基數列


                        break;
                    case 1:
                        soundPool.play(can1, 1.0F, 1.0F, 0, 0, 1.0F);

                        break;
                    case 2:
                        soundPool.play(can2, 1.0F, 1.0F, 0, 0, 1.0F);
                        break;
                    case 3:
                        soundPool.play(can3, 1.0F, 1.0F, 0, 0, 1.0F);

                        break;
                    case 4:
                        soundPool.play(can4, 1.0F, 1.0F, 0, 0, 1.0F);

                        break;
                    case 5:
                        soundPool.play(can5, 1.0F, 1.0F, 0, 0, 1.0F);

                        break;
                    case 6:
                        soundPool.play(can6, 1.0F, 1.0F, 0, 0, 1.0F);

                        break;
                    case 7:
                        soundPool.play(can7, 1.0F, 1.0F, 0, 0, 1.0F);

                        break;
                    case 8:
                        soundPool.play(can8, 1.0F, 1.0F, 0, 0, 1.0F);

                        break;
                    case 9:
                        soundPool.play(can9, 1.0F, 1.0F, 0, 0, 1.0F);

                        break;
                    case 10:
                        soundPool.play(can10, 1.0F, 1.0F, 0, 0, 1.0F);

                        break;
                    case 11:
                        soundPool.play(can11, 1.0F, 1.0F, 0, 0, 1.0F);

                        break;
                    case 12:
                        soundPool.play(can12, 1.0F, 1.0F, 0, 0, 1.0F);

                        break;
                    case 13:
                        soundPool.play(can13, 1.0F, 1.0F, 0, 0, 1.0F);

                        break;
                    case 14:
                        soundPool.play(can14, 1.0F, 1.0F, 0, 0, 1.0F);

                        break;
                    case 15:
                        soundPool.play(can15, 1.0F, 1.0F, 0, 0, 1.0F);

                        break;
                    case 16:
                        soundPool.play(can16, 1.0F, 1.0F, 0, 0, 1.0F);

                        break;
                    case 17:
                        soundPool.play(can17, 1.0F, 1.0F, 0, 0, 1.0F);

                        break;
                    case 18:
                        soundPool.play(can18, 1.0F, 1.0F, 0, 0, 1.0F);

                        break;
                    case 19:
                        soundPool.play(can19, 1.0F, 1.0F, 0, 0, 1.0F);

                        break;
                    case 20:
                        soundPool.play(can20, 1.0F, 1.0F, 0, 0, 1.0F);

                        break;
                    case 21:
                        soundPool.play(can21, 1.0F, 1.0F, 0, 0, 1.0F);

                        break;
                    case 22:
                        soundPool.play(can22, 1.0F, 1.0F, 0, 0, 1.0F);

                        break;
                    case 23:
                        soundPool.play(can23, 1.0F, 1.0F, 0, 0, 1.0F);

                        break;
                    case 24:
                        soundPool.play(can24, 1.0F, 1.0F, 0, 0, 1.0F);

                        break;
                    case 25:
                        soundPool.play(can25, 1.0F, 1.0F, 0, 0, 1.0F);

                        break;
                    case 26:
                        soundPool.play(can26, 1.0F, 1.0F, 0, 0, 1.0F);

                        break;
                    case 27:
                        soundPool.play(can27, 1.0F, 1.0F, 0, 0, 1.0F);

                        break;
                    case 28:
                        soundPool.play(can28, 1.0F, 1.0F, 0, 0, 1.0F);

                        break;
                    case 29:
                        soundPool.play(can29, 1.0F, 1.0F, 0, 0, 1.0F);

                        break;
                    case 30:
                        soundPool.play(can30, 1.0F, 1.0F, 0, 0, 1.0F);

                        break;
                    case 31:
                        soundPool.play(can31, 1.0F, 1.0F, 0, 0, 1.0F);

                        break;
                    case 32:
                        soundPool.play(can32, 1.0F, 1.0F, 0, 0, 1.0F);

                        break;
                    case 33:
                        soundPool.play(can33, 1.0F, 1.0F, 0, 0, 1.0F);

                        break;
                    case 34:
                        soundPool.play(can34, 1.0F, 1.0F, 0, 0, 1.0F);

                        break;
                    case 35:
                        soundPool.play(can35, 1.0F, 1.0F, 0, 0, 1.0F);

                        break;
                    case 36:
                        soundPool.play(can36, 1.0F, 1.0F, 0, 0, 1.0F);

                        break;
                    case 37:
                        soundPool.play(can37, 1.0F, 1.0F, 0, 0, 1.0F);

                        break;
                    case 38:
                        soundPool.play(can38, 1.0F, 1.0F, 0, 0, 1.0F);

                        break;
                    case 39:
                        soundPool.play(can39, 1.0F, 1.0F, 0, 0, 1.0F);

                        break;
                    case 40:
                        soundPool.play(can40, 1.0F, 1.0F, 0, 0, 1.0F);

                        break;
                    case 41:
                        soundPool.play(can41, 1.0F, 1.0F, 0, 0, 1.0F);

                        break;
                    case 42://序數列

                        break;
                    case 43:
                        soundPool.play(can43, 1.0F, 1.0F, 0, 0, 1.0F);

                        break;
                    case 44:
                        soundPool.play(can44, 1.0F, 1.0F, 0, 0, 1.0F);

                        break;
                    case 45:
                        soundPool.play(can45, 1.0F, 1.0F, 0, 0, 1.0F);

                        break;
                    case 46:
                        soundPool.play(can46, 1.0F, 1.0F, 0, 0, 1.0F);

                        break;
                    case 47:
                        soundPool.play(can47, 1.0F, 1.0F, 0, 0, 1.0F);

                        break;
                    case 48:
                        soundPool.play(can48, 1.0F, 1.0F, 0, 0, 1.0F);

                        break;
                    case 49:
                        soundPool.play(can49, 1.0F, 1.0F, 0, 0, 1.0F);

                        break;
                    case 50:
                        soundPool.play(can50, 1.0F, 1.0F, 0, 0, 1.0F);

                        break;
                    case 51:
                        soundPool.play(can51, 1.0F, 1.0F, 0, 0, 1.0F);

                        break;
                    case 52:
                        soundPool.play(can52, 1.0F, 1.0F, 0, 0, 1.0F);

                        break;

                }
                return;
            }
        });
    }

    public void setData() {
        list.add("基數");
        listTag.add("基數");
        list.add("零");
        list.add("一");
        list.add("二");
        list.add("三");
        list.add("四");
        list.add("五");
        list.add("六");
        list.add("七");
        list.add("八");
        list.add("九");
        list.add("十");
        list.add("十一");
        list.add("十二");
        list.add("十三");
        list.add("十四");
        list.add("十五");
        list.add("十六");
        list.add("十七");
        list.add("十八");
        list.add("十九");
        list.add("二十");
        list.add("二十一");
        list.add("二十二");
        list.add("二十三");
        list.add("二十四");
        list.add("二十五");
        list.add("二十六");
        list.add("二十七");
        list.add("二十八");
        list.add("二十九");
        list.add("三十");
        list.add("四十");
        list.add("五十");
        list.add("六十");
        list.add("七十");
        list.add("八十");
        list.add("九十");
        list.add("百");
        list.add("千");
        list.add("萬");
        list.add("億");


        list.add("序數");
        listTag.add("序數");
        list.add("第一");
        list.add("第二");
        list.add("第三");
        list.add("第四");
        list.add("第五");
        list.add("第六");
        list.add("第七");
        list.add("第八");
        list.add("第九");
        list.add("第十");

        }

    private static class GroupListAdapter extends ArrayAdapter<String>{

        private List<String> listTag = null;
        public GroupListAdapter(Context context, List<String> objects, List<String> tags) {
            super(context, 0, objects);
            this.listTag = tags;
        }

        @Override
        public boolean isEnabled(int position) {
            if(listTag.contains(getItem(position))){
                return false;
            }
            return super.isEnabled(position);
        }
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view = convertView;
            if(listTag.contains(getItem(position))){
                view = LayoutInflater.from(getContext()).inflate(R.layout.group_list_item_tag, null);
            }else{
                view = LayoutInflater.from(getContext()).inflate(R.layout.group_list_item, null);
            }
            TextView textView = (TextView) view.findViewById(R.id.group_list_item_text);
            textView.setText(getItem(position));
            textView.setTextSize(25);
            return view;
        }
    }
}
