package com.example.solattimefyp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class PermainanMini2 extends AppCompatActivity  {

    private TextView tvSoal, tvTime;
    private ImageButton btnSelanjutnya, btn_kembali;
    private RadioGroup rgPilihan;
    private RadioButton rbA, rbB, rbC, rbD;
    private ImageView ivImage;
    int nombor = 0;
    int score;
    int betul  = 0, salah = 0;
    MediaPlayer mediaPlayer;


    int gambar[] = new int[]{
            R.drawable.pberdiritegak,
            R.drawable.ptakbir,
            R.drawable.palfatihah,
            R.drawable.prukuk,
            R.drawable.psujud,
            R.drawable.pdudukantaraduasujud,
            R.drawable.ptahiyatawal,
            R.drawable.ptahiyatakhir,
            R.drawable.psalam,
            R.drawable.pberdiritegak
    };

    String Soal[] = new String[]{
            "Dibaca ketika berdiri tegak?",
            "Pergerakan ini ialah",
            "Surah wajib dibaca: ",
            "sebelum iktidal, kita perlu :",
            "Selepas iktidal, kita akan : ",
            "Apakah yang dilakukan?",
            "Dilakukan pada rakaat ke-dua",
            "Wajib berselawat keatas nabi",
            "Rukun solat terakhir",
            "Rukun pertama"
    };

    String Option[] = new String[]{

            "niat", "takbir","alfatihah","duduk antara dua sujud",
            "tahiyat awal", "takbir", "sujud", "tahiyat awal",
            "sujud", "salam", "tahiyat awal", "alfatihah",
            "duduk antara dua sujud","rukuk", "tahiyat akhir", "niat",
            "sujud", "tahiyat awal", "takbir" , "alfatihah",
            "sujud","duduk antara dua sujud","takbir", "alfatihah",
            "alfatihah", "tahiyat awal", "niat","sujud",
            "tahiyat akhir", "tahiyat awal","sujud", "rukuk",
            "alfatihah","niat","duduk antara dua sujud", "salam",
            "duduk antara dua sujud","berdiri tegak", "tahiyat akhir", "salam",



    };

    String jawapan[] = new String[]{
            "niat",
            "takbir",
            "alfatihah",
            "rukuk",
            "sujud",
            "duduk antara dua sujud",
            "tahiyat awal",
            "tahiyat akhir",
            "salam",
            "berdiri tegak"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_permainan_mini2);

        mediaPlayer=mediaPlayer.create(this,R.raw.gamesong);
        mediaPlayer.setLooping(true);
        mediaPlayer.start();

        btn_kembali=findViewById(R.id.btn_kembali);
        btn_kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(PermainanMini2.this,  menuUtamaPerempuan.class);
                startActivity(intent);
                mediaPlayer.release();
            }
        });

        tvSoal = findViewById(R.id.tvSoal);
        //tvTime = findViewById(R.id.tvTime);
        btnSelanjutnya = findViewById(R.id.btnSeterusnya);
        rbA = findViewById(R.id.rbA);
        rbB = findViewById(R.id.rbB);
        rbC = findViewById(R.id.rbC);
        rbD = findViewById(R.id.rbD);
        ivImage = findViewById(R.id.ivImage);

        rgPilihan = (RadioGroup) findViewById(R.id.rgPilihan);
        rgPilihan.check(0);
        tvSoal.setText(Soal[nombor]);
        rbA.setText(Option[0]);
        rbB.setText(Option[1]);
        rbC.setText(Option[2]);
        rbD.setText(Option[3]);

       /*new CountDownTimer(63000,  1000){

            @Override
            public void onTick(long millisUntilFinished) {
                tvTime.setText(millisUntilFinished / 1000 + "s");
            }

            @Override
            public void onFinish() {
                tvTime.setText("Waktu Tamat!!");
                score = betul * 10;
                Intent next = new Intent(getApplicationContext(), markah2.class);

                next.putExtra("nilai", score);
                next.putExtra("betul", betul);
                next.putExtra("salah", salah);
                mediaPlayer.release();
                startActivity(next);
            }
        }.start();*/

        btnSelanjutnya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rbA.isChecked() || rbB.isChecked() || rbC.isChecked() || rbD.isChecked()){

                    RadioButton Pilihan_User = findViewById(rgPilihan.getCheckedRadioButtonId());
                    String jawapan_User = Pilihan_User.getText().toString();
                    rgPilihan.check(0);

                    if (jawapan_User.equalsIgnoreCase(jawapan[nombor])){
                        betul++;
                    }else{
                        salah++;
                    }
                    nombor++;

                    if (nombor < Soal.length){

                        tvSoal.setText(Soal[nombor]);
                        ivImage.setImageResource(gambar[nombor]);

                        rbA.setText(Option[(nombor * 4 ) + 0]);
                        rbB.setText(Option[(nombor * 4 ) + 1]);
                        rbC.setText(Option[(nombor * 4 ) + 2]);
                        rbD.setText(Option[(nombor * 4 ) + 3]);

                    }else{
                        score = betul * 10;
                        Intent next = new Intent(getApplicationContext(), markah2.class);
                        next.putExtra("nilai", score);
                        next.putExtra("betul", betul);
                        next.putExtra("salah", salah);
                        mediaPlayer.release();
                        startActivity(next);
                    }
                } else{
                    Toast.makeText(PermainanMini2.this, "Sila Pilih Jawapan!",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}