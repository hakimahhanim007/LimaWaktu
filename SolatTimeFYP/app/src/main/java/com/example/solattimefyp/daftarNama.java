package com.example.solattimefyp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;



public class daftarNama extends AppCompatActivity {

    ImageButton btn_daftar, btn_back;
    EditText et_nama;
    SharedPreferences sharedPreferences;

    private static final String SHARED_PREF_NAME ="my_pref";
    private static final String KEY_NAME="name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_nama);
        btn_back=findViewById(R.id.btn_back);
        et_nama = findViewById(R.id.editNama);
        btn_daftar= findViewById(R.id.btn_daftar);

        sharedPreferences=getSharedPreferences(SHARED_PREF_NAME,MODE_PRIVATE);

        String name = sharedPreferences.getString(KEY_NAME,null);

        if(name!= null){
            //if data available so directly call menu utama activity
            Intent intent =new Intent(daftarNama.this, menuUtama2.class);
            startActivity(intent);
        }

          btn_daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString(KEY_NAME,et_nama.getText().toString());
                editor.apply();

                Intent intent = new Intent(daftarNama.this, menuUtama2.class);
                startActivity(intent);

            }
        });
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.clear();
                editor.commit();
                Intent intent = new Intent(daftarNama.this, pilihWatak.class);
                startActivity(intent);
            }
        });
    }
}