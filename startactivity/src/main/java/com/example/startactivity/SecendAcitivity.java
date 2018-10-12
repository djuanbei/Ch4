package com.example.startactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SecendAcitivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secend_acitivity);
    }


    public void start(View source){

        Intent intent=new Intent(SecendAcitivity.this, MainActivity.class);
        startActivity(intent);
    }

    public void close(View source){
        Intent intent=new Intent(SecendAcitivity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
