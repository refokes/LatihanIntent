package com.example.latihanintent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class intentact extends AppCompatActivity implements View.OnClickListener {
        @Override
        protected void onCreate(Bundle savedInstanceState){

            super.onCreate(savedInstanceState);
            setContentView(R.layout.intentact);

          Button  line2 = (Button) findViewById(R.id.line2);
          line2.setOnClickListener(this);

        }
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.line2:
                Intent explicit = new Intent(intentact.this, intentact2.class);
                startActivity(explicit);
                break;
            default:
                break;
        }
    }
}



