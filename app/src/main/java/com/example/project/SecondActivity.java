package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private SharedPreferences sharedPreferences;
    private final String key = String.valueOf(R.string.keyData);
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        sharedPreferences = getSharedPreferences(key, MODE_PRIVATE);

        button = findViewById(R.id.second_button_save);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                store();
                finish();
            }
        });
    }


    void store() {
        EditText input = findViewById(R.id.et_input);
        String data = input.getText().toString();
        SharedPreferences.Editor sharedPrefDataEditor = sharedPreferences.edit();
        sharedPrefDataEditor.putString(key, data);
        sharedPrefDataEditor.apply();
    }


}