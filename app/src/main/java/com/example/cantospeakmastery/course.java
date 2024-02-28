

package com.example.cantospeakmastery;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.content.Intent;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Toast;




public class course extends AppCompatActivity {
    private long lastClickTime = 0L;
    // 兩次點擊間格少於2秒
    private static final int FAST_CLICK_DELAY_TIME = 3000;


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            Toast.makeText(this, "返回主選單", Toast.LENGTH_SHORT).show();
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ActionBar actionBar=getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //toolbar.setTitle("Title");//设置主标题



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course);

        LinearLayout Button5 = findViewById(R.id.buttonspeaking);
        Button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (System.currentTimeMillis() - lastClickTime >= FAST_CLICK_DELAY_TIME) {
                    //下面進行其他操作，比如跳轉等
                    opencourse_speaking();
                    lastClickTime = System.currentTimeMillis();
                }

            }
        });
        LinearLayout Button6 =  findViewById(R.id.buttonvocabulary);
        Button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (System.currentTimeMillis() - lastClickTime >= FAST_CLICK_DELAY_TIME) {
                    //下面進行其他操作，比如跳轉等
                    opencourse_word();
                    lastClickTime = System.currentTimeMillis();
                }
            }
        });

        LinearLayout Button8 =  findViewById(R.id.buttonconversation);
        Button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (System.currentTimeMillis() - lastClickTime >= FAST_CLICK_DELAY_TIME) {
                    //下面進行其他操作，比如跳轉等
                    opencourse_conversation();
                    lastClickTime = System.currentTimeMillis();
                }
            }
        });
        LinearLayout Button9 =  findViewById(R.id.buttontranslate);
        Button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (System.currentTimeMillis() - lastClickTime >= FAST_CLICK_DELAY_TIME) {
                    //下面進行其他操作，比如跳轉等
                    opencourse_translate();
                    lastClickTime = System.currentTimeMillis();
                }
            }
        });
        LinearLayout Button10 =  findViewById(R.id.buttonapplication);
        Button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (System.currentTimeMillis() - lastClickTime >= FAST_CLICK_DELAY_TIME) {
                    //下面進行其他操作，比如跳轉等
                    opencourse_application();
                    lastClickTime = System.currentTimeMillis();
                }
            }
        });

    }



    private void opencourse_speaking() {
        Intent intent = new Intent(this,course_speaking.class);
        startActivity(intent);
    }


    private void opencourse_word() {
        Intent intent = new Intent(this,course_word.class);
        startActivity(intent);
    }

    private void opencourse_conversation() {
        Intent intent = new Intent(this,course_conversation.class);
        startActivity(intent);
    }

    private void opencourse_translate() {
        Uri uri = Uri.parse("https://yue.micblo.com/");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    private void opencourse_application() {
        Intent intent = new Intent(this,course_application.class);
        startActivity(intent);
    }




}
