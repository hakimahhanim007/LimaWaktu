package com.example.solattimefyp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class HasilKuis extends AppCompatActivity {

    private TextView tvNilai, tvMessage,tvHasil,tvmarkahtertinggi;
    private ImageButton btnUlang,btnhome;
    private ImageView star;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_kuis);

        tvNilai = findViewById(R.id.tvNilai);
        tvMessage = findViewById(R.id.tvMessage);
        btnhome=findViewById(R.id.home_btn);
        btnUlang = findViewById(R.id.btnUlang);
        //tvHasil = findViewById(R.id.tvmarkahtertinggi);
        star = findViewById(R.id.star);
        tvmarkahtertinggi=findViewById(R.id.highestScore);

        int nilai = getIntent().getExtras().getInt("nilai");
        int betul = getIntent().getExtras().getInt("betul");
        int salah = getIntent().getExtras().getInt("salah");

        tvMessage.setText("Jawapan betul: " + betul +" , "+ "Jawapan Salah: " + salah);
        tvNilai.setText(String.valueOf(nilai));

        nilai=getIntent().getIntExtra("nilai",0);

        SharedPreferences settings = getSharedPreferences("GAME_DATA", Context.MODE_PRIVATE);
        int highScore = settings.getInt("HIGH_SCORE", 0);

        if (nilai>highScore){
            tvmarkahtertinggi.setText("Markah Tertinggi : "+nilai);

            SharedPreferences.Editor editor = settings.edit();
            editor.putInt("HIGH_SCORE",nilai);
            editor.commit();
        }else{
            tvmarkahtertinggi.setText("Markah Tertinggi : " + highScore);
        }

        if (nilai == 100){
            star.setImageResource(R.drawable.star5);
        }else if (nilai >= 80){
            star.setImageResource(R.drawable.star4);

        }else if (nilai >= 60 ){
            star.setImageResource(R.drawable.star3);

        }else if (nilai >= 40){
            star.setImageResource(R.drawable.star2);

        }else if (nilai >= 20){
            star.setImageResource(R.drawable.star);

        }

        btnUlang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                Intent back = new Intent(getApplicationContext(), MenuPermainanMini.class);
                startActivity(back);
            }
        });

        btnhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                Intent back = new Intent(getApplicationContext(), menuUtama2.class);
                startActivity(back);
            }
        });


    }
}