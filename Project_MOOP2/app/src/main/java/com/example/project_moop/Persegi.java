package com.example.project_moop;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Persegi extends Fragment {

    private Button bthHasil;
    private EditText data_sisi;
    private TextView hasil_luas,hasil_keliling;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_persegi, container, false);
        bthHasil= v.findViewById(R.id.btnhasil);

        data_sisi= v.findViewById(R.id.data_sisi);

        hasil_luas= v.findViewById(R.id.hasil_luas);
        hasil_keliling= v.findViewById(R.id.hasil_keliling);
        bthHasil.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                String s = data_sisi.getText().toString();

                if(s.isEmpty() ){
                    hasil_luas.setText("Hasil isi terlebih dahulu");
                }else{
                    float float_s= Float.parseFloat(s);


                    Rumus_Persegi perhitungan= new Rumus_Persegi(float_s);
                    float luas= perhitungan.hitungLuas();
                    float keliling=perhitungan.hitungKeliling();
                    String luas_str= "Luas :" + Float.toString(luas);
                    String keliling_str="Keliling :" + Float.toString(keliling);
                    hasil_luas.setText(luas_str);
                    hasil_keliling.setText(keliling_str);
                }
            }
        });
        return v;
    }
}