package com.monse.android.a12stepstohappness;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openFirstStep(View view) {
        Intent i = new Intent(this, FirstActivity.class);
        startActivity(i);
    }

    public void openSecondStep(View view) {
        Intent i = new Intent(this, SecondActivity.class);
        startActivity(i);
    }
    }




