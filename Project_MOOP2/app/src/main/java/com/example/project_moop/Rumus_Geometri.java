package com.example.project_moop;
import java.util.*;
public class Rumus_Geometri implements Baris_dan_Deret, Soal_Quiz {
    float u1;
    float r;
    float n;
    public Rumus_Geometri(float u1, float r, float n){
        this.n=n;
        this.u1=u1;
        this.r=r;
    }
    @Override

    public float baris() {
        float hasil= (float) (u1 * (Math.pow(r,(n-1))));
        return hasil;
    }

    @Override
    public float deret() {
        float hasil=u1;
        if(r<1){
            hasil= (float) ((u1*(1-Math.pow(r,n)))/(1-r));
        }else if(r>1){
            hasil= (float) ((u1*(Math.pow(r,n)-1))/(r-1));
        }
        return hasil;
    }

    @Override
    public void random_soal() {
        Random ran= new Random();
        u1= (float) ran.nextInt(21);
        r= (float) ran.nextInt(5);
        n= (float)ran.nextInt(21);
    }
}
