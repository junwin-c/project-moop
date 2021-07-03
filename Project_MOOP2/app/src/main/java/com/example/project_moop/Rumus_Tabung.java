package com.example.project_moop;

import java.util.Random;

public class Rumus_Tabung extends Rumus_Lingkaran implements BangunRuang, Soal_Quiz{
    float tinggi;

    public Rumus_Tabung(float r) {
        super(r);
    }


    @Override
    public float Volume() {


        float l=hitungLuas();

        float volume=l*tinggi;
        return volume;
    }

    @Override
    public float LuasPermukaan() {
        float l=hitungKeliling();

        float lp=l * (r+tinggi);
        return lp;

    }

        @Override
        public void random_soal() {
            Random ran= new Random();
            r= (float) (ran.nextInt(31));
            tinggi= (float) (ran.nextInt(31));
        }
}
