package com.example.project_moop;

import java.util.Random;

public class Rumus_Balok extends Rumus_Persegi_Panjang implements BangunRuang, Soal_Quiz{
    float tinggi;
    public Rumus_Balok(float panjang, float lebar) {

        super(panjang, lebar);
    }

    @Override
    public float Volume() {

        float l=hitungLuas();



        float volume= tinggi * l;
        return volume;
    }

    @Override
    public float LuasPermukaan() {


        float LP= 2*(panjang*lebar +panjang*tinggi + lebar*tinggi);
        return LP;
    }

    @Override
    public void random_soal() {
        Random ran=new Random();
        panjang= (float) (ran.nextInt(30));
        lebar= (float) (ran.nextInt(30));
        tinggi= (float) (ran.nextInt(30));
    }
}
