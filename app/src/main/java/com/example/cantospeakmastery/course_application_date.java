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

public class course_application_date extends AppCompatActivity {

    private course_application_date.GroupListAdapter adapter = null;
    private ListView listView = null;
    private List<String> list = new ArrayList<String>();
    private List<String> listTag = new ArrayList<String>();
    private int cad1,cad2,cad3,cad4,cad5,cad6,cad7,cad9,cad10,
            cad11,cad12,cad13,cad14,cad15,cad16,cad17,cad18,cad19,cad20,
            cad22,cad23,cad24,cad25;
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
        setContentView(R.layout.activity_course_application_date);
        ActionBar actionBar=getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        soundPool = new SoundPool(102, AudioManager.STREAM_MUSIC, 5);
        setData();
        adapter = new course_application_date.GroupListAdapter(this, list, listTag);
        listView = (ListView)findViewById(R.id.group_list);
        listView.setAdapter(adapter);


        cad1 = soundPool.load(this, R.raw.cad1, 1);
        cad2 = soundPool.load(this, R.raw.cad2, 1);
        cad3 = soundPool.load(this, R.raw.cad3, 1);
        cad4 = soundPool.load(this, R.raw.cad4, 1);
        cad5 = soundPool.load(this, R.raw.cad5, 1);
        cad6 = soundPool.load(this, R.raw.cad6, 1);
        cad7 = soundPool.load(this, R.raw.cad7, 1);

        cad9 = soundPool.load(this, R.raw.cad9, 1);
        cad10 = soundPool.load(this, R.raw.cad10, 1);
        cad11 = soundPool.load(this, R.raw.cad11, 1);
        cad12 = soundPool.load(this, R.raw.cad12, 1);
        cad13 = soundPool.load(this, R.raw.cad13, 1);
        cad14 = soundPool.load(this, R.raw.cad14, 1);
        cad15 = soundPool.load(this, R.raw.cad15, 1);
        cad16 = soundPool.load(this, R.raw.cad16, 1);
        cad17 = soundPool.load(this, R.raw.cad17, 1);
        cad18 = soundPool.load(this, R.raw.cad18, 1);
        cad19 = soundPool.load(this, R.raw.cad19, 1);
        cad20 = soundPool.load(this, R.raw.cad20, 1);

        cad22 = soundPool.load(this, R.raw.cad22, 1);
        cad23 = soundPool.load(this, R.raw.cad23, 1);
        cad24 = soundPool.load(this, R.raw.cad24, 1);
        cad25 = soundPool.load(this, R.raw.cad25, 1);



        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                switch (position) {

                    case 0://基數列


                        break;
                    case 1:
                        soundPool.play(cad1, 1.0F, 1.0F, 0, 0, 1.0F);

                        break;
                    case 2:
                        soundPool.play(cad2, 1.0F, 1.0F, 0, 0, 1.0F);
                        break;
                    case 3:
                        soundPool.play(cad3, 1.0F, 1.0F, 0, 0, 1.0F);

                        break;
                    case 4:
                        soundPool.play(cad4, 1.0F, 1.0F, 0, 0, 1.0F);

                        break;
                    case 5:
                        soundPool.play(cad5, 1.0F, 1.0F, 0, 0, 1.0F);

                        break;
                    case 6:
                        soundPool.play(cad6, 1.0F, 1.0F, 0, 0, 1.0F);

                        break;
                    case 7:
                        soundPool.play(cad7, 1.0F, 1.0F, 0, 0, 1.0F);

                        break;
                    case 8:


                        break;
                    case 9:
                        soundPool.play(cad9, 1.0F, 1.0F, 0, 0, 1.0F);

                        break;
                    case 10:
                        soundPool.play(cad10, 1.0F, 1.0F, 0, 0, 1.0F);

                        break;
                    case 11:
                        soundPool.play(cad11, 1.0F, 1.0F, 0, 0, 1.0F);

                        break;
                    case 12:
                        soundPool.play(cad12, 1.0F, 1.0F, 0, 0, 1.0F);

                        break;
                    case 13:
                        soundPool.play(cad13, 1.0F, 1.0F, 0, 0, 1.0F);

                        break;
                    case 14:
                        soundPool.play(cad14, 1.0F, 1.0F, 0, 0, 1.0F);

                        break;
                    case 15:
                        soundPool.play(cad15, 1.0F, 1.0F, 0, 0, 1.0F);

                        break;
                    case 16:
                        soundPool.play(cad16, 1.0F, 1.0F, 0, 0, 1.0F);

                        break;
                    case 17:
                        soundPool.play(cad17, 1.0F, 1.0F, 0, 0, 1.0F);

                        break;
                    case 18:
                        soundPool.play(cad18, 1.0F, 1.0F, 0, 0, 1.0F);

                        break;
                    case 19:
                        soundPool.play(cad19, 1.0F, 1.0F, 0, 0, 1.0F);

                        break;
                    case 20:
                        soundPool.play(cad20, 1.0F, 1.0F, 0, 0, 1.0F);

                        break;
                    case 21:


                        break;
                    case 22:
                        soundPool.play(cad22, 1.0F, 1.0F, 0, 0, 1.0F);

                        break;
                    case 23:
                        soundPool.play(cad23, 1.0F, 1.0F, 0, 0, 1.0F);

                        break;
                    case 24:
                        soundPool.play(cad24, 1.0F, 1.0F, 0, 0, 1.0F);

                        break;
                    case 25:
                        soundPool.play(cad25, 1.0F, 1.0F, 0, 0, 1.0F);

                        break;


                }
                return;
            }
        });
    }

    public void setData() {
        list.add("星期");
        listTag.add("星期");
        list.add("星期日");
        list.add("星期一");
        list.add("星期二");
        list.add("星期三");
        list.add("星期四");
        list.add("星期五");
        list.add("星期六");


        list.add("月份");
        listTag.add("月份");
        list.add("一月");
        list.add("二月");
        list.add("三月");
        list.add("四月");
        list.add("五月");
        list.add("六月");
        list.add("七月");
        list.add("八月");
        list.add("九月");
        list.add("十月");
        list.add("十一月");
        list.add("十二月");

        list.add("四季");
        listTag.add("四季");
        list.add("春天");
        list.add("夏天");
        list.add("秋天");
        list.add("冬天");
    }

    private static class GroupListAdapter extends ArrayAdapter<String> {

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
