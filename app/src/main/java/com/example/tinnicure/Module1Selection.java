package com.example.tinnicure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Module1Selection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module1_selection);
    }

    public void mod1_sel1_Click(View view){
        startActivity(new Intent(getApplicationContext(),Module1Part1.class));
    }

    public void mod1_sel2_click(View view){
        startActivity(new Intent(getApplicationContext(),Module1Part2.class));
    }
}
