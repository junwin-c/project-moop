package com.example.project_moop;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Aritmatika extends Fragment {

    private Button bthHasil;
    private EditText data_u1,data_b, data_n;
    private TextView hasil_baris,hasil_deret;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_aritmatika, container, false);
        bthHasil = v.findViewById(R.id.btnhasil);

        data_u1 = v.findViewById(R.id.data_u1);
        data_b = v.findViewById(R.id.data_b);
        data_n = v.findViewById(R.id.data_n);


        hasil_baris = v.findViewById(R.id.hasil_baris);
        hasil_deret = v.findViewById(R.id.hasil_deret);
        bthHasil.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String u1 = data_u1.getText().toString();
                String b = data_b.getText().toString();
                String n = data_n.getText().toString();
                Float float_u1 = Float.parseFloat(u1);
                Float float_b = Float.parseFloat(b);
                Float float_n = Float.parseFloat(n);
                Rumus_Aritmatika perhitungan = new Rumus_Aritmatika(float_u1, float_b, float_n);
                float baris = perhitungan.baris();
                float deret = perhitungan.deret();

                if (u1.isEmpty() || b.isEmpty() || n.isEmpty()) {
                    hasil_baris.setText("Hasil isi terlebih dahulu");
                } else {

                    String volume_str = "Baris-ke :" + n + " " + Float.toString(baris);
                    String lp_str = "jumlah total  :" + Float.toString(deret);
                    hasil_baris.setText(volume_str);
                    hasil_deret.setText(lp_str);

                }
            }

        });
        return v;
    }
}