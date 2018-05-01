package com.example.miriam.demoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class SecondActivity extends AppCompatActivity {

    public void fade(View view){
        ImageView uno = (ImageView) findViewById(R.id.imagen1);
        ImageView dos = (ImageView) findViewById(R.id.imagen2);

        uno.animate()
                .translationXBy(1000f)
                .translationYBy(1000f)
                .rotationBy(3600)
                .setDuration(2000);

                //.alpha(0f).setDuration(3000);
                dos.animate().alpha(1f).setDuration(3000);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
}