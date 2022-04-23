package com.example.driveapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button navigateBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        navigateBtn = findViewById(R.id.navigateBtn);
        navigateBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Uri uri = Uri.parse("google.navigation:q=Montclair+State+University,+Montclair+New+Jersey");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW,uri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);
    }
}