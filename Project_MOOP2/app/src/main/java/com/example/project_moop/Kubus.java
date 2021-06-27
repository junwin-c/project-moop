package com.example.project_moop;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Kubus extends Fragment {
    private Button bthHasil;
    private EditText data_sisi;
    private TextView hasil_volume,hasil_lp;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_kubus, container, false);
        bthHasil= v.findViewById(R.id.btnhasil);

        data_sisi= v.findViewById(R.id.data_sisi);

        hasil_volume= v.findViewById(R.id.hasil_volume);
        hasil_lp= v.findViewById(R.id.hasil_lp);
        bthHasil.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                String s=data_sisi.getText().toString();
                Float float_s= Float.parseFloat(s);
                Rumus_kubus perhitungan= new Rumus_kubus(float_s);
                float volume=perhitungan.Volume();
                float lp=perhitungan.LuasPermukaan();

                if(s.isEmpty() ){
                    hasil_volume.setText("Hasil isi terlebih dahulu");
                }else{

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