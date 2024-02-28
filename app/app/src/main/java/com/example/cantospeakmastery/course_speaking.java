package com.example.cantospeakmastery;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;

import android.media.SoundPool;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import android.widget.TextView;
import android.widget.Toast;

public class course_speaking extends AppCompatActivity {
    private SoundPool soundPool;
    private TextView explain;
    private int Id,Id2,Id4,Id5,Id6,Id7,Id8,Id9,Id10,Id11
            ,Id13,Id14,Id15,Id16,Id17,Id18,Id19,Id20,Id21,Id22,Id23,Id24,Id25,Id26,Id27
            ,Id28,Id29,Id30,Id31,Id32,Id33,Id34,Id35,Id36,Id37,Id38,Id39,Id40,Id41,Id42,Id43
            ,Id44,Id45,Id46,Id47,Id48,Id49,Id50,Id51,Id52,Id53,Id54,Id55,Id56,Id57,Id58,Id59
            ,Id60,Id61,Id62,Id63,Id64,Id65,Id66,Id67,Id68,Id69,Id70,Id71,Id72,Id73,Id74,Id75
            ,Id76,Id77;



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
        setContentView(R.layout.activity_course_speaking);
        ActionBar actionBar=getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        explain = findViewById(R.id.explain);

        soundPool = new SoundPool(102, AudioManager.STREAM_MUSIC, 5);
        Id = soundPool.load(this, R.raw.s01, 1);
        Id2 = soundPool.load(this, R.raw.s02, 1);

        Id4 = soundPool.load(this, R.raw.s04, 1);
        Id5 = soundPool.load(this, R.raw.s05, 1);
        Id6 = soundPool.load(this, R.raw.s06, 1);
        Id7 = soundPool.load(this, R.raw.s07, 1);
        Id8 = soundPool.load(this, R.raw.s08, 1);
        Id9 = soundPool.load(this, R.raw.s09, 1);
        Id10 = soundPool.load(this, R.raw.s10, 1);
        Id11 = soundPool.load(this, R.raw.s11, 1);

