package com.example.project_moop;

public class Rumus_Tabung extends Rumus_Lingkaran implements BangunRuang{
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
}
