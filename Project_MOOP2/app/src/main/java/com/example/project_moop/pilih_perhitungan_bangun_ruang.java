package com.example.project_moop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class pilih_perhitungan_bangun_ruang extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilih_perhitungan_bangun_ruang);
    }
    public void Kubus(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.container,new Kubus()).commit();

    }

    public void Balok(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.container,new Balok()).commit();
    }

    public void Tabung(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.container,new Tabung()).commit();
    }

    public void activity_main(View view) {
        Intent intent=new Intent(pilih_perhitungan_bangun_ruang.this,MainActivity.class);
        startActivity(intent);
    }
}