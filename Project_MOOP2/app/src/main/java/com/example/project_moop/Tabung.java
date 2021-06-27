package com.example.project_moop;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Tabung extends Fragment {

    private Button bthHasil;
    private EditText data_jari, data_tinggi;
    private TextView hasil_volume,hasil_lp;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_tabung, container, false);
        bthHasil= v.findViewById(R.id.btnhasil);

        data_jari= v.findViewById(R.id.data_jari);

        data_tinggi= v.findViewById(R.id.data_tinggi);
        hasil_volume= v.findViewById(R.id.hasil_volume);
        hasil_lp= v.findViewById(R.id.hasil_lp);
        bthHasil.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                String r=data_jari.getText().toString();
                String t=data_tinggi.getText().toString();


                if(r.isEmpty()  || t.isEmpty() ){
                    hasil_volume.setText("Hasil isi terlebih dahulu");
                }else{
                    float float_r= Float.parseFloat(r);
                    float float_t= Float.parseFloat(t);
                    Rumus_Tabung perhitungan= new Rumus_Tabung(float_r);
                    perhitungan.tinggi=float_t;
                    float volume= perhitungan.Volume();
                    float lp= perhitungan.LuasPermukaan();
                    String volume_str= "Volume :" + Float.toString(volume);
                    String lp_str="Luas Permukaan :" + Float.toString(lp);
                    hasil_volume.setText(volume_str);
                    hasil_lp.setText(lp_str);


                }
            }
        });
        return v;
    }
}