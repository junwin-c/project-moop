package com.example.project_moop;

import java.util.Random;

public class Rumus_Aritmatika implements Baris_dan_Deret, Soal_Quiz {
    float u1;
    float b;
    float n;
    public Rumus_Aritmatika(float u1, float b, float n){
        this.n=n;
        this.u1=u1;
        this.b=b;
    }
    @Override
    public float baris() {
        float hasil= u1 + (n-1)*b;
        return 0;
    }

    @Override
    public float deret() {
        float hasil= (n/2) * (u1 + baris());
        return 0;
    }

    @Override
    public void random_soal() {
        Random ran= new Random();
        u1= (float) ran.nextInt(21);
        b= (float) ran.nextInt(5);
        n= (float) ran.nextInt(21);
    }
}
