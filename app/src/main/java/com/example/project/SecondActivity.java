package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // TODO: write data to shared preferences
        // use SharedPreferences sharedPref = getActivity().getPreferences(Context.MODE_PRIVATE);

        // write to shared preferences:
        // SharedPreferences sharedPref = getActivity().getPreferences(Context.MODE_PRIVATE);
        // SharedPreferences.Editor editor = sharedPref.edit();
        // editor.putInt(getString(R.string.saved_high_score_key), newHighScore);
        // editor.apply();
    }
}