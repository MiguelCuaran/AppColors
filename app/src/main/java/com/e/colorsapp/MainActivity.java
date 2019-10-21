package com.e.colorsapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.GenericArrayType;

public class MainActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener {

    private SeekBar sbRed = null, sbGreen = null, sbBlue = null, sbAlpha = null;
    private View vieColors;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sbRed = findViewById(R.id.sb_red);
        sbGreen = findViewById(R.id.sb_green);
        sbBlue = findViewById(R.id.sb_blue);
        sbAlpha = findViewById(R.id.sb_alpha);
        vieColors = findViewById(R.id.viewColor);

        registerForContextMenu(vieColors);

        sbRed.setOnSeekBarChangeListener(this);
        sbGreen.setOnSeekBarChangeListener(this);
        sbBlue.setOnSeekBarChangeListener(this);
        sbAlpha.setOnSeekBarChangeListener(this);


    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.colors_menu2, menu);

    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        switch (item.getItemId()) {
            case R.id.itRed:
                sbRed.setProgress(255);
                sbGreen.setProgress(0);
                sbBlue.setProgress(0);
                sbAlpha.setProgress(100);
                return true;
            case R.id.itGreen:
                sbRed.setProgress(0);
                sbGreen.setProgress(255);
                sbBlue.setProgress(0);
                sbAlpha.setProgress(100);
                return true;
            case R.id.itBlue:
                sbRed.setProgress(0);
                sbGreen.setProgress(0);
                sbBlue.setProgress(255);
                sbAlpha.setProgress(100);
                return true;
            case R.id.itYellow:

                sbRed.setProgress(255);
                sbGreen.setProgress(255);
                sbBlue.setProgress(0);
                sbAlpha.setProgress(100);
                return true;
            case R.id.itTransaparent:
                sbRed.setProgress(0);
                sbGreen.setProgress(0);
                sbBlue.setProgress(0);
                sbAlpha.setProgress(100);
                return true;
            case R.id.itMagenta:
                sbRed.setProgress(0);
                sbGreen.setProgress(255);
                sbBlue.setProgress(255);
                sbAlpha.setProgress(100);
                return true;
            case R.id.itsemiTransaparent:
                sbRed.setProgress(128);
                sbGreen.setProgress(0);
                sbBlue.setProgress(0);
                sbAlpha.setProgress(100);
                return true;
            case R.id.itCyan:
                sbRed.setProgress(0);
                sbGreen.setProgress(160);
                sbBlue.setProgress(227);
                sbAlpha.setProgress(100);
                return true;
            case R.id.itBrown:
                sbRed.setProgress(165);
                sbGreen.setProgress(42);
                sbBlue.setProgress(42);
                sbAlpha.setProgress(100);
                return true;
        }
        return super.onContextItemSelected(item);
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean bo) {
        int r = sbRed.getProgress();
        int g = sbGreen.getProgress();
        int b = sbBlue.getProgress();
        int a = sbAlpha.getProgress();

        int colorH = Color.argb(a, r, g, b);

        vieColors.setBackgroundColor(colorH);
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.colors_menu1, menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        switch (item.getItemId()) {
            case R.id.itRed:
                sbRed.setProgress(255);
                sbGreen.setProgress(0);
                sbBlue.setProgress(0);
                sbAlpha.setProgress(100);
                return true;
            case R.id.itGreen:
                sbRed.setProgress(0);
                sbGreen.setProgress(255);
                sbBlue.setProgress(0);
                sbAlpha.setProgress(100);
                return true;
            case R.id.itBlue:
                sbRed.setProgress(0);
                sbGreen.setProgress(0);
                sbBlue.setProgress(255);
                sbAlpha.setProgress(100);
                return true;
            case R.id.itYellow:

                sbRed.setProgress(255);
                sbGreen.setProgress(255);
                sbBlue.setProgress(0);
                sbAlpha.setProgress(100);
                return true;
            case R.id.itTransaparent:
                sbRed.setProgress(0);
                sbGreen.setProgress(0);
                sbBlue.setProgress(0);
                sbAlpha.setProgress(100);
                return true;
            case R.id.itMagenta:
                sbRed.setProgress(0);
                sbGreen.setProgress(255);
                sbBlue.setProgress(255);
                sbAlpha.setProgress(100);
                return true;
            case R.id.itsemiTransaparent:
                sbRed.setProgress(128);
                sbGreen.setProgress(0);
                sbBlue.setProgress(0);
                sbAlpha.setProgress(100);
                return true;
            case R.id.itCyan:
                sbRed.setProgress(0);
                sbGreen.setProgress(160);
                sbBlue.setProgress(227);
                sbAlpha.setProgress(100);
                return true;
            case R.id.itBrown:
                sbRed.setProgress(165);
                sbGreen.setProgress(42);
                sbBlue.setProgress(42);
                sbAlpha.setProgress(100);
                return true;
            case R.id.itAbout:
                Intent myIntent = new Intent(MainActivity.this, About.class);
                startActivity(myIntent);

                return true;


        }
        return super.onOptionsItemSelected(item);
    }


}
