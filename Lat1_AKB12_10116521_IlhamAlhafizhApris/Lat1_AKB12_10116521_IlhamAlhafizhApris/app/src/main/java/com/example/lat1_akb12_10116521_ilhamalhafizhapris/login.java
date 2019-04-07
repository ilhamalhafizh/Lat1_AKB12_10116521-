package com.example.lat1_akb12_10116521_ilhamalhafizhapris;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/*
 * Created By
 *
 * Nama    : Ilham Alhafizh Apris
 * NIM     : 10116521
 * Kelas   : IF-12 / AKB-12
 * Tanggal : 6 April 2019
 *
 * */
public class login extends AppCompatActivity implements View.OnClickListener {

    Button btn_Login, btn_BeliKode;
    EditText edt_KodeKeluarga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampilan_login);

        TextView textKebijakan = (TextView) findViewById(R.id.tvDescKetentuan);

        edt_KodeKeluarga = findViewById(R.id.edtKodeKeluarga);

        btn_Login = findViewById(R.id.btnLogin);
        btn_Login.setOnClickListener(this);

        btn_BeliKode = findViewById(R.id.btnBeliKode);
        btn_BeliKode.setOnClickListener(this);

        /*
                    Spanned
                    This is the interface for text that has markup objects attached to ranges of it.
                 */

        Spanned html = Html.fromHtml(
                "Dengan menekan tombol masuk berarti Anda menyetujui <b>Ketentuan Pengguna</b> dan <b>Ketentuan Pengguna</b> Data kami"
        );

        // Set TextView text from html
        textKebijakan.setText(html);
    }

    @Override
    public void onClick(View v) {
        String kk = edt_KodeKeluarga.getText().toString();
        boolean isEmptyFields = false;
        switch (v.getId()) {
            case R.id.btnLogin:
                if (TextUtils.isEmpty(kk)){
                    isEmptyFields = true;
                    Toast.makeText(getApplicationContext(), "Harap isi dengan Kode Keluarga Anda", Toast.LENGTH_LONG).show();
                }else{
                    Intent moveIntent = new Intent(login.this, biodata.class);
                    startActivity(moveIntent);
                }
                break;
            case R.id.btnBeliKode:
                if (TextUtils.isEmpty(kk)){
                    isEmptyFields = true;
                    Toast.makeText(getApplicationContext(), "Harap isi dengan Kode Keluarga Anda", Toast.LENGTH_LONG).show();
                }else{
                    Intent moveIntent = new Intent(login.this, biodata.class);
                    startActivity(moveIntent);
                }
                break;
        }
    }
}
