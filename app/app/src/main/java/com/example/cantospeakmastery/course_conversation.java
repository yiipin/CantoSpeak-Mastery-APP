package com.example.cantospeakmastery;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class course_conversation extends AppCompatActivity {
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
        setContentView(R.layout.activity_course_conversation);
        ActionBar actionBar=getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);



        LinearLayout menu_airport = (LinearLayout )findViewById(R.id.layout_airport);
        LinearLayout menu_exchange = (LinearLayout )findViewById(R.id.layout_exchange);
        LinearLayout menu_traffic = (LinearLayout )findViewById(R.id.layout_traffic);
        LinearLayout menu_stay = (LinearLayout )findViewById(R.id.layout_stay);
        LinearLayout menu_order = (LinearLayout )findViewById(R.id.layout_order);
        LinearLayout menu_chat = (LinearLayout )findViewById(R.id.layout_chat);
        LinearLayout menu_emergency = (LinearLayout )findViewById(R.id.layout_emergency);
        LinearLayout menu_shopping = (LinearLayout )findViewById(R.id.layout_shopping);
        LinearLayout menu_viewpoint = (LinearLayout )findViewById(R.id.layout_viewpoint);
        LinearLayout menu_greetings = (LinearLayout )findViewById(R.id.layout_greetings);

        menu_airport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (System.currentTimeMillis() - lastClickTime >= FAST_CLICK_DELAY_TIME) {
                    //下面进行其他操作，比如跳转等
                    opencourse_airport();
                            lastClickTime = System.currentTimeMillis();
                }

            }
        });
        menu_exchange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (System.currentTimeMillis() - lastClickTime >= FAST_CLICK_DELAY_TIME) {
                    //下面进行其他操作，比如跳转等
                    opencourse_exchange();
                    lastClickTime = System.currentTimeMillis();
                }
            }
        });
        menu_stay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (System.currentTimeMillis() - lastClickTime >= FAST_CLICK_DELAY_TIME) {
                    //下面进行其他操作，比如跳转等
                    opencourse_stay();
                    lastClickTime = System.currentTimeMillis();
                }
            }
        });
        menu_traffic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (System.currentTimeMillis() - lastClickTime >= FAST_CLICK_DELAY_TIME) {
                    //下面进行其他操作，比如跳转等
                    opencourse_traffic();
                    lastClickTime = System.currentTimeMillis();
                }
            }
        });
        menu_order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (System.currentTimeMillis() - lastClickTime >= FAST_CLICK_DELAY_TIME) {
                    //下面进行其他操作，比如跳转等
                    opencourse_order();
                    lastClickTime = System.currentTimeMillis();
                }
            }
        });
        menu_chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (System.currentTimeMillis() - lastClickTime >= FAST_CLICK_DELAY_TIME) {
                    //下面进行其他操作，比如跳转等
                    opencourse_chat();
                    lastClickTime = System.currentTimeMillis();
                }
            }
        });
        menu_emergency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (System.currentTimeMillis() - lastClickTime >= FAST_CLICK_DELAY_TIME) {
                    //下面进行其他操作，比如跳转等
                    opencourse_emergency();
                    lastClickTime = System.currentTimeMillis();
                }
            }
        });
        menu_shopping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (System.currentTimeMillis() - lastClickTime >= FAST_CLICK_DELAY_TIME) {
                    //下面进行其他操作，比如跳转等
                    opencourse_shopping();
                    lastClickTime = System.currentTimeMillis();
                }
            }
        });
        menu_viewpoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (System.currentTimeMillis() - lastClickTime >= FAST_CLICK_DELAY_TIME) {
                    //下面进行其他操作，比如跳转等
                    opencourse_viewpoint();
                    lastClickTime = System.currentTimeMillis();
                }

            }
        });
        menu_greetings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (System.currentTimeMillis() - lastClickTime >= FAST_CLICK_DELAY_TIME) {
                    //下面进行其他操作，比如跳转等
                    opencourse_greetings();
                    lastClickTime = System.currentTimeMillis();
                }
            }
        });
    }
    private void opencourse_airport() {
        Intent intent = new Intent(this, course_conversation_airport.class);
        startActivity(intent);
    }
    private void opencourse_exchange() {
        Intent intent = new Intent(this, course_conversation_exchange.class);
        startActivity(intent);
    }
    private void opencourse_traffic() {
        Intent intent = new Intent(this, course_conversation_traffic.class);
        startActivity(intent);
    }
    private void opencourse_stay() {
        Intent intent = new Intent(this, course_conversation_stay.class);
        startActivity(intent);
    }
    private void opencourse_order() {
        Intent intent = new Intent(this, course_conversation_order.class);
        startActivity(intent);
    }
    private void opencourse_chat() {
        Intent intent = new Intent(this, course_conversation_chat.class);
        startActivity(intent);
    }
    private void opencourse_emergency() {
        Intent intent = new Intent(this, course_conversation_emergency.class);
        startActivity(intent);
    }
    private void opencourse_shopping() {
        Intent intent = new Intent(this, course_conversation_shopping.class);
        startActivity(intent);
    }
    private void opencourse_viewpoint() {
        Intent intent = new Intent(this, course_conversation_viewpoint.class);
        startActivity(intent);
    }
    private void opencourse_greetings() {
        Intent intent = new Intent(this, course_conversation_greetings.class);
        startActivity(intent);
    }


}

