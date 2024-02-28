package com.example.cantospeakmastery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class exam_score_hd extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam_score_hd);

        TextView resultLabel = findViewById(R.id.resultLabel);
        TextView totalScoreLabel = findViewById(R.id.totalScoreLabel);

        int score = getIntent().getIntExtra("RIGHT_ANSWER_COUNT_hd", 0);

        SharedPreferences sharedPreferences = getSharedPreferences("QUIZ_DATA2", Context.MODE_PRIVATE);
        int totalScore = sharedPreferences.getInt("TOTAL_SCORE2", 0);
        totalScore += score;

        resultLabel.setText(score + " / 10題");
        totalScoreLabel.setText("高級測驗累計答對題數: " + totalScore);

        // Update total score.
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("TOTAL_SCORE2", totalScore);
        editor.commit();
    }

    public void returnTop(View view) {
        finish();
        exam_hard.a.finish();

    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        finish();

    }
    @Override
    protected void onStop() {
        super.onStop();
        finish();
    }
}