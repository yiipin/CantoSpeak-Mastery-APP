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

public class exam_intermediate extends AppCompatActivity {

    private SoundPool soundPool;
    private TextView countLabel, questionLabel,moreex;
    private Button answerBtn1, answerBtn2, answerBtn3, answerBtn4,nextq;
    private ImageButton s0,s1,s2,s3,s4;
    public static exam_intermediate a=null;
    private String rightAnswer,more,question;
    private int rightAnswerCount = 0;
    private int quizCount = 1;
    static final private int QUIZ_COUNT = 10;
    private int eb1,eb2,eb3,eb4,
            eb5,eb6,eb7,eb8,
            eb9,eb10,eb11,eb12,
            eb13,eb14,eb15;

    ArrayList<ArrayList<String>> quizArray = new ArrayList<>();

    String quizData3[][] = {
            // {"Country", "Right Answer", "Choice1", "Choice2", "Choice3"}
            {"下面哪個中文字的讀音與「酒」的粵語讀音一樣?請選擇最合適的答案", "走", "狗", "丑", "咒","「酒」的粵語拼音為[zau2]，與中文字【走】最為相近，因此最合適的答案為【走】","本題為無聲題，請直接作答"},
            {"「靜啲」的中文意思是?請選擇最合適的答案", "安靜點", "靜止", "靜坐", "靜心點","「靜啲」的中文意思為安靜點，因此最合適的答案為【安靜點】","本題為無聲題，請直接作答"},
            {"常用一百字中，「睇」的中文意思是什麼?請選擇最合適的答案", "看", "注意", "什麼", "弟弟","「睇」的中文意思為看，因此最合適的答案為【看】","本題為無聲題，請直接作答"},
            {"請問題目中的目的地是什麼?請選擇最合適的答案", "菜市場", "市民大道", "市政府", "超市","題目：「這附近哪裡有『街市』?」，其中『街市』的中文意思為菜市場，因此最合適的答案為【菜市場】","本題題目為聽力題，點選按鈕播放題目"},
            {"「講畀我知」的意思是?請選擇最合適的答案", "告訴我", "提醒我", "警告我", "跟蹤我","「講畀我知」的中文意思為告訴我，因此最合適的答案為【告訴我】","此題為無聲題，請直接作答"},
            {"下列哪個是數字「20」的粵語？請選擇最合適的答案", "廿", "咁", "乜", "冚","【廿】二十\n【咁】這樣、這麼\n【乜】為什麼\n【冚】全部\n因此最合適的答案為【廿】","本題可播放選項音效"},
            {"請問題目中這個人想去哪裡？請選擇最合適的答案", "機場", "火車站", "餐廳", "飯店","題目：「不好意思，我現在想去機場，但我迷路了，你可以在地圖上指給我看嗎?」，因此最合適的答案為【機場】","本題題目為聽力題，點選按鈕播放題目"},
            {"「唔該、對唔住、多謝、靜啲」以上四個哪個不是較禮貌性的詞語?請選擇最合適的答案", "靜啲", "唔該", "對唔住", "多謝","【唔該】請、麻煩了\n【對唔住】對不起\n【多謝】謝謝\n【靜啲】安靜點\n因此最合適的答案為【靜啲】","本題可播放選項音效"},
            {"下列選項哪個字的中文意思是「甚麼」? 請選擇最合適的答案", "咩", "咗", "唞", "呢","【咗】的中文意思為已經、了\n【唞】休息\n 【呢】這\n【咩】甚麼\n因此最合適的答案為【咩】","本題可播放選項音效"},
            {"請問題目中的人要去買甚麼?，請選擇最合適的答案", "果汁", "牛奶", "咖啡", "紅茶","題目：「我想去買果汁，你要嗎?」，因此最合適的答案為【果汁】","本題題目為聽力題，點選按鈕播放題目"},
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam_intermediate);
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

