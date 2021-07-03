package com.example.project_moop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class pilih_perhitungan_baris_deret extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilih_perhitungan_baris_deret);
    }

    public void Aritmatika(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.container,new Aritmatika()).commit();
    }

    public void Geometri(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.container,new Geometri()).commit();
    }

    public void activity_main(View view) {
        Intent intent=new Intent(pilih_perhitungan_baris_deret.this,MainActivity.class);
        startActivity(intent);
    }
}