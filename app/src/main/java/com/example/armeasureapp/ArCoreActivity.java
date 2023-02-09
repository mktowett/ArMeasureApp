package com.example.armeasureapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.ar.sceneform.FrameTime;
import com.google.ar.sceneform.Scene;

public class ArCoreActivity extends AppCompatActivity implements Scene.OnUpdateListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ar_core);
    }

    @Override
    public void onUpdate(FrameTime frameTime) {

    }
}