package com.example.islamicapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class ConditionActivity extends AppCompatActivity {
    Toolbar toolbar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_condition);

        toolbar=findViewById(R.id.ToolbarView);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("      TERMS & CONDITION");
        toolbar.setTitleTextColor(getResources().getColor(R.color.textColor));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



    }
}
