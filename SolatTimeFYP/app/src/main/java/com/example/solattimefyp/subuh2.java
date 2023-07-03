package com.example.solattimefyp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class subuh2 extends AppCompatActivity  {

    ImageButton back,show,btn_sound;
    MediaPlayer mediaPlayer;
    ImageView showSlide;
    TextView bacaan, rukun,tvlabelsolat;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subuh2);

        mediaPlayer= MediaPlayer.create(this, R.raw.sample);
        mediaPlayer.start();

        showSlide=(ImageView) findViewById(R.id.showslide);
        show= (ImageButton)findViewById(R.id.btn_niat);
        show=(ImageButton) findViewById(R.id.btn_takbir);
        bacaan = (TextView) findViewById(R.id.tv_bacaan);
        rukun=(TextView) findViewById(R.id.tv_label);
        tvlabelsolat=(TextView)findViewById((R.id.tvlabelsolat));
        tvlabelsolat.setText("SOLAT SUBUH");

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

        //assign button to image view
        ImageButton btnsound1=(ImageButton) this.findViewById(R.id.btn_niat);
        ImageButton btnsound2=(ImageButton) this.findViewById(R.id.btn_takbir);
        ImageButton btnsound3=(ImageButton) this.findViewById(R.id.btn_iftitah);
        ImageButton btnsound=(ImageButton) this.findViewById(R.id.btn_alfatihah);
        ImageButton btnsound4=(ImageButton) this.findViewById(R.id.btn_rukuk1);
        ImageButton btnsound5=(ImageButton) this.findViewById(R.id.btn_iktidal1);
        ImageButton btnsound6=(ImageButton) this.findViewById(R.id.btn_sujud1);
        ImageButton btnsound7=(ImageButton) this.findViewById(R.id.btn_duduk1);
        ImageButton btnsound8=(ImageButton) this.findViewById(R.id.btn_sujud12);
        ImageButton btnsound9=(ImageButton) this.findViewById(R.id.btn_alfatihah2);
        ImageButton btnsound10=(ImageButton) this.findViewById(R.id.btn_rukuk2);
        ImageButton btnsound22=(ImageButton) this.findViewById(R.id.btn_iktidal2);

        ImageButton btnsound11=(ImageButton) this.findViewById(R.id.btn_qunut);
        ImageButton btnsound12=(ImageButton) this.findViewById(R.id.btn_sujud2);
        ImageButton btnsound13=(ImageButton) this.findViewById(R.id.btn_duduk2);
        ImageButton btnsound14=(ImageButton) this.findViewById(R.id.btn_sujud22);
        ImageButton btnsound15=(ImageButton) this.findViewById(R.id.btn_tahiyatakhir);
        ImageButton btnsound16=(ImageButton) this.findViewById(R.id.btn_salam);
        //ImageButton btnsoundIftitah=(ImageButton) this.findViewById(R.id.btn_iftitah);

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

                showSlide.setImageResource(R.drawable.pberdiritegak);
                bacaan.setText(R.string.niatSubuh);
                rukun.setText(R.string.tvniat);


                mediaPlayer.release();
                mediaPlayer= MediaPlayer.create(subuh2.this, R.raw.bacaan1_niatsubuh);
                mediaPlayer.start();            }
        });

        btnsound2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.release();
                showSlide.setImageResource(R.drawable.ptakbir);
                bacaan.setText(R.string.takbir);
                rukun.setText(R.string.tvtakbir);

                //mediaPlayer.release();
                mediaPlayer= MediaPlayer.create(subuh2.this, R.raw.bacaan2_takbir);
                mediaPlayer.start();
            }
        });

        btnsound3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                showSlide.setImageResource(R.drawable.palfatihah);
                bacaan.setText(R.string.doaiftitah);
                rukun.setText(R.string.tviftitah);

                mediaPlayer.release();
                mediaPlayer= MediaPlayer.create(subuh2.this, R.raw.bacaan3_iftitah);
                mediaPlayer.start();            }
        });

        btnsound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                showSlide.setImageResource(R.drawable.palfatihah);
                bacaan.setText(R.string.alfatihah);
                rukun.setText(R.string.tvalfatihah);

                mediaPlayer.release();
                mediaPlayer= MediaPlayer.create(subuh2.this, R.raw.bacaan1_alfatihah);
                mediaPlayer.start();            }
        });
        btnsound4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showSlide.setImageResource(R.drawable.prukuk);
                bacaan.setText(R.string.rukuk);
                rukun.setText(R.string.tvrukuk);
                mediaPlayer.release();
                mediaPlayer= MediaPlayer.create(subuh2.this, R.raw.bacaan4_rukuk);
                mediaPlayer.start();
            }
        });


        btnsound5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.release();
                mediaPlayer= MediaPlayer.create(subuh2.this, R.raw.bacaan5_iktidal);
                mediaPlayer.start();
                showSlide.setImageResource(R.drawable.pberdiritegak);//iktidal
                bacaan.setText(R.string.iktidal);
                rukun.setText(R.string.tviktidal);
            }
        });

        //sujud
        btnsound6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showSlide.setImageResource(R.drawable.psujud);
                bacaan.setText(R.string.sujud);
                rukun.setText(R.string.tvsujud);

                mediaPlayer.release();
                mediaPlayer= MediaPlayer.create(subuh2.this, R.raw.bacaan6_sujud);
                mediaPlayer.start();              }
        });

        //duduk antara dua sujud
        btnsound7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showSlide.setImageResource(R.drawable.pdudukantaraduasujud);
                bacaan.setText(R.string.dudukantaraduasujud);
                rukun.setText(R.string.tvdudukantaraduasujud);

                mediaPlayer.release();
                mediaPlayer= MediaPlayer.create(subuh2.this, R.raw.bacaan7_dudukads);
                mediaPlayer.start();              }
        });

        btnsound8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showSlide.setImageResource(R.drawable.psujud);
                bacaan.setText(R.string.sujud);
                rukun.setText(R.string.tvsujud);

                mediaPlayer.release();
                mediaPlayer= MediaPlayer.create(subuh2.this, R.raw.bacaan6_sujud);
                mediaPlayer.start();              }
        });

        btnsound9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showSlide.setImageResource(R.drawable.palfatihah);
                bacaan.setText(R.string.alfatihah);
                rukun.setText(R.string.tvalfatihah);

                mediaPlayer.release();
                mediaPlayer= MediaPlayer.create(subuh2.this, R.raw.bacaan1_alfatihah);
                mediaPlayer.start();              }
        });

        btnsound10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showSlide.setImageResource(R.drawable.prukuk);
                bacaan.setText(R.string.rukuk);
                rukun.setText(R.string.tvrukuk);

                mediaPlayer.release();
                mediaPlayer= MediaPlayer.create(subuh2.this, R.raw.bacaan4_rukuk);
                mediaPlayer.start();              }
        });

        btnsound11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showSlide.setImageResource(R.drawable.pqunut);
                bacaan.setText(R.string.qunut);
                rukun.setText(R.string.tvqunut);

                mediaPlayer.release();
                mediaPlayer= MediaPlayer.create(subuh2.this, R.raw.bacaan10_qunut);
                mediaPlayer.start();              }
        });

        btnsound12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showSlide.setImageResource(R.drawable.psujud);
                bacaan.setText(R.string.sujud);
                rukun.setText(R.string.tvsujud);

                mediaPlayer.release();
                mediaPlayer= MediaPlayer.create(subuh2.this, R.raw.bacaan6_sujud);
                mediaPlayer.start();              }
        });

        btnsound13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showSlide.setImageResource(R.drawable.pdudukantaraduasujud);
                bacaan.setText(R.string.dudukantaraduasujud);
                rukun.setText(R.string.tvdudukantaraduasujud);

                mediaPlayer.release();
                mediaPlayer= MediaPlayer.create(subuh2.this, R.raw.bacaan6_sujud);
                mediaPlayer.start();              }
        });

        btnsound14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showSlide.setImageResource(R.drawable.psujud);
                bacaan.setText(R.string.sujud);
                rukun.setText(R.string.tvsujud);
                mediaPlayer.release();
                mediaPlayer= MediaPlayer.create(subuh2.this, R.raw.bacaan6_sujud);
                mediaPlayer.start();
            }
        });
        btnsound15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showSlide.setImageResource(R.drawable.ptahiyatakhir);
                bacaan.setText(R.string.tahiyatakhir);
                rukun.setText(R.string.tvtahiyatakhir);

                mediaPlayer.release();
                mediaPlayer= MediaPlayer.create(subuh2.this, R.raw.bacaan9_tahiyatakhir);
                mediaPlayer.start();
            }
        });
        btnsound16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showSlide.setImageResource(R.drawable.psalam);
                bacaan.setText(R.string.salam);
                rukun.setText(R.string.tvsalam);

                mediaPlayer.release();
                mediaPlayer= MediaPlayer.create(subuh2.this, R.raw.bacaan_salam);
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
                Intent intent=new Intent(subuh2.this, MainActivity2.class);
                startActivity(intent);
                clicksound.stop();
            }
        });



    }



}