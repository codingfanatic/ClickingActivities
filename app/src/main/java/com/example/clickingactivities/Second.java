package com.example.clickingactivities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Second extends AppCompatActivity {
    Button buttonStartThird;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);

        getSupportActionBar().setTitle("Act Two");

        buttonStartThird = findViewById(R.id.startActThree);

        buttonStartThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                intent = new Intent(Second.this, Third.class);
                startActivity(intent);
            }
        });
    }
}
