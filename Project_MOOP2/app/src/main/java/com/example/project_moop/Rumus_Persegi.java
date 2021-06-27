package com.example.project_moop;


public class Rumus_Persegi implements BangunDatar{
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
}
