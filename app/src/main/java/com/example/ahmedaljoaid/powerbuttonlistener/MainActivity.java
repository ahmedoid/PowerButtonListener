package com.example.ahmedaljoaid.powerbuttonlistener;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.ahmedaljoaid.powerbuttonlistener.services.ScreenOnOffService;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent i0 = new Intent(this,ScreenOnOffService.class);
        i0.setAction("com.example.ahmedaljoaid.powerbuttonlistener.services.ScreenOnOffService");
        startService(i0);
    }
}
