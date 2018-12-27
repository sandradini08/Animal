package com.example.animal;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnTentang,btnKeluar,btnMulai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //tombol tentang
        btnTentang = (Button) findViewById(R.id.btn_tentang);
        btnTentang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //memanggil alert
                showTentangDialog();
                //Dibawah merupakan kode inten pindah aktifitas dengan tombol
                //Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                //startActivity(intent);
            }
        });
        //tombol keluar
        btnKeluar = (Button) findViewById(R.id.btn_keluar);
        btnKeluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Memanggil AlertDialog
                showExitDialog();
            }
        });
        //tombol mulai
        btnMulai = (Button) findViewById(R.id.btn_mulai);
        btnMulai.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DaftarhewanActivity.class);
                startActivity(intent);
                finish();
            }
        }));
    }

    //pembuatan alert yang akan di panggil
    private void showTentangDialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this)
                .setMessage("Aplikasi tentang penjelasan hewan yang ada dibumi dilengkapi dengan gambar dan penjelasan")
                .setNegativeButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
        AlertDialog dialog = builder.create();
        dialog.show();
    }

    //pembuatan alert yang akan di panggil
    private void showExitDialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this)
                .setMessage("Yakin Ingin Keluar ?")
                .setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                })
                .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        finish();
                    }
                });
        AlertDialog dialog = builder.create();
        dialog.show();
    }
}
