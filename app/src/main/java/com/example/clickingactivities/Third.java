package com.example.clickingactivities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Third extends AppCompatActivity {
    Button buttonStartFirst;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third);

        getSupportActionBar().setTitle("Act Three");
        
        buttonStartFirst = findViewById(R.id.startActOne);

        buttonStartFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                intent = new Intent(Third.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
