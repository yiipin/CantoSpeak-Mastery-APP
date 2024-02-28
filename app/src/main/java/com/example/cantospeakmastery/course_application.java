package com.example.cantospeakmastery;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class course_application extends AppCompatActivity {
    private long lastClickTime = 0L;
    // 两次点击间隔不能少于1000ms
    private static final int FAST_CLICK_DELAY_TIME = 1000;
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            Toast.makeText(this, "返回小學堂", Toast.LENGTH_SHORT).show();
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_application);

        ActionBar actionBar=getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);




        }
    public void number(View view){
        if (System.currentTimeMillis() - lastClickTime >= FAST_CLICK_DELAY_TIME) {
        //下面進行其他操作，比如跳轉等
            Intent intent = new Intent(this, course_application_number.class);
            startActivity(intent);
    }

    }
    public void date(View view){
        if (System.currentTimeMillis() - lastClickTime >= FAST_CLICK_DELAY_TIME) {
            //下面進行其他操作，比如跳轉等
            Intent intent = new Intent(this, course_application_date.class);
            startActivity(intent);
        }

    }
    public void daily(View view){
        if (System.currentTimeMillis() - lastClickTime >= FAST_CLICK_DELAY_TIME) {
            //下面進行其他操作，比如跳轉等
            Intent intent = new Intent(this, course_vocabulary.class);
            startActivity(intent);
        }

    }
}