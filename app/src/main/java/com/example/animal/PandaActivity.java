package com.example.animal;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public class PandaActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_panda);
    }
    public void onBackPressed(){
        //memanggil alert dialog
        Intent intent = new Intent(PandaActivity.this, DaftarhewanActivity.class);
        startActivity(intent);
        finish();
    }
}
