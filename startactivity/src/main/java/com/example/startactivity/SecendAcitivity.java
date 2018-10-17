package com.example.startactivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SecendAcitivity extends AppCompatActivity {


    Handler h=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            // ...
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secend_acitivity);
        h.postDelayed();
    }


    public void start(View source){
        Intent intent=new Intent(SecendAcitivity.this, MainActivity.class);
        startActivity(intent);
    }

    public void close(View source){
      //  Intent intent=new Intent(SecendAcitivity.this, MainActivity.class);
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.baidu.com"));
        startActivity(intent);
        finish();
    }
}
