package com.example.project_moop;

import java.util.Random;

public class Rumus_Lingkaran implements BangunDatar, Soal_Quiz {
    float r;
    public Rumus_Lingkaran(float r){
        this.r=r;
    }
    @Override
    public float hitungLuas() {

        float luas= phi *r *r;
        return luas;
    }

    @Override
    public float hitungKeliling() {

        float keliling= 2*phi *r;

        return keliling;
    }

    @Override
    public void random_soal() {
        Random ran= new Random();
        r= (float) (ran.nextInt(30));
    }
}
