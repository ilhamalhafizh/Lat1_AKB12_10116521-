package com.example.lat1_akb12_10116521_ilhamalhafizhapris;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/*
 * Created by
 *
 * Nama    : Ilham Alhafizh Apris
 * NIM     : 10116521
 * Kelas   : IF-12 / AKB-12
 * Tanggal : 5 April 2019
 *
 * */
public class hai extends AppCompatActivity {

    private String KEY_NAME = "kamu";
    private String nama;
    TextView textHai;
    Button btn_Hai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampilan_hai);

        textHai = (TextView) findViewById(R.id.txtHai);

        Bundle extras = getIntent().getExtras();
        nama = extras.getString(KEY_NAME);
        textHai.setText("Beres! Sekarang " + nama + " udah bisa ngecek penggunan HP mu tiap hari buat bantu kamu ngatur waktu :)");

        btn_Hai = (Button) findViewById(R.id.Oke);
        btn_Hai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hai.this, MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.putExtra("EXIT", true);
                startActivity(intent);
            }
        });
    }
}
