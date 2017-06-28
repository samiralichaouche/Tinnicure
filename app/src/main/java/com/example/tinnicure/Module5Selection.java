package com.example.tinnicure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Module5Selection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module5_selection);
    }

    public void mod5_sel1_Click(View view){
        startActivity(new Intent(getApplicationContext(),Module5Part1.class));
    }

}
