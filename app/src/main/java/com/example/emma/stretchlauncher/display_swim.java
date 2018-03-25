package com.example.emma.stretchlauncher;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class display_swim extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_swim);

    }

    public void enlarge_current(View view){
        Intent enlarge_current_view = new Intent(this, current_Swim_enlarged.class);
        startActivity(enlarge_current_view);
    }
}
