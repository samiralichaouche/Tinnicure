package com.example.tinnicure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Module2Homework extends AppCompatActivity {

    TextView text_view;
    TextView text_view_2;
    int page_number = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module2_homework);
    }

    public void mod2Backhom2(View view) {
        text_view = (TextView) findViewById(R.id.text_view_mod2hom2);
        text_view_2 = (TextView) findViewById(R.id.text_view_mod2_2hom2);
        page_number -= 1;
        if (page_number >= 0) {
            if (page_number == 0) {
                finish();
            }
            if (page_number == 1) {
                text_view.setText("Week 2/4/7");
                text_view_2.setText(getString(R.string.mindful));
            }
            if (page_number == 2) {
                text_view.setText(R.string.mindful);
                text_view_2.setText(R.string.mindfulbreath);
            }
            if (page_number == 3){
                text_view.setText(R.string.homework);
                text_view_2.setText(R.string.mindfulhomework);
            }
        }
    }
    public void mod2Nexthom2(View view) {
        text_view = (TextView) findViewById(R.id.text_view_mod2hom2);
        text_view_2 = (TextView) findViewById(R.id.text_view_mod2_2hom2);
        page_number += 1;
        if (page_number < 5) {
            if (page_number == 2) {
                text_view.setText(R.string.mindful);
                text_view_2.setText(R.string.mindfulbreath);
            }
            if (page_number == 3){
                text_view.setText(R.string.homework);
                text_view_2.setText(R.string.mindfulhomework);
            }
            if (page_number == 4){
                startActivity(new Intent(getApplicationContext(),MindfulBreathing.class));
                finish();
            }
        }
    }
}
