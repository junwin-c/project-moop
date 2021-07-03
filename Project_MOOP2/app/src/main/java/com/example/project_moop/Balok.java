package com.example.project_moop;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Balok extends Fragment {
    private Button bthHasil;
    private EditText data_lebar, data_tinggi, data_panjang;
    private TextView hasil_volume,hasil_lp;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =inflater.inflate(R.layout.fragment_balok, container, false);

        bthHasil= v.findViewById(R.id.btnhasil);

        data_panjang= v.findViewById(R.id.data_panjang);
        data_lebar= v.findViewById(R.id.data_lebar);
        data_tinggi= v.findViewById(R.id.data_tinggi);
        hasil_volume= v.findViewById(R.id.hasil_volume);
        hasil_lp= v.findViewById(R.id.hasil_lp);
        bthHasil.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                String p=data_panjang.getText().toString();
                String l=data_lebar.getText().toString();
                String t=data_tinggi.getText().toString();


                if(p.isEmpty() || l.isEmpty() || t.isEmpty() ){
                    hasil_volume.setText("Hasil isi terlebih dahulu");
                }else{
                    float float_p= Float.parseFloat(p);
                    float float_l= Float.parseFloat(l);
                    float float_t= Float.parseFloat(t);
                    Rumus_Balok perhitungan= new Rumus_Balok(float_p, float_l);
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