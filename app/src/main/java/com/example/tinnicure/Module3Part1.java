package com.example.tinnicure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class Module3Part1 extends AppCompatActivity {

    TextView text_view;
    TextView text_view_2;
    TextView text_view_3;
    int page_number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module3_part1);
        text_view = (TextView) findViewById(R.id.text_view_mod3pt2);
        text_view_2 = (TextView) findViewById(R.id.text_view_mod3pt2_2);
        text_view_3 = (TextView) findViewById(R.id.text_view_mod3pt2_3);
        if (savedInstanceState != null) {
            page_number = Integer.parseInt(savedInstanceState.getString("NUM"));
            if (page_number == 1) {
                text_view.setText(getString(R.string.mod3pt1pg1title));
                text_view_2.setText(getString(R.string.mod3pt1pg1));
                text_view_3.setText("1 of 26");
            }
            if (page_number == 2){
                page_number = 2;
                text_view.setText(getString(R.string.mod3pt1pg2title));
                text_view_2.setText(getString(R.string.mod3pt1pg2));
                text_view_3.setText("2 of 26");
            }
            if (page_number == 3){
                page_number = 3;
                text_view.setText(getString(R.string.mod3pt1pg3title));
                text_view_2.setText(getString(R.string.mod3pt1pg3));
                text_view_3.setText("3 of 26");
            }
            if (page_number == 4){
                page_number = 4;
                text_view.setText(getString(R.string.mod3pt1pg4title));
                text_view_2.setText(getString(R.string.mod3pt1pg4));
                text_view_3.setText("4 of 26");
            }
            if (page_number == 5){
                page_number = 5;
                text_view.setText(getString(R.string.mod3pt1pg5title));
                text_view_2.setText(getString(R.string.mod3pt1pg5));
                text_view_3.setText("5 of 26");
            }
            if (page_number == 6){
                page_number = 6;
                text_view.setText(getString(R.string.mod3pt1pg6title));
                text_view_2.setText(getString(R.string.mod3pt1pg6));
                text_view_3.setText("6 of 26");
            }
            if (page_number == 7){
                page_number = 7;
                text_view.setText(getString(R.string.mod3pt1pg7title));
                text_view_2.setText(getString(R.string.mod3pt1pg7));
                text_view_3.setText("7 of 26");
            }
            if (page_number == 8){
                page_number = 8;
                text_view.setText(getString(R.string.mod3pt1pg8title));
                text_view_2.setText(getString(R.string.mod3pt1pg8));
                text_view_3.setText("8 of 26");
            }
            if (page_number == 9){
                page_number = 9;
                text_view.setText(getString(R.string.mod3pt1pg9title));
                text_view_2.setText(getString(R.string.mod3pt1pg9));
                text_view_3.setText("9 of 26");
            }
            if (page_number == 10){
                page_number = 10;
                text_view.setText(getString(R.string.mod3pt1pg10title));
                text_view_2.setText(getString(R.string.mod3pt1pg10));
                text_view_3.setText("10 of 26");
            }
            if (page_number == 11){
                page_number = 11;
                text_view.setText(getString(R.string.mod3pt1pg11title));
                text_view_2.setText(getString(R.string.mod3pt1pg11));
                text_view_3.setText("11 of 26");
            }
            if (page_number == 12){
                page_number = 12;
                text_view.setText(getString(R.string.mod3pt1pg1215title));
                text_view_2.setText(getString(R.string.mod3pt1pg12));
                text_view_3.setText("12 of 26");
            }
            if (page_number == 13){
                page_number = 13;
                text_view.setText(getString(R.string.mod3pt1pg1215title));
                text_view_2.setText(getString(R.string.mod3pt1pg13));
                text_view_3.setText("13 of 26");
            }
            if (page_number == 14){
                page_number = 14;
                text_view.setText(getString(R.string.mod3pt1pg1215title));
                text_view_2.setText(getString(R.string.mod3pt1pg14));
                text_view_3.setText("14 of 26");
            }
            if (page_number == 15){
                page_number = 15;
                text_view.setText(getString(R.string.mod3pt1pg1215title));
                text_view_2.setText(getString(R.string.mod3pt1pg15));
                text_view_3.setText("15 of 26");
            }
            if (page_number == 16){
                page_number = 16;
                text_view.setText(getString(R.string.mod3pt1pg1623title));
                text_view_2.setText(getString(R.string.mod3pt1pg16));
                text_view_3.setText("16 of 26");
            }
            if (page_number == 17){
                page_number = 17;
                text_view.setText(getString(R.string.mod3pt1pg1623title));
                text_view_2.setText(getString(R.string.mod3pt1pg17));
                text_view_3.setText("17 of 26");
            }
            if (page_number == 18){
                page_number = 18;
                text_view.setText(getString(R.string.mod3pt1pg1623title));
                text_view_2.setText(getString(R.string.mod3pt1pg18));
                text_view_3.setText("18 of 26");
            }
            if (page_number == 19){
                page_number = 19;
                text_view.setText(getString(R.string.mod3pt1pg1623title));
                text_view_2.setText(getString(R.string.mod3pt1pg19));
                text_view_3.setText("19 of 26");
            }
            if (page_number == 20){
                page_number = 20;
                text_view.setText(getString(R.string.mod3pt1pg1623title));
                text_view_2.setText(getString(R.string.mod3pt1pg20));
                text_view_3.setText("20 of 26");
            }
            if (page_number == 21){
                page_number = 21;
                text_view.setText(getString(R.string.mod3pt1pg1623title));
                text_view_2.setText(getString(R.string.mod3pt1pg21));
                text_view_3.setText("21 of 26");
            }
            if (page_number == 22){
                page_number = 22;
                text_view.setText(getString(R.string.mod3pt1pg1623title));
                text_view_2.setText(getString(R.string.mod3pt1pg22));
                text_view_3.setText("22 of 26");
            }
            if (page_number == 23){
                page_number = 23;
                text_view.setText(getString(R.string.mod3pt1pg1623title));
                text_view_2.setText(getString(R.string.mod3pt1pg23));
                text_view_3.setText("23 of 26");
            }
            if (page_number == 24){
                page_number = 24;
                text_view.setText(getString(R.string.mod3pt1pg24title));
                text_view_2.setText(getString(R.string.mod3pt1pg24));
                text_view_3.setText("24 of 26");
            }
            if (page_number == 25){
                page_number = 25;
                text_view.setText(getString(R.string.mod3pt1pg25title));
                text_view_2.setText(getString(R.string.mod3pt1pg25));
                text_view_3.setText("25 of 26");
            }
            if (page_number == 26){
                page_number = 26;
                text_view.setText(getString(R.string.mod3pt1pg26title));
                text_view_2.setText(getString(R.string.mod3pt1pg26));
                text_view_3.setText("26 of 26");
            }
        }
        else{
            page_number = 1;
            text_view.setText(getString(R.string.mod3pt1pg1title));
            text_view_2.setText(getString(R.string.mod3pt1pg1));
            text_view_3.setText("1 of 26");
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("NUM",Integer.toString(page_number));
    }

    public void mod3Back(View view) {
        page_number -= 1;
        if (page_number >= 0){
            if (page_number == 0){
                finish();
            }
            if (page_number == 1){
                page_number = 1;
                text_view.setText(getString(R.string.mod3pt1pg1title));
                text_view_2.setText(getString(R.string.mod3pt1pg1));
                text_view_3.setText("1 of 26");
            }
            if (page_number == 2){
                page_number = 2;
                text_view.setText(getString(R.string.mod3pt1pg2title));
                text_view_2.setText(getString(R.string.mod3pt1pg2));
                text_view_3.setText("2 of 26");
            }
            if (page_number == 3){
                page_number = 3;
                text_view.setText(getString(R.string.mod3pt1pg3title));
                text_view_2.setText(getString(R.string.mod3pt1pg3));
                text_view_3.setText("3 of 26");
            }
            if (page_number == 4){
                page_number = 4;
                text_view.setText(getString(R.string.mod3pt1pg4title));
                text_view_2.setText(getString(R.string.mod3pt1pg4));
                text_view_3.setText("4 of 26");
            }
            if (page_number == 5){
                page_number = 5;
                text_view.setText(getString(R.string.mod3pt1pg5title));
                text_view_2.setText(getString(R.string.mod3pt1pg5));
                text_view_3.setText("5 of 26");
            }
            if (page_number == 6){
                page_number = 6;
                text_view.setText(getString(R.string.mod3pt1pg6title));
                text_view_2.setText(getString(R.string.mod3pt1pg6));
                text_view_3.setText("6 of 26");
            }
            if (page_number == 7){
                page_number = 7;
                text_view.setText(getString(R.string.mod3pt1pg7title));
                text_view_2.setText(getString(R.string.mod3pt1pg7));
                text_view_3.setText("7 of 26");
            }
            if (page_number == 8){
                page_number = 8;
                text_view.setText(getString(R.string.mod3pt1pg8title));
                text_view_2.setText(getString(R.string.mod3pt1pg8));
                text_view_3.setText("8 of 26");
            }
            if (page_number == 9){
                page_number = 9;
                text_view.setText(getString(R.string.mod3pt1pg9title));
                text_view_2.setText(getString(R.string.mod3pt1pg9));
                text_view_3.setText("9 of 26");
            }
            if (page_number == 10){
                page_number = 10;
                text_view.setText(getString(R.string.mod3pt1pg10title));
                text_view_2.setText(getString(R.string.mod3pt1pg10));
                text_view_3.setText("10 of 26");
            }
            if (page_number == 11){
                page_number = 11;
                text_view.setText(getString(R.string.mod3pt1pg11title));
                text_view_2.setText(getString(R.string.mod3pt1pg11));
                text_view_3.setText("11 of 26");
            }
            if (page_number == 12){
                page_number = 12;
                text_view.setText(getString(R.string.mod3pt1pg1215title));
                text_view_2.setText(getString(R.string.mod3pt1pg12));
                text_view_3.setText("12 of 26");
            }
            if (page_number == 13){
                page_number = 13;
                text_view.setText(getString(R.string.mod3pt1pg1215title));
                text_view_2.setText(getString(R.string.mod3pt1pg13));
                text_view_3.setText("13 of 26");
            }
            if (page_number == 14){
                page_number = 14;
                text_view.setText(getString(R.string.mod3pt1pg1215title));
                text_view_2.setText(getString(R.string.mod3pt1pg14));
                text_view_3.setText("14 of 26");
            }
            if (page_number == 15){
                page_number = 15;
                text_view.setText(getString(R.string.mod3pt1pg1215title));
                text_view_2.setText(getString(R.string.mod3pt1pg15));
                text_view_3.setText("15 of 26");
            }
            if (page_number == 16){
                page_number = 16;
                text_view.setText(getString(R.string.mod3pt1pg1623title));
                text_view_2.setText(getString(R.string.mod3pt1pg16));
                text_view_3.setText("16 of 26");
            }
            if (page_number == 17){
                page_number = 17;
                text_view.setText(getString(R.string.mod3pt1pg1623title));
                text_view_2.setText(getString(R.string.mod3pt1pg17));
                text_view_3.setText("17 of 26");
            }
            if (page_number == 18){
                page_number = 18;
                text_view.setText(getString(R.string.mod3pt1pg1623title));
                text_view_2.setText(getString(R.string.mod3pt1pg18));
                text_view_3.setText("18 of 26");
            }
            if (page_number == 19){
                page_number = 19;
                text_view.setText(getString(R.string.mod3pt1pg1623title));
                text_view_2.setText(getString(R.string.mod3pt1pg19));
                text_view_3.setText("19 of 26");
            }
            if (page_number == 20){
                page_number = 20;
                text_view.setText(getString(R.string.mod3pt1pg1623title));
                text_view_2.setText(getString(R.string.mod3pt1pg20));
                text_view_3.setText("20 of 26");
            }
            if (page_number == 21){
                page_number = 21;
                text_view.setText(getString(R.string.mod3pt1pg1623title));
                text_view_2.setText(getString(R.string.mod3pt1pg21));
                text_view_3.setText("21 of 26");
            }
            if (page_number == 22){
                page_number = 22;
                text_view.setText(getString(R.string.mod3pt1pg1623title));
                text_view_2.setText(getString(R.string.mod3pt1pg22));
                text_view_3.setText("22 of 26");
            }
            if (page_number == 23){
                page_number = 23;
                text_view.setText(getString(R.string.mod3pt1pg1623title));
                text_view_2.setText(getString(R.string.mod3pt1pg23));
                text_view_3.setText("23 of 26");
            }
            if (page_number == 24){
                page_number = 24;
                text_view.setText(getString(R.string.mod3pt1pg24title));
                text_view_2.setText(getString(R.string.mod3pt1pg24));
                text_view_3.setText("24 of 26");
            }
            if (page_number == 25){
                page_number = 25;
                text_view.setText(getString(R.string.mod3pt1pg25title));
                text_view_2.setText(getString(R.string.mod3pt1pg25));
                text_view_3.setText("25 of 26");
            }
        }

    }

    public void mod3Next(View view) {
        page_number += 1;
        if (page_number < 28) {
            if (page_number == 2){
                page_number = 2;
                text_view.setText(getString(R.string.mod3pt1pg2title));
                text_view_2.setText(getString(R.string.mod3pt1pg2));
                text_view_3.setText("2 of 26");
            }
            if (page_number == 3){
                page_number = 3;
                text_view.setText(getString(R.string.mod3pt1pg3title));
                text_view_2.setText(getString(R.string.mod3pt1pg3));
                text_view_3.setText("3 of 26");
            }
            if (page_number == 4){
                page_number = 4;
                text_view.setText(getString(R.string.mod3pt1pg4title));
                text_view_2.setText(getString(R.string.mod3pt1pg4));
                text_view_3.setText("4 of 26");
            }
            if (page_number == 5){
                page_number = 5;
                text_view.setText(getString(R.string.mod3pt1pg5title));
                text_view_2.setText(getString(R.string.mod3pt1pg5));
                text_view_3.setText("5 of 26");
            }
            if (page_number == 6){
                page_number = 6;
                text_view.setText(getString(R.string.mod3pt1pg6title));
                text_view_2.setText(getString(R.string.mod3pt1pg6));
                text_view_3.setText("6 of 26");
            }
            if (page_number == 7){
                page_number = 7;
                text_view.setText(getString(R.string.mod3pt1pg7title));
                text_view_2.setText(getString(R.string.mod3pt1pg7));
                text_view_3.setText("7 of 26");
            }
            if (page_number == 8){
                page_number = 8;
                text_view.setText(getString(R.string.mod3pt1pg8title));
                text_view_2.setText(getString(R.string.mod3pt1pg8));
                text_view_3.setText("8 of 26");
            }
            if (page_number == 9){
                page_number = 9;
                text_view.setText(getString(R.string.mod3pt1pg9title));
                text_view_2.setText(getString(R.string.mod3pt1pg9));
                text_view_3.setText("9 of 26");
            }
            if (page_number == 10){
                page_number = 10;
                text_view.setText(getString(R.string.mod3pt1pg10title));
                text_view_2.setText(getString(R.string.mod3pt1pg10));
                text_view_3.setText("10 of 26");
            }
            if (page_number == 11){
                page_number = 11;
                text_view.setText(getString(R.string.mod3pt1pg11title));
                text_view_2.setText(getString(R.string.mod3pt1pg11));
                text_view_3.setText("11 of 26");
            }
            if (page_number == 12){
                page_number = 12;
                text_view.setText(getString(R.string.mod3pt1pg1215title));
                text_view_2.setText(getString(R.string.mod3pt1pg12));
                text_view_3.setText("12 of 26");
            }
            if (page_number == 13){
                page_number = 13;
                text_view.setText(getString(R.string.mod3pt1pg1215title));
                text_view_2.setText(getString(R.string.mod3pt1pg13));
                text_view_3.setText("13 of 26");
            }
            if (page_number == 14){
                page_number = 14;
                text_view.setText(getString(R.string.mod3pt1pg1215title));
                text_view_2.setText(getString(R.string.mod3pt1pg14));
                text_view_3.setText("14 of 26");
            }
            if (page_number == 15){
                page_number = 15;
                text_view.setText(getString(R.string.mod3pt1pg1215title));
                text_view_2.setText(getString(R.string.mod3pt1pg15));
                text_view_3.setText("15 of 26");
            }
            if (page_number == 16){
                page_number = 16;
                text_view.setText(getString(R.string.mod3pt1pg1623title));
                text_view_2.setText(getString(R.string.mod3pt1pg16));
                text_view_3.setText("16 of 26");
            }
            if (page_number == 17){
                page_number = 17;
                text_view.setText(getString(R.string.mod3pt1pg1623title));
                text_view_2.setText(getString(R.string.mod3pt1pg17));
                text_view_3.setText("17 of 26");
            }
            if (page_number == 18){
                page_number = 18;
                text_view.setText(getString(R.string.mod3pt1pg1623title));
                text_view_2.setText(getString(R.string.mod3pt1pg18));
                text_view_3.setText("18 of 26");
            }
            if (page_number == 19){
                page_number = 19;
                text_view.setText(getString(R.string.mod3pt1pg1623title));
                text_view_2.setText(getString(R.string.mod3pt1pg19));
                text_view_3.setText("19 of 26");
            }
            if (page_number == 20){
                page_number = 20;
                text_view.setText(getString(R.string.mod3pt1pg1623title));
                text_view_2.setText(getString(R.string.mod3pt1pg20));
                text_view_3.setText("20 of 26");
            }
            if (page_number == 21){
                page_number = 21;
                text_view.setText(getString(R.string.mod3pt1pg1623title));
                text_view_2.setText(getString(R.string.mod3pt1pg21));
                text_view_3.setText("21 of 26");
            }
            if (page_number == 22){
                page_number = 22;
                text_view.setText(getString(R.string.mod3pt1pg1623title));
                text_view_2.setText(getString(R.string.mod3pt1pg22));
                text_view_3.setText("22 of 26");
            }
            if (page_number == 23){
                page_number = 23;
                text_view.setText(getString(R.string.mod3pt1pg1623title));
                text_view_2.setText(getString(R.string.mod3pt1pg23));
                text_view_3.setText("23 of 26");
            }
            if (page_number == 24){
                page_number = 24;
                text_view.setText(getString(R.string.mod3pt1pg24title));
                text_view_2.setText(getString(R.string.mod3pt1pg24));
                text_view_3.setText("24 of 26");
            }
            if (page_number == 25){
                page_number = 25;
                text_view.setText(getString(R.string.mod3pt1pg25title));
                text_view_2.setText(getString(R.string.mod3pt1pg25));
                text_view_3.setText("25 of 26");
            }
            if (page_number == 26){
                page_number = 26;
                text_view.setText(getString(R.string.mod3pt1pg26title));
                text_view_2.setText(getString(R.string.mod3pt1pg26));
                text_view_3.setText("26 of 26");
            }
            if (page_number == 27){
                finish();
            }
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.mod3pt1_main, menu);
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
        if (id == R.id.Page1){
            page_number = 1;
            text_view.setText(getString(R.string.mod3pt1pg1title));
            text_view_2.setText(getString(R.string.mod3pt1pg1));
            text_view_3.setText("1 of 26");
        }
        if (id == R.id.Page2){
            page_number = 2;
            text_view.setText(getString(R.string.mod3pt1pg2title));
            text_view_2.setText(getString(R.string.mod3pt1pg2));
            text_view_3.setText("2 of 26");
        }
        if (id == R.id.Page3){
            page_number = 3;
            text_view.setText(getString(R.string.mod3pt1pg3title));
            text_view_2.setText(getString(R.string.mod3pt1pg3));
            text_view_3.setText("3 of 26");
        }
        if (id == R.id.Page4){
            page_number = 4;
            text_view.setText(getString(R.string.mod3pt1pg4title));
            text_view_2.setText(getString(R.string.mod3pt1pg4));
            text_view_3.setText("4 of 26");
        }
        if (id == R.id.Page5){
            page_number = 5;
            text_view.setText(getString(R.string.mod3pt1pg5title));
            text_view_2.setText(getString(R.string.mod3pt1pg5));
            text_view_3.setText("5 of 26");
        }
        if (id == R.id.Page6){
            page_number = 6;
            text_view.setText(getString(R.string.mod3pt1pg6title));
            text_view_2.setText(getString(R.string.mod3pt1pg6));
            text_view_3.setText("6 of 26");
        }
        if (id == R.id.Page7){
            page_number = 7;
            text_view.setText(getString(R.string.mod3pt1pg7title));
            text_view_2.setText(getString(R.string.mod3pt1pg7));
            text_view_3.setText("7 of 26");
        }
        if (id == R.id.Page8){
            page_number = 8;
            text_view.setText(getString(R.string.mod3pt1pg8title));
            text_view_2.setText(getString(R.string.mod3pt1pg8));
            text_view_3.setText("8 of 26");
        }
        if (id == R.id.Page9){
            page_number = 9;
            text_view.setText(getString(R.string.mod3pt1pg9title));
            text_view_2.setText(getString(R.string.mod3pt1pg9));
            text_view_3.setText("9 of 26");
        }
        if (id == R.id.Page10){
            page_number = 10;
            text_view.setText(getString(R.string.mod3pt1pg10title));
            text_view_2.setText(getString(R.string.mod3pt1pg10));
            text_view_3.setText("10 of 26");
        }
        if (id == R.id.Page11){
            page_number = 11;
            text_view.setText(getString(R.string.mod3pt1pg11title));
            text_view_2.setText(getString(R.string.mod3pt1pg11));
            text_view_3.setText("11 of 26");
        }
        if (id == R.id.Page12){
            page_number = 12;
            text_view.setText(getString(R.string.mod3pt1pg1215title));
            text_view_2.setText(getString(R.string.mod3pt1pg12));
            text_view_3.setText("12 of 26");
        }
        if (id == R.id.Page13){
            page_number = 13;
            text_view.setText(getString(R.string.mod3pt1pg1215title));
            text_view_2.setText(getString(R.string.mod3pt1pg13));
            text_view_3.setText("13 of 26");
        }
        if (id == R.id.Page14){
            page_number = 14;
            text_view.setText(getString(R.string.mod3pt1pg1215title));
            text_view_2.setText(getString(R.string.mod3pt1pg14));
            text_view_3.setText("14 of 26");
        }
        if (id == R.id.Page15){
            page_number = 15;
            text_view.setText(getString(R.string.mod3pt1pg1215title));
            text_view_2.setText(getString(R.string.mod3pt1pg15));
            text_view_3.setText("15 of 26");
        }
        if (id == R.id.Page16){
            page_number = 16;
            text_view.setText(getString(R.string.mod3pt1pg1623title));
            text_view_2.setText(getString(R.string.mod3pt1pg16));
            text_view_3.setText("16 of 26");
        }
        if (id == R.id.Page17){
            page_number = 17;
            text_view.setText(getString(R.string.mod3pt1pg1623title));
            text_view_2.setText(getString(R.string.mod3pt1pg17));
            text_view_3.setText("17 of 26");
        }
        if (id == R.id.Page18){
            page_number = 18;
            text_view.setText(getString(R.string.mod3pt1pg1623title));
            text_view_2.setText(getString(R.string.mod3pt1pg18));
            text_view_3.setText("18 of 26");
        }
        if (id == R.id.Page19){
            page_number = 19;
            text_view.setText(getString(R.string.mod3pt1pg1623title));
            text_view_2.setText(getString(R.string.mod3pt1pg19));
            text_view_3.setText("19 of 26");
        }
        if (id == R.id.Page20){
            page_number = 20;
            text_view.setText(getString(R.string.mod3pt1pg1623title));
            text_view_2.setText(getString(R.string.mod3pt1pg20));
            text_view_3.setText("20 of 26");
        }
        if (id == R.id.Page21){
            page_number = 21;
            text_view.setText(getString(R.string.mod3pt1pg1623title));
            text_view_2.setText(getString(R.string.mod3pt1pg21));
            text_view_3.setText("21 of 26");
        }
        if (id == R.id.Page22){
            page_number = 22;
            text_view.setText(getString(R.string.mod3pt1pg1623title));
            text_view_2.setText(getString(R.string.mod3pt1pg22));
            text_view_3.setText("22 of 26");
        }
        if (id == R.id.Page23){
            page_number = 23;
            text_view.setText(getString(R.string.mod3pt1pg1623title));
            text_view_2.setText(getString(R.string.mod3pt1pg23));
            text_view_3.setText("23 of 26");
        }
        if (id == R.id.Page24){
            page_number = 24;
            text_view.setText(getString(R.string.mod3pt1pg24title));
            text_view_2.setText(getString(R.string.mod3pt1pg24));
            text_view_3.setText("24 of 26");
        }
        if (id == R.id.Page25){
            page_number = 25;
            text_view.setText(getString(R.string.mod3pt1pg25title));
            text_view_2.setText(getString(R.string.mod3pt1pg25));
            text_view_3.setText("25 of 26");
        }
        if (id == R.id.Page26){
            page_number = 26;
            text_view.setText(getString(R.string.mod3pt1pg26title));
            text_view_2.setText(getString(R.string.mod3pt1pg26));
            text_view_3.setText("26 of 26");
        }
        return super.onOptionsItemSelected(item);
    }

}

