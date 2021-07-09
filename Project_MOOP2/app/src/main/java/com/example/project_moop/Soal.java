package com.example.project_moop;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.util.*;

public class Soal extends Fragment {
    Random ran = new Random();
    private Button bthHasil;
    private EditText data_Jawaban;
    private TextView a,b,c,persoalan, jawaban_benar;
    public  int jmlh=0;
    float jawaban;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v=inflater.inflate(R.layout.fragment_soal, container, false);
        bthHasil= v.findViewById(R.id.btnhasil);

        data_Jawaban= v.findViewById(R.id.data_Jawaban);

        a= v.findViewById(R.id.a);
        b= v.findViewById(R.id.b);
        c= v.findViewById(R.id.c);
        jawaban_benar= v.findViewById(R.id.Jawaban_benar);
        persoalan= v.findViewById(R.id.persoalan);
        int rand= (int) (ran.nextInt(16))+1;
        if(jmlh==1){
            a.setText("");
            b.setText("");
            c.setText("");
            jawaban_benar.setText("");
            persoalan.setText("");
        }else if(rand==1){

            Rumus_Persegi persegi= new Rumus_Persegi(0);
            persegi.random_soal();
            float s=persegi.sisi;

            persoalan.setText("Hitunglah Luas Persegi");
            a.setText("Sisi : "+ Float.toString(s));
            jawaban=persegi.hitungLuas();

        }else if(rand==2){
            Rumus_Persegi persegi= new Rumus_Persegi(0);
            persegi.random_soal();
            float s=persegi.sisi;

            persoalan.setText("Hitunglah Keliling Persegi");
            a.setText("Sisi : "+ Float.toString(s));
            jawaban=persegi.hitungKeliling();
        }else if(rand==3){
            Rumus_Persegi_Panjang persegi_panjang= new Rumus_Persegi_Panjang(0,0);
            persegi_panjang.random_soal();
            float p=persegi_panjang.panjang;
            float l= persegi_panjang.lebar;

            persoalan.setText("Hitunglah Luas Persegi Panjang");
            a.setText("Panjang :" +Float.toString(p));
            b.setText("Lebar :" +Float.toString(l));
            jawaban=persegi_panjang.hitungLuas();
        }else if(rand==4){
            Rumus_Persegi_Panjang persegi_panjang= new Rumus_Persegi_Panjang(0,0);
            persegi_panjang.random_soal();
            float p=persegi_panjang.panjang;
            float l= persegi_panjang.lebar;

            persoalan.setText("Hitunglah Keliling Persegi Panjang");
            a.setText("Panjang :" +Float.toString(p));
            b.setText("Lebar :" +Float.toString(l));
            jawaban=persegi_panjang.hitungKeliling();
        }else if(rand==5){
            Rumus_Lingkaran Lingkaran= new Rumus_Lingkaran(0);
            Lingkaran.random_soal();
            float r=Lingkaran.r;

            persoalan.setText("Hitunglah Luas Lingkaran");
            a.setText("Jari-jari :"+ Float.toString(r));
            jawaban=Lingkaran.hitungLuas();
        }else if(rand==6){
            Rumus_Lingkaran Lingkaran= new Rumus_Lingkaran(0);
            Lingkaran.random_soal();
            float r=Lingkaran.r;

            persoalan.setText("Hitunglah Keliling Lingkaran");
            a.setText("Jari-jari :"+ Float.toString(r));
            jawaban=Lingkaran.hitungKeliling();
        }else if(rand==7){
            Rumus_kubus Kubus= new Rumus_kubus(0);
            Kubus.random_soal();
            float s=Kubus.sisi;

            persoalan.setText("Hitunglah Volume Kubus");
            a.setText("Sisi : "+ Float.toString(s));
            jawaban=Kubus.Volume();
        }else if(rand==8){
            Rumus_kubus Kubus= new Rumus_kubus(0);
            Kubus.random_soal();
            float s=Kubus.sisi;

            persoalan.setText("Hitunglah Luas Permukaan Kubus");
            a.setText("Sisi : "+ Float.toString(s));
            jawaban=Kubus.LuasPermukaan();
        }else if(rand==9){
            Rumus_Balok Balok= new Rumus_Balok(0,0);
            Balok.random_soal();
            float p=Balok.panjang;
            float l= Balok.lebar;
            float t= Balok.tinggi;
            persoalan.setText("Hitunglah Volume Balok");
            a.setText("Panjang :" +Float.toString(p));
            b.setText("Lebar :" +Float.toString(l));
            c.setText("Tinggi :" +Float.toString(t));
            jawaban=Balok.Volume();
        }else if(rand==10){
            Rumus_Balok Balok= new Rumus_Balok(0,0);
            Balok.random_soal();
            float p=Balok.panjang;
            float l= Balok.lebar;
            float t= Balok.tinggi;
            persoalan.setText("Hitunglah Luas Permukaan Balok");
            a.setText("Panjang :" +Float.toString(p));
            b.setText("Lebar :" +Float.toString(l));
            c.setText("Tinggi :" +Float.toString(t));
            jawaban=Balok.LuasPermukaan();
        }else if(rand==11){
            Rumus_Tabung Tabung= new Rumus_Tabung(0);
            Tabung.random_soal();

            float r= Tabung.r;
            float t= Tabung.tinggi;
            persoalan.setText("Hitunglah Volume Tabung");
            a.setText("Panjang :" +Float.toString(r));
            b.setText("Lebar :" +Float.toString(t));
            jawaban=Tabung.Volume();
        }else if(rand==12){
            Rumus_Tabung Tabung= new Rumus_Tabung(0);
            Tabung.random_soal();

            float r= Tabung.r;
            float t= Tabung.tinggi;
            persoalan.setText("Hitunglah Luas Permukaan Tabung");
            a.setText("Panjang :" +Float.toString(r));
            b.setText("Lebar :" +Float.toString(t));

            jawaban=Tabung.LuasPermukaan();
        }else if(rand==13){
            Rumus_Aritmatika Aritmatika= new Rumus_Aritmatika(0,0,0);
            Aritmatika.random_soal();

            float u1= Aritmatika.u1;
            float beda= Aritmatika.b;
            float n= Aritmatika.n;
            persoalan.setText("Hitunglah Baris Aritmatika ke- " + n);
            a.setText("Baris-1 :" +Float.toString(u1));
            b.setText("Beda :" +Float.toString(beda));
            jawaban=Aritmatika.baris();
        }else if(rand==14){
            Rumus_Aritmatika Aritmatika= new Rumus_Aritmatika(0,0,0);
            Aritmatika.random_soal();

            float u1= Aritmatika.u1;
            float beda= Aritmatika.b;
            float n= Aritmatika.n;
            persoalan.setText("Hitunglah  " + n +" Deret Aritmatika");
            a.setText("Baris-1 :" +Float.toString(u1));

            b.setText("Beda :" +Float.toString(beda));
            jawaban=Aritmatika.deret();
        }else if(rand==15){
            Rumus_Geometri Geometri= new Rumus_Geometri(0,0,0);
            Geometri.random_soal();

            float u1= Geometri.u1;
            float r= Geometri.r;
            float n= Geometri.n;
            persoalan.setText("Hitunglah Baris Geometri ke- " + n);
            a.setText("Baris-1 :" +Float.toString(u1));
            b.setText("Beda :" +Float.toString(r));
            jawaban=Geometri.baris();
        }else if(rand==16){
            Rumus_Geometri Geometri= new Rumus_Geometri(0,0,0);
            Geometri.random_soal();

            float u1= Geometri.u1;
            float r= Geometri.r;
            float n= Geometri.n;
            persoalan.setText("Hitunglah  " + n +" Deret Geometri");
            a.setText("Baris-1 :" +Float.toString(u1));
            b.setText("Beda :" +Float.toString(r));
            jawaban=Geometri.deret();
        }
        bthHasil.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                String data=data_Jawaban.getText().toString();
                if(jmlh==1){
                    jawaban_benar.setText("");
                    jmlh=0;

                }else if(data.isEmpty() ){
                    jawaban_benar.setText("Harap jawab terlebih dahulu!" );

                }else{
                    float jawab= Float.parseFloat(data);
                    if(jawab== jawaban){
                        jawaban_benar.setText("Selamat jawaban anda benar!");
                    }else{
                        jawaban_benar.setText("Jawaban anda salah! Jawabannya adalah " + Float.toString(jawaban));
                    }
                    jmlh=1;



                }
            }
        });
        return v;
    }
}