package com.example.emma.stretchlauncher;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class create_new_swim extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_new_swim);

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.stroke_array, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);

        // Resistance Level Spinner to select the amount of foam being used
        Spinner resistance_level_selection = (Spinner) findViewById(R.id.resistance_level_selection);
        // Create an ArrayAdapter using the string array to populate the spinner and a default spinner layout
        ArrayAdapter<CharSequence> adapter_resistance = ArrayAdapter.createFromResource(this,
                R.array.resistance_array, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        resistance_level_selection.setAdapter(adapter_resistance);
    }

    public void view_swim_pressed(View view){
        Intent view_swim_move = new Intent(this,display_swim.class);
        startActivity(view_swim_move);

    }
}
