package com.example.screens;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity2 extends AppCompatActivity {
    TextView name, number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        name = findViewById(R.id.set_name);
        number = findViewById(R.id.set_number);

        Bundle extras = getIntent().getExtras();
        if(extras != null){
            String name = extras.getString("name");
            int number = extras.getInt("number");

    }
        name.setText(extras.getString("name"));
        number.setText(String.valueOf(extras.getInt("number")));

    }

}
