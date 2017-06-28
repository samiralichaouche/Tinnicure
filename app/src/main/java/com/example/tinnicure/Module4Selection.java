package com.example.tinnicure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Module4Selection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module4_selection);
    }

    public void mod4_sel1_Click(View view){
        startActivity(new Intent(getApplicationContext(),Module4Part1.class));
    }

    public void mod4_sel2_Click(View view){
        startActivity(new Intent(getApplicationContext(),Module4Part2.class));
    }

}
