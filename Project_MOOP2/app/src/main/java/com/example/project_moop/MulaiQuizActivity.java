package com.example.project_moop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MulaiQuizActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mulai_quiz);
    }

    public void soal(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.container,new Soal()).commit();
    }

    public void activity_main(View view) {
        Intent intent = new Intent(MulaiQuizActivity.this,MainActivity.class);
        startActivity(intent);
    }
}