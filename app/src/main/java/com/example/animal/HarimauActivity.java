package com.example.animal;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public class HarimauActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_harimau);

    }

    public void onBackPressed(){
        //memanggil alert dialog
        Intent intent = new Intent(HarimauActivity.this, DaftarhewanActivity.class);
        startActivity(intent);
        finish();
    }
}
