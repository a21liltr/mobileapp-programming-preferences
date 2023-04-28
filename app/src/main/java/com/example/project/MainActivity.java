package com.example.project;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    private SharedPreferences myPreferenceRef;
    private SharedPreferences.Editor myPreferenceEditor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        SharedPreferences myPreferenceRef = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor myPreferenceEditor = myPreferenceRef.edit();

        TextView prefTextRef = findViewById(R.id.tv_output);
        prefTextRef.setText(myPreferenceRef.getString("MyAppPreferenceString", "No preference found."));


        // TODO: Launch SecondActivity

        // TODO: get data from shared preferences

        // SharedPreferences sharedPref = getActivity().getPreferences(Context.MODE_PRIVATE);
        // int defaultValue = getResources().getInteger(R.integer.saved_high_score_default_key);
        // int highScore = sharedPref.getInt(getString(R.string.saved_high_score_key), defaultValue);

    }

}
