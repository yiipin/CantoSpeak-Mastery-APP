package com.example.cantospeakmastery;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;
import android.util.AttributeSet;
import android.content.Context;
import android.media.SoundPool;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class course_word extends AppCompatActivity {
    private SoundPool soundPool;
    private int Id,Id2,Id3,Id4,Id5,Id6,Id7,Id8,Id9,Id10,Id11
,Id12,Id13,Id14,Id15,Id16,Id17,Id18,Id19,Id20,Id21,Id22,Id23,Id24,Id25,Id26,Id27
,Id28,Id29,Id30,Id31,Id32,Id33,Id34,Id35,Id36,Id37,Id38,Id39,Id40,Id41,Id42,Id43
,Id44,Id45,Id46,Id47,Id48,Id49,Id50,Id51,Id52,Id53,Id54,Id55,Id56,Id57,Id58,Id59
,Id60,Id61,Id62,Id63,Id64,Id65,Id66,Id67,Id68,Id69,Id70,Id71,Id72,Id73,Id74,Id75
,Id76,Id77,Id78,Id79,Id80,Id81,Id82,Id83,Id84,Id85,Id86,Id87,Id88,Id89,Id90,Id91
,Id92,Id93,Id94,Id95,Id96,Id97,Id98,Id99,Id100,Id101,Id102;
    GridView gridView;

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
        setContentView(R.layout.activity_course_word);
        ActionBar actionBar=getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        TextView ep = findViewById(R.id.explain);

        soundPool = new SoundPool(102, AudioManager.STREAM_MUSIC, 5);
        Id = soundPool.load(this, R.raw.c01, 1);
        Id2 = soundPool.load(this, R.raw.c02, 1);
        Id3 = soundPool.load(this, R.raw.c03, 1);
        Id4 = soundPool.load(this, R.raw.c04, 1);
        Id5 = soundPool.load(this, R.raw.c05, 1);
        Id6 = soundPool.load(this, R.raw.c06, 1);
        Id7 = soundPool.load(this, R.raw.c07, 1);
        Id8 = soundPool.load(this, R.raw.c08, 1);
        Id9 = soundPool.load(this, R.raw.c09, 1);
        Id10 = soundPool.load(this, R.raw.c10, 1);
        Id11 = soundPool.load(this, R.raw.c11, 1);
        Id12 = soundPool.load(this, R.raw.c12, 1);
        Id13 = soundPool.load(this, R.raw.c13, 1);
        Id14 = soundPool.load(this, R.raw.c14, 1);
        Id15 = soundPool.load(this, R.raw.c15, 1);
        Id16 = soundPool.load(this, R.raw.c16, 1);
        Id17 = soundPool.load(this, R.raw.c17, 1);
        Id18 = soundPool.load(this, R.raw.c18, 1);
        Id19 = soundPool.load(this, R.raw.c19, 1);
        Id20 = soundPool.load(this, R.raw.c20, 1);
        Id21 = soundPool.load(this, R.raw.c21, 1);
        Id22 = soundPool.load(this, R.raw.c22, 1);
        Id23 = soundPool.load(this, R.raw.c23, 1);
        Id24 = soundPool.load(this, R.raw.c24, 1);
        Id25 = soundPool.load(this, R.raw.c25, 1);
        Id26 = soundPool.load(this, R.raw.c26, 1);
        Id27 = soundPool.load(this, R.raw.c27, 1);
        Id28 = soundPool.load(this, R.raw.c28, 1);
        Id29 = soundPool.load(this, R.raw.c29, 1);
        Id30 = soundPool.load(this, R.raw.c30, 1);
        Id31 = soundPool.load(this, R.raw.c31, 1);
        Id32 = soundPool.load(this, R.raw.c32, 1);
        Id33 = soundPool.load(this, R.raw.c33, 1);
        Id34 = soundPool.load(this, R.raw.c37, 1);
        Id35 = soundPool.load(this, R.raw.c35, 1);
        Id36 = soundPool.load(this, R.raw.c36, 1);
        Id37 = soundPool.load(this, R.raw.c37, 1);
        Id38 = soundPool.load(this, R.raw.c38, 1);
        Id39 = soundPool.load(this, R.raw.c39, 1);
        Id40 = soundPool.load(this, R.raw.c40, 1);
        Id41 = soundPool.load(this, R.raw.c41, 1);
        Id42 = soundPool.load(this, R.raw.c42, 1);
        Id43 = soundPool.load(this, R.raw.c43, 1);
        Id44 = soundPool.load(this, R.raw.c44, 1);
        Id45 = soundPool.load(this, R.raw.c45, 1);
        Id46 = soundPool.load(this, R.raw.c46, 1);
        Id47 = soundPool.load(this, R.raw.c47, 1);
        Id48 = soundPool.load(this, R.raw.c48, 1);
        Id49 = soundPool.load(this, R.raw.c49, 1);
        Id50 = soundPool.load(this, R.raw.c50, 1);
        Id51 = soundPool.load(this, R.raw.c51, 1);
        Id52 = soundPool.load(this, R.raw.c52, 1);
        Id53 = soundPool.load(this, R.raw.c53, 1);
        Id54 = soundPool.load(this, R.raw.c54, 1);
        Id55 = soundPool.load(this, R.raw.c55, 1);
        Id56 = soundPool.load(this, R.raw.c56, 1);
        Id57 = soundPool.load(this, R.raw.c57, 1);
        Id58 = soundPool.load(this, R.raw.c58, 1);
        Id59 = soundPool.load(this, R.raw.c59, 1);
        Id60 = soundPool.load(this, R.raw.c60, 1);
        Id61 = soundPool.load(this, R.raw.c61, 1);
        Id62 = soundPool.load(this, R.raw.c62, 1);
        Id63 = soundPool.load(this, R.raw.c63, 1);
        Id64 = soundPool.load(this, R.raw.c64, 1);
        Id65 = soundPool.load(this, R.raw.c65, 1);
        Id66 = soundPool.load(this, R.raw.c66, 1);
        Id67 = soundPool.load(this, R.raw.c67, 1);
        Id68 = soundPool.load(this, R.raw.c68, 1);
        Id69 = soundPool.load(this, R.raw.c69, 1);
        Id70 = soundPool.load(this, R.raw.c70, 1);
        Id71 = soundPool.load(this, R.raw.c71, 1);
        Id72 = soundPool.load(this, R.raw.c72, 1);
        Id73 = soundPool.load(this, R.raw.c73, 1);
        Id74 = soundPool.load(this, R.raw.c74, 1);
        Id75 = soundPool.load(this, R.raw.c75, 1);
        Id76 = soundPool.load(this, R.raw.c76, 1);
        Id77 = soundPool.load(this, R.raw.c77, 1);
        Id78 = soundPool.load(this, R.raw.c78, 1);
        Id79 = soundPool.load(this, R.raw.c79, 1);
        Id80 = soundPool.load(this, R.raw.c80, 1);
        Id81 = soundPool.load(this, R.raw.c81, 1);
        Id82 = soundPool.load(this, R.raw.c82, 1);
        Id83 = soundPool.load(this, R.raw.c83, 1);
        Id84 = soundPool.load(this, R.raw.c84, 1);
        Id85 = soundPool.load(this, R.raw.c85, 1);
        Id86 = soundPool.load(this, R.raw.c86, 1);
        Id87 = soundPool.load(this, R.raw.c87, 1);
        Id88 = soundPool.load(this, R.raw.c88, 1);
        Id89 = soundPool.load(this, R.raw.c89, 1);
        Id90 = soundPool.load(this, R.raw.c90, 1);
        Id91 = soundPool.load(this, R.raw.c91, 1);
        Id92 = soundPool.load(this, R.raw.c92, 1);
        Id93 = soundPool.load(this, R.raw.c93, 1);
        Id94 = soundPool.load(this, R.raw.c94, 1);
        Id95 = soundPool.load(this, R.raw.c95, 1);
        Id96 = soundPool.load(this, R.raw.c96, 1);
        Id97 = soundPool.load(this, R.raw.c97, 1);
        Id98 = soundPool.load(this, R.raw.c98, 1);
        Id99 = soundPool.load(this, R.raw.c99, 1);
        Id100 = soundPool.load(this, R.raw.c100, 1);
        Id101 = soundPool.load(this, R.raw.c101, 1);
        Id102 = soundPool.load(this, R.raw.c102, 1);


        String[] words = new String[]{
                "佢", "啲", "咁", "嗰",//4
                "咗", "係", "喺", "哋",//8
                "冇", "吓", "唔", "咩",//12
                "咪", "咪", "嘅", "㗎",//16
                "喎", "嘢", "嚟", "囉",//20
                "乜", "住", "嗱", "叻",//24
                "吖", "攰", "依", "呢",//28
                "哩", "俾", "蚊", "啩",//32
                "啱", "噃", "掂", "喂",//36
                "睇", "髀", "搵", "曬",//40
                "廿", "囝", "囡", "呃",//44
                "奀", "乸", "拎", "響",//48
                "閂", "冧", "唓", "唞",//52
                "晏", "諗", "屙", "掟",//56
                "擝", "啫", "喇", "喐",//60
                "揼", "搣", "碌", "蹝",//64
                "摟", "摟", "鑊", "噏",//68
                "篤", "嬲", "燶", "傾",//72
                "嚿", "攞", "𠱁", "𥄫",//76
                "姣", "𤓓", "撳", "點",//80
                "瓜", "執", "褪", "孭",//84
                "揸", "劏", "插", "淆",//88
                "瞓", "緊", "瀨", "嚡",//92
                "度", "揈", "屌", "尻",//96
                "撚", "柒", "閪", "仆",//100
                "冚", "躝",
        };

        final List<String> plantsList = new ArrayList<String>(Arrays.asList(words));
        gridView = findViewById(R.id.gridView);


        gridView.setAdapter(new ArrayAdapter<String>(
                this, android.R.layout.simple_list_item_1, plantsList){
            public View getView(int position, View convertView, ViewGroup parent) {

                // Return the GridView current item as a View
                View view = super.getView(position,convertView,parent);

                // Convert the view as a TextView widget
                TextView tv = (TextView) view;
                tv.setTextSize(25);
                // Set the TextView text (GridView item text)
                tv.setText(plantsList.get(position));

                return tv;
            }
        });







        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch (position) {

                    case 0:
                        soundPool.play(Id, 1.0F, 1.0F, 0, 0, 1.0F);
                        ep.setText(R.string.word1);
                        break;
                    case 1:
                        soundPool.play(Id2, 1.0F, 1.0F, 0, 0, 1.0F);
                        ep.setText(R.string.word2);
                        break;
                    case 2:
                        soundPool.play(Id3, 1.0F, 1.0F, 0, 0, 1.0F);
                        ep.setText(R.string.word3);
                        break;
                    case 3:
                        soundPool.play(Id4, 1.0F, 1.0F, 0, 0, 1.0F);
                        ep.setText(R.string.word4);
                        break;
                    case 4:
                        soundPool.play(Id5, 1.0F, 1.0F, 0, 0, 1.0F);
                        ep.setText(R.string.word5);
                        break;
                    case 5:
                        soundPool.play(Id6, 1.0F, 1.0F, 0, 0, 1.0F);
                        ep.setText(R.string.word6);
                        break;
                    case 6:
                        soundPool.play(Id7, 1.0F, 1.0F, 0, 0, 1.0F);
                        ep.setText(R.string.word7);
                        break;
                    case 7:
                        soundPool.play(Id8, 1.0F, 1.0F, 0, 0, 1.0F);
                        ep.setText(R.string.word8);
                        break;
                    case 8:
                        soundPool.play(Id9, 1.0F, 1.0F, 0, 0, 1.0F);
                        ep.setText(R.string.word9);
                        break;
                    case 9:
                        soundPool.play(Id10, 1.0F, 1.0F, 0, 0, 1.0F);
                        ep.setText(R.string.word10);
                        break;
                    case 10:
                        soundPool.play(Id11, 1.0F, 1.0F, 0, 0, 1.0F);
                        ep.setText(R.string.word11);
                        break;
                    case 11:
                        soundPool.play(Id12, 1.0F, 1.0F, 0, 0, 1.0F);
                        ep.setText(R.string.word12);
                        break;
                    case 12:
                        soundPool.play(Id13, 1.0F, 1.0F, 0, 0, 1.0F);
                        ep.setText(R.string.word13);
                        break;
                    case 13:
                        soundPool.play(Id14, 1.0F, 1.0F, 0, 0, 1.0F);
                        ep.setText(R.string.word14);
                        break;
                    case 14:
                        soundPool.play(Id15, 1.0F, 1.0F, 0, 0, 1.0F);
                        ep.setText(R.string.word15);
                        break;
                    case 15:
                        soundPool.play(Id16, 1.0F, 1.0F, 0, 0, 1.0F);
                        ep.setText(R.string.word16);
                        break;
                    case 16:
                        soundPool.play(Id17, 1.0F, 1.0F, 0, 0, 1.0F);
                        ep.setText(R.string.word17);
                        break;
                    case 17:
                        soundPool.play(Id18, 1.0F, 1.0F, 0, 0, 1.0F);
                        ep.setText(R.string.word18);
                        break;
                    case 18:
                        soundPool.play(Id19, 1.0F, 1.0F, 0, 0, 1.0F);
                        ep.setText(R.string.word19);
                        break;
                    case 19:
                        soundPool.play(Id20, 1.0F, 1.0F, 0, 0, 1.0F);
                        ep.setText(R.string.word20);
                        break;
                    case 20:
                        soundPool.play(Id21, 1.0F, 1.0F, 0, 0, 1.0F);
                        ep.setText(R.string.word21);
                        break;
                    case 21:
                        soundPool.play(Id22, 1.0F, 1.0F, 0, 0, 1.0F);
                        ep.setText(R.string.word22);
                        break;
                    case 22:
                        soundPool.play(Id23, 1.0F, 1.0F, 0, 0, 1.0F);
                        ep.setText(R.string.word23);
                        break;
                    case 23:
                        soundPool.play(Id24, 1.0F, 1.0F, 0, 0, 1.0F);
                        ep.setText(R.string.word24);
                        break;
                    case 24:
                        soundPool.play(Id25, 1.0F, 1.0F, 0, 0, 1.0F);
                        ep.setText(R.string.word25);
                        break;
                    case 25:
                        soundPool.play(Id26, 1.0F, 1.0F, 0, 0, 1.0F);
                        ep.setText(R.string.word26);
                        break;
                    case 26:
                        soundPool.play(Id27, 1.0F, 1.0F, 0, 0, 1.0F);
                        ep.setText(R.string.word27);
                        break;
                    case 27:
                        soundPool.play(Id28, 1.0F, 1.0F, 0, 0, 1.0F);
                        ep.setText(R.string.word28);
                        break;
                    case 28:
                        soundPool.play(Id29, 1.0F, 1.0F, 0, 0, 1.0F);
                        ep.setText(R.string.word29);
                        break;
                    case 29:
                        soundPool.play(Id30, 1.0F, 1.0F, 0, 0, 1.0F);
                        ep.setText(R.string.word30);
                        break;
                    case 30:
                        soundPool.play(Id31, 1.0F, 1.0F, 0, 0, 1.0F);
                        ep.setText(R.string.word31);
                        break;
                    case 31:
                        soundPool.play(Id32, 1.0F, 1.0F, 0, 0, 1.0F);
                        ep.setText(R.string.word32);
                        break;
                    case 32:
                        soundPool.play(Id33, 1.0F, 1.0F, 0, 0, 1.0F);
                        ep.setText(R.string.word33);
                        break;
                    case 33:
                        soundPool.play(Id34, 1.0F, 1.0F, 0, 0, 1.0F);
                        ep.setText(R.string.word34);
                        break;
                    case 34:
                        soundPool.play(Id35, 1.0F, 1.0F, 0, 0, 1.0F);
                        ep.setText(R.string.word35);
                        break;
                    case 35:
                        soundPool.play(Id36, 1.0F, 1.0F, 0, 0, 1.0F);
                        ep.setText(R.string.word36);
                        break;
                    case 36:
                        soundPool.play(Id37, 1.0F, 1.0F, 0, 0, 1.0F);
                        ep.setText(R.string.word37);
                        break;
                    case 37:
                        soundPool.play(Id38, 1.0F, 1.0F, 0, 0, 1.0F);
                        ep.setText(R.string.word38);
                        break;
                    case 38:
                        soundPool.play(Id39, 1.0F, 1.0F, 0, 0, 1.0F);
                        ep.setText(R.string.word39);
                        break;
                    case 39:
                        soundPool.play(Id40, 1.0F, 1.0F, 0, 0, 1.0F);
                        ep.setText(R.string.word40);
                        break;
                    case 40:
                        soundPool.play(Id41, 1.0F, 1.0F, 0, 0, 1.0F);
                        ep.setText(R.string.word41);
                        break;
                    case 41:
                        soundPool.play(Id42, 1.0F, 1.0F, 0, 0, 1.0F);
                        ep.setText(R.string.word42);
                        break;
                    case 42:
                        soundPool.play(Id43, 1.0F, 1.0F, 0, 0, 1.0F);
                        ep.setText(R.string.word43);
                        break;
                    case 43:
                        soundPool.play(Id44, 1.0F, 1.0F, 0, 0, 1.0F);
                        ep.setText(R.string.word44);
                        break;
                    case 44:
                        soundPool.play(Id45, 1.0F, 1.0F, 0, 0, 1.0F);
                        ep.setText(R.string.word45);
                        break;
                    case 45:
                        soundPool.play(Id46, 1.0F, 1.0F, 0, 0, 1.0F);
                        ep.setText(R.string.word46);
                        break;
                    case 46:
                        soundPool.play(Id47, 1.0F, 1.0F, 0, 0, 1.0F);
                        ep.setText(R.string.word47);
                        break;
                    case 47:
                        soundPool.play(Id48, 1.0F, 1.0F, 0, 0, 1.0F);
                        ep.setText(R.string.word48);
                        break;
                    case 48:
                        soundPool.play(Id49, 1.0F, 1.0F, 0, 0, 1.0F);
                        ep.setText(R.string.word49);
                        break;
                    case 49:
                        soundPool.play(Id50, 1.0F, 1.0F, 0, 0, 1.0F);
                        ep.setText(R.string.word50);
                        break;
                    case 50:
                        soundPool.play(Id51, 1.0F, 1.0F, 0, 0, 1.0F);
                        ep.setText(R.string.word51);
                        break;
                    case 51:
                        soundPool.play(Id52, 1.0F, 1.0F, 0, 0, 1.0F);
                        ep.setText(R.string.word52);
                        break;
                    case 52:
                        soundPool.play(Id53, 1.0F, 1.0F, 0, 0, 1.0F);
                        ep.setText(R.string.word53);
                        break;
                    case 53:
                        soundPool.play(Id54, 1.0F, 1.0F, 0, 0, 1.0F);
                        ep.setText(R.string.word54);
                        break;
                    case 54:
                        soundPool.play(Id55, 1.0F, 1.0F, 0, 0, 1.0F);
                        ep.setText(R.string.word55);
                        break;
                    case 55:
                        soundPool.play(Id56, 1.0F, 1.0F, 0, 0, 1.0F);
                        ep.setText(R.string.word56);
                        break;
                    case 56:
                        soundPool.play(Id57, 1.0F, 1.0F, 0, 0, 1.0F);
                        ep.setText(R.string.word57);
                        break;
                    case 57:
                        soundPool.play(Id58, 1.0F, 1.0F, 0, 0, 1.0F);
                        ep.setText(R.string.word58);
                        break;
                    case 58:
                        soundPool.play(Id59, 1.0F, 1.0F, 0, 0, 1.0F);
                        ep.setText(R.string.word59);
                        break;
                    case 59:
                        soundPool.play(Id60, 1.0F, 1.0F, 0, 0, 1.0F);
                        ep.setText(R.string.word60);
                        break;
                    case 60:
                        soundPool.play(Id61, 1.0F, 1.0F, 0, 0, 1.0F);
                        ep.setText(R.string.word61);
                        break;
                    case 61:
                        soundPool.play(Id62, 1.0F, 1.0F, 0, 0, 1.0F);
                        ep.setText(R.string.word62);
                        break;
                    case 62:
                        soundPool.play(Id63, 1.0F, 1.0F, 0, 0, 1.0F);
                        ep.setText(R.string.word63);
                        break;
                    case 63:
                        soundPool.play(Id64, 1.0F, 1.0F, 0, 0, 1.0F);
                        ep.setText(R.string.word64);
                        break;
                    case 64:
                        soundPool.play(Id65, 1.0F, 1.0F, 0, 0, 1.0F);
                        ep.setText(R.string.word65);
                        break;
                    case 65:
                        soundPool.play(Id66, 1.0F, 1.0F, 0, 0, 1.0F);
                        ep.setText(R.string.word66);
                        break;
                    case 66:
                        soundPool.play(Id67, 1.0F, 1.0F, 0, 0, 1.0F);
                        ep.setText(R.string.word67);
                        break;
                    case 67:
                        soundPool.play(Id68, 1.0F, 1.0F, 0, 0, 1.0F);
                        ep.setText(R.string.word68);
                        break;
                    case 68:
                        soundPool.play(Id69, 1.0F, 1.0F, 0, 0, 1.0F);
                        ep.setText(R.string.word69);
                        break;
                    case 69:
                        soundPool.play(Id70, 1.0F, 1.0F, 0, 0, 1.0F);
                        ep.setText(R.string.word70);
                        break;
                    case 70:
                        soundPool.play(Id71, 1.0F, 1.0F, 0, 0, 1.0F);
                        ep.setText(R.string.word71);
                        break;
                    case 71:
                        soundPool.play(Id72, 1.0F, 1.0F, 0, 0, 1.0F);
                        ep.setText(R.string.word72);
                        break;
                    case 72:
                        soundPool.play(Id73, 1.0F, 1.0F, 0, 0, 1.0F);
                        ep.setText(R.string.word73);
                        break;
                    case 73:
                        soundPool.play(Id74, 1.0F, 1.0F, 0, 0, 1.0F);
                        ep.setText(R.string.word74);
                        break;
                    case 74:
                        soundPool.play(Id75, 1.0F, 1.0F, 0, 0, 1.0F);
                        ep.setText(R.string.word75);
                        break;
                    case 75:
                        soundPool.play(Id76, 1.0F, 1.0F, 0, 0, 1.0F);
                        ep.setText(R.string.word76);
                        break;
                    case 76:
                        soundPool.play(Id77, 1.0F, 1.0F, 0, 0, 1.0F);
                        ep.setText(R.string.word77);
                        break;
                    case 77:
                        soundPool.play(Id78, 1.0F, 1.0F, 0, 0, 1.0F);
                        ep.setText(R.string.word78);
                        break;
                    case 78:
                        soundPool.play(Id79, 1.0F, 1.0F, 0, 0, 1.0F);
                        ep.setText(R.string.word79);
                        break;
                    case 79:
                        soundPool.play(Id80, 1.0F, 1.0F, 0, 0, 1.0F);
                        ep.setText(R.string.word80);
                        break;
                    case 80:
                        soundPool.play(Id81, 1.0F, 1.0F, 0, 0, 1.0F);
                        ep.setText(R.string.word81);
                        break;
                    case 81:
                        soundPool.play(Id82, 1.0F, 1.0F, 0, 0, 1.0F);
                        ep.setText(R.string.word82);
                        break;
                    case 82:
                        soundPool.play(Id83, 1.0F, 1.0F, 0, 0, 1.0F);
                        ep.setText(R.string.word83);
                        break;
                    case 83:
                        soundPool.play(Id84, 1.0F, 1.0F, 0, 0, 1.0F);
                        ep.setText(R.string.word84);
                        break;
                    case 84:
                        soundPool.play(Id85, 1.0F, 1.0F, 0, 0, 1.0F);
                        ep.setText(R.string.word85);
                        break;
                    case 85:
                        soundPool.play(Id86, 1.0F, 1.0F, 0, 0, 1.0F);
                        ep.setText(R.string.word86);
                        break;
                    case 86:
                        soundPool.play(Id87, 1.0F, 1.0F, 0, 0, 1.0F);
                        ep.setText(R.string.word87);
                        break;
                    case 87:
                        soundPool.play(Id88, 1.0F, 1.0F, 0, 0, 1.0F);
                        ep.setText(R.string.word88);
                        break;
                    case 88:
                        soundPool.play(Id89, 1.0F, 1.0F, 0, 0, 1.0F);
                        ep.setText(R.string.word89);
                        break;
                    case 89:
                        soundPool.play(Id90, 1.0F, 1.0F, 0, 0, 1.0F);
                        ep.setText(R.string.word90);
                        break;
                    case 90:
                        soundPool.play(Id91, 1.0F, 1.0F, 0, 0, 1.0F);
                        ep.setText(R.string.word91);
                        break;
                    case 91:
                        soundPool.play(Id92, 1.0F, 1.0F, 0, 0, 1.0F);
                        ep.setText(R.string.word92);
                        break;
                    case 92:
                        soundPool.play(Id93, 1.0F, 1.0F, 0, 0, 1.0F);
                        ep.setText(R.string.word93);
                        break;
                    case 93:
                        soundPool.play(Id94, 1.0F, 1.0F, 0, 0, 1.0F);
                        ep.setText(R.string.word94);
                        break;
                    case 94:
                        soundPool.play(Id95, 1.0F, 1.0F, 0, 0, 1.0F);
                        ep.setText(R.string.word95);
                        break;
                    case 95:
                        soundPool.play(Id96, 1.0F, 1.0F, 0, 0, 1.0F);
                        ep.setText(R.string.word96);
                        break;
                    case 96:
                        soundPool.play(Id97, 1.0F, 1.0F, 0, 0, 1.0F);
                        ep.setText(R.string.word97);
                        break;
                    case 97:
                        soundPool.play(Id98, 1.0F, 1.0F, 0, 0, 1.0F);
                        ep.setText(R.string.word98);
                        break;
                    case 98:
                        soundPool.play(Id99, 1.0F, 1.0F, 0, 0, 1.0F);
                        ep.setText(R.string.word99);
                        break;
                    case 99:
                        soundPool.play(Id100, 1.0F, 1.0F, 0, 0, 1.0F);
                        ep.setText(R.string.word100);
                        break;
                    case 100:
                        soundPool.play(Id101, 1.0F, 1.0F, 0, 0, 1.0F);
                        ep.setText(R.string.word101);
                        break;
                    case 101:
                        soundPool.play(Id102, 1.0F, 1.0F, 0, 0, 1.0F);
                        ep.setText(R.string.word102);
                        break;


                }
                return;
            }
        }
        );


    }

}

