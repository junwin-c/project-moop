package com.example.project_moop;

import java.util.Random;

public class Rumus_kubus extends Rumus_Persegi implements BangunRuang, Soal_Quiz {


    public Rumus_kubus(float sisi) {
        super(sisi);
    }

    @Override
    public float Volume() {

        float V=sisi*sisi*sisi;
        return V;
    }

    @Override
    public float LuasPermukaan() {
        float LP= hitungLuas()* 6;
        return LP;
    }

    @Override
    public void random_soal() {
        Random ran= new Random();
        sisi= (float) (ran.nextInt(30));
    }
}
