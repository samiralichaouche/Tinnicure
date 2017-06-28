package com.example.tinnicure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;

public class Module6 extends AppCompatActivity {

    TextView text_view;
    TextView text_view_2;
    TextView text_view_3;
    ScrollView scroll_view;
    int page_number = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module6);
        text_view = (TextView) findViewById(R.id.text_view_mod6);
        text_view_2 = (TextView) findViewById(R.id.text_view_mod6_2);
        text_view_3 = (TextView) findViewById(R.id.textviewmod6_3);
        scroll_view = (ScrollView) findViewById(R.id.sv1);
        if (savedInstanceState != null) {
            page_number = Integer.parseInt(savedInstanceState.getString("NUM"));
            if (page_number == 1) {
                text_view.setText(getString(R.string.mod6pg13title));
                text_view_2.setText(R.string.mod6pg1);
                scroll_view.scrollTo(0,0);
                text_view_3.setText("1 of 10");
            }
            if (page_number == 2) {
                text_view.setText(getString(R.string.mod6pg13title));
                text_view_2.setText(R.string.mod6pg2);
                scroll_view.scrollTo(0,0);
                text_view_3.setText("2 of 10");
            }
            if (page_number == 3) {
                text_view.setText(getString(R.string.mod6pg13title));
                text_view_2.setText(R.string.mod6pg3);
                scroll_view.scrollTo(0,0);
                text_view_3.setText("3 of 10");
            }
            if (page_number == 4) {
                text_view.setText(getString(R.string.mod6pg45title));
                text_view_2.setText(R.string.mod6pg4);
                scroll_view.scrollTo(0,0);
                text_view_3.setText("4 of 10");
            }
            if (page_number == 5) {
                text_view.setText(getString(R.string.mod6pg45title));
                text_view_2.setText(R.string.mod6pg5);
                scroll_view.scrollTo(0,0);
                text_view_3.setText("5 of 10");
            }
            if (page_number == 6) {
                text_view.setText(getString(R.string.mod6pg67title));
                text_view_2.setText(R.string.mod6pg6);
                scroll_view.scrollTo(0,0);
                text_view_3.setText("6 of 10");
            }
            if (page_number == 7) {
                text_view.setText(getString(R.string.mod6pg67title));
                text_view_2.setText(R.string.mod6pg7);
                scroll_view.scrollTo(0,0);
                text_view_3.setText("7 of 10");
            }
            if (page_number == 8) {
                text_view.setText(getString(R.string.mod6pg89title));
                text_view_2.setText(R.string.mod6pg8);
                scroll_view.scrollTo(0,0);
                text_view_3.setText("8 of 10");
            }
            if (page_number == 9) {
                text_view.setText(getString(R.string.mod6pg89title));
                text_view_2.setText(R.string.mod6pg9);
                scroll_view.scrollTo(0,0);
                text_view_3.setText("9 of 10");
            }
            if (page_number == 10) {
                text_view.setText(getString(R.string.mod6pg10title));
                text_view_2.setText(R.string.mod6pg10);
                scroll_view.scrollTo(0,0);
                text_view_3.setText("10 of 10");
            }
        }
        else{
            page_number = 1;
            text_view.setText(getString(R.string.mod6pg13title));
            text_view_2.setText(R.string.mod6pg1);
            scroll_view.scrollTo(0,0);
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("NUM",Integer.toString(page_number));
    }

    public void mod6Back(View view) {
        page_number -= 1;
        if (page_number >= 0) {
            if (page_number == 0) {
                finish();
            }
            if (page_number == 1) {
                text_view.setText(getString(R.string.mod6pg13title));
                text_view_2.setText(R.string.mod6pg1);
                scroll_view.scrollTo(0,0);
                text_view_3.setText("1 of 10");
            }
            if (page_number == 2) {
                text_view.setText(getString(R.string.mod6pg13title));
                text_view_2.setText(R.string.mod6pg2);
                scroll_view.scrollTo(0,0);
                text_view_3.setText("2 of 10");
            }
            if (page_number == 3) {
                text_view.setText(getString(R.string.mod6pg13title));
                text_view_2.setText(R.string.mod6pg3);
                scroll_view.scrollTo(0,0);
                text_view_3.setText("3 of 10");
            }
            if (page_number == 4) {
                text_view.setText(getString(R.string.mod6pg45title));
                text_view_2.setText(R.string.mod6pg4);
                scroll_view.scrollTo(0,0);
                text_view_3.setText("4 of 10");
            }
            if (page_number == 5) {
                text_view.setText(getString(R.string.mod6pg45title));
                text_view_2.setText(R.string.mod6pg5);
                scroll_view.scrollTo(0,0);
                text_view_3.setText("5 of 10");
            }
            if (page_number == 6) {
                text_view.setText(getString(R.string.mod6pg67title));
                text_view_2.setText(R.string.mod6pg6);
                scroll_view.scrollTo(0,0);
                text_view_3.setText("6 of 10");
            }
            if (page_number == 7) {
                text_view.setText(getString(R.string.mod6pg67title));
                text_view_2.setText(R.string.mod6pg7);
                scroll_view.scrollTo(0,0);
                text_view_3.setText("7 of 10");
            }
            if (page_number == 8) {
                text_view.setText(getString(R.string.mod6pg89title));
                text_view_2.setText(R.string.mod6pg8);
                scroll_view.scrollTo(0,0);
                text_view_3.setText("8 of 10");
            }
            if (page_number == 9) {
                text_view.setText(getString(R.string.mod6pg89title));
                text_view_2.setText(R.string.mod6pg9);
                scroll_view.scrollTo(0,0);
                text_view_3.setText("9 of 10");
            }
        }
    }
    public void mod6Next(View view) {
        page_number += 1;
        if (page_number < 12) {
            if (page_number == 2) {
                text_view.setText(getString(R.string.mod6pg13title));
                text_view_2.setText(R.string.mod6pg2);
                scroll_view.scrollTo(0,0);
                text_view_3.setText("2 of 10");
            }
            if (page_number == 3) {
                text_view.setText(getString(R.string.mod6pg13title));
                text_view_2.setText(R.string.mod6pg3);
                scroll_view.scrollTo(0,0);
                text_view_3.setText("3 of 10");
            }
            if (page_number == 4) {
                text_view.setText(getString(R.string.mod6pg45title));
                text_view_2.setText(R.string.mod6pg4);
                scroll_view.scrollTo(0,0);
                text_view_3.setText("4 of 10");
            }
            if (page_number == 5) {
                text_view.setText(getString(R.string.mod6pg45title));
                text_view_2.setText(R.string.mod6pg5);
                scroll_view.scrollTo(0,0);
                text_view_3.setText("5 of 10");
            }
            if (page_number == 6) {
                text_view.setText(getString(R.string.mod6pg67title));
                text_view_2.setText(R.string.mod6pg6);
                scroll_view.scrollTo(0,0);
                text_view_3.setText("6 of 10");
            }
            if (page_number == 7) {
                text_view.setText(getString(R.string.mod6pg67title));
                text_view_2.setText(R.string.mod6pg7);
                scroll_view.scrollTo(0,0);
                text_view_3.setText("7 of 10");
            }
            if (page_number == 8) {
                text_view.setText(getString(R.string.mod6pg89title));
                text_view_2.setText(R.string.mod6pg8);
                scroll_view.scrollTo(0,0);
                text_view_3.setText("8 of 10");
            }
            if (page_number == 9) {
                text_view.setText(getString(R.string.mod6pg89title));
                text_view_2.setText(R.string.mod6pg9);
                scroll_view.scrollTo(0,0);
                text_view_3.setText("9 of 10");
            }
            if (page_number == 10) {
                text_view.setText(getString(R.string.mod6pg10title));
                text_view_2.setText(R.string.mod6pg10);
                scroll_view.scrollTo(0,0);
                text_view_3.setText("10 of 10");
            }
            if (page_number == 11){
                finish();
            }
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.mod6_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
        if (id == R.id.home_page) {
            finish();
            return true;
        }
        if (id == R.id.Page1) {
            page_number = 1;
            text_view.setText(getString(R.string.mod6pg13title));
            text_view_2.setText(R.string.mod6pg1);
            scroll_view.scrollTo(0,0);
            text_view_3.setText("1 of 10");
            return true;
        }
        if (id == R.id.Page2) {
            page_number = 2;
            text_view.setText(getString(R.string.mod6pg13title));
            text_view_2.setText(R.string.mod6pg2);
            scroll_view.scrollTo(0,0);
            text_view_3.setText("2 of 10");
            return true;
        }
        if (id == R.id.Page3){
            page_number = 3;
            text_view.setText(getString(R.string.mod6pg13title));
            text_view_2.setText(R.string.mod6pg3);
            scroll_view.scrollTo(0,0);
            text_view_3.setText("3 of 10");
            return true;
        }
        if (id == R.id.Page4){
            page_number = 4;
            text_view.setText(getString(R.string.mod6pg45title));
            text_view_2.setText(R.string.mod6pg4);
            scroll_view.scrollTo(0,0);
            text_view_3.setText("4 of 10");
            return true;
        }
        if (id == R.id.Page5){
            page_number = 5;
            text_view.setText(getString(R.string.mod6pg45title));
            text_view_2.setText(R.string.mod6pg5);
            scroll_view.scrollTo(0,0);
            text_view_3.setText("5 of 10");
            return true;
        }
        if (id == R.id.Page6){
            page_number = 6;
            text_view.setText(getString(R.string.mod6pg67title));
            text_view_2.setText(R.string.mod6pg6);
            scroll_view.scrollTo(0,0);
            text_view_3.setText("6 of 10");
            return true;
        }
        if (id == R.id.Page7){
            page_number = 7;
            text_view.setText(getString(R.string.mod6pg67title));
            text_view_2.setText(R.string.mod6pg7);
            scroll_view.scrollTo(0,0);
            text_view_3.setText("7 of 10");
            return true;
        }
        if (id == R.id.Page8){
            page_number = 8;
            text_view.setText(getString(R.string.mod6pg89title));
            text_view_2.setText(R.string.mod6pg8);
            scroll_view.scrollTo(0,0);
            text_view_3.setText("8 of 10");
            return true;
        }
        if (id == R.id.Page9){
            page_number = 9;
            text_view.setText(getString(R.string.mod6pg89title));
            text_view_2.setText(R.string.mod6pg9);
            scroll_view.scrollTo(0,0);
            text_view_3.setText("9 of 10");
            return true;
        }
        if (id == R.id.Page10){
            page_number = 10;
            text_view.setText(getString(R.string.mod6pg10title));
            text_view_2.setText(R.string.mod6pg10);
            scroll_view.scrollTo(0,0);
            text_view_3.setText("10 of 10");
            return true;
        }
        return super.onOptionsItemSelected(item);
    }



}
