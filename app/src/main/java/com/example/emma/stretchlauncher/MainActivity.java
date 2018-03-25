package com.example.emma.stretchlauncher;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void new_swim_pressed(View view){
        Intent new_swim_move = new Intent(this,create_new_swim.class);
        startActivity(new_swim_move);

    }
}
