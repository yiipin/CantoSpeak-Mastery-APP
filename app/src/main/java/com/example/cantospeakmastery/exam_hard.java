package com.example.cantospeakmastery;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class exam_hard extends AppCompatActivity {

    private SoundPool soundPool;
    private TextView countLabel, questionLabel,moreex;
    private Button answerBtn1, answerBtn2, answerBtn3, answerBtn4,nextq;
    private ImageButton s0,s1,s2,s3,s4;
    public static exam_hard a=null;
    private String rightAnswer, more ,question;
    private int rightAnswerCount = 0;
    private int quizCount = 1;
    static final private int QUIZ_COUNT = 10;
    private int ec1,ec2,ec3,ec4,
            ec5,ec6,ec88,ec12,
            ec14,ec15,ec16,
            ec17,ec18,ec19,ec20,
            ec21,ec22,ec23;

    ArrayList<ArrayList<String>> quizArray = new ArrayList<>();

    String quizData2[][] = {
            // {"Country", "Right Answer", "Choice1", "Choice2", "Choice3"}
            {"下面四個詞中，意思不同的一個是?請選擇最合適的答案", "跌咗", "去咗", "釘咗", "瓜咗","【跌咗】的意思為跌倒了\n【釘咗】、【去咗】、【瓜咗】的意思皆為去世了，因此最合適的答案為【跌咗】","本題為無聲題，請直接作答"},
            {"題目中提到約定的時間是?請選擇最合適的答案", "五點四十分", "五點十八分", "五點二十七分", "五點零七分","題目：「5點40分在地王廣場等，遲到的話就不等你了」，因此最合適的答案為【五點四十分】","本題題目為聽力題，點選按鈕播放題目"},
            {"下面哪個是「故意」的粵語正確寫法", "專覴", "專燈", "專登", "專瞪","【專燈】、【專瞪】、【專登】皆為錯誤的寫法，因此最合適的答案為【專覴】","本題為無聲題，請直接作答"},
            {"請問題目中總共拿了多少錢?請選擇最合適的答案", "1000", "500", "1500", "250","題目：「請給我5張100元和1張500元」，因此最合適的答案為【1000】","本題題目為聽力題，點選按鈕播放題目"},
            {"小新：老董，呢九把刀幾錢啊？\n老董：30蚊。\n小新：咁貴，20蚊得唔得啊\n老董：咁囉嗦，殺你啊！\n請問文中老董講的「殺你啊」是什麼意思？", "痛快地把刀賣給小明", "要對小明動粗", "跟他繼續談價錢", "表示價錢沒得砍","題目翻譯：\n小新：老董，這把刀多少錢啊？\n老董：30塊。\n小新：真貴，20可不可以阿？\n老董：那麼囉嗦，成交啦！\n因此最合適的答案為【痛快地把刀賣給小明】","本題題目為聽力題，點選按鈕播放題目"},
            {"這個人一整晚都在做什麼？請選擇最合適的答案", "搓麻將", "打坐", "和親戚打架 ", "陪老婆","題目「昨天晚上跟姑姑阿姨打了八圈，輸的連本錢都沒了，連老婆的錢都虧損了」，因此最合適的答案為【搓麻將】","本題題目為聽力題，點選按鈕播放題目"},
            {"題目中提到的三個字分別是什麼意思，請選擇最合適的答案", "晚安、午安、早安", "早安、午安、早安", "早安、午安、晚安", "午安、晚安、早安\n","題目：「早唞、午安、早晨，這三句話翻成中文既順序係下列何者?」\n「早唞」晚安\n「午安」午安\n「早晨」早安\n因此最合適的答案為【晚安、午安、早安】","本題題目為聽力題，點選按鈕播放題目"},
            {"「巴士站、地鐵站、火車站」下列選項哪個是正確按照這順序唸出來的，請選擇最合適的答案", "選項A", "選項B", "選項C", "選項D","選項A的順序為「巴士站、地鐵站、火車站」\n選項B的順序為「巴士站、火車站、地鐵站」\n選項C的順序為「地鐵站、火車站、巴士站」\n選項D的順序為「火車站、巴士站、地鐵站」\n因此最合適的答案為【選項A】「巴士站、地鐵站、火車站」","本題請點選選項旁按鈕播放錄音"},
            {"小鳴：阿助，最近有咩戲好睇啊？\n阿助：TENET(天能)聽講唔錯。\n小鳴：真係架?但係聽講好難睇得明\n阿助：咁囉嗦，睇戲啦\n文中阿助講的「睇戲」是什麼意思？", "看電影", "看歌劇", "聽演唱會", "玩桌遊","題目翻譯：\n小鳴：阿助，最近有甚麼電影啊？\n阿助：TENET(天能)聽說不錯。\n小鳴：真的嗎?可是聽說很難懂\n阿助：真囉嗦，看電影了啦！\n其中「睇戲」看戲，也有看電影的意思，因此最合適的答案為【看電影】","本題可點選選項旁按鈕播放錄音"},
            {"請問題目中他點的餐是什麼?，請選擇最合適的答案", "甜的爆米花和一杯可樂", "鹹的爆米花和一杯可樂", "鹹的爆米花和一杯紅茶", "甜的爆米花和一杯紅茶\n","題目：「我要一份甜的爆米花和一杯可樂」因此最合適的答案為【甜的爆米花和一杯可樂】","本題題目為聽力題，點選按鈕播放題目"},
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam_hard);
        soundPool = new SoundPool(50, AudioManager.STREAM_MUSIC, 5);
        a=this;
        moreex = findViewById(R.id.moreex);
        countLabel = findViewById(R.id.countLabel);
        questionLabel = findViewById(R.id.questionLabel);
        answerBtn1 = findViewById(R.id.answerBtn1);
        answerBtn2 = findViewById(R.id.answerBtn2);
        answerBtn3 = findViewById(R.id.answerBtn3);
        answerBtn4 = findViewById(R.id.answerBtn4);
        nextq = findViewById(R.id.nextq);
        s0 = findViewById(R.id.s0);
        s1 = findViewById(R.id.s1);
        s2 = findViewById(R.id.s2);
        s3 = findViewById(R.id.s3);
        s4 = findViewById(R.id.s4);

        ec1 = soundPool.load(this, R.raw.ec1, 1);
        ec2 = soundPool.load(this, R.raw.ec2, 1);
        ec3 = soundPool.load(this, R.raw.ec3, 1);
        ec4 = soundPool.load(this, R.raw.ec4, 1);
        ec5 = soundPool.load(this, R.raw.ec5, 1);
        ec6 = soundPool.load(this, R.raw.ec6, 1);

        ec88 = soundPool.load(this, R.raw.ec88, 1);
        ec12 = soundPool.load(this, R.raw.ec12, 1);

        ec14 = soundPool.load(this, R.raw.ec14, 1);
        ec15 = soundPool.load(this, R.raw.ec15, 1);
        ec16 = soundPool.load(this, R.raw.ec16, 1);
        ec17 = soundPool.load(this, R.raw.ec17, 1);
        ec18 = soundPool.load(this, R.raw.ec18, 1);
        ec19 = soundPool.load(this, R.raw.ec19, 1);
        ec20 = soundPool.load(this, R.raw.ec20, 1);
        ec21 = soundPool.load(this, R.raw.ec21, 1);
        ec22 = soundPool.load(this, R.raw.ec22, 1);
        ec23 = soundPool.load(this, R.raw.ec23, 1);



        // Receive quizCategory from StartActivity.
        //int quizCategory = getIntent().getIntExtra("QUIZ_CATEGORY", 0);
        //Log.v("CATEGORY", quizCategory + "");


        // Crecte quizArray from quizData2.
        for (int i = 0; i < quizData2.length; i++) {

            // Prepare array.
            ArrayList<String> tmpArray = new ArrayList<>();
            tmpArray.add(quizData2[i][0]); // Country
            tmpArray.add(quizData2[i][1]); // Right Answer
            tmpArray.add(quizData2[i][2]); // Choice1
            tmpArray.add(quizData2[i][3]); // Choice2
            tmpArray.add(quizData2[i][4]); // Choice3
            tmpArray.add(quizData2[i][5]); //解析
            tmpArray.add(quizData2[i][6]);//題目提示

            // Add tmpArray to quizArray.
            quizArray.add(tmpArray);
        }

        showNextQuiz();
    }
    public void check(){
        if(countLabel.getText().toString().contains("無")){
            s0.setVisibility(View.GONE);
            s1.setVisibility(View.GONE);
            s2.setVisibility(View.GONE);
            s3.setVisibility(View.GONE);
            s4.setVisibility(View.GONE);
        }

        if(countLabel.getText().toString().contains("聽")){
            s0.setVisibility(View.VISIBLE);
            s1.setVisibility(View.GONE);
            s2.setVisibility(View.GONE);
            s3.setVisibility(View.GONE);
            s4.setVisibility(View.GONE);
        }
        if(countLabel.getText().toString().contains("旁")){
            s0.setVisibility(View.GONE);
            s1.setVisibility(View.VISIBLE);
            s2.setVisibility(View.VISIBLE);
            s3.setVisibility(View.VISIBLE);
            s4.setVisibility(View.VISIBLE);
        }
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
        question = quiz.get(6);
        rightAnswer = quiz.get(1);
        // Update quizCountLabel.
        countLabel.setText("Q" + quizCount+question);
        check();
        // Remove "Country" from quiz and Shuffle choices.
        quiz.remove(6);
        quiz.remove(5);
        quiz.remove(0);
        Collections.shuffle(quiz);
        // Set choices.
        answerBtn1.setText(quiz.get(0));
        answerBtn2.setText(quiz.get(1));
        answerBtn3.setText(quiz.get(2));
        answerBtn4.setText(quiz.get(3));

        s0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (questionLabel.getText().toString().contains("約定")){
                    soundPool.play(ec1,1.0F,1.0F,0,0,1.0F);
                }
                if (questionLabel.getText().toString().contains("多")){
                    soundPool.play(ec6,1.0F,1.0F,0,0,1.0F);
                }
                if (questionLabel.getText().toString().contains("小新")){
                    soundPool.play(ec88,1.0F,1.0F,0,0,1.0F);
                }
                if (questionLabel.getText().toString().contains("整")){
                    soundPool.play(ec12,1.0F,1.0F,0,0,1.0F);
                }
                if (questionLabel.getText().toString().contains("早唞")){
                    soundPool.play(ec14,1.0F,1.0F,0,0,1.0F);
                }
                if (questionLabel.getText().toString().contains("餐")){
                    soundPool.play(ec23,1.0F,1.0F,0,0,1.0F);
                }
            }
        });

        s1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //2
                if (answerBtn1.getText().toString().contains("八")) {
                    soundPool.play(ec2, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn1.getText().toString().contains("七")) {
                    soundPool.play(ec3, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn1.getText().toString().contains("零")) {
                    soundPool.play(ec4, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn1.getText().toString().contains("四")) {
                    soundPool.play(ec5, 1.0F, 1.0F, 0, 0, 1.0F);

                }

                //4

                //5

                //6

                //                }

                //8
                if (answerBtn1.getText().toString().contains("B")) {
                    soundPool.play(ec15, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn1.getText().toString().contains("C")) {
                    soundPool.play(ec16, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn1.getText().toString().contains("A")) {
                    soundPool.play(ec17, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn1.getText().toString().contains("D")) {
                    soundPool.play(ec18, 1.0F, 1.0F, 0, 0, 1.0F);
                }
                //9
                if (answerBtn1.getText().toString().contains("歌劇")) {
                    soundPool.play(ec19, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn1.getText().toString().contains("電影")) {
                    soundPool.play(ec20, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn1.getText().toString().contains("聽演唱會")) {
                    soundPool.play(ec21, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn1.getText().toString().contains("玩桌遊")) {
                    soundPool.play(ec22, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                //10



            }
        });

        s2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //2
                if (answerBtn2.getText().toString().contains("八")) {
                    soundPool.play(ec2, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn2.getText().toString().contains("七")) {
                    soundPool.play(ec3, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn2.getText().toString().contains("零")) {
                    soundPool.play(ec4, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn2.getText().toString().contains("四")) {
                    soundPool.play(ec5, 1.0F, 1.0F, 0, 0, 1.0F);

                }


                //4

                //5



                //6

                //7                }

                //8
                if (answerBtn2.getText().toString().contains("B")) {
                    soundPool.play(ec15, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn2.getText().toString().contains("C")) {
                    soundPool.play(ec16, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn2.getText().toString().contains("A")) {
                    soundPool.play(ec17, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn2.getText().toString().contains("D")) {
                    soundPool.play(ec18, 1.0F, 1.0F, 0, 0, 1.0F);
                }
                //9
                if (answerBtn2.getText().toString().contains("歌劇")) {
                    soundPool.play(ec19, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn2.getText().toString().contains("電影")) {
                    soundPool.play(ec20, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn2.getText().toString().contains("聽演唱會")) {
                    soundPool.play(ec21, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn2.getText().toString().contains("玩桌遊")) {
                    soundPool.play(ec22, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                //10



            }
        });

        s3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //2
                if (answerBtn3.getText().toString().contains("八")) {
                    soundPool.play(ec2, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn3.getText().toString().contains("七")) {
                    soundPool.play(ec3, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn3.getText().toString().contains("零")) {
                    soundPool.play(ec4, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn3.getText().toString().contains("四")) {
                    soundPool.play(ec5, 1.0F, 1.0F, 0, 0, 1.0F);

                }


                //4

                //5



                //6


                //7                }

                //8
                if (answerBtn3.getText().toString().contains("B")) {
                    soundPool.play(ec15, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn3.getText().toString().contains("C")) {
                    soundPool.play(ec16, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn3.getText().toString().contains("A")) {
                    soundPool.play(ec17, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn3.getText().toString().contains("D")) {
                    soundPool.play(ec18, 1.0F, 1.0F, 0, 0, 1.0F);
                }
                //9
                if (answerBtn3.getText().toString().contains("歌劇")) {
                    soundPool.play(ec19, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn3.getText().toString().contains("電影")) {
                    soundPool.play(ec20, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn3.getText().toString().contains("聽演唱會")) {
                    soundPool.play(ec21, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn3.getText().toString().contains("玩桌遊")) {
                    soundPool.play(ec22, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                //10



            }
        });

        s4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //2
                if (answerBtn4.getText().toString().contains("八")) {
                    soundPool.play(ec2, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn4.getText().toString().contains("七")) {
                    soundPool.play(ec3, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn4.getText().toString().contains("零")) {
                    soundPool.play(ec4, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn4.getText().toString().contains("四")) {
                    soundPool.play(ec5, 1.0F, 1.0F, 0, 0, 1.0F);

                }

                //4

                //5



                //6

                //7                }

                //8
                if (answerBtn4.getText().toString().contains("B")) {
                    soundPool.play(ec15, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn4.getText().toString().contains("C")) {
                    soundPool.play(ec16, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn4.getText().toString().contains("A")) {
                    soundPool.play(ec17, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn4.getText().toString().contains("D")) {
                    soundPool.play(ec18, 1.0F, 1.0F, 0, 0, 1.0F);
                }
                //9
                if (answerBtn4.getText().toString().contains("歌劇")) {
                    soundPool.play(ec19, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn4.getText().toString().contains("電影")) {
                    soundPool.play(ec20, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn4.getText().toString().contains("聽演唱會")) {
                    soundPool.play(ec21, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn4.getText().toString().contains("玩桌遊")) {
                    soundPool.play(ec22, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                //10



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

        // Crecte AlertDialog.
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
                    Intent intent = new Intent(getApplicationContext(), exam_score_hd.class);
                    intent.putExtra("RIGHT_ANSWER_COUNT_hd", rightAnswerCount);
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
                    soundPool.release();
                    Intent intent = new Intent(getApplicationContext(), exam_score_hd.class);
                    intent.putExtra("RIGHT_ANSWER_COUNT_hd", rightAnswerCount);
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