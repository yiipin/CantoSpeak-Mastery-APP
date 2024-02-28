package com.example.cantospeakmastery;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class exam_easy extends AppCompatActivity {

    private SoundPool soundPool;
    private TextView countLabel, questionLabel;
    private Button answerBtn1, answerBtn2, answerBtn3, answerBtn4,nextq;
    private ImageButton s1,s2,s3,s4;
    public static exam_easy a=null;
    private String rightAnswer;
    private TextView moreex;
    private int rightAnswerCount = 0;
    private int quizCount = 1;
    static final private int QUIZ_COUNT = 10;
    private String more ;
    private int ea1,ea2,ea3,ea4,
            b01,b03,b25,b12,
            b02,ea10,ea11,ea12,
            ea13,ea14,ea15,ea16,
            ea17,ea18,ea19,ea20,
            cad1,cad2,cad3,cad5,
            ea25,ea26,ea27,ea28,
            ea30,ea31,ea32,
            ea33,ea34,ea35,ea36,
            ea37,ea38,ea39,ea40;

    ArrayList<ArrayList<String>> quizArray = new ArrayList<>();

    String quizData[][] = {
            // {"Country", "Right Answer", "Choice1", "Choice2", "Choice3"}
            {"請問以下選項何者與交通最無關連，請選出最合適的答案", "選項1", "選項2", "選項3", "選項4","【選項1】廢棄場\n【選項2】火車站\n【選項3】公車站\n【選項4】機場\n其中【選項1】廢棄場與交通最不具關聯性"},
            {"下列哪一個選項的意思是請、麻煩你、謝謝，請選出最不合適的答案", "唔該", "落單","點","街市","【唔該】的中文意思為請、麻煩你、謝謝\n【落單】的中文意思為點菜\n【點】的中文意思為怎麼樣\n【街市】的中文意思為菜市場\n因此最合適的選項為【唔該】"},
            {"請問下列哪個選項是搭飛機時需要用到的東西，請選出最不合適的答案", "選項5", "選項6", "選項7", "選項8","【選項5】機票\n【選項6】埋單、中文意思為結帳\n【選項7】電視\n【選項8】電腦\n因此最合適的選項為【選項5】機票"},
            {"我在路上撿到了一個皮包，請問附近的_____在哪裡?請選出最適合____中的答案", "選項A", "選項B", "選項C", "選項D","【選項A】警察局\n【選項B】消防局\n【選項C】新聞局\n【選項D】文化局\n因此最合適的答案為【選項A】警察局"},
            {"我最近要搭飛機去澳門旅遊，你可以幫我訂一張____等級的票嗎?請選出最不合適____中的答案", "選項S", "選項T", "選項U", "選項V","【選項S】單程票\n【選項T】頭等艙\n【選項U】經濟艙\n【選項V】商務艙\n因此較不合適的答案為【選項S】單程票"},
            {"下列哪個選項聲音是星期日的粵語念法，請選出最合適的答案", "H選項", "G選項", "I選項", "J選項","【H選項】星期日\n【G選項】星期四\n【I選項】星期一\n【J選項】星期二\n因此最合適的答案為【H選項】星期日"},
            {"我的班機因為氣候不佳_____兩個小時，我們晚點再會合吧。請選出最適合____中的答案", "甲", "乙", "丙", "丁","【選項甲】延誤\n【選項乙】起飛\n【選項丙】登機\n【選項丁】飛行\n因此最合適的答案為【選項甲】延誤"},
            {"我現在身上只有大鈔，請問可以跟你換____嗎?請選出最適合____中的答案", "散紙", "機票", "支票", "錢包","【散紙】的中文意思是零錢，題目中提到要將大鈔換小，因此最合適的答案是【散紙】"},
            {"我迷路了，可以請問你_____上的這條巷弄要怎麼去嗎?請選出最適合____中的答案", "選項一", "選項二", "選項三", "選項四","【選項一】地圖\n【選項二】手機\n【選項三】導覽手冊\n【選項四】賭場\n題目中提到迷路以及巷弄，因此最合適的答案是【選項一】地圖"},
            {"不好意思我沒有先訂房，但我想請問今晚還有____可以住嗎？請選出最適合____中的答案", "選項W", "選項X", "選項Y", "選項Z","【選項W】房間\n【選項X】廁所\n【選項Y】網路\n【選項Z】座位\n因此【選項W】房間最合適的答案"},
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam_easy);
        soundPool = new SoundPool(102, AudioManager.STREAM_MUSIC, 5);
        a=this;
        moreex=findViewById(R.id.moreex);
        countLabel = findViewById(R.id.countLabel);
        questionLabel = findViewById(R.id.questionLabel);
        answerBtn1 = findViewById(R.id.answerBtn1);
        answerBtn2 = findViewById(R.id.answerBtn2);
        answerBtn3 = findViewById(R.id.answerBtn3);
        answerBtn4 = findViewById(R.id.answerBtn4);
        nextq = findViewById(R.id.nextq);
        s1 = findViewById(R.id.s1);
        s2 = findViewById(R.id.s2);
        s3 = findViewById(R.id.s3);
        s4 = findViewById(R.id.s4);

        ea1 = soundPool.load(this, R.raw.ea1, 1);
        ea2 = soundPool.load(this, R.raw.ea2, 1);
        ea3 = soundPool.load(this, R.raw.ea3, 1);
        ea4 = soundPool.load(this, R.raw.ea4, 1);
        b01 = soundPool.load(this,R.raw.b01,1);
        b03 = soundPool.load(this,R.raw.b03,1);
        b25 = soundPool.load(this,R.raw.b25,1);
        b12 = soundPool.load(this,R.raw.b12,1);

        b02 = soundPool.load(this, R.raw.b02, 1);
        ea10 = soundPool.load(this, R.raw.ea10, 1);
        ea11 = soundPool.load(this, R.raw.ea11, 1);
        ea12 = soundPool.load(this, R.raw.ea12, 1);
        ea13 = soundPool.load(this, R.raw.ea13, 1);
        ea14 = soundPool.load(this, R.raw.ea14, 1);
        ea15 = soundPool.load(this, R.raw.ea15, 1);
        ea16 = soundPool.load(this, R.raw.ea16, 1);
        ea17 = soundPool.load(this, R.raw.ea17, 1);
        ea18 = soundPool.load(this, R.raw.ea18, 1);
        ea19 = soundPool.load(this, R.raw.ea19, 1);
        ea20 = soundPool.load(this, R.raw.ea20, 1);

        ea25 = soundPool.load(this, R.raw.ea25, 1);
        ea26 = soundPool.load(this, R.raw.ea26, 1);
        ea27 = soundPool.load(this, R.raw.ea27, 1);
        ea28 = soundPool.load(this, R.raw.ea28, 1);

        ea30 = soundPool.load(this,R.raw.ea30,1);
        ea31 = soundPool.load(this, R.raw.ea31, 1);
        ea32 = soundPool.load(this, R.raw.ea32, 1);
        ea33 = soundPool.load(this, R.raw.ea33, 1);
        ea34 = soundPool.load(this, R.raw.ea34, 1);
        ea35 = soundPool.load(this, R.raw.ea35, 1);
        ea36 = soundPool.load(this, R.raw.ea36, 1);
        ea37 = soundPool.load(this, R.raw.ea37, 1);
        ea38 = soundPool.load(this, R.raw.ea38, 1);
        ea39 = soundPool.load(this, R.raw.ea39, 1);
        ea40 = soundPool.load(this, R.raw.ea40, 1);

        cad1 = soundPool.load(this, R.raw.cad1, 1);
        cad2 = soundPool.load(this, R.raw.cad2, 1);
        cad3 = soundPool.load(this, R.raw.cad3, 1);
        cad5 = soundPool.load(this, R.raw.cad5, 1);
        // Receive quizCategory from StartActivity.
        //int quizCategory = getIntent().getIntExtra("QUIZ_CATEGORY", 0);
        //Log.v("CATEGORY", quizCategory + "");


        // Create quizArray from quizData.
        for (int i = 0; i < quizData.length; i++) {

            // Prepare array.
            ArrayList<String> tmpArray = new ArrayList<>();
            tmpArray.add(quizData[i][0]); // Country
            tmpArray.add(quizData[i][1]); // Right Answer
            tmpArray.add(quizData[i][2]); // Choice1
            tmpArray.add(quizData[i][3]); // Choice2
            tmpArray.add(quizData[i][4]); // Choice3
            tmpArray.add(quizData[i][5]); //解析

            // Add tmpArray to quizArray.
            quizArray.add(tmpArray);
        }

        showNextQuiz();
    }

    public void showNextQuiz() {

        // Update quizCountLabel.
        countLabel.setText("Q" + quizCount);

        // Generate random number between 0 and 14 (quizArray's size - 1)
        Random random = new Random();
        int randomNum = random.nextInt(quizArray.size());

        // Pick one quiz set.
        ArrayList<String> quiz = quizArray.get(randomNum);

        // Set question and right answer.
        // Array format: {"Country", "Right Answer", "Choice1", "Choice2", "Choice3"}
        questionLabel.setText(quiz.get(0));
        more = quiz.get(5);
        rightAnswer = quiz.get(1);

        // Remove "Country" from quiz and Shuffle choices.
        quiz.remove(5);
        quiz.remove(0);

        Collections.shuffle(quiz);

        // Set choices.
        answerBtn1.setText(quiz.get(0));
        answerBtn2.setText(quiz.get(1));
        answerBtn3.setText(quiz.get(2));
        answerBtn4.setText(quiz.get(3));

        s1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //1
                if (answerBtn1.getText().toString().contains("4")) {
                    soundPool.play(ea1, 1.0F, 1.0F, 0, 0, 1.0F);
                }
                if (answerBtn1.getText().toString().contains("2")) {
                    soundPool.play(ea2, 1.0F, 1.0F, 0, 0, 1.0F);
                }
                if (answerBtn1.getText().toString().contains("3")) {
                    soundPool.play(ea3, 1.0F, 1.0F, 0, 0, 1.0F);
                }
                if (answerBtn1.getText().toString().contains("1")) {
                    soundPool.play(ea4, 1.0F, 1.0F, 0, 0, 1.0F);
                }

//2
                if (answerBtn1.getText().toString().contains("唔該")) {
                    soundPool.play(b01, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn1.getText().toString().contains("落單")) {
                    soundPool.play(b03, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn1.getText().toString().contains("點")) {
                    soundPool.play(b25, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn1.getText().toString().contains("街市")) {
                    soundPool.play(b12, 1.0F, 1.0F, 0, 0, 1.0F);

                }
//3
                if (answerBtn1.getText().toString().contains("6")) {
                    soundPool.play(b02, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn1.getText().toString().contains("5")) {
                    soundPool.play(ea10, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn1.getText().toString().contains("7")) {
                    soundPool.play(ea11, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn1.getText().toString().contains("8")) {
                    soundPool.play(ea12, 1.0F, 1.0F, 0, 0, 1.0F);

                }
//4
                if (answerBtn1.getText().toString().contains("A")) {
                    soundPool.play(ea13, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn1.getText().toString().contains("B")) {
                    soundPool.play(ea14, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn1.getText().toString().contains("C")) {
                    soundPool.play(ea15, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn1.getText().toString().contains("D")) {
                    soundPool.play(ea16, 1.0F, 1.0F, 0, 0, 1.0F);

                }
//5
                if (answerBtn1.getText().toString().contains("U")) {
                    soundPool.play(ea17, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn1.getText().toString().contains("T")) {
                    soundPool.play(ea18, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn1.getText().toString().contains("S")) {
                    soundPool.play(ea19, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn1.getText().toString().contains("V")) {
                    soundPool.play(ea20, 1.0F, 1.0F, 0, 0, 1.0F);

                }
//6
                if (answerBtn1.getText().toString().contains("G")){
                    soundPool.play(cad5,1.0F,1.0F,0,0,1.0F);
                }

                if (answerBtn1.getText().toString().contains("H")){
                    soundPool.play(cad1,1.0F,1.0F,0,0,1.0F);
                }

                if (answerBtn1.getText().toString().contains("I")){
                    soundPool.play(cad2,1.0F,1.0F,0,0,1.0F);
                }

                if (answerBtn1.getText().toString().contains("J")){
                    soundPool.play(cad3,1.0F,1.0F,0,0,1.0F);
                }
//7
                if (answerBtn1.getText().toString().contains("甲")) {
                    soundPool.play(ea25, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn1.getText().toString().contains("乙")) {
                    soundPool.play(ea26, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn1.getText().toString().contains("丙")) {
                    soundPool.play(ea27, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn1.getText().toString().contains("丁")) {
                    soundPool.play(ea28, 1.0F, 1.0F, 0, 0, 1.0F);

                }
//8
                if (answerBtn1.getText().toString().contains("散紙")) {
                    soundPool.play(ea32, 1.0F, 1.0F, 0, 0, 1.0F);

                }

                if (answerBtn1.getText().toString().contains("支")) {
                    soundPool.play(ea30, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn1.getText().toString().contains("錢包")) {
                    soundPool.play(ea31, 1.0F, 1.0F, 0, 0, 1.0F);
                }
                if (answerBtn1.getText().toString().contains("機")){
                    soundPool.play(ea10,1.0F,1.0f,0,0,1.0F);
                }
//9
                if (answerBtn1.getText().toString().contains("一")) {
                    soundPool.play(ea33, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn1.getText().toString().contains("二")) {
                    soundPool.play(ea34, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn1.getText().toString().contains("三")) {
                    soundPool.play(ea35, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn1.getText().toString().contains("四")) {
                    soundPool.play(ea36, 1.0F, 1.0F, 0, 0, 1.0F);

                }
//10
                if (answerBtn1.getText().toString().contains("W")) {
                    soundPool.play(ea37, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn1.getText().toString().contains("X")) {
                    soundPool.play(ea38, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn1.getText().toString().contains("Y")) {
                    soundPool.play(ea39, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn1.getText().toString().contains("Z")) {
                    soundPool.play(ea40, 1.0F, 1.0F, 0, 0, 1.0F);

                }



            }
        });


        s2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //1
                if (answerBtn2.getText().toString().contains("4")) {
                    soundPool.play(ea1, 1.0F, 1.0F, 0, 0, 1.0F);
                }
                if (answerBtn2.getText().toString().contains("2")) {
                    soundPool.play(ea2, 1.0F, 1.0F, 0, 0, 1.0F);
                }
                if (answerBtn2.getText().toString().contains("3")) {
                    soundPool.play(ea3, 1.0F, 1.0F, 0, 0, 1.0F);
                }
                if (answerBtn2.getText().toString().contains("1")) {
                    soundPool.play(ea4, 1.0F, 1.0F, 0, 0, 1.0F);
                }

                //2
                if (answerBtn2.getText().toString().contains("唔該")) {
                    soundPool.play(b01, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn2.getText().toString().contains("落單")) {
                    soundPool.play(b03, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn2.getText().toString().contains("點")) {
                    soundPool.play(b25, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn2.getText().toString().contains("街市")) {
                    soundPool.play(b12, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                //3
                if (answerBtn2.getText().toString().contains("6")) {
                    soundPool.play(b02, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn2.getText().toString().contains("5")) {
                    soundPool.play(ea10, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn2.getText().toString().contains("7")) {
                    soundPool.play(ea11, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn2.getText().toString().contains("8")) {
                    soundPool.play(ea12, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                //4
                if (answerBtn2.getText().toString().contains("A")) {
                    soundPool.play(ea13, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn2.getText().toString().contains("B")) {
                    soundPool.play(ea14, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn2.getText().toString().contains("C")) {
                    soundPool.play(ea15, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn2.getText().toString().contains("D")) {
                    soundPool.play(ea16, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                //5
                if (answerBtn2.getText().toString().contains("U")) {
                    soundPool.play(ea17, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn2.getText().toString().contains("T")) {
                    soundPool.play(ea18, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn2.getText().toString().contains("S")) {
                    soundPool.play(ea19, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn2.getText().toString().contains("V")) {
                    soundPool.play(ea20, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                //6
                if (answerBtn2.getText().toString().contains("G")){
                    soundPool.play(cad5,1.0F,1.0F,0,0,1.0F);
                }

                if (answerBtn2.getText().toString().contains("H")){
                    soundPool.play(cad1,1.0F,1.0F,0,0,1.0F);
                }

                if (answerBtn2.getText().toString().contains("I")){
                    soundPool.play(cad2,1.0F,1.0F,0,0,1.0F);
                }

                if (answerBtn2.getText().toString().contains("J")){
                    soundPool.play(cad3,1.0F,1.0F,0,0,1.0F);
                }
                //7
                if (answerBtn2.getText().toString().contains("甲")) {
                    soundPool.play(ea25, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn2.getText().toString().contains("乙")) {
                    soundPool.play(ea26, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn2.getText().toString().contains("丙")) {
                    soundPool.play(ea27, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn2.getText().toString().contains("丁")) {
                    soundPool.play(ea28, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                //8
                if (answerBtn2.getText().toString().contains("散紙")) {
                    soundPool.play(ea32, 1.0F, 1.0F, 0, 0, 1.0F);

                }

                if (answerBtn2.getText().toString().contains("支")) {
                    soundPool.play(ea30, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn2.getText().toString().contains("錢包")) {
                    soundPool.play(ea31, 1.0F, 1.0F, 0, 0, 1.0F);
                }
                if (answerBtn2.getText().toString().contains("機")){
                    soundPool.play(ea10,1.0F,1.0f,0,0,1.0F);
                }
                //9
                if (answerBtn2.getText().toString().contains("一")) {
                    soundPool.play(ea33, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn2.getText().toString().contains("二")) {
                    soundPool.play(ea34, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn2.getText().toString().contains("三")) {
                    soundPool.play(ea35, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn2.getText().toString().contains("四")) {
                    soundPool.play(ea36, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                //10
                if (answerBtn2.getText().toString().contains("W")) {
                    soundPool.play(ea37, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn2.getText().toString().contains("X")) {
                    soundPool.play(ea38, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn2.getText().toString().contains("Y")) {
                    soundPool.play(ea39, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn2.getText().toString().contains("Z")) {
                    soundPool.play(ea40, 1.0F, 1.0F, 0, 0, 1.0F);

                }

            }
        });
        s3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //1
                if (answerBtn3.getText().toString().contains("4")) {
                    soundPool.play(ea1, 1.0F, 1.0F, 0, 0, 1.0F);
                }
                if (answerBtn3.getText().toString().contains("2")) {
                    soundPool.play(ea2, 1.0F, 1.0F, 0, 0, 1.0F);
                }
                if (answerBtn3.getText().toString().contains("3")) {
                    soundPool.play(ea3, 1.0F, 1.0F, 0, 0, 1.0F);
                }
                if (answerBtn3.getText().toString().contains("1")) {
                    soundPool.play(ea4, 1.0F, 1.0F, 0, 0, 1.0F);
                }

                //2
                if (answerBtn3.getText().toString().contains("唔該")) {
                    soundPool.play(b01, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn3.getText().toString().contains("落單")) {
                    soundPool.play(b03, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn3.getText().toString().contains("點")) {
                    soundPool.play(b25, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn3.getText().toString().contains("街市")) {
                    soundPool.play(b12, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                //3
                if (answerBtn3.getText().toString().contains("6")) {
                    soundPool.play(b02, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn3.getText().toString().contains("5")) {
                    soundPool.play(ea10, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn3.getText().toString().contains("7")) {
                    soundPool.play(ea11, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn3.getText().toString().contains("8")) {
                    soundPool.play(ea12, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                //4
                if (answerBtn3.getText().toString().contains("A")) {
                    soundPool.play(ea13, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn3.getText().toString().contains("B")) {
                    soundPool.play(ea14, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn3.getText().toString().contains("C")) {
                    soundPool.play(ea15, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn3.getText().toString().contains("D")) {
                    soundPool.play(ea16, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                //5
                if (answerBtn3.getText().toString().contains("U")) {
                    soundPool.play(ea17, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn3.getText().toString().contains("T")) {
                    soundPool.play(ea18, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn3.getText().toString().contains("S")) {
                    soundPool.play(ea19, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn3.getText().toString().contains("V")) {
                    soundPool.play(ea20, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                //6
                if (answerBtn3.getText().toString().contains("G")){
                    soundPool.play(cad5,1.0F,1.0F,0,0,1.0F);
                }

                if (answerBtn3.getText().toString().contains("H")){
                    soundPool.play(cad1,1.0F,1.0F,0,0,1.0F);
                }

                if (answerBtn3.getText().toString().contains("I")){
                    soundPool.play(cad2,1.0F,1.0F,0,0,1.0F);
                }

                if (answerBtn3.getText().toString().contains("J")){
                    soundPool.play(cad3,1.0F,1.0F,0,0,1.0F);
                }
                //7
                if (answerBtn3.getText().toString().contains("甲")) {
                    soundPool.play(ea25, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn3.getText().toString().contains("乙")) {
                    soundPool.play(ea26, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn3.getText().toString().contains("丙")) {
                    soundPool.play(ea27, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn3.getText().toString().contains("丁")) {
                    soundPool.play(ea28, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                //8
                if (answerBtn3.getText().toString().contains("散紙")) {
                    soundPool.play(ea32, 1.0F, 1.0F, 0, 0, 1.0F);

                }

                if (answerBtn3.getText().toString().contains("支")) {
                    soundPool.play(ea30, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn3.getText().toString().contains("錢包")) {
                    soundPool.play(ea31, 1.0F, 1.0F, 0, 0, 1.0F);
                }
                if (answerBtn3.getText().toString().contains("機")){
                    soundPool.play(ea10,1.0F,1.0f,0,0,1.0F);
                }
                //9
                if (answerBtn3.getText().toString().contains("一")) {
                    soundPool.play(ea33, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn3.getText().toString().contains("二")) {
                    soundPool.play(ea34, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn3.getText().toString().contains("三")) {
                    soundPool.play(ea35, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn3.getText().toString().contains("四")) {
                    soundPool.play(ea36, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                //10
                if (answerBtn3.getText().toString().contains("W")) {
                    soundPool.play(ea37, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn3.getText().toString().contains("X")) {
                    soundPool.play(ea38, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn3.getText().toString().contains("Y")) {
                    soundPool.play(ea39, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn3.getText().toString().contains("Z")) {
                    soundPool.play(ea40, 1.0F, 1.0F, 0, 0, 1.0F);

                }

            }
        });

        s4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //1
                if (answerBtn4.getText().toString().contains("4")) {
                    soundPool.play(ea1, 1.0F, 1.0F, 0, 0, 1.0F);
                }
                if (answerBtn4.getText().toString().contains("2")) {
                    soundPool.play(ea2, 1.0F, 1.0F, 0, 0, 1.0F);
                }
                if (answerBtn4.getText().toString().contains("3")) {
                    soundPool.play(ea3, 1.0F, 1.0F, 0, 0, 1.0F);
                }
                if (answerBtn4.getText().toString().contains("1")) {
                    soundPool.play(ea4, 1.0F, 1.0F, 0, 0, 1.0F);
                }

                //2
                if (answerBtn4.getText().toString().contains("唔該")) {
                    soundPool.play(b01, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn4.getText().toString().contains("落單")) {
                    soundPool.play(b03, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn4.getText().toString().contains("點")) {
                    soundPool.play(b25, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn4.getText().toString().contains("街市")) {
                    soundPool.play(b12, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                //3
                if (answerBtn4.getText().toString().contains("6")) {
                    soundPool.play(b02, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn4.getText().toString().contains("5")) {
                    soundPool.play(ea10, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn4.getText().toString().contains("7")) {
                    soundPool.play(ea11, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn4.getText().toString().contains("8")) {
                    soundPool.play(ea12, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                //4
                if (answerBtn4.getText().toString().contains("A")) {
                    soundPool.play(ea13, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn4.getText().toString().contains("B")) {
                    soundPool.play(ea14, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn4.getText().toString().contains("C")) {
                    soundPool.play(ea15, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn4.getText().toString().contains("D")) {
                    soundPool.play(ea16, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                //5
                if (answerBtn4.getText().toString().contains("U")) {
                    soundPool.play(ea17, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn4.getText().toString().contains("T")) {
                    soundPool.play(ea18, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn4.getText().toString().contains("S")) {
                    soundPool.play(ea19, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn4.getText().toString().contains("V")) {
                    soundPool.play(ea20, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                //6
                if (answerBtn4.getText().toString().contains("G")){
                    soundPool.play(cad5,1.0F,1.0F,0,0,1.0F);
                }

                if (answerBtn4.getText().toString().contains("H")){
                    soundPool.play(cad1,1.0F,1.0F,0,0,1.0F);
                }

                if (answerBtn4.getText().toString().contains("I")){
                    soundPool.play(cad2,1.0F,1.0F,0,0,1.0F);
                }

                if (answerBtn4.getText().toString().contains("J")){
                    soundPool.play(cad3,1.0F,1.0F,0,0,1.0F);
                }
                //7
                if (answerBtn4.getText().toString().contains("甲")) {
                    soundPool.play(ea25, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn4.getText().toString().contains("乙")) {
                    soundPool.play(ea26, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn4.getText().toString().contains("丙")) {
                    soundPool.play(ea27, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn4.getText().toString().contains("丁")) {
                    soundPool.play(ea28, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                //8
                if (answerBtn4.getText().toString().contains("散紙")) {
                    soundPool.play(ea32, 1.0F, 1.0F, 0, 0, 1.0F);

                }

                if (answerBtn4.getText().toString().contains("支")) {
                    soundPool.play(ea30, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn4.getText().toString().contains("錢包")) {
                    soundPool.play(ea31, 1.0F, 1.0F, 0, 0, 1.0F);
                }
                if (answerBtn4.getText().toString().contains("機")){
                    soundPool.play(ea10,1.0F,1.0f,0,0,1.0F);
                }
                //9
                if (answerBtn4.getText().toString().contains("一")) {
                    soundPool.play(ea33, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn4.getText().toString().contains("二")) {
                    soundPool.play(ea34, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn4.getText().toString().contains("三")) {
                    soundPool.play(ea35, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn4.getText().toString().contains("四")) {
                    soundPool.play(ea36, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                //10
                if (answerBtn4.getText().toString().contains("W")) {
                    soundPool.play(ea37, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn4.getText().toString().contains("X")) {
                    soundPool.play(ea38, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn4.getText().toString().contains("Y")) {
                    soundPool.play(ea39, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn4.getText().toString().contains("Z")) {
                    soundPool.play(ea40, 1.0F, 1.0F, 0, 0, 1.0F);

                }

            }
        });





        // Remove this quiz from quizArray.
        quizArray.remove(randomNum);
    }

    public void checkAnswer(View view) {

        // Get pushed button.
        Button answerBtn = findViewById(view.getId());
        String btnText = answerBtn.getText().toString();

        String alertTitle;

        if (btnText.equals(rightAnswer)) {
            // Correct
            alertTitle = "答對了!";
            rightAnswerCount++;

        } else {
            alertTitle = "答錯了喔...";
        }

        // Create AlertDialog.
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setTitle(alertTitle);

        builder.setMessage("正確答案是  " + rightAnswer);
        builder.setNegativeButton("返回觀看解析", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                moreex.setVisibility(View.VISIBLE);
                moreex.setText("解析:"+more);
                nextq.setVisibility(View.VISIBLE);
                nextq.setClickable(true);
                answerBtn1.setClickable(false);
                answerBtn2.setClickable(false);
                answerBtn3.setClickable(false);
                answerBtn4.setClickable(false);
                answerBtn1.setBackgroundResource(R.drawable.outsidenock);
                answerBtn2.setBackgroundResource(R.drawable.outsidenock);
                answerBtn3.setBackgroundResource(R.drawable.outsidenock);
                answerBtn4.setBackgroundResource(R.drawable.outsidenock);

            }
        });
        nextq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moreex.setVisibility(View.INVISIBLE);
                moreex.setText("");
                answerBtn1.setClickable(true);
                answerBtn2.setClickable(true);
                answerBtn3.setClickable(true);
                answerBtn4.setClickable(true);
                answerBtn1.setBackgroundResource(R.drawable.outsidequiz);
                answerBtn2.setBackgroundResource(R.drawable.outsidequiz);
                answerBtn3.setBackgroundResource(R.drawable.outsidequiz);
                answerBtn4.setBackgroundResource(R.drawable.outsidequiz);

                nextq.setClickable(false);
                nextq.setVisibility(View.INVISIBLE);
                if (quizCount == QUIZ_COUNT) {
                    // Show Result.
                    Intent intent = new Intent(getApplicationContext(), exam_score.class);
                    intent.putExtra("RIGHT_ANSWER_COUNT", rightAnswerCount);
                    startActivity(intent);

                } else {
                    quizCount++;
                    showNextQuiz();
                }
            }
        });
        builder.setPositiveButton("下一題", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                if (quizCount == QUIZ_COUNT) {
                    // Show Result.
                    Intent intent = new Intent(getApplicationContext(), exam_score.class);
                    intent.putExtra("RIGHT_ANSWER_COUNT", rightAnswerCount);
                    startActivity(intent);

                } else {
                    quizCount++;
                    showNextQuiz();
                }
            }
        });
        builder.setCancelable(false);
        builder.show();

    }
    @Override
    protected void onStop(){
        super.onStop();

    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        finish();

    }


}