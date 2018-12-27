package com.example.animal;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class DaftarhewanActivity extends AppCompatActivity {

    Button btnMacan, btnHarimau, btnPanda, btnKambing;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftarhewan);

        btnMacan = (Button) findViewById(R.id.btn_macan);
        btnMacan.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DaftarhewanActivity.this, MacanActivity.class);
                startActivity(intent);
                finish();
            }
        }));

        btnHarimau = (Button) findViewById(R.id.btn_harimau);
        btnHarimau.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DaftarhewanActivity.this, HarimauActivity.class);
                startActivity(intent);
                finish();
            }
        }));

        btnPanda = (Button) findViewById(R.id.btn_panda);
        btnPanda.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DaftarhewanActivity.this, PandaActivity.class);
                startActivity(intent);
                finish();
            }
        }));

        btnKambing = (Button) findViewById(R.id.btn_kambing);
        btnKambing.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DaftarhewanActivity.this, KambingActivity.class);
                startActivity(intent);
                finish();
            }
        }));
    }

    public void onBackPressed(){
        //memanggil alert dialog
        Intent intent = new Intent(DaftarhewanActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
