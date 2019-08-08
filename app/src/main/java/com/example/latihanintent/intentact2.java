package com.example.latihanintent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class intentact2 extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.intentact2);

        Button  line2 = (Button) findViewById(R.id.login1);
        line2.setOnClickListener(this);

    }
    @Override
    public void onClick(View view) {
                Intent explicit = new Intent(intentact2.this, intentact3.class);
                startActivity(explicit);
        }
    }




