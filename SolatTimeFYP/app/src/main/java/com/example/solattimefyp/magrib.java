package com.example.solattimefyp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class magrib extends AppCompatActivity  {

    ImageButton back,show,btn_sound;
    MediaPlayer mediaPlayer;
    ImageView showSlide;
    TextView bacaan, rukun,tvlabelsolat;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_magrib);

        mediaPlayer= MediaPlayer.create(this, R.raw.sample);
        mediaPlayer.start();

        showSlide=(ImageView) findViewById(R.id.showslide);
        show= (ImageButton)findViewById(R.id.btn_niat);
        show=(ImageButton) findViewById(R.id.btn_takbir);
        bacaan = (TextView) findViewById(R.id.tv_bacaan);
        rukun=(TextView) findViewById(R.id.tv_label);
        tvlabelsolat=(TextView)findViewById((R.id.tvlabelsolat));
        tvlabelsolat.setText("SOLAT MAGHRIB");

        //assign button to image view
        ImageButton btnsound1=(ImageButton) this.findViewById(R.id.btn_niat);
        ImageButton btnsound2=(ImageButton) this.findViewById(R.id.btn_takbir);
        ImageButton btnsound3=(ImageButton) this.findViewById(R.id.btn_iftitah);
        ImageButton btnsound4=(ImageButton) this.findViewById(R.id.btn_alfatihah);
        ImageButton btnsound5=(ImageButton) this.findViewById(R.id.btn_rukuk1);
        ImageButton btnsound6=(ImageButton) this.findViewById(R.id.btn_iktidal1);
        ImageButton btnsound7=(ImageButton) this.findViewById(R.id.btn_sujud1);
        ImageButton btnsound8=(ImageButton) this.findViewById(R.id.btn_duduk1);
        ImageButton btnsound9=(ImageButton) this.findViewById(R.id.btn_sujud12);
        ImageButton btnsound10=(ImageButton) this.findViewById(R.id.btn_alfatihah2);
        ImageButton btnsound11=(ImageButton) this.findViewById(R.id.btn_rukuk2);
        ImageButton btnsound12=(ImageButton) this.findViewById(R.id.btn_iktidal2);
        ImageButton btnsound13=(ImageButton) this.findViewById(R.id.btn_sujud2);
        ImageButton btnsound14=(ImageButton) this.findViewById(R.id.btn_duduk2);
        ImageButton btnsound15=(ImageButton) this.findViewById(R.id.btn_sujud22);
        ImageButton btnsound16=(ImageButton) this.findViewById(R.id.btn_tahiyatawal);
        ImageButton btnsound17=(ImageButton) this.findViewById(R.id.btn_alfatihah3);
        ImageButton btnsound18=(ImageButton) this.findViewById(R.id.btn_rukuk3);
        ImageButton btnsound19=(ImageButton) this.findViewById(R.id.btn_iktidal3);
        ImageButton btnsound20=(ImageButton) this.findViewById(R.id.sujud31);
        ImageButton btnsound21=(ImageButton) this.findViewById(R.id.btn_duduk3);
        ImageButton btnsound22=(ImageButton) this.findViewById(R.id.btn_sujud32);
        ImageButton btnsound23=(ImageButton) this.findViewById(R.id.btn_tahiyatakhir);
        ImageButton btnsound24=(ImageButton) this.findViewById(R.id.btn_salam);

        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                showSlide.setVisibility((View.VISIBLE));

            }
        });

        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                showSlide.setVisibility((View.INVISIBLE));

            }
        });



        //image button, tekan show image dekat slide, lepastu bunyi bacaan


        btnsound1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showSlide.setImageResource(R.drawable.solat1_berdiritegak);
                bacaan.setText(R.string.niatmagrib);
                rukun.setText(R.string.tvniat);
                mediaPlayer.release();
                mediaPlayer= MediaPlayer.create(magrib.this, R.raw.bacaan1_niatmagrib);
                mediaPlayer.start();            }
        });

        btnsound2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.release();
                showSlide.setImageResource(R.drawable.solat2_takbir);
                bacaan.setText(R.string.takbir);
                rukun.setText(R.string.tvtakbir);

                //mediaPlayer.release();
                mediaPlayer= MediaPlayer.create(magrib.this, R.raw.bacaan2_takbir);
                mediaPlayer.start();
            }
        });

        btnsound3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                showSlide.setImageResource(R.drawable.solat3_alfatihah);
                bacaan.setText(R.string.doaiftitah);
                rukun.setText(R.string.tviftitah);

                mediaPlayer.release();
                mediaPlayer= MediaPlayer.create(magrib.this, R.raw.bacaan3_iftitah);
                mediaPlayer.start();            }
        });

        btnsound4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                showSlide.setImageResource(R.drawable.solat3_alfatihah);
                bacaan.setText(R.string.alfatihah);
                rukun.setText(R.string.tvalfatihah);

                mediaPlayer.release();
                mediaPlayer= MediaPlayer.create(magrib.this, R.raw.bacaan1_alfatihah);
                mediaPlayer.start();            }
        });
        btnsound5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showSlide.setImageResource(R.drawable.solat4_rukuk);
                bacaan.setText(R.string.rukuk);
                rukun.setText(R.string.tvrukuk);
                mediaPlayer.release();
                mediaPlayer= MediaPlayer.create(magrib.this, R.raw.bacaan4_rukuk);
                mediaPlayer.start();
            }
        });


        btnsound6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.release();
                mediaPlayer= MediaPlayer.create(magrib.this, R.raw.bacaan5_iktidal);
                mediaPlayer.start();
                showSlide.setImageResource(R.drawable.solat1_berdiritegak);//iktidal
                bacaan.setText(R.string.iktidal);
                rukun.setText(R.string.tviktidal);
            }
        });

        //sujud
        btnsound7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showSlide.setImageResource(R.drawable.solat5_sujud);
                bacaan.setText(R.string.sujud);
                rukun.setText(R.string.tvsujud);

                mediaPlayer.release();
                mediaPlayer= MediaPlayer.create(magrib.this, R.raw.bacaan6_sujud);
                mediaPlayer.start();              }
        });

        //duduk antara dua sujud
        btnsound8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showSlide.setImageResource(R.drawable.solat6_duduk_a_2sujud);
                bacaan.setText(R.string.dudukantaraduasujud);
                rukun.setText(R.string.tvdudukantaraduasujud);

                mediaPlayer.release();
                mediaPlayer= MediaPlayer.create(magrib.this, R.raw.bacaan7_dudukads);
                mediaPlayer.start();              }
        });

        btnsound9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showSlide.setImageResource(R.drawable.solat5_sujud);
                bacaan.setText(R.string.sujud);
                rukun.setText(R.string.tvsujud);

                mediaPlayer.release();
                mediaPlayer= MediaPlayer.create(magrib.this, R.raw.bacaan6_sujud);
                mediaPlayer.start();              }
        });

        btnsound10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showSlide.setImageResource(R.drawable.solat3_alfatihah);
                bacaan.setText(R.string.alfatihah);
                rukun.setText(R.string.tvalfatihah);

                mediaPlayer.release();
                mediaPlayer= MediaPlayer.create(magrib.this, R.raw.bacaan1_alfatihah);
                mediaPlayer.start();              }
        });

        btnsound11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showSlide.setImageResource(R.drawable.solat4_rukuk);
                bacaan.setText(R.string.rukuk);
                rukun.setText(R.string.tvrukuk);

                mediaPlayer.release();
                mediaPlayer= MediaPlayer.create(magrib.this, R.raw.bacaan4_rukuk);
                mediaPlayer.start();              }
        });

        btnsound12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showSlide.setImageResource(R.drawable.berdiritegak);
                bacaan.setText(R.string.iktidal);
                rukun.setText(R.string.tviktidal);

                mediaPlayer.release();
                mediaPlayer= MediaPlayer.create(magrib.this, R.raw.bacaan5_iktidal);
                mediaPlayer.start();              }
        });

        btnsound13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showSlide.setImageResource(R.drawable.solat5_sujud);
                bacaan.setText(R.string.sujud);
                rukun.setText(R.string.tvsujud);

                mediaPlayer.release();
                mediaPlayer= MediaPlayer.create(magrib.this, R.raw.bacaan6_sujud);
                mediaPlayer.start();              }
        });

        btnsound14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showSlide.setImageResource(R.drawable.solat6_duduk_a_2sujud);
                bacaan.setText(R.string.dudukantaraduasujud);
                rukun.setText(R.string.tvdudukantaraduasujud);

                mediaPlayer.release();
                mediaPlayer= MediaPlayer.create(magrib.this, R.raw.bacaan7_dudukads);
                mediaPlayer.start();              }
        });

        btnsound15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showSlide.setImageResource(R.drawable.solat5_sujud);
                bacaan.setText(R.string.sujud);
                rukun.setText(R.string.tvsujud);
                mediaPlayer.release();
                mediaPlayer= MediaPlayer.create(magrib.this, R.raw.bacaan6_sujud);
                mediaPlayer.start();
            }
        });
        btnsound16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showSlide.setImageResource(R.drawable.solat6_tahiyat_awal);
                bacaan.setText(R.string.tahiyatawal);
                rukun.setText(R.string.tvtahiyatawal);

                mediaPlayer.release();
                mediaPlayer= MediaPlayer.create(magrib.this, R.raw.bacaan9_tahiyatakhir);
                mediaPlayer.start();
            }
        });
        btnsound17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showSlide.setImageResource(R.drawable.solat3_alfatihah);
                bacaan.setText(R.string.alfatihah);
                rukun.setText(R.string.tvalfatihah);

                mediaPlayer.release();
                mediaPlayer= MediaPlayer.create(magrib.this, R.raw.bacaan1_alfatihah);
                mediaPlayer.start();              }
        });
        btnsound18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showSlide.setImageResource(R.drawable.solat4_rukuk);
                bacaan.setText(R.string.rukuk);
                rukun.setText(R.string.tvrukuk);

                mediaPlayer.release();
                mediaPlayer= MediaPlayer.create(magrib.this, R.raw.bacaan4_rukuk);
                mediaPlayer.start();              }
        });
        btnsound19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showSlide.setImageResource(R.drawable.berdiritegak);
                bacaan.setText(R.string.iktidal);
                rukun.setText(R.string.tviktidal);

                mediaPlayer.release();
                mediaPlayer= MediaPlayer.create(magrib.this, R.raw.bacaan5_iktidal);
                mediaPlayer.start();              }
        });

        btnsound20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showSlide.setImageResource(R.drawable.solat5_sujud);
                bacaan.setText(R.string.sujud);
                rukun.setText(R.string.tvsujud);

                mediaPlayer.release();
                mediaPlayer= MediaPlayer.create(magrib.this, R.raw.bacaan6_sujud);
                mediaPlayer.start();              }
        });
        btnsound21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showSlide.setImageResource(R.drawable.solat6_duduk_a_2sujud);
                bacaan.setText(R.string.dudukantaraduasujud);
                rukun.setText(R.string.tvdudukantaraduasujud);

                mediaPlayer.release();
                mediaPlayer= MediaPlayer.create(magrib.this, R.raw.bacaan7_dudukads);
                mediaPlayer.start();              }
        });
        btnsound22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showSlide.setImageResource(R.drawable.solat5_sujud);
                bacaan.setText(R.string.sujud);
                rukun.setText(R.string.tvsujud);

                mediaPlayer.release();
                mediaPlayer= MediaPlayer.create(magrib.this, R.raw.bacaan6_sujud);
                mediaPlayer.start();              }
        });

        btnsound23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showSlide.setImageResource(R.drawable.solat7_tahiyat_akhir);
                bacaan.setText(R.string.tahiyatakhir);
                rukun.setText(R.string.tvtahiyatakhir);

                mediaPlayer.release();
                mediaPlayer= MediaPlayer.create(magrib.this, R.raw.bacaan9_tahiyatakhir);
                mediaPlayer.start();              }
        });
        btnsound24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showSlide.setImageResource(R.drawable.solat8_salam);
                bacaan.setText(R.string.salam);
                rukun.setText(R.string.tvsalam);

                mediaPlayer.release();
                mediaPlayer= MediaPlayer.create(magrib.this, R.raw.bacaan_salam);
                mediaPlayer.start();              }
        });

        //click sound
        final MediaPlayer clicksound = MediaPlayer.create(this, R.raw.clicksound);

        back=(ImageButton) findViewById(R.id.imgbtn_back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.release();

                clicksound.start();
                Intent intent=new Intent(magrib.this, MainActivity.class);
                startActivity(intent);
                clicksound.stop();
            }
        });

        btn_sound=findViewById(R.id.sound);
        btn_sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mediaPlayer.isPlaying()){
                    mediaPlayer.pause();
                }
                else{
                    mediaPlayer.start();
                }

            }
        });


    }




}