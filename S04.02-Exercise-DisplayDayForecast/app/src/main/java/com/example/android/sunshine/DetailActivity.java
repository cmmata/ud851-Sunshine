package com.example.android.sunshine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private static final String FORECAST_SHARE_HASHTAG = " #SunshineApp";
    private TextView mWeatherValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        mWeatherValue = (TextView) findViewById(R.id.tv_weather_value);

        // DONE (2) Display the weather forecast that was passed from MainActivity
        if (getIntent().hasExtra(Intent.EXTRA_TEXT)) {
            String weatherValue = getIntent().getStringExtra(Intent.EXTRA_TEXT);
            mWeatherValue.setText(weatherValue);
        }
    }
}