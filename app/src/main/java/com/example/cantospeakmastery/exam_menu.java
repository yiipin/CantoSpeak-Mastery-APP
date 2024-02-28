package com.example.cantospeakmastery;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class exam_menu extends AppCompatActivity {

    private ImageButton Button_exam_easy;
    private ImageButton Button_exam_intermediate;
    private ImageButton Button_exam_hard;
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            Toast.makeText(this, "返回主畫面", Toast.LENGTH_SHORT).show();
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam_menu);
        ActionBar actionBar=getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        Button_exam_easy = (ImageButton) findViewById(R.id.Button_exam_easy);
        Button_exam_easy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openexam_easy();
            }
        });



        Button_exam_intermediate = (ImageButton) findViewById(R.id.Button_exam_intermediate);
        Button_exam_intermediate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openexam_intermediate();
            }
        });

        Button_exam_hard = (ImageButton) findViewById(R.id.Button_exam_hard);
        Button_exam_hard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openexam_hard();
            }
        });
    }

    public void openexam_easy(){
        Intent intent = new Intent(this, exam_easy.class);
        startActivity(intent);
    }

    public void openexam_intermediate(){
        Intent intent = new Intent(this, exam_intermediate.class);
        startActivity(intent);
    }
    public void openexam_hard(){
        Intent intent = new Intent(this, exam_hard.class);
        startActivity(intent);
    }
}