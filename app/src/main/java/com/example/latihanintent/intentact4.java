package com.example.latihanintent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class intentact4 extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.intentact4);

        Button  line3 = (Button) findViewById(R.id.line3);
        line3.setOnClickListener(this);

    }
    @Override
    public void onClick(View view) {
        Intent explicit = new Intent(intentact4.this, intentact5.class);
        startActivity(explicit);

    }
}



