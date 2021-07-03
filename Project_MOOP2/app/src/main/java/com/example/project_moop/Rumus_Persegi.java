package com.example.project_moop;


import java.util.Random;

public class Rumus_Persegi implements BangunDatar, Soal_Quiz{
    float sisi;
    public Rumus_Persegi(float sisi){
        this.sisi=sisi;
    }


    @Override

    public float hitungLuas() {

        float luas=sisi*sisi;
        return luas;
    }

    @Override
    public float hitungKeliling() {
        System.out.print("Masukkan sisi :");

        float keliling=4*sisi;
        return keliling;
    }

    @Override
    public void random_soal() {
        Random ran= new Random();
        sisi= (float) (ran.nextInt(30));
    }
}
