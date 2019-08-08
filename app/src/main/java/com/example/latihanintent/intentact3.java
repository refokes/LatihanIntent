package com.example.latihanintent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class intentact3 extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.intentact3);

        Button  line3 = (Button) findViewById(R.id.login);
        line3.setOnClickListener(this);

    }
    @Override
    public void onClick(View view) {
                Intent explicit = new Intent(intentact3.this, intentact4.class);
                startActivity(explicit);

    }
}



