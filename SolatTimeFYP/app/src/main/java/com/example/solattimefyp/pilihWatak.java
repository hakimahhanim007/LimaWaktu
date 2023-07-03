package com.example.solattimefyp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class pilihWatak extends AppCompatActivity {

    ImageButton ib_lelaki,ib_perempuan;
    SharedPreferences sharedPreferences;

    private static final String SHARED_PREF_NAME ="my_pref";
    private static final String KEY_NAME="name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilih_watak);

        

         ib_lelaki=findViewById(R.id.img_btn_lelaki);
         ib_perempuan=findViewById(R.id.img_btn_perempuan);
        final MediaPlayer clicksound = MediaPlayer.create(this, R.raw.clicksound);


        ib_perempuan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //run perempuan
                clicksound.start();
                Intent intent=new Intent(pilihWatak.this, daftarNamaPerempuan.class);
                startActivity(intent);
                clicksound.stop();
            }
        });


        ib_lelaki.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 //run lelaki
                 clicksound.start();
                 Intent intent=new Intent(pilihWatak.this, daftarNama.class);
                 startActivity(intent);
                 clicksound.stop();
             }
         });

    }
}