        eb1 = soundPool.load(this, R.raw.eb1, 1);
        eb2 = soundPool.load(this, R.raw.eb2, 1);
        eb3 = soundPool.load(this, R.raw.eb3, 1);
        eb4 = soundPool.load(this, R.raw.eb4, 1);
        eb5 = soundPool.load(this, R.raw.eb5, 1);
        eb6 = soundPool.load(this, R.raw.eb6, 1);
        eb7 = soundPool.load(this, R.raw.eb7, 1);
        eb8 = soundPool.load(this, R.raw.eb8, 1);
        eb9 = soundPool.load(this, R.raw.eb9, 1);
        eb10 = soundPool.load(this, R.raw.eb10, 1);
        eb11 = soundPool.load(this, R.raw.eb11, 1);

        eb13 = soundPool.load(this, R.raw.eb13, 1);
        eb14 = soundPool.load(this, R.raw.c28, 1);
        eb15 = soundPool.load(this, R.raw.eb15, 1);
        eb12 = soundPool.load(this,R.raw.c05,1);


        // Receive quizCategory from StartActivity.
        //int quizCategory = getIntent().getIntExtra("QUIZ_CATEGORY", 0);
        //Log.v("CATEGORY", quizCategory + "");


        // Crebte quizArray from quizData3.
        for (int i = 0; i < quizData3.length; i++) {

            // Prepare array.
            ArrayList<String> tmpArray = new ArrayList<>();
            tmpArray.add(quizData3[i][0]); // Country
            tmpArray.add(quizData3[i][1]); // Right Answer
            tmpArray.add(quizData3[i][2]); // Choice1
            tmpArray.add(quizData3[i][3]); // Choice2
            tmpArray.add(quizData3[i][4]); // Choice3
            tmpArray.add(quizData3[i][5]); //解析
            tmpArray.add(quizData3[i][6]);//題目提示
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
        if(countLabel.getText().toString().contains("可")){
            s0.setVisibility(View.GONE);
            s1.setVisibility(View.VISIBLE);
            s2.setVisibility(View.VISIBLE);
            s3.setVisibility(View.VISIBLE);
            s4.setVisibility(View.VISIBLE);
        }
    if(countLabel.getText().toString().contains("聽")){
        s0.setVisibility(View.VISIBLE);
        s1.setVisibility(View.GONE);
        s2.setVisibility(View.GONE);
        s3.setVisibility(View.GONE);
        s4.setVisibility(View.GONE);
    }
}
    public void showNextQuiz() {



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
                if (questionLabel.getText().toString().contains("目的地")){
                    soundPool.play(eb1,1.0F,1.0F,0,0,1.0F);
                }
                if (questionLabel.getText().toString().contains("去哪裡")){
                    soundPool.play(eb6,1.0F,1.0F,0,0,1.0F);
                }
                if (questionLabel.getText().toString().contains("買甚麼")){
                    soundPool.play(eb15,1.0F,1.0F,0,0,1.0F);
                }
            }
        });


        s1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //4

                //6
                if (answerBtn1.getText().toString().contains("廿")) {
                    soundPool.play(eb3, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn1.getText().toString().contains("咁")) {
                    soundPool.play(eb5, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn1.getText().toString().contains("乜")) {
                    soundPool.play(eb2, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn1.getText().toString().contains("冚")) {
                    soundPool.play(eb4, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                //7

                //8
                if (answerBtn1.getText().toString().contains("該")) {
                    soundPool.play(eb8, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn1.getText().toString().contains("對唔住")) {
                    soundPool.play(eb9, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn1.getText().toString().contains("多謝")) {
                    soundPool.play(eb7, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn1.getText().toString().contains("靜")) {
                    soundPool.play(eb10, 1.0F, 1.0F, 0, 0, 1.0F);
                }
                //9
                if (answerBtn1.getText().toString().contains("咗")) {
                    soundPool.play(eb12, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn1.getText().toString().contains("唞")) {
                    soundPool.play(eb13, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn1.getText().toString().contains("咩")) {
                    soundPool.play(eb11, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn1.getText().toString().contains("呢")) {
                    soundPool.play(eb14, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                //10

            }
        });

        s2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //4

                //6
                if (answerBtn2.getText().toString().contains("廿")) {
                    soundPool.play(eb3, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn2.getText().toString().contains("咁")) {
                    soundPool.play(eb5, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn2.getText().toString().contains("乜")) {
                    soundPool.play(eb2, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn2.getText().toString().contains("冚")) {
                    soundPool.play(eb4, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                //7

                //8
                if (answerBtn2.getText().toString().contains("該")) {
                    soundPool.play(eb8, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn2.getText().toString().contains("對唔住")) {
                    soundPool.play(eb9, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn2.getText().toString().contains("多謝")) {
                    soundPool.play(eb7, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn2.getText().toString().contains("靜")) {
                    soundPool.play(eb10, 1.0F, 1.0F, 0, 0, 1.0F);
                }
                //9
                if (answerBtn2.getText().toString().contains("咗")) {
                    soundPool.play(eb12, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn2.getText().toString().contains("唞")) {
                    soundPool.play(eb13, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn2.getText().toString().contains("咩")) {
                    soundPool.play(eb11, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn2.getText().toString().contains("呢")) {
                    soundPool.play(eb14, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                //10

            }
        });



        s3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //4

                //6
                if (answerBtn3.getText().toString().contains("廿")) {
                    soundPool.play(eb3, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn3.getText().toString().contains("咁")) {
                    soundPool.play(eb5, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn3.getText().toString().contains("乜")) {
                    soundPool.play(eb2, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn3.getText().toString().contains("冚")) {
                    soundPool.play(eb4, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                //7

                //8
                if (answerBtn3.getText().toString().contains("該")) {
                    soundPool.play(eb8, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn3.getText().toString().contains("對唔住")) {
                    soundPool.play(eb9, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn3.getText().toString().contains("多謝")) {
                    soundPool.play(eb7, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn3.getText().toString().contains("靜")) {
                    soundPool.play(eb10, 1.0F, 1.0F, 0, 0, 1.0F);
                }
                //9
                if (answerBtn3.getText().toString().contains("咗")) {
                    soundPool.play(eb12, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn3.getText().toString().contains("唞")) {
                    soundPool.play(eb13, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn3.getText().toString().contains("咩")) {
                    soundPool.play(eb11, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn3.getText().toString().contains("呢")) {
                    soundPool.play(eb14, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                //10

            }
        });

        s4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //4

                //6
                if (answerBtn4.getText().toString().contains("廿")) {
                    soundPool.play(eb3, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn4.getText().toString().contains("咁")) {
                    soundPool.play(eb5, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn4.getText().toString().contains("乜")) {
                    soundPool.play(eb2, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn4.getText().toString().contains("冚")) {
                    soundPool.play(eb4, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                //7

                //8
                if (answerBtn4.getText().toString().contains("該")) {
                    soundPool.play(eb8, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn4.getText().toString().contains("對唔住")) {
                    soundPool.play(eb9, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn4.getText().toString().contains("多謝")) {
                    soundPool.play(eb7, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn4.getText().toString().contains("靜")) {
                    soundPool.play(eb10, 1.0F, 1.0F, 0, 0, 1.0F);
                }
                //9
                if (answerBtn4.getText().toString().contains("咗")) {
                    soundPool.play(eb12, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn4.getText().toString().contains("唞")) {
                    soundPool.play(eb13, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn4.getText().toString().contains("咩")) {
                    soundPool.play(eb11, 1.0F, 1.0F, 0, 0, 1.0F);

                }
                if (answerBtn4.getText().toString().contains("呢")) {
                    soundPool.play(eb14, 1.0F, 1.0F, 0, 0, 1.0F);

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

        // Crebte AlertDialog.
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
                    Intent intent = new Intent(getApplicationContext(), exam_score_im.class);
                    intent.putExtra("RIGHT_ANSWER_COUNT_im", rightAnswerCount);
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
                    Intent intent = new Intent(getApplicationContext(), exam_score_im.class);
                    intent.putExtra("RIGHT_ANSWER_COUNT_im", rightAnswerCount);
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