package com.example.project_moop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class pilih_perhitungan_bangun_datar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilih_perhitungan_bangun_datar);
    }

    public void persegi(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.container,new Persegi()).commit();
    }

    public void persegi_panjang(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.container,new Persegi_Panjang()).commit();
    }

    public void lingkaran(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.container,new Lingkaran()).commit();
    }

    public void activity_main(View view) {
        Intent intent=new Intent(pilih_perhitungan_bangun_datar.this,MainActivity.class);
        startActivity(intent);
    }
}