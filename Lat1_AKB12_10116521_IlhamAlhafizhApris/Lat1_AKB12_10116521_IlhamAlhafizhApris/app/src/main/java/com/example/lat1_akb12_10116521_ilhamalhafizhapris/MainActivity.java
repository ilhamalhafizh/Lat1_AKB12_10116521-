package com.example.lat1_akb12_10116521_ilhamalhafizhapris;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/*
 * Created By
 *
 * Nama    : Ilham Alhafizh Apris
 * NIM     : 10116521
 * Kelas   : IF-12 / AKB-12
 * Tanggal : 5 April 2019
 *
 * */
public class MainActivity extends AppCompatActivity {

    Button btn_Mulai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getIntent().getBooleanExtra("EXIT", false))
        {
            finish();
        }

        btn_Mulai = (Button) findViewById(R.id.btnMulai);
        btn_Mulai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, login.class);
                startActivity(i);
            }
        });
    }
}
