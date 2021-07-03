package com.example.project_moop;

import java.util.Random;

public class Rumus_Persegi_Panjang implements BangunDatar, Soal_Quiz {
    float panjang;
    float lebar;
    public Rumus_Persegi_Panjang(float panjang, float lebar){
        this.panjang=panjang;
        this.lebar=lebar;
    }

    @Override
    public float hitungLuas() {

        float luas= panjang*lebar;
        return luas;
    }

    @Override
    public float hitungKeliling() {


        float keliling= 2*(panjang + lebar);
        return keliling;
    }

    @Override
    public void random_soal() {
        Random ran= new Random();
        panjang= (float) (ran.nextInt(30));
        lebar= (float) (ran.nextInt(30));
    }
}
