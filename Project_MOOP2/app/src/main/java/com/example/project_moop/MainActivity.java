package com.example.project_moop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pilih_perhitungan_bangun_ruang(View view) {
        Intent intent=new Intent(MainActivity.this,pilih_perhitungan_bangun_ruang.class);
        startActivity(intent);
    }

    public void pilih_perhitungan_bangun_datar(View view) {
        Intent intent=new Intent(MainActivity.this,pilih_perhitungan_bangun_datar.class);
        startActivity(intent);
    }

    public void pilih_perhitungan_baris_deret(View view) {
        Intent intent=new Intent(MainActivity.this,pilih_perhitungan_baris_deret.class);
        startActivity(intent);
    }

    public void pilih_menu_quiz(View view) {
        Intent intent = new Intent(MainActivity.this, MulaiQuizActivity.class);
        startActivity(intent);
    }
}