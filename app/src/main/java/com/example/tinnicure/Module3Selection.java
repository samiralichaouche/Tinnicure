package com.example.tinnicure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Module3Selection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module3_selection);
    }

    public void mod3_1(View view){
        startActivity(new Intent(getApplicationContext(),Module3Part2.class));
    }

    public void mod3_sel2_click(View view){
        startActivity(new Intent(getApplicationContext(),Module3Part1.class));
    }

}
