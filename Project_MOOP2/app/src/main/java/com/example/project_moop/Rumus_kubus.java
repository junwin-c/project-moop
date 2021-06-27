package com.example.project_moop;

public class Rumus_kubus extends Rumus_Persegi implements BangunRuang {


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
}
