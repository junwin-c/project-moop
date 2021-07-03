package com.example.project_moop;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Geometri extends Fragment {

    private Button bthHasil;
    private EditText data_u1,data_R, data_n;
    private TextView hasil_volume,hasil_lp;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_geometri, container, false);
        bthHasil= v.findViewById(R.id.btnhasil);

        data_u1= v.findViewById(R.id.data_u1);
        data_R= v.findViewById(R.id.data_r);
        data_n= v.findViewById(R.id.data_n);


        hasil_volume= v.findViewById(R.id.hasil_baris);
        hasil_lp= v.findViewById(R.id.hasil_deret);
        bthHasil.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String u1 = data_u1.getText().toString();
                String r = data_R.getText().toString();
                String n = data_n.getText().toString();
                Float float_u1 = Float.parseFloat(u1);
                Float float_r = Float.parseFloat(r);
                Float float_n = Float.parseFloat(n);
                Rumus_Geometri perhitungan = new Rumus_Geometri(float_u1, float_r, float_n);
                float volume = perhitungan.baris();
                float lp = perhitungan.baris();

                if (u1.isEmpty() || r.isEmpty() || n.isEmpty()) {
                    hasil_volume.setText("Hasil isi terlebih dahulu");
                } else {

                    String volume_str = "Baris-ke :" + n + Float.toString(volume);
                    String lp_str = "deret :" + Float.toString(lp);
                    hasil_volume.setText(volume_str);
                    hasil_lp.setText(lp_str);


                }
            }
        });
        return v;
    }
}