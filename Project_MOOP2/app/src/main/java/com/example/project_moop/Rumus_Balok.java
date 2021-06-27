package com.example.project_moop;

public class Rumus_Balok extends Rumus_Persegi_Panjang implements BangunRuang{
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
}
