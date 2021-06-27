package com.example.project_moop;

public class Rumus_Persegi_Panjang implements BangunDatar {
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
}
