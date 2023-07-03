package com.example.solattimefyp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class menuUtama2 extends AppCompatActivity {

    ImageButton main, solat, back,btn_sound;
    TextView tv_nama;
    MediaPlayer mediaPlayer;

    SharedPreferences sharedPreferences;
    private static final String SHARED_PREF_NAME ="my_pref";
    private static final String KEY_NAME="name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama2);

        mediaPlayer=mediaPlayer.create(this,R.raw.soundtrack);
        mediaPlayer.setLooping(true);
        mediaPlayer.start();
        btn_sound=findViewById(R.id.btn_sound);
        back=findViewById(R.id.btn_kembali);
        tv_nama=findViewById(R.id.tv_nama);

        sharedPreferences = getSharedPreferences(SHARED_PREF_NAME,MODE_PRIVATE);

        String name=sharedPreferences.getString(KEY_NAME,null);

        if(name!=null){
            tv_nama.setText(name);

        }

        main=(ImageButton) findViewById(R.id.btn_main);
        main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(menuUtama2.this, MenuPermainanMini.class);
                startActivity(intent);
                mediaPlayer.release();

            }
        });

        solat=(ImageButton) findViewById(R.id.btn_solat);
        solat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(menuUtama2.this, MainActivity.class);
                startActivity(intent);
                mediaPlayer.release();

            }
        });

        btn_sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mediaPlayer.isPlaying()){
                    mediaPlayer.pause();
                }
                else{
                    mediaPlayer.start();
                    mediaPlayer.setLooping(true);
                }

            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.clear();
                editor.commit();
                Intent intent = new Intent(menuUtama2.this, daftarNama.class);
                startActivity(intent);
                mediaPlayer.release();

            }
        });



    }
}