package com.example.tinnicure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Module3Part2 extends AppCompatActivity {

    int page_number = 1;
    TextView text_view;
    TextView text_view_2;
    TextView text_view_3;
    ImageView image_view;
    ImageView image_view_2;
    ImageView image_view_3;
    ScrollView scroll_view_1;
    ScrollView scroll_view_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module3_part2);
        text_view = (TextView) findViewById(R.id.text_view_mod3);
        text_view_2 = (TextView) findViewById(R.id.text_view_mod3_2);
        text_view_3 = (TextView) findViewById(R.id.tvmod3_5);
        image_view = (ImageView) findViewById(R.id.image_view_mod3);
        image_view_2 = (ImageView) findViewById(R.id.ivmod3_3);
        image_view_3 = (ImageView) findViewById(R.id.image_view_mod4);
        scroll_view_1 = (ScrollView) findViewById(R.id.sv1);
        scroll_view_2 = (ScrollView) findViewById(R.id.sv2);

        if (savedInstanceState != null) {
            page_number = Integer.parseInt(savedInstanceState.getString("NUM"));
            if (page_number == 1) {
                scroll_view_1.setVisibility(View.VISIBLE);
                scroll_view_2.setVisibility(View.INVISIBLE);
                text_view.setText(getString(R.string.mod3pt2pg1title));
                text_view_2.setText(getString(R.string.mod3pt2pg1));
                image_view.setVisibility(View.VISIBLE);
                image_view_2.setVisibility(View.GONE);
                image_view_3.setVisibility(View.GONE);
                image_view.setImageResource(R.drawable.mod3pt2pg1);
                image_view_2.setImageDrawable(null);
                image_view_3.setImageDrawable(null);
            }
            if (page_number == 2){
                scroll_view_1.setVisibility(View.VISIBLE);
                scroll_view_2.setVisibility(View.INVISIBLE);
                text_view.setText(getString(R.string.mod3pt2pg2title));
                text_view_2.setText(getString(R.string.mod3pt2pg2));
                image_view.setVisibility(View.VISIBLE);
                image_view_2.setVisibility(View.GONE);
                image_view_3.setVisibility(View.GONE);
                image_view.setImageResource(R.drawable.headphones);
                image_view_2.setImageDrawable(null);
                image_view_3.setImageDrawable(null);
            }
            if (page_number == 3){
                scroll_view_1.setVisibility(View.VISIBLE);
                scroll_view_2.setVisibility(View.INVISIBLE);
                text_view.setText(getString(R.string.mod3pt2pg3title));
                text_view_2.setText(getString(R.string.mod3pt2pg3));
                image_view.setVisibility(View.VISIBLE);
                image_view_2.setVisibility(View.GONE);
                image_view_3.setVisibility(View.GONE);
                image_view.setImageResource(R.drawable.mod3pt1pg3);
                image_view_2.setImageDrawable(null);
                image_view_3.setImageDrawable(null);
            }
            if (page_number == 4){
                scroll_view_1.setVisibility(View.VISIBLE);
                scroll_view_2.setVisibility(View.INVISIBLE);
                text_view.setText(getString(R.string.mod3pt2pg4title));
                text_view_2.setText(getString(R.string.mod3pt2pg4));
                image_view.setVisibility(View.VISIBLE);
                image_view_2.setVisibility(View.GONE);
                image_view_3.setVisibility(View.GONE);
                image_view.setImageResource(R.drawable.mod3pt1pg4);
                image_view_2.setImageDrawable(null);
                image_view_3.setImageDrawable(null);
            }
            if (page_number == 5){
                scroll_view_1.setVisibility(View.VISIBLE);
                scroll_view_2.setVisibility(View.INVISIBLE);
                text_view.setText(getString(R.string.mod3pt2pg5title));
                text_view_2.setText(getString(R.string.mod3pt2pg5));
                image_view.setVisibility(View.VISIBLE);
                image_view_2.setVisibility(View.GONE);
                image_view_3.setVisibility(View.GONE);
                image_view.setImageResource(R.drawable.mod3pt1pg5);
                image_view_2.setImageDrawable(null);
                image_view_3.setImageDrawable(null);
            }
            if (page_number == 6){
                scroll_view_1.setVisibility(View.INVISIBLE);
                scroll_view_2.setVisibility(View.VISIBLE);
                text_view.setText(getString(R.string.mod3pt2pg6title));
                text_view_3.setText(getString(R.string.mod3pt2pg6));
                image_view.setVisibility(View.GONE);
                image_view_2.setVisibility(View.VISIBLE);
                image_view_3.setVisibility(View.GONE);
                image_view.setImageDrawable(null);
                image_view_2.setImageResource(R.drawable.mod3pt1pg6);
                image_view_3.setImageDrawable(null);
            }
            if (page_number == 7){
                scroll_view_1.setVisibility(View.INVISIBLE);
                scroll_view_2.setVisibility(View.VISIBLE);
                text_view.setText(getString(R.string.mod3pt2pg79title));
                text_view_3.setText(getString(R.string.mod3pt2pg7));
                image_view.setVisibility(View.GONE);
                image_view_2.setVisibility(View.VISIBLE);
                image_view_3.setVisibility(View.GONE);
                image_view.setImageDrawable(null);
                image_view_2.setImageResource(R.drawable.mod3pt1pg7);
                image_view_3.setImageDrawable(null);
            }
            if (page_number == 8){
                scroll_view_1.setVisibility(View.INVISIBLE);
                scroll_view_2.setVisibility(View.VISIBLE);
                text_view.setText(getString(R.string.mod3pt2pg79title));
                text_view_3.setText(getString(R.string.mod3pt2pg8));
                image_view.setVisibility(View.GONE);
                image_view_2.setVisibility(View.VISIBLE);
                image_view_3.setVisibility(View.GONE);
                image_view.setImageDrawable(null);
                image_view_2.setImageResource(R.drawable.mod3pt2pg8);
                image_view_3.setImageDrawable(null);
            }
            if (page_number == 9){
                scroll_view_1.setVisibility(View.INVISIBLE);
                scroll_view_2.setVisibility(View.VISIBLE);
                text_view.setText(getString(R.string.mod3pt2pg79title));
                text_view_3.setText(getString(R.string.mod3pt2pg9));
                image_view.setVisibility(View.GONE);
                image_view_2.setVisibility(View.VISIBLE);
                image_view_3.setVisibility(View.GONE);
                image_view.setImageDrawable(null);
                image_view_2.setImageResource(R.drawable.mod3pt2pg9);
                image_view_3.setImageDrawable(null);
            }
            if (page_number == 10){
                scroll_view_1.setVisibility(View.INVISIBLE);
                scroll_view_2.setVisibility(View.INVISIBLE);
                text_view.setText(getString(R.string.mod3pt2pg10title));
                image_view.setVisibility(View.GONE);
                image_view_2.setVisibility(View.GONE);
                image_view_3.setVisibility(View.VISIBLE);
                image_view.setImageDrawable(null);
                image_view_2.setImageDrawable(null);
                image_view_3.setImageResource(R.drawable.mod3pt2pg10);
            }
            if (page_number == 11){
                scroll_view_1.setVisibility(View.INVISIBLE);
                scroll_view_2.setVisibility(View.INVISIBLE);
                text_view.setText(getString(R.string.mod3pt2pg11title));
                image_view.setVisibility(View.GONE);
                image_view_2.setVisibility(View.GONE);
                image_view_3.setVisibility(View.VISIBLE);
                image_view.setImageDrawable(null);
                image_view_2.setImageDrawable(null);
                image_view_3.setImageResource(R.drawable.mod3pt2pg11);
            }
            if (page_number == 12){
                scroll_view_1.setVisibility(View.INVISIBLE);
                scroll_view_2.setVisibility(View.INVISIBLE);
                text_view.setText(getString(R.string.mod3pt2pg12title));
                image_view.setVisibility(View.GONE);
                image_view_2.setVisibility(View.GONE);
                image_view_3.setVisibility(View.VISIBLE);
                image_view.setImageDrawable(null);
                image_view_2.setImageDrawable(null);
                image_view_3.setImageResource(R.drawable.mod3pt2pg12);
            }
            if (page_number == 13){
                scroll_view_1.setVisibility(View.INVISIBLE);
                scroll_view_2.setVisibility(View.INVISIBLE);
                text_view.setText(getString(R.string.mod3pt2pg13title));
                image_view.setVisibility(View.GONE);
                image_view_2.setVisibility(View.GONE);
                image_view_3.setVisibility(View.VISIBLE);
                image_view.setImageDrawable(null);
                image_view_2.setImageDrawable(null);
                image_view_3.setImageResource(R.drawable.mod3pt2pg13);
            }
            if (page_number == 14){
                scroll_view_1.setVisibility(View.INVISIBLE);
                scroll_view_2.setVisibility(View.INVISIBLE);
                text_view.setText(getString(R.string.mod3pt2pg14title));
                image_view.setVisibility(View.GONE);
                image_view_2.setVisibility(View.GONE);
                image_view_3.setVisibility(View.VISIBLE);
                image_view.setImageDrawable(null);
                image_view_2.setImageDrawable(null);
                image_view_3.setImageResource(R.drawable.mod3pt2pg14);
            }
            if (page_number == 15){
                scroll_view_1.setVisibility(View.VISIBLE);
                scroll_view_2.setVisibility(View.INVISIBLE);
                text_view.setText(getString(R.string.mod3pt2pg15title));
                text_view_2.setText(getString(R.string.mod3pt2pg15));
                image_view.setVisibility(View.VISIBLE);
                image_view_2.setVisibility(View.GONE);
                image_view_3.setVisibility(View.GONE);
                image_view.setImageResource(R.drawable.mod3pt2pg15);
                image_view_2.setImageDrawable(null);
                image_view_3.setImageDrawable(null);
            }
            if (page_number == 16){
                scroll_view_1.setVisibility(View.INVISIBLE);
                scroll_view_2.setVisibility(View.INVISIBLE);
                text_view.setText(getString(R.string.mod3pt2pg16title));
                image_view.setVisibility(View.GONE);
                image_view_2.setVisibility(View.GONE);
                image_view_3.setVisibility(View.VISIBLE);
                image_view.setImageDrawable(null);
                image_view_2.setImageDrawable(null);
                image_view_3.setImageResource(R.drawable.mod3pt2pg16);
            }
            if (page_number == 17){
                scroll_view_1.setVisibility(View.VISIBLE);
                scroll_view_2.setVisibility(View.INVISIBLE);
                text_view.setText(getString(R.string.mod3pt2pg17title));
                text_view_2.setText(getString(R.string.mod3pt2pg17));
                image_view.setVisibility(View.GONE);
                image_view_2.setVisibility(View.GONE);
                image_view_3.setVisibility(View.GONE);
                image_view.setImageDrawable(null);
                image_view_2.setImageDrawable(null);
                image_view_3.setImageDrawable(null);
            }
            if (page_number == 18){
                scroll_view_1.setVisibility(View.INVISIBLE);
                scroll_view_2.setVisibility(View.INVISIBLE);
                text_view.setText(getString(R.string.mod3pt2pg18title));
                image_view.setVisibility(View.GONE);
                image_view_2.setVisibility(View.GONE);
                image_view_3.setVisibility(View.VISIBLE);
                image_view.setImageDrawable(null);
                image_view_2.setImageDrawable(null);
                image_view_3.setImageResource(R.drawable.mod3pt2pg18);
            }
            if (page_number == 19){
                scroll_view_1.setVisibility(View.VISIBLE);
                scroll_view_2.setVisibility(View.INVISIBLE);
                text_view.setText(getString(R.string.mod3pt2pg19title));
                text_view_2.setText(getString(R.string.mod3pt2pg19));
                image_view.setVisibility(View.VISIBLE);
                image_view_2.setVisibility(View.GONE);
                image_view_3.setVisibility(View.GONE);
                image_view.setImageResource(R.drawable.mod3pt2pg19);
                image_view_2.setImageDrawable(null);
                image_view_3.setImageDrawable(null);
            }
            if (page_number == 20){
                scroll_view_1.setVisibility(View.VISIBLE);
                scroll_view_2.setVisibility(View.INVISIBLE);
                text_view.setText(getString(R.string.mod3pt2pg20title));
                text_view_2.setText(getString(R.string.mod3pt2pg20));
                image_view.setVisibility(View.GONE);
                image_view_2.setVisibility(View.GONE);
                image_view_3.setVisibility(View.GONE);
                image_view.setImageDrawable(null);
                image_view_2.setImageDrawable(null);
                image_view_3.setImageDrawable(null);
            }
            if (page_number == 21){
                scroll_view_1.setVisibility(View.INVISIBLE);
                scroll_view_2.setVisibility(View.VISIBLE);
                text_view.setText(getString(R.string.mod3pt2pg21title));
                text_view_3.setText(getString(R.string.mod3pt2pg21));
                image_view.setVisibility(View.GONE);
                image_view_2.setVisibility(View.VISIBLE);
                image_view_3.setVisibility(View.GONE);
                image_view.setImageDrawable(null);
                image_view_2.setImageResource(R.drawable.mod3pt2pg21);
                image_view_3.setImageDrawable(null);
            }
            if (page_number == 22){
                scroll_view_1.setVisibility(View.VISIBLE);
                scroll_view_2.setVisibility(View.INVISIBLE);
                text_view.setText(getString(R.string.mod3pt2pg22title));
                text_view_2.setText(getString(R.string.mod3pt2pg22));
                image_view.setVisibility(View.VISIBLE);
                image_view_2.setVisibility(View.GONE);
                image_view_3.setVisibility(View.GONE);
                image_view.setImageResource(R.drawable.mod3pt2pg22);
                image_view_2.setImageDrawable(null);
                image_view_3.setImageDrawable(null);
            }
            if (page_number == 23){
                scroll_view_1.setVisibility(View.VISIBLE);
                scroll_view_2.setVisibility(View.INVISIBLE);
                text_view.setText(getString(R.string.mod3pt2pg23title));
                text_view_2.setText(getString(R.string.mod3pt2pg23));
                image_view.setVisibility(View.GONE);
                image_view_2.setVisibility(View.GONE);
                image_view_3.setVisibility(View.GONE);
                image_view.setImageDrawable(null);
                image_view_2.setImageDrawable(null);
                image_view_3.setImageDrawable(null);
            }
            if (page_number == 24){
                scroll_view_1.setVisibility(View.VISIBLE);
                scroll_view_2.setVisibility(View.INVISIBLE);
                text_view.setText(getString(R.string.mod3pt2pg24title));
                text_view_2.setText(getString(R.string.mod3pt2pg24));
                image_view.setVisibility(View.GONE);
                image_view_2.setVisibility(View.GONE);
                image_view_3.setVisibility(View.GONE);
                image_view.setImageDrawable(null);
                image_view_2.setImageDrawable(null);
                image_view_3.setImageDrawable(null);
            }
            if (page_number == 25){
                scroll_view_1.setVisibility(View.INVISIBLE);
                scroll_view_2.setVisibility(View.VISIBLE);
                text_view.setText(getString(R.string.mod3pt2pg25title));
                text_view_3.setText(getString(R.string.mod3pt2pg25));
                image_view.setVisibility(View.GONE);
                image_view_2.setVisibility(View.VISIBLE);
                image_view_3.setVisibility(View.GONE);
                image_view.setImageDrawable(null);
                image_view_2.setImageResource(R.drawable.mod3pt2pg25);
                image_view_3.setImageDrawable(null);
            }
            if (page_number == 26){
                scroll_view_1.setVisibility(View.INVISIBLE);
                scroll_view_2.setVisibility(View.INVISIBLE);
                text_view.setText("");
                image_view.setVisibility(View.GONE);
                image_view_2.setVisibility(View.GONE);
                image_view_3.setVisibility(View.VISIBLE);
                image_view.setImageDrawable(null);
                image_view_2.setImageDrawable(null);
                image_view_3.setImageResource(R.drawable.mod3pt2pg26);
            }
            if (page_number == 27){
                scroll_view_1.setVisibility(View.INVISIBLE);
                scroll_view_2.setVisibility(View.INVISIBLE);
                text_view.setText(getString(R.string.mod3pt2pg27title));
                image_view.setVisibility(View.GONE);
                image_view_2.setVisibility(View.GONE);
                image_view_3.setVisibility(View.VISIBLE);
                image_view.setImageDrawable(null);
                image_view_2.setImageDrawable(null);
                image_view_3.setImageResource(R.drawable.mod3pt2pg27);
            }
            if (page_number == 28){
                scroll_view_1.setVisibility(View.VISIBLE);
                scroll_view_2.setVisibility(View.INVISIBLE);
                text_view.setText("");
                text_view_2.setText(getString(R.string.mod3pt2pg28));
                image_view.setVisibility(View.VISIBLE);
                image_view_2.setVisibility(View.GONE);
                image_view_3.setVisibility(View.GONE);
                image_view.setImageResource(R.drawable.mod3pt2pg28);
                image_view_2.setImageDrawable(null);
                image_view_3.setImageDrawable(null);
            }
            if (page_number == 29){
                scroll_view_1.setVisibility(View.INVISIBLE);
                scroll_view_2.setVisibility(View.INVISIBLE);
                text_view.setText(getString(R.string.mod3pt2pg29title));
                image_view.setVisibility(View.GONE);
                image_view_2.setVisibility(View.GONE);
                image_view_3.setVisibility(View.VISIBLE);
                image_view.setImageDrawable(null);
                image_view_2.setImageDrawable(null);
                image_view_3.setImageResource(R.drawable.mod3pt2pg29);
            }
            if (page_number == 30){
                scroll_view_1.setVisibility(View.INVISIBLE);
                scroll_view_2.setVisibility(View.VISIBLE);
                text_view.setText(getString(R.string.mod3pt2pg30title));
                text_view_3.setText(getString(R.string.mod3pt2pg30));
                image_view.setVisibility(View.GONE);
                image_view_2.setVisibility(View.VISIBLE);
                image_view_3.setVisibility(View.GONE);
                image_view.setImageDrawable(null);
                image_view_2.setImageResource(R.drawable.mod3pt2pg30);
                image_view_3.setImageDrawable(null);
            }
            if (page_number == 31){
                scroll_view_1.setVisibility(View.INVISIBLE);
                scroll_view_2.setVisibility(View.INVISIBLE);
                text_view.setText(getString(R.string.mod3pt2pg31title));
                image_view.setVisibility(View.GONE);
                image_view_2.setVisibility(View.GONE);
                image_view_3.setVisibility(View.VISIBLE);
                image_view.setImageDrawable(null);
                image_view_2.setImageDrawable(null);
                image_view_3.setImageResource(R.drawable.mod3pt2pg31);
            }
            if (page_number == 32){
                scroll_view_1.setVisibility(View.INVISIBLE);
                scroll_view_2.setVisibility(View.INVISIBLE);
                text_view.setText(getString(R.string.mod3pt2pg32title));
                image_view.setVisibility(View.GONE);
                image_view_2.setVisibility(View.GONE);
                image_view_3.setVisibility(View.VISIBLE);
                image_view.setImageDrawable(null);
                image_view_2.setImageDrawable(null);
                image_view_3.setImageResource(R.drawable.mod3pt2pg32);
            }
        }
        else{
            page_number = 1;
            scroll_view_1.setVisibility(View.VISIBLE);
            scroll_view_2.setVisibility(View.INVISIBLE);
            text_view.setText(getString(R.string.mod3pt2pg1title));
            text_view_2.setText(getString(R.string.mod3pt2pg1));
            image_view.setImageResource(R.drawable.mod3pt2pg1);
            image_view_2.setImageDrawable(null);
            image_view_3.setImageDrawable(null);
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("NUM",Integer.toString(page_number));
    }

    public void mod3Back(View view){
        page_number -= 1;
        if (page_number >= 0) {
            if (page_number == 0){
                finish();
            }
            if (page_number == 1){
                scroll_view_1.setVisibility(View.VISIBLE);
                scroll_view_2.setVisibility(View.INVISIBLE);
                text_view.setText(getString(R.string.mod3pt2pg1title));
                text_view_2.setText(getString(R.string.mod3pt2pg1));
                image_view.setVisibility(View.VISIBLE);
                image_view_2.setVisibility(View.GONE);
                image_view_3.setVisibility(View.GONE);
                image_view.setImageResource(R.drawable.mod3pt2pg1);
                image_view_2.setImageDrawable(null);
                image_view_3.setImageDrawable(null);
            }
            if (page_number == 2){
                scroll_view_1.setVisibility(View.VISIBLE);
                scroll_view_2.setVisibility(View.INVISIBLE);
                text_view.setText(getString(R.string.mod3pt2pg2title));
                text_view_2.setText(getString(R.string.mod3pt2pg2));
                image_view.setVisibility(View.VISIBLE);
                image_view_2.setVisibility(View.GONE);
                image_view_3.setVisibility(View.GONE);
                image_view.setImageResource(R.drawable.headphones);
                image_view_2.setImageDrawable(null);
                image_view_3.setImageDrawable(null);
            }
            if (page_number == 3){
                scroll_view_1.setVisibility(View.VISIBLE);
                scroll_view_2.setVisibility(View.INVISIBLE);
                text_view.setText(getString(R.string.mod3pt2pg3title));
                text_view_2.setText(getString(R.string.mod3pt2pg3));
                image_view.setVisibility(View.VISIBLE);
                image_view_2.setVisibility(View.GONE);
                image_view_3.setVisibility(View.GONE);
                image_view.setImageResource(R.drawable.mod3pt1pg3);
                image_view_2.setImageDrawable(null);
                image_view_3.setImageDrawable(null);
            }
            if (page_number == 4){
                scroll_view_1.setVisibility(View.VISIBLE);
                scroll_view_2.setVisibility(View.INVISIBLE);
                text_view.setText(getString(R.string.mod3pt2pg4title));
                text_view_2.setText(getString(R.string.mod3pt2pg4));
                image_view.setVisibility(View.VISIBLE);
                image_view_2.setVisibility(View.GONE);
                image_view_3.setVisibility(View.GONE);
                image_view.setImageResource(R.drawable.mod3pt1pg4);
                image_view_2.setImageDrawable(null);
                image_view_3.setImageDrawable(null);
            }
            if (page_number == 5){
                scroll_view_1.setVisibility(View.VISIBLE);
                scroll_view_2.setVisibility(View.INVISIBLE);
                text_view.setText(getString(R.string.mod3pt2pg5title));
                text_view_2.setText(getString(R.string.mod3pt2pg5));
                image_view.setVisibility(View.VISIBLE);
                image_view_2.setVisibility(View.GONE);
                image_view_3.setVisibility(View.GONE);
                image_view.setImageResource(R.drawable.mod3pt1pg5);
                image_view_2.setImageDrawable(null);
                image_view_3.setImageDrawable(null);
            }
            if (page_number == 6){
                scroll_view_1.setVisibility(View.INVISIBLE);
                scroll_view_2.setVisibility(View.VISIBLE);
                text_view.setText(getString(R.string.mod3pt2pg6title));
                text_view_3.setText(getString(R.string.mod3pt2pg6));
                image_view.setVisibility(View.GONE);
                image_view_2.setVisibility(View.VISIBLE);
                image_view_3.setVisibility(View.GONE);
                image_view.setImageDrawable(null);
                image_view_2.setImageResource(R.drawable.mod3pt1pg6);
                image_view_3.setImageDrawable(null);
            }
            if (page_number == 7){
                scroll_view_1.setVisibility(View.INVISIBLE);
                scroll_view_2.setVisibility(View.VISIBLE);
                text_view.setText(getString(R.string.mod3pt2pg79title));
                text_view_3.setText(getString(R.string.mod3pt2pg7));
                image_view.setVisibility(View.GONE);
                image_view_2.setVisibility(View.VISIBLE);
                image_view_3.setVisibility(View.GONE);
                image_view.setImageDrawable(null);
                image_view_2.setImageResource(R.drawable.mod3pt1pg7);
                image_view_3.setImageDrawable(null);
            }
            if (page_number == 8){
                scroll_view_1.setVisibility(View.INVISIBLE);
                scroll_view_2.setVisibility(View.VISIBLE);
                text_view.setText(getString(R.string.mod3pt2pg79title));
                text_view_3.setText(getString(R.string.mod3pt2pg8));
                image_view.setVisibility(View.GONE);
                image_view_2.setVisibility(View.VISIBLE);
                image_view_3.setVisibility(View.GONE);
                image_view.setImageDrawable(null);
                image_view_2.setImageResource(R.drawable.mod3pt2pg8);
                image_view_3.setImageDrawable(null);
            }
            if (page_number == 9){
                scroll_view_1.setVisibility(View.INVISIBLE);
                scroll_view_2.setVisibility(View.VISIBLE);
                text_view.setText(getString(R.string.mod3pt2pg79title));
                text_view_3.setText(getString(R.string.mod3pt2pg9));
                image_view.setVisibility(View.GONE);
                image_view_2.setVisibility(View.VISIBLE);
                image_view_3.setVisibility(View.GONE);
                image_view.setImageDrawable(null);
                image_view_2.setImageResource(R.drawable.mod3pt2pg9);
                image_view_3.setImageDrawable(null);
            }
            if (page_number == 10){
                scroll_view_1.setVisibility(View.INVISIBLE);
                scroll_view_2.setVisibility(View.INVISIBLE);
                text_view.setText(getString(R.string.mod3pt2pg10title));
                image_view.setVisibility(View.GONE);
                image_view_2.setVisibility(View.GONE);
                image_view_3.setVisibility(View.VISIBLE);
                image_view.setImageDrawable(null);
                image_view_2.setImageDrawable(null);
                image_view_3.setImageResource(R.drawable.mod3pt2pg10);
            }
            if (page_number == 11){
                scroll_view_1.setVisibility(View.INVISIBLE);
                scroll_view_2.setVisibility(View.INVISIBLE);
                text_view.setText(getString(R.string.mod3pt2pg11title));
                image_view.setVisibility(View.GONE);
                image_view_2.setVisibility(View.GONE);
                image_view_3.setVisibility(View.VISIBLE);
                image_view.setImageDrawable(null);
                image_view_2.setImageDrawable(null);
                image_view_3.setImageResource(R.drawable.mod3pt2pg11);
            }
            if (page_number == 12){
                scroll_view_1.setVisibility(View.INVISIBLE);
                scroll_view_2.setVisibility(View.INVISIBLE);
                text_view.setText(getString(R.string.mod3pt2pg12title));
                image_view.setVisibility(View.GONE);
                image_view_2.setVisibility(View.GONE);
                image_view_3.setVisibility(View.VISIBLE);
                image_view.setImageDrawable(null);
                image_view_2.setImageDrawable(null);
                image_view_3.setImageResource(R.drawable.mod3pt2pg12);
            }
            if (page_number == 13){
                scroll_view_1.setVisibility(View.INVISIBLE);
                scroll_view_2.setVisibility(View.INVISIBLE);
                text_view.setText(getString(R.string.mod3pt2pg13title));
                image_view.setVisibility(View.GONE);
                image_view_2.setVisibility(View.GONE);
                image_view_3.setVisibility(View.VISIBLE);
                image_view.setImageDrawable(null);
                image_view_2.setImageDrawable(null);
                image_view_3.setImageResource(R.drawable.mod3pt2pg13);
            }
            if (page_number == 14){
                scroll_view_1.setVisibility(View.INVISIBLE);
                scroll_view_2.setVisibility(View.INVISIBLE);
                text_view.setText(getString(R.string.mod3pt2pg14title));
                image_view.setVisibility(View.GONE);
                image_view_2.setVisibility(View.GONE);
                image_view_3.setVisibility(View.VISIBLE);
                image_view.setImageDrawable(null);
                image_view_2.setImageDrawable(null);
                image_view_3.setImageResource(R.drawable.mod3pt2pg14);
            }
            if (page_number == 15){
                scroll_view_1.setVisibility(View.VISIBLE);
                scroll_view_2.setVisibility(View.INVISIBLE);
                text_view.setText(getString(R.string.mod3pt2pg15title));
                text_view_2.setText(getString(R.string.mod3pt2pg15));
                image_view.setVisibility(View.VISIBLE);
                image_view_2.setVisibility(View.GONE);
                image_view_3.setVisibility(View.GONE);
                image_view.setImageResource(R.drawable.mod3pt2pg15);
                image_view_2.setImageDrawable(null);
                image_view_3.setImageDrawable(null);
            }
            if (page_number == 16){
                scroll_view_1.setVisibility(View.INVISIBLE);
                scroll_view_2.setVisibility(View.INVISIBLE);
                text_view.setText(getString(R.string.mod3pt2pg16title));
                image_view.setVisibility(View.GONE);
                image_view_2.setVisibility(View.GONE);
                image_view_3.setVisibility(View.VISIBLE);
                image_view.setImageDrawable(null);
                image_view_2.setImageDrawable(null);
                image_view_3.setImageResource(R.drawable.mod3pt2pg16);
            }
            if (page_number == 17){
                scroll_view_1.setVisibility(View.VISIBLE);
                scroll_view_2.setVisibility(View.INVISIBLE);
                text_view.setText(getString(R.string.mod3pt2pg17title));
                text_view_2.setText(getString(R.string.mod3pt2pg17));
                image_view.setVisibility(View.GONE);
                image_view_2.setVisibility(View.GONE);
                image_view_3.setVisibility(View.GONE);
                image_view.setImageDrawable(null);
                image_view_2.setImageDrawable(null);
                image_view_3.setImageDrawable(null);
            }
            if (page_number == 18){
                scroll_view_1.setVisibility(View.INVISIBLE);
                scroll_view_2.setVisibility(View.INVISIBLE);
                text_view.setText(getString(R.string.mod3pt2pg18title));
                image_view.setVisibility(View.GONE);
                image_view_2.setVisibility(View.GONE);
                image_view_3.setVisibility(View.VISIBLE);
                image_view.setImageDrawable(null);
                image_view_2.setImageDrawable(null);
                image_view_3.setImageResource(R.drawable.mod3pt2pg18);
            }
            if (page_number == 19){
                scroll_view_1.setVisibility(View.VISIBLE);
                scroll_view_2.setVisibility(View.INVISIBLE);
                text_view.setText(getString(R.string.mod3pt2pg19title));
                text_view_2.setText(getString(R.string.mod3pt2pg19));
                image_view.setVisibility(View.VISIBLE);
                image_view_2.setVisibility(View.GONE);
                image_view_3.setVisibility(View.GONE);
                image_view.setImageResource(R.drawable.mod3pt2pg19);
                image_view_2.setImageDrawable(null);
                image_view_3.setImageDrawable(null);
            }
            if (page_number == 20){
                scroll_view_1.setVisibility(View.VISIBLE);
                scroll_view_2.setVisibility(View.INVISIBLE);
                text_view.setText(getString(R.string.mod3pt2pg20title));
                text_view_2.setText(getString(R.string.mod3pt2pg20));
                image_view.setVisibility(View.GONE);
                image_view_2.setVisibility(View.GONE);
                image_view_3.setVisibility(View.GONE);
                image_view.setImageDrawable(null);
                image_view_2.setImageDrawable(null);
                image_view_3.setImageDrawable(null);
            }
            if (page_number == 21){
                scroll_view_1.setVisibility(View.INVISIBLE);
                scroll_view_2.setVisibility(View.VISIBLE);
                text_view.setText(getString(R.string.mod3pt2pg21title));
                text_view_3.setText(getString(R.string.mod3pt2pg21));
                image_view.setVisibility(View.GONE);
                image_view_2.setVisibility(View.VISIBLE);
                image_view_3.setVisibility(View.GONE);
                image_view.setImageDrawable(null);
                image_view_2.setImageResource(R.drawable.mod3pt2pg21);
                image_view_3.setImageDrawable(null);
            }
            if (page_number == 22){
                scroll_view_1.setVisibility(View.VISIBLE);
                scroll_view_2.setVisibility(View.INVISIBLE);
                text_view.setText(getString(R.string.mod3pt2pg22title));
                text_view_2.setText(getString(R.string.mod3pt2pg22));
                image_view.setVisibility(View.VISIBLE);
                image_view_2.setVisibility(View.GONE);
                image_view_3.setVisibility(View.GONE);
                image_view.setImageResource(R.drawable.mod3pt2pg22);
                image_view_2.setImageDrawable(null);
                image_view_3.setImageDrawable(null);
            }
            if (page_number == 23){
                scroll_view_1.setVisibility(View.VISIBLE);
                scroll_view_2.setVisibility(View.INVISIBLE);
                text_view.setText(getString(R.string.mod3pt2pg23title));
                text_view_2.setText(getString(R.string.mod3pt2pg23));
                image_view.setVisibility(View.GONE);
                image_view_2.setVisibility(View.GONE);
                image_view_3.setVisibility(View.GONE);
                image_view.setImageDrawable(null);
                image_view_2.setImageDrawable(null);
                image_view_3.setImageDrawable(null);
            }
            if (page_number == 24){
                scroll_view_1.setVisibility(View.VISIBLE);
                scroll_view_2.setVisibility(View.INVISIBLE);
                text_view.setText(getString(R.string.mod3pt2pg24title));
                text_view_2.setText(getString(R.string.mod3pt2pg24));
                image_view.setVisibility(View.GONE);
                image_view_2.setVisibility(View.GONE);
                image_view_3.setVisibility(View.GONE);
                image_view.setImageDrawable(null);
                image_view_2.setImageDrawable(null);
                image_view_3.setImageDrawable(null);
            }
            if (page_number == 25){
                scroll_view_1.setVisibility(View.INVISIBLE);
                scroll_view_2.setVisibility(View.VISIBLE);
                text_view.setText(getString(R.string.mod3pt2pg25title));
                text_view_3.setText(getString(R.string.mod3pt2pg25));
                image_view.setVisibility(View.GONE);
                image_view_2.setVisibility(View.VISIBLE);
                image_view_3.setVisibility(View.GONE);
                image_view.setImageDrawable(null);
                image_view_2.setImageResource(R.drawable.mod3pt2pg25);
                image_view_3.setImageDrawable(null);
            }
            if (page_number == 26){
                scroll_view_1.setVisibility(View.INVISIBLE);
                scroll_view_2.setVisibility(View.INVISIBLE);
                text_view.setText("");
                image_view.setVisibility(View.GONE);
                image_view_2.setVisibility(View.GONE);
                image_view_3.setVisibility(View.VISIBLE);
                image_view.setImageDrawable(null);
                image_view_2.setImageDrawable(null);
                image_view_3.setImageResource(R.drawable.mod3pt2pg26);
            }
            if (page_number == 27){
                scroll_view_1.setVisibility(View.INVISIBLE);
                scroll_view_2.setVisibility(View.INVISIBLE);
                text_view.setText(getString(R.string.mod3pt2pg27title));
                image_view.setVisibility(View.GONE);
                image_view_2.setVisibility(View.GONE);
                image_view_3.setVisibility(View.VISIBLE);
                image_view.setImageDrawable(null);
                image_view_2.setImageDrawable(null);
                image_view_3.setImageResource(R.drawable.mod3pt2pg27);
            }
            if (page_number == 28){
                scroll_view_1.setVisibility(View.VISIBLE);
                scroll_view_2.setVisibility(View.INVISIBLE);
                text_view.setText("");
                text_view_2.setText(getString(R.string.mod3pt2pg28));
                image_view.setVisibility(View.VISIBLE);
                image_view_2.setVisibility(View.GONE);
                image_view_3.setVisibility(View.GONE);
                image_view.setImageResource(R.drawable.mod3pt2pg28);
                image_view_2.setImageDrawable(null);
                image_view_3.setImageDrawable(null);
            }
            if (page_number == 29){
                scroll_view_1.setVisibility(View.INVISIBLE);
                scroll_view_2.setVisibility(View.INVISIBLE);
                text_view.setText(getString(R.string.mod3pt2pg29title));
                image_view.setVisibility(View.GONE);
                image_view_2.setVisibility(View.GONE);
                image_view_3.setVisibility(View.VISIBLE);
                image_view.setImageDrawable(null);
                image_view_2.setImageDrawable(null);
                image_view_3.setImageResource(R.drawable.mod3pt2pg29);
            }
            if (page_number == 30){
                scroll_view_1.setVisibility(View.INVISIBLE);
                scroll_view_2.setVisibility(View.VISIBLE);
                text_view.setText(getString(R.string.mod3pt2pg30title));
                text_view_3.setText(getString(R.string.mod3pt2pg30));
                image_view.setVisibility(View.GONE);
                image_view_2.setVisibility(View.VISIBLE);
                image_view_3.setVisibility(View.GONE);
                image_view.setImageDrawable(null);
                image_view_2.setImageResource(R.drawable.mod3pt2pg30);
                image_view_3.setImageDrawable(null);
            }
            if (page_number == 31){
                scroll_view_1.setVisibility(View.INVISIBLE);
                scroll_view_2.setVisibility(View.INVISIBLE);
                text_view.setText(getString(R.string.mod3pt2pg31title));
                image_view.setVisibility(View.GONE);
                image_view_2.setVisibility(View.GONE);
                image_view_3.setVisibility(View.VISIBLE);
                image_view.setImageDrawable(null);
                image_view_2.setImageDrawable(null);
                image_view_3.setImageResource(R.drawable.mod3pt2pg31);
            }
        }
    }

    public void mod3Next(View view){
        page_number += 1;
        if (page_number < 34){
            if (page_number == 2){
                scroll_view_1.setVisibility(View.VISIBLE);
                scroll_view_2.setVisibility(View.INVISIBLE);
                text_view.setText(getString(R.string.mod3pt2pg2title));
                text_view_2.setText(getString(R.string.mod3pt2pg2));
                image_view.setVisibility(View.VISIBLE);
                image_view_2.setVisibility(View.GONE);
                image_view_3.setVisibility(View.GONE);
                image_view.setImageResource(R.drawable.headphones);
                image_view_2.setImageDrawable(null);
                image_view_3.setImageDrawable(null);
            }
            if (page_number == 3){
                scroll_view_1.setVisibility(View.VISIBLE);
                scroll_view_2.setVisibility(View.INVISIBLE);
                text_view.setText(getString(R.string.mod3pt2pg3title));
                text_view_2.setText(getString(R.string.mod3pt2pg3));
                image_view.setVisibility(View.VISIBLE);
                image_view_2.setVisibility(View.GONE);
                image_view_3.setVisibility(View.GONE);
                image_view.setImageResource(R.drawable.mod3pt1pg3);
                image_view_2.setImageDrawable(null);
                image_view_3.setImageDrawable(null);
            }
            if (page_number == 4){
                scroll_view_1.setVisibility(View.VISIBLE);
                scroll_view_2.setVisibility(View.INVISIBLE);
                text_view.setText(getString(R.string.mod3pt2pg4title));
                text_view_2.setText(getString(R.string.mod3pt2pg4));
                image_view.setVisibility(View.VISIBLE);
                image_view_2.setVisibility(View.GONE);
                image_view_3.setVisibility(View.GONE);
                image_view.setImageResource(R.drawable.mod3pt1pg4);
                image_view_2.setImageDrawable(null);
                image_view_3.setImageDrawable(null);
            }
            if (page_number == 5){
                scroll_view_1.setVisibility(View.VISIBLE);
                scroll_view_2.setVisibility(View.INVISIBLE);
                text_view.setText(getString(R.string.mod3pt2pg5title));
                text_view_2.setText(getString(R.string.mod3pt2pg5));
                image_view.setVisibility(View.VISIBLE);
                image_view_2.setVisibility(View.GONE);
                image_view_3.setVisibility(View.GONE);
                image_view.setImageResource(R.drawable.mod3pt1pg5);
                image_view_2.setImageDrawable(null);
                image_view_3.setImageDrawable(null);
            }
            if (page_number == 6){
                scroll_view_1.setVisibility(View.INVISIBLE);
                scroll_view_2.setVisibility(View.VISIBLE);
                text_view.setText(getString(R.string.mod3pt2pg6title));
                text_view_3.setText(getString(R.string.mod3pt2pg6));
                image_view.setVisibility(View.GONE);
                image_view_2.setVisibility(View.VISIBLE);
                image_view_3.setVisibility(View.GONE);
                image_view.setImageDrawable(null);
                image_view_2.setImageResource(R.drawable.mod3pt1pg6);
                image_view_3.setImageDrawable(null);
            }
            if (page_number == 7){
                scroll_view_1.setVisibility(View.INVISIBLE);
                scroll_view_2.setVisibility(View.VISIBLE);
                text_view.setText(getString(R.string.mod3pt2pg79title));
                text_view_3.setText(getString(R.string.mod3pt2pg7));
                image_view.setVisibility(View.GONE);
                image_view_2.setVisibility(View.VISIBLE);
                image_view_3.setVisibility(View.GONE);
                image_view.setImageDrawable(null);
                image_view_2.setImageResource(R.drawable.mod3pt1pg7);
                image_view_3.setImageDrawable(null);
            }
            if (page_number == 8){
                scroll_view_1.setVisibility(View.INVISIBLE);
                scroll_view_2.setVisibility(View.VISIBLE);
                text_view.setText(getString(R.string.mod3pt2pg79title));
                text_view_3.setText(getString(R.string.mod3pt2pg8));
                image_view.setVisibility(View.GONE);
                image_view_2.setVisibility(View.VISIBLE);
                image_view_3.setVisibility(View.GONE);
                image_view.setImageDrawable(null);
                image_view_2.setImageResource(R.drawable.mod3pt2pg8);
                image_view_3.setImageDrawable(null);
            }
            if (page_number == 9){
                scroll_view_1.setVisibility(View.INVISIBLE);
                scroll_view_2.setVisibility(View.VISIBLE);
                text_view.setText(getString(R.string.mod3pt2pg79title));
                text_view_3.setText(getString(R.string.mod3pt2pg9));
                image_view.setVisibility(View.GONE);
                image_view_2.setVisibility(View.VISIBLE);
                image_view_3.setVisibility(View.GONE);
                image_view.setImageDrawable(null);
                image_view_2.setImageResource(R.drawable.mod3pt2pg9);
                image_view_3.setImageDrawable(null);
            }
            if (page_number == 10){
                scroll_view_1.setVisibility(View.INVISIBLE);
                scroll_view_2.setVisibility(View.INVISIBLE);
                text_view.setText(getString(R.string.mod3pt2pg10title));
                image_view.setVisibility(View.GONE);
                image_view_2.setVisibility(View.GONE);
                image_view_3.setVisibility(View.VISIBLE);
                image_view.setImageDrawable(null);
                image_view_2.setImageDrawable(null);
                image_view_3.setImageResource(R.drawable.mod3pt2pg10);
            }
            if (page_number == 11){
                scroll_view_1.setVisibility(View.INVISIBLE);
                scroll_view_2.setVisibility(View.INVISIBLE);
                text_view.setText(getString(R.string.mod3pt2pg11title));
                image_view.setVisibility(View.GONE);
                image_view_2.setVisibility(View.GONE);
                image_view_3.setVisibility(View.VISIBLE);
                image_view.setImageDrawable(null);
                image_view_2.setImageDrawable(null);
                image_view_3.setImageResource(R.drawable.mod3pt2pg11);
            }
            if (page_number == 12){
                scroll_view_1.setVisibility(View.INVISIBLE);
                scroll_view_2.setVisibility(View.INVISIBLE);
                text_view.setText(getString(R.string.mod3pt2pg12title));
                image_view.setVisibility(View.GONE);
                image_view_2.setVisibility(View.GONE);
                image_view_3.setVisibility(View.VISIBLE);
                image_view.setImageDrawable(null);
                image_view_2.setImageDrawable(null);
                image_view_3.setImageResource(R.drawable.mod3pt2pg12);
            }
            if (page_number == 13){
                scroll_view_1.setVisibility(View.INVISIBLE);
                scroll_view_2.setVisibility(View.INVISIBLE);
                text_view.setText(getString(R.string.mod3pt2pg13title));
                image_view.setVisibility(View.GONE);
                image_view_2.setVisibility(View.GONE);
                image_view_3.setVisibility(View.VISIBLE);
                image_view.setImageDrawable(null);
                image_view_2.setImageDrawable(null);
                image_view_3.setImageResource(R.drawable.mod3pt2pg13);
            }
            if (page_number == 14){
                scroll_view_1.setVisibility(View.INVISIBLE);
                scroll_view_2.setVisibility(View.INVISIBLE);
                text_view.setText(getString(R.string.mod3pt2pg14title));
                image_view.setVisibility(View.GONE);
                image_view_2.setVisibility(View.GONE);
                image_view_3.setVisibility(View.VISIBLE);
                image_view.setImageDrawable(null);
                image_view_2.setImageDrawable(null);
                image_view_3.setImageResource(R.drawable.mod3pt2pg14);
            }
            if (page_number == 15){
                scroll_view_1.setVisibility(View.VISIBLE);
                scroll_view_2.setVisibility(View.INVISIBLE);
                text_view.setText(getString(R.string.mod3pt2pg15title));
                text_view_2.setText(getString(R.string.mod3pt2pg15));
                image_view.setVisibility(View.VISIBLE);
                image_view_2.setVisibility(View.GONE);
                image_view_3.setVisibility(View.GONE);
                image_view.setImageResource(R.drawable.mod3pt2pg15);
                image_view_2.setImageDrawable(null);
                image_view_3.setImageDrawable(null);
            }
            if (page_number == 16){
                scroll_view_1.setVisibility(View.INVISIBLE);
                scroll_view_2.setVisibility(View.INVISIBLE);
                text_view.setText(getString(R.string.mod3pt2pg16title));
                image_view.setVisibility(View.GONE);
                image_view_2.setVisibility(View.GONE);
                image_view_3.setVisibility(View.VISIBLE);
                image_view.setImageDrawable(null);
                image_view_2.setImageDrawable(null);
                image_view_3.setImageResource(R.drawable.mod3pt2pg16);
            }
            if (page_number == 17){
                scroll_view_1.setVisibility(View.VISIBLE);
                scroll_view_2.setVisibility(View.INVISIBLE);
                text_view.setText(getString(R.string.mod3pt2pg17title));
                text_view_2.setText(getString(R.string.mod3pt2pg17));
                image_view.setVisibility(View.GONE);
                image_view_2.setVisibility(View.GONE);
                image_view_3.setVisibility(View.GONE);
                image_view.setImageDrawable(null);
                image_view_2.setImageDrawable(null);
                image_view_3.setImageDrawable(null);
            }
            if (page_number == 18){
                scroll_view_1.setVisibility(View.INVISIBLE);
                scroll_view_2.setVisibility(View.INVISIBLE);
                text_view.setText(getString(R.string.mod3pt2pg18title));
                image_view.setVisibility(View.GONE);
                image_view_2.setVisibility(View.GONE);
                image_view_3.setVisibility(View.VISIBLE);
                image_view.setImageDrawable(null);
                image_view_2.setImageDrawable(null);
                image_view_3.setImageResource(R.drawable.mod3pt2pg18);
            }
            if (page_number == 19){
                scroll_view_1.setVisibility(View.VISIBLE);
                scroll_view_2.setVisibility(View.INVISIBLE);
                text_view.setText(getString(R.string.mod3pt2pg19title));
                text_view_2.setText(getString(R.string.mod3pt2pg19));
                image_view.setVisibility(View.VISIBLE);
                image_view_2.setVisibility(View.GONE);
                image_view_3.setVisibility(View.GONE);
                image_view.setImageResource(R.drawable.mod3pt2pg19);
                image_view_2.setImageDrawable(null);
                image_view_3.setImageDrawable(null);
            }
            if (page_number == 20){
                scroll_view_1.setVisibility(View.VISIBLE);
                scroll_view_2.setVisibility(View.INVISIBLE);
                text_view.setText(getString(R.string.mod3pt2pg20title));
                text_view_2.setText(getString(R.string.mod3pt2pg20));
                image_view.setVisibility(View.GONE);
                image_view_2.setVisibility(View.GONE);
                image_view_3.setVisibility(View.GONE);
                image_view.setImageDrawable(null);
                image_view_2.setImageDrawable(null);
                image_view_3.setImageDrawable(null);
            }
            if (page_number == 21){
                scroll_view_1.setVisibility(View.INVISIBLE);
                scroll_view_2.setVisibility(View.VISIBLE);
                text_view.setText(getString(R.string.mod3pt2pg21title));
                text_view_3.setText(getString(R.string.mod3pt2pg21));
                image_view.setVisibility(View.GONE);
                image_view_2.setVisibility(View.VISIBLE);
                image_view_3.setVisibility(View.GONE);
                image_view.setImageDrawable(null);
                image_view_2.setImageResource(R.drawable.mod3pt2pg21);
                image_view_3.setImageDrawable(null);
            }
            if (page_number == 22){
                scroll_view_1.setVisibility(View.VISIBLE);
                scroll_view_2.setVisibility(View.INVISIBLE);
                text_view.setText(getString(R.string.mod3pt2pg22title));
                text_view_2.setText(getString(R.string.mod3pt2pg22));
                image_view.setVisibility(View.VISIBLE);
                image_view_2.setVisibility(View.GONE);
                image_view_3.setVisibility(View.GONE);
                image_view.setImageResource(R.drawable.mod3pt2pg22);
                image_view_2.setImageDrawable(null);
                image_view_3.setImageDrawable(null);
            }
            if (page_number == 23){
                scroll_view_1.setVisibility(View.VISIBLE);
                scroll_view_2.setVisibility(View.INVISIBLE);
                text_view.setText(getString(R.string.mod3pt2pg23title));
                text_view_2.setText(getString(R.string.mod3pt2pg23));
                image_view.setVisibility(View.GONE);
                image_view_2.setVisibility(View.GONE);
                image_view_3.setVisibility(View.GONE);
                image_view.setImageDrawable(null);
                image_view_2.setImageDrawable(null);
                image_view_3.setImageDrawable(null);
            }
            if (page_number == 24){
                scroll_view_1.setVisibility(View.VISIBLE);
                scroll_view_2.setVisibility(View.INVISIBLE);
                text_view.setText(getString(R.string.mod3pt2pg24title));
                text_view_2.setText(getString(R.string.mod3pt2pg24));
                image_view.setVisibility(View.GONE);
                image_view_2.setVisibility(View.GONE);
                image_view_3.setVisibility(View.GONE);
                image_view.setImageDrawable(null);
                image_view_2.setImageDrawable(null);
                image_view_3.setImageDrawable(null);
            }
            if (page_number == 25){
                scroll_view_1.setVisibility(View.INVISIBLE);
                scroll_view_2.setVisibility(View.VISIBLE);
                text_view.setText(getString(R.string.mod3pt2pg25title));
                text_view_3.setText(getString(R.string.mod3pt2pg25));
                image_view.setVisibility(View.GONE);
                image_view_2.setVisibility(View.VISIBLE);
                image_view_3.setVisibility(View.GONE);
                image_view.setImageDrawable(null);
                image_view_2.setImageResource(R.drawable.mod3pt2pg25);
                image_view_3.setImageDrawable(null);
            }
            if (page_number == 26){
                scroll_view_1.setVisibility(View.INVISIBLE);
                scroll_view_2.setVisibility(View.INVISIBLE);
                text_view.setText("");
                image_view.setVisibility(View.GONE);
                image_view_2.setVisibility(View.GONE);
                image_view_3.setVisibility(View.VISIBLE);
                image_view.setImageDrawable(null);
                image_view_2.setImageDrawable(null);
                image_view_3.setImageResource(R.drawable.mod3pt2pg26);
            }
            if (page_number == 27){
                scroll_view_1.setVisibility(View.INVISIBLE);
                scroll_view_2.setVisibility(View.INVISIBLE);
                text_view.setText(getString(R.string.mod3pt2pg27title));
                image_view.setVisibility(View.GONE);
                image_view_2.setVisibility(View.GONE);
                image_view_3.setVisibility(View.VISIBLE);
                image_view.setImageDrawable(null);
                image_view_2.setImageDrawable(null);
                image_view_3.setImageResource(R.drawable.mod3pt2pg27);
            }
            if (page_number == 28){
                scroll_view_1.setVisibility(View.VISIBLE);
                scroll_view_2.setVisibility(View.INVISIBLE);
                text_view.setText("");
                text_view_2.setText(getString(R.string.mod3pt2pg28));
                image_view.setVisibility(View.VISIBLE);
                image_view_2.setVisibility(View.GONE);
                image_view_3.setVisibility(View.GONE);
                image_view.setImageResource(R.drawable.mod3pt2pg28);
                image_view_2.setImageDrawable(null);
                image_view_3.setImageDrawable(null);
            }
            if (page_number == 29){
                scroll_view_1.setVisibility(View.INVISIBLE);
                scroll_view_2.setVisibility(View.INVISIBLE);
                text_view.setText(getString(R.string.mod3pt2pg29title));
                image_view.setVisibility(View.GONE);
                image_view_2.setVisibility(View.GONE);
                image_view_3.setVisibility(View.VISIBLE);
                image_view.setImageDrawable(null);
                image_view_2.setImageDrawable(null);
                image_view_3.setImageResource(R.drawable.mod3pt2pg29);
            }
            if (page_number == 30){
                scroll_view_1.setVisibility(View.INVISIBLE);
                scroll_view_2.setVisibility(View.VISIBLE);
                text_view.setText(getString(R.string.mod3pt2pg30title));
                text_view_3.setText(getString(R.string.mod3pt2pg30));
                image_view.setVisibility(View.GONE);
                image_view_2.setVisibility(View.VISIBLE);
                image_view_3.setVisibility(View.GONE);
                image_view.setImageDrawable(null);
                image_view_2.setImageResource(R.drawable.mod3pt2pg30);
                image_view_3.setImageDrawable(null);
            }
            if (page_number == 31){
                scroll_view_1.setVisibility(View.INVISIBLE);
                scroll_view_2.setVisibility(View.INVISIBLE);
                text_view.setText(getString(R.string.mod3pt2pg31title));
                image_view.setVisibility(View.GONE);
                image_view_2.setVisibility(View.GONE);
                image_view_3.setVisibility(View.VISIBLE);
                image_view.setImageDrawable(null);
                image_view_2.setImageDrawable(null);
                image_view_3.setImageResource(R.drawable.mod3pt2pg31);
            }
            if (page_number == 32){
                scroll_view_1.setVisibility(View.INVISIBLE);
                scroll_view_2.setVisibility(View.INVISIBLE);
                text_view.setText(getString(R.string.mod3pt2pg32title));
                image_view.setVisibility(View.GONE);
                image_view_2.setVisibility(View.GONE);
                image_view_3.setVisibility(View.VISIBLE);
                image_view.setImageDrawable(null);
                image_view_2.setImageDrawable(null);
                image_view_3.setImageResource(R.drawable.mod3pt2pg32);
            }
            if (page_number == 33){
                finish();
            }
        }
    }
}
