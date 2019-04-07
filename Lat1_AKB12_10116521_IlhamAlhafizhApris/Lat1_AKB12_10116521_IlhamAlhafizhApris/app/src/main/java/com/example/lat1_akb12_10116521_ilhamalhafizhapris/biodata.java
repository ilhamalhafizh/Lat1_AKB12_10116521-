package com.example.lat1_akb12_10116521_ilhamalhafizhapris;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/*
 * Created By
 *
 * Nama    : Ilham Alhafizh Apris
 * NIM     : 10116521
 * Kelas   : IF-12 / AKB-12
 * Tanggal : 6 April 2019
 *
 * */
public class biodata extends AppCompatActivity {

    //V Edit Text & Button
    EditText edt_Nama, edt_Umur;
    Button btn_Next;

    private String KEY_NAME = "kamu";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampilan_biodata);

        edt_Nama = (EditText) findViewById(R.id.edtNama);
        edt_Umur = (EditText) findViewById(R.id.edtUmur);
        btn_Next = (Button) findViewById(R.id.btnNext);

        btn_Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nama = edt_Nama.getText().toString();
                String umur = edt_Umur.getText().toString();

                boolean isEmptyFields = false;

                if (TextUtils.isEmpty(nama)) {
                    isEmptyFields = true;
                    edt_Nama.setError("Harap isi dengan nama kamu!");
                } else {
                    Intent moveIntentWithData = new Intent(biodata.this, hai.class);
                    moveIntentWithData.putExtra(KEY_NAME, nama);
                    startActivity(moveIntentWithData);
                }
                if (TextUtils.isEmpty(umur)) {
                    isEmptyFields = true;
                    edt_Umur.setError("Harap isi dengan umur kamu!");
                }
            }
        });
    }
}