        Id13 = soundPool.load(this, R.raw.s13, 1);
        Id14 = soundPool.load(this, R.raw.s14, 1);
        Id15 = soundPool.load(this, R.raw.s15, 1);
        Id16 = soundPool.load(this, R.raw.s16, 1);
        Id17 = soundPool.load(this, R.raw.s17, 1);
        Id18 = soundPool.load(this, R.raw.s18, 1);
        Id19 = soundPool.load(this, R.raw.s19, 1);
        Id20 = soundPool.load(this, R.raw.s20, 1);
        Id21 = soundPool.load(this, R.raw.s21, 1);
        Id22 = soundPool.load(this, R.raw.s22, 1);
        Id23 = soundPool.load(this, R.raw.s23, 1);
        Id24 = soundPool.load(this, R.raw.s24, 1);
        Id25 = soundPool.load(this, R.raw.s25, 1);
        Id26 = soundPool.load(this, R.raw.s26, 1);
        Id27 = soundPool.load(this, R.raw.s27, 1);
        Id28 = soundPool.load(this, R.raw.s28, 1);
        Id29 = soundPool.load(this, R.raw.s29, 1);
        Id30 = soundPool.load(this, R.raw.s30, 1);
        Id31 = soundPool.load(this, R.raw.s31, 1);
        Id32 = soundPool.load(this, R.raw.s32, 1);
        Id33 = soundPool.load(this, R.raw.s33, 1);
        Id34 = soundPool.load(this, R.raw.s37, 1);
        Id35 = soundPool.load(this, R.raw.s35, 1);
        Id36 = soundPool.load(this, R.raw.s36, 1);
        Id37 = soundPool.load(this, R.raw.s37, 1);
        Id38 = soundPool.load(this, R.raw.s38, 1);
        Id39 = soundPool.load(this, R.raw.s39, 1);
        Id40 = soundPool.load(this, R.raw.s40, 1);
        Id41 = soundPool.load(this, R.raw.s41, 1);
        Id42 = soundPool.load(this, R.raw.s42, 1);
        Id43 = soundPool.load(this, R.raw.s43, 1);
        Id44 = soundPool.load(this, R.raw.s44, 1);
        Id45 = soundPool.load(this, R.raw.s45, 1);
        Id46 = soundPool.load(this, R.raw.s46, 1);
        Id47 = soundPool.load(this, R.raw.s47, 1);
        Id48 = soundPool.load(this, R.raw.s48, 1);
        Id49 = soundPool.load(this, R.raw.s49, 1);
        Id50 = soundPool.load(this, R.raw.s50, 1);
        Id51 = soundPool.load(this, R.raw.s51, 1);
        Id52 = soundPool.load(this, R.raw.s52, 1);
        Id53 = soundPool.load(this, R.raw.s53, 1);
        Id54 = soundPool.load(this, R.raw.s54, 1);
        Id55 = soundPool.load(this, R.raw.s55, 1);
        Id56 = soundPool.load(this, R.raw.s56, 1);
        Id57 = soundPool.load(this, R.raw.s57, 1);
        Id58 = soundPool.load(this, R.raw.s58, 1);
        Id59 = soundPool.load(this, R.raw.s59, 1);
        Id60 = soundPool.load(this, R.raw.s60, 1);
        Id61 = soundPool.load(this, R.raw.s61, 1);
        Id62 = soundPool.load(this, R.raw.s62, 1);
        Id63 = soundPool.load(this, R.raw.s63, 1);
        Id64 = soundPool.load(this, R.raw.s64, 1);
        Id65 = soundPool.load(this, R.raw.s65, 1);
        Id66 = soundPool.load(this, R.raw.s66, 1);
        Id67 = soundPool.load(this, R.raw.s67, 1);
        Id68 = soundPool.load(this, R.raw.s68, 1);
        Id69 = soundPool.load(this, R.raw.s69, 1);
        Id70 = soundPool.load(this, R.raw.s70, 1);
        Id71 = soundPool.load(this, R.raw.s71, 1);
        Id72 = soundPool.load(this, R.raw.s72, 1);
        Id73 = soundPool.load(this, R.raw.s73, 1);
        Id74 = soundPool.load(this, R.raw.s74, 1);
        Id75 = soundPool.load(this, R.raw.s75, 1);
        Id76 = soundPool.load(this, R.raw.s76, 1);
        Id77 = soundPool.load(this, R.raw.s77, 1);

            }

    public void speaking1_1(View view){
        explain.setText(R.string.sk1);
        soundPool.play(Id, 1.0F, 1.0F, 0, 0, 1.0F);
            };
    public void speaking1_2(View view){
        explain.setText(R.string.sk2);
        soundPool.play(Id2, 1.0F, 1.0F, 0, 0, 1.0F);
    };

    public void speaking1_4(View view){
        explain.setText(R.string.sk3);
        soundPool.play(Id4, 1.0F, 1.0F, 0, 0, 1.0F);
    };
    public void speaking1_5(View view){
        explain.setText(R.string.sk4);
        soundPool.play(Id5, 1.0F, 1.0F, 0, 0, 1.0F);
    };
    public void speaking2_1(View view){
        explain.setText(R.string.sk5);
        soundPool.play(Id6, 1.0F, 1.0F, 0, 0, 1.0F);
    };
    public void speaking2_2(View view){
        explain.setText(R.string.sk6);
        soundPool.play(Id7, 1.0F, 1.0F, 0, 0, 1.0F);
    };
    public void speaking2_3(View view){
        explain.setText(R.string.sk7);
        soundPool.play(Id8, 1.0F, 1.0F, 0, 0, 1.0F);
    };
    public void speaking2_4(View view){
        explain.setText(R.string.sk8);
        soundPool.play(Id9, 1.0F, 1.0F, 0, 0, 1.0F);
    };
    public void speaking2_5(View view){
        explain.setText(R.string.sk9);
        soundPool.play(Id10, 1.0F, 1.0F, 0, 0, 1.0F);
    };

    public void speaking3_1(View view){
        explain.setText(R.string.sk10);
        soundPool.play(Id11, 1.0F, 1.0F, 0, 0, 1.0F);
    };
    public void speaking3_2(View view){
        explain.setText(R.string.sk11);
        soundPool.play(Id11, 1.0F, 1.0F, 0, 0, 1.0F);
    };
    public void speaking3_3(View view){
        explain.setText(R.string.sk12);
        soundPool.play(Id13, 1.0F, 1.0F, 0, 0, 1.0F);
    };
    public void speaking3_4(View view){
        explain.setText(R.string.sk13);
        soundPool.play(Id14, 1.0F, 1.0F, 0, 0, 1.0F);
    };
    public void speaking3_5(View view){
        explain.setText(R.string.sk14);
        soundPool.play(Id15, 1.0F, 1.0F, 0, 0, 1.0F);
    };
    public void speaking4_1(View view){
        explain.setText(R.string.sk15);
        soundPool.play(Id16, 1.0F, 1.0F, 0, 0, 1.0F);
    };
    public void speaking4_2(View view){
        explain.setText(R.string.sk16);
        soundPool.play(Id17, 1.0F, 1.0F, 0, 0, 1.0F);
    };
    public void speaking4_3(View view){
        explain.setText(R.string.sk17);
        soundPool.play(Id18, 1.0F, 1.0F, 0, 0, 1.0F);
    };
    public void speaking4_4(View view){
        explain.setText(R.string.sk18);
        soundPool.play(Id19, 1.0F, 1.0F, 0, 0, 1.0F);
    };
    public void speaking5_1(View view){
        explain.setText(R.string.sk19);
        soundPool.play(Id20, 1.0F, 1.0F, 0, 0, 1.0F);
    };

    public void speaking5_2(View view){
        explain.setText(R.string.sk20);
        soundPool.play(Id21, 1.0F, 1.0F, 0, 0, 1.0F);
    };
    public void speaking5_3(View view){
        explain.setText(R.string.sk21);
        soundPool.play(Id22, 1.0F, 1.0F, 0, 0, 1.0F);
    };
    public void speaking5_4(View view){
        explain.setText(R.string.sk22);
        soundPool.play(Id23, 1.0F, 1.0F, 0, 0, 1.0F);
    };
    public void speaking6_1(View view){
        explain.setText(R.string.sk23);
        soundPool.play(Id24, 1.0F, 1.0F, 0, 0, 1.0F);
    };
    public void speaking6_2(View view){
        explain.setText(R.string.sk24);
        soundPool.play(Id25, 1.0F, 1.0F, 0, 0, 1.0F);
    };
    public void speaking6_3(View view){
        explain.setText(R.string.sk25);
        soundPool.play(Id26, 1.0F, 1.0F, 0, 0, 1.0F);
    };
    public void speaking6_4(View view){
        explain.setText(R.string.sk26);
        soundPool.play(Id27, 1.0F, 1.0F, 0, 0, 1.0F);
    };
    public void speaking7_1(View view){
        explain.setText(R.string.sk27);
        soundPool.play(Id28, 1.0F, 1.0F, 0, 0, 1.0F);
    };
    public void speaking7_2(View view){
        explain.setText(R.string.sk28);
        soundPool.play(Id29, 1.0F, 1.0F, 0, 0, 1.0F);
    };
    public void speaking7_3(View view){
        explain.setText(R.string.sk29);
        soundPool.play(Id30, 1.0F, 1.0F, 0, 0, 1.0F);
    };
    public void speaking7_4(View view){
        explain.setText(R.string.sk30);
        soundPool.play(Id31, 1.0F, 1.0F, 0, 0, 1.0F);
    };
    public void speaking8_1(View view){
        explain.setText(R.string.sk31);
        soundPool.play(Id32, 1.0F, 1.0F, 0, 0, 1.0F);
    };
    public void speaking8_2(View view){
        explain.setText(R.string.sk32);
        soundPool.play(Id33, 1.0F, 1.0F, 0, 0, 1.0F);
    };
    public void speaking8_3(View view){
        explain.setText(R.string.sk33);
        soundPool.play(Id34, 1.0F, 1.0F, 0, 0, 1.0F);
    };
    public void speaking8_4(View view){
        explain.setText(R.string.sk34);
        soundPool.play(Id35, 1.0F, 1.0F, 0, 0, 1.0F);
    };
    public void speaking9_1(View view){
        explain.setText(R.string.sk35);
        soundPool.play(Id36, 1.0F, 1.0F, 0, 0, 1.0F);
    };
    public void speaking9_2(View view){
        explain.setText(R.string.sk36);
        soundPool.play(Id37, 1.0F, 1.0F, 0, 0, 1.0F);
    };
    public void speaking9_3(View view){
        explain.setText(R.string.sk37);
        soundPool.play(Id38, 1.0F, 1.0F, 0, 0, 1.0F);
    };
    public void speaking9_4(View view){
        explain.setText(R.string.sk38);
        soundPool.play(Id39, 1.0F, 1.0F, 0, 0, 1.0F);
    };
    public void speaking10_1(View view){
        explain.setText(R.string.sk39);
        soundPool.play(Id40, 1.0F, 1.0F, 0, 0, 1.0F);
    };

    public void speaking10_2(View view){
        explain.setText(R.string.sk40);
        soundPool.play(Id41, 1.0F, 1.0F, 0, 0, 1.0F);
    };
    public void speaking10_3(View view){
        explain.setText(R.string.sk41);
        soundPool.play(Id42, 1.0F, 1.0F, 0, 0, 1.0F);
    };
    public void speaking10_4(View view){
        explain.setText(R.string.sk42);
        soundPool.play(Id43, 1.0F, 1.0F, 0, 0, 1.0F);
    };
    public void speaking11_1(View view){
        explain.setText(R.string.sk43);
        soundPool.play(Id44, 1.0F, 1.0F, 0, 0, 1.0F);
    };
    public void speaking11_2(View view){
        explain.setText(R.string.sk44);
        soundPool.play(Id45, 1.0F, 1.0F, 0, 0, 1.0F);
    };
    public void speaking11_3(View view){
        explain.setText(R.string.sk45);
        soundPool.play(Id46, 1.0F, 1.0F, 0, 0, 1.0F);
    };
    public void speaking11_4(View view){
        explain.setText(R.string.sk46);
        soundPool.play(Id47, 1.0F, 1.0F, 0, 0, 1.0F);
    };
    public void speaking12_1(View view){
        explain.setText(R.string.sk47);
        soundPool.play(Id48, 1.0F, 1.0F, 0, 0, 1.0F);
    };
    public void speaking12_2(View view){
        explain.setText(R.string.sk48);
        soundPool.play(Id49, 1.0F, 1.0F, 0, 0, 1.0F);
    };
    public void speaking12_3(View view){
        explain.setText(R.string.sk49);
        soundPool.play(Id50, 1.0F, 1.0F, 0, 0, 1.0F);
    };

    public void speaking12_4(View view){
        explain.setText(R.string.sk50);
        soundPool.play(Id51, 1.0F, 1.0F, 0, 0, 1.0F);
    };
    public void speaking13_1(View view){
        explain.setText(R.string.sk51);
        soundPool.play(Id52, 1.0F, 1.0F, 0, 0, 1.0F);
    };
    public void speaking13_2(View view){
        explain.setText(R.string.sk52);
        soundPool.play(Id53, 1.0F, 1.0F, 0, 0, 1.0F);
    };
    public void speaking13_3(View view){
        explain.setText(R.string.sk53);
        soundPool.play(Id54, 1.0F, 1.0F, 0, 0, 1.0F);
    };
    public void speaking13_4(View view){
        explain.setText(R.string.sk54);
        soundPool.play(Id55, 1.0F, 1.0F, 0, 0, 1.0F);
    };
    public void speaking14_1(View view){
        explain.setText(R.string.sk55);
        soundPool.play(Id56, 1.0F, 1.0F, 0, 0, 1.0F);
    };
    public void speaking14_2(View view){
        explain.setText(R.string.sk56);
        soundPool.play(Id57, 1.0F, 1.0F, 0, 0, 1.0F);
    };
    public void speaking14_3(View view){
        explain.setText(R.string.sk57);
        soundPool.play(Id58, 1.0F, 1.0F, 0, 0, 1.0F);
    };
    public void speaking14_4(View view){
        explain.setText(R.string.sk58);
        soundPool.play(Id59, 1.0F, 1.0F, 0, 0, 1.0F);
    };
    public void speaking15_1(View view){
        explain.setText(R.string.sk59);
        soundPool.play(Id60, 1.0F, 1.0F, 0, 0, 1.0F);
    };

    public void speaking15_2(View view){
        explain.setText(R.string.sk60);
        soundPool.play(Id61, 1.0F, 1.0F, 0, 0, 1.0F);
    };
    public void speaking15_3(View view){
        explain.setText(R.string.sk61);
        soundPool.play(Id62, 1.0F, 1.0F, 0, 0, 1.0F);
    };
    public void speaking15_4(View view){
        explain.setText(R.string.sk62);
        soundPool.play(Id63, 1.0F, 1.0F, 0, 0, 1.0F);
    };
    public void speaking16_1(View view){
        explain.setText(R.string.sk63);
        soundPool.play(Id64, 1.0F, 1.0F, 0, 0, 1.0F);
    };
    public void speaking16_2(View view){
        explain.setText(R.string.sk64);
        soundPool.play(Id65, 1.0F, 1.0F, 0, 0, 1.0F);
    };
    public void speaking16_3(View view){
        explain.setText(R.string.sk65);
        soundPool.play(Id66, 1.0F, 1.0F, 0, 0, 1.0F);
    };
    public void speaking16_4(View view){
        explain.setText(R.string.sk66);
        soundPool.play(Id67, 1.0F, 1.0F, 0, 0, 1.0F);
    };
    public void speaking17_1(View view){
        explain.setText(R.string.sk67);
        soundPool.play(Id68, 1.0F, 1.0F, 0, 0, 1.0F);
    };
    public void speaking17_2(View view){
        explain.setText(R.string.sk68);
        soundPool.play(Id69, 1.0F, 1.0F, 0, 0, 1.0F);
    };
    public void speaking17_3(View view){
        explain.setText(R.string.sk69);
        soundPool.play(Id70, 1.0F, 1.0F, 0, 0, 1.0F);
    };

    public void speaking17_4(View view){
        explain.setText(R.string.sk70);
        soundPool.play(Id71, 1.0F, 1.0F, 0, 0, 1.0F);
    };
    public void speaking18_1(View view){
        explain.setText(R.string.sk71);
        soundPool.play(Id72, 1.0F, 1.0F, 0, 0, 1.0F);
    };
    public void speaking18_2(View view){
        explain.setText(R.string.sk72);
        soundPool.play(Id73, 1.0F, 1.0F, 0, 0, 1.0F);
    };
    public void speaking18_3(View view){
        explain.setText(R.string.sk73);
        soundPool.play(Id74, 1.0F, 1.0F, 0, 0, 1.0F);
    };
    public void speaking18_4(View view){
        explain.setText(R.string.sk74);
        soundPool.play(Id75, 1.0F, 1.0F, 0, 0, 1.0F);
    };
    public void speaking19_1(View view){
        explain.setText(R.string.sk75);
        soundPool.play(Id76, 1.0F, 1.0F, 0, 0, 1.0F);
    };
    public void speaking19_2(View view){
        explain.setText(R.string.sk76);
        soundPool.play(Id77, 1.0F, 1.0F, 0, 0, 1.0F);
    };

    @Override
    protected void onDestroy() {
        super.onDestroy();
        soundPool.release();
        return;
    }
        }

