package com.example.cryptocurrencyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class IntroActivity extends AppCompatActivity {
    private ImageView goBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);  
        
        initView();
        setVariable();
        
    }

    private void initView() {
        goBtn=findViewById(R.id.goBtn);

    }
    private void setVariable(){
        goBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(IntroActivity.this,LoginActivity.class));


            }
        });
    }
}