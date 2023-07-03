package com.example.solattimefyp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    TextView date,  waktuSubuh,  waktuZohor, waktuAsar, waktuMaghrib, waktuIsyak,  timeSubuh,  timeZohor, timeAsar, timeMaghrib, timeIsyak;
    WaktuSolatJakimService waktuSolatJakimService;

    ImageButton btn_subuh, btn_zuhur, btn_asar, btn_magrib, btn_isyak, ib_home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final MediaPlayer bunyi = MediaPlayer.create(this, R.raw.clicksound);

        ib_home=findViewById(R.id.ib_home);
        ib_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bunyi.start();
                Intent intent = new Intent(MainActivity2.this, menuUtamaPerempuan.class);
                startActivity(intent);
                bunyi.stop();

            }
        });


        btn_subuh=findViewById(R.id.btn_subuh);
        btn_subuh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bunyi.start();
                Intent intent = new Intent(MainActivity2.this, subuh2.class);
                startActivity(intent);
                bunyi.stop();

            }
        });
        btn_zuhur=findViewById(R.id.btn_zuhur);
        btn_zuhur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bunyi.start();
                Intent intent = new Intent(MainActivity2.this, zohor2.class);
                startActivity(intent);
                bunyi.stop();

            }
        });
        btn_asar=findViewById(R.id.btn_asar);
        btn_asar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bunyi.start();
                Intent intent = new Intent(MainActivity2.this, asar2.class);
                startActivity(intent);
                bunyi.stop();

            }
        });
        btn_magrib=findViewById(R.id.btn_magrib);
        btn_magrib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bunyi.start();
                Intent intent = new Intent(MainActivity2.this, magrib2.class);
                startActivity(intent);
                bunyi.stop();

            }
        });
        btn_isyak=findViewById(R.id.btn_isyak);
        btn_isyak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bunyi.start();
                Intent intent = new Intent(MainActivity2.this, isyak2.class);
                startActivity(intent);
                bunyi.stop();

            }
        });

        date = findViewById(R.id.date);
        waktuSubuh = findViewById(R.id.waktu_subuh);
        waktuZohor = findViewById(R.id.waktu_zohor);
        waktuAsar = findViewById(R.id.waktu_asar);
        waktuMaghrib = findViewById(R.id.waktu_maghrib);
        waktuIsyak = findViewById(R.id.waktu_isyak);
        timeSubuh = findViewById(R.id.time_subuh);
        timeZohor = findViewById(R.id.time_zohor);
        timeAsar = findViewById(R.id.time_asar);
        timeMaghrib = findViewById(R.id.time_maghrib);
        timeIsyak = findViewById(R.id.time_isyak);

        waktuSolatJakimService = new WaktuSolatJakimService(this);

        waktuSolatJakimService.getWaktuSolat(new WaktuSolatListCallback() {
            @Override
            public void onSuccess(WaktuSolatList waktuSolatList) {

                date.setText(waktuSolatList.date);
                waktuSubuh.setText(waktuSolatList.waktuSolatDetailArrayList.get(1).title);
                waktuZohor.setText(waktuSolatList.waktuSolatDetailArrayList.get(3).title);
                waktuAsar.setText(waktuSolatList.waktuSolatDetailArrayList.get(4).title);
                waktuMaghrib.setText(waktuSolatList.waktuSolatDetailArrayList.get(5).title);
                waktuIsyak.setText(waktuSolatList.waktuSolatDetailArrayList.get(6).title);
                timeSubuh.setText(waktuSolatList.waktuSolatDetailArrayList.get(1).description);
                timeZohor.setText(waktuSolatList.waktuSolatDetailArrayList.get(3).description);
                timeAsar.setText(waktuSolatList.waktuSolatDetailArrayList.get(4).description);
                timeMaghrib.setText(waktuSolatList.waktuSolatDetailArrayList.get(5).description);
                timeIsyak.setText(waktuSolatList.waktuSolatDetailArrayList.get(6).description);
            }

            @Override
            public void onFailure(Message message) {
                Toast.makeText(getApplicationContext(), message.message, Toast.LENGTH_SHORT).show();
            }
        });
    }
}