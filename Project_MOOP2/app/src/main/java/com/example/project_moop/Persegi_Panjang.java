package com.example.project_moop;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Persegi_Panjang extends Fragment {

    private Button bthHasil;
    private EditText data_panjang, data_lebar;
    private TextView hasil_luas,hasil_keliling;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_persegi__panjang, container, false);
        bthHasil= v.findViewById(R.id.btnhasil);

        data_panjang= v.findViewById(R.id.data_panjang);
        data_lebar= v.findViewById(R.id.data_lebar);

        hasil_luas= v.findViewById(R.id.hasil_luas);
        hasil_keliling= v.findViewById(R.id.hasil_keliling);
        bthHasil.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                String p=data_panjang.getText().toString();
                String l=data_lebar.getText().toString();

                if(p.isEmpty() || l.isEmpty() ){
                    hasil_luas.setText("Hasil isi terlebih dahulu");
                }else{
                    float float_p= Float.parseFloat(p);
                    float float_l= Float.parseFloat(l);

                    Rumus_Persegi_Panjang perhitungan= new Rumus_Persegi_Panjang(float_p,float_l);
                    float luas= perhitungan.hitungLuas();
                    float keliling=perhitungan.hitungKeliling();
                    String luas_str= "Luas :" + Float.toString(luas);
                    String keliling_str="keliling :" + Float.toString(keliling);
                    hasil_luas.setText(luas_str);
                    hasil_keliling.setText(keliling_str);


                }
            }
        });
        return v;
    }
}