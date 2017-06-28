package com.example.tinnicure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Module4Part1 extends AppCompatActivity {

    TextView text_view;
    TextView text_view_2;
    TextView text_view_3;
    int page_number = 1;
    ScrollView scroll_View;
    ScrollView scroll_View_2;
    ScrollView scroll_View_3;
    ScrollView scroll_View_4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module4_part1);
        text_view = (TextView) findViewById(R.id.text_view_mod4_pt1);
        text_view_2 = (TextView) findViewById(R.id.text_view_mod4_pt1_2);
        scroll_View = (ScrollView) findViewById(R.id.sv4_ex1);
        scroll_View_2 = (ScrollView) findViewById(R.id.sv4_ex2_1);
        scroll_View_3 = (ScrollView) findViewById(R.id.sv4_ex2_2);
        scroll_View_4 = (ScrollView) findViewById(R.id.sv4_ex2_3);

        page_number = 1;
        text_view.setText(getString(R.string.mod4pt1pg1title));
        text_view_2.setText(getString(R.string.mod4pt1pg1));
    }

    public void mod4Next(View view){
        page_number += 1;
        if (page_number < 44){
            if (page_number == 2){
                text_view.setText(getString(R.string.mod4pt1pg2title));
                text_view_2.setText(getString(R.string.mod4pt1pg2));
            }
            if (page_number == 3){
                text_view.setText(getString(R.string.mod4pt1pg3title));
                text_view_2.setText(getString(R.string.mod4pt1pg3));
            }
            if (page_number == 4){
                text_view.setText(getString(R.string.mod4pt1pg4title));
                text_view_2.setText(getString(R.string.mod4pt1pg4));
            }
            if (page_number == 5){
                text_view.setText("");
                text_view_2.setText(getString(R.string.mod4pt1pg5));
            }
            if (page_number == 6){
                text_view.setText(getString(R.string.mod4pt1pg6title));
                text_view_2.setText(getString(R.string.mod4pt1pg6));
            }
            if (page_number == 7){
                text_view.setText(getString(R.string.mod4pt1pg7title));
                text_view_2.setText(getString(R.string.mod4pt1pg7));
            }
            if (page_number == 8){
                text_view.setText(getString(R.string.mod4pt1pg8title));
                text_view_2.setText(getString(R.string.mod4pt1pg8));
            }
            if (page_number == 9){
                text_view.setText(getString(R.string.mod4pt1pg9title));
                text_view_2.setText(getString(R.string.mod4pt1pg9));
            }
            if (page_number == 10){
                text_view.setText(getString(R.string.mod4pt1pg10title));
                text_view_2.setText(getString(R.string.mod4pt1pg10));
            }
            if (page_number == 11){
                text_view.setText(getString(R.string.mod4pt1pg11title));
                text_view_2.setText(getString(R.string.mod4pt1pg11));
            }
            if (page_number == 12){
                text_view.setText(getString(R.string.mod4pt1pg12title));
                text_view_2.setText(getString(R.string.mod4pt1pg12));
            }
            if (page_number == 13){
                text_view.setText(getString(R.string.mod4pt1pg13title));
                text_view_2.setText(getString(R.string.mod4pt1pg13));
            }
            if (page_number == 14){
                text_view.setText(getString(R.string.mod4pt1pg14title));
                text_view_2.setText(getString(R.string.mod4pt1pg14));
            }
            if (page_number == 15){
                text_view.setText("");
                text_view_2.setText(getString(R.string.mod4pt1pg15));
            }
            if (page_number == 16){
                text_view.setText(getString(R.string.mod4pt1pg16title));
                text_view_2.setText(getString(R.string.mod4pt1pg16));
            }
            if (page_number == 17){
                text_view.setText(getString(R.string.mod4pt1pg17title));
                text_view_2.setText(getString(R.string.mod4pt1pg17));
            }
            if (page_number == 18){
                text_view.setText(getString(R.string.mod4pt1pg18title));
                text_view_2.setText(getString(R.string.mod4pt1pg18));
            }
            if (page_number == 19){
                text_view.setText(getString(R.string.mod4pt1pg19title));
                text_view_2.setText(getString(R.string.mod4pt1pg19));
            }
            if (page_number == 20){
                text_view.setText(getString(R.string.mod4pt1pg20title));
                text_view_2.setText(getString(R.string.mod4pt1pg20));
            }
            if (page_number == 21){
                text_view.setText(getString(R.string.mod4pt1pg21title));
                text_view_2.setText(getString(R.string.mod4pt1pg21));
            }
            if (page_number == 22){
                text_view.setText(getString(R.string.mod4pt1pg22title));
                text_view_2.setText(getString(R.string.mod4pt1pg22));
            }
            if (page_number == 23){
                text_view.setText(getString(R.string.mod4pt1pg23title));
                text_view_2.setText(getString(R.string.mod4pt1pg23));
            }
            if (page_number == 24){
                text_view.setText(getString(R.string.mod4pt1pg24title));
                text_view_2.setText(getString(R.string.mod4pt1pg24));
            }
            if (page_number == 25){
                text_view.setText(getString(R.string.mod4pt1pg25title));
                text_view_2.setText(getString(R.string.mod4pt1pg25));
            }
            if (page_number == 26){
                text_view.setText(getString(R.string.mod4pt1pg26title));
                text_view_2.setText(getString(R.string.mod4pt1pg26));
            }
            if (page_number == 27){
                text_view.setText(getString(R.string.mod4pt1pg27title));
                text_view_2.setText(getString(R.string.mod4pt1pg27));
            }
            if (page_number == 28){
                text_view.setText(getString(R.string.mod4pt1pg28title));
                text_view_2.setText(getString(R.string.mod4pt1pg28));
            }
            if (page_number == 29){
                text_view.setText(getString(R.string.mod4pt1pg29title));
                text_view_2.setText(getString(R.string.mod4pt1pg29));
            }
            if (page_number == 30){
                text_view.setText(getString(R.string.mod4pt1pg30title));
                text_view_2.setText(getString(R.string.mod4pt1pg30));
            }
            if (page_number == 31){
                text_view.setText(getString(R.string.mod4pt1pg31title));
                text_view_2.setText(getString(R.string.mod4pt1pg31));
            }
            if (page_number == 32){
                text_view.setText(getString(R.string.mod4pt1pg32title));
                text_view_2.setText(getString(R.string.mod4pt1pg32));
            }
            if (page_number == 33){
                text_view.setText("");
                text_view_2.setText(getString(R.string.mod4pt1pg33));
            }
            if (page_number == 34){
                text_view.setText(getString(R.string.mod4pt1pg34title));
                text_view_2.setText(getString(R.string.mod4pt1pg34));
            }
            if (page_number == 35){
                text_view.setText("");
                text_view_2.setText(getString(R.string.mod4pt1pg35));
            }
            if (page_number == 36){
                text_view.setText("");
                text_view_2.setText(getString(R.string.mod4pt1pg36));
            }
            if (page_number == 37){
                text_view.setText(getString(R.string.mod4pt1pg37title));
                text_view_2.setText(getString(R.string.mod4pt1pg37));
            }
            if (page_number == 38){
                text_view.setText(getString(R.string.mod4pt1pg38title));
                text_view_2.setText("");
                scroll_View.setVisibility(View.VISIBLE);
            }
            if (page_number == 39){
                text_view.setText(getString(R.string.mod4pt1pg39title));
                text_view_2.setText("");
                scroll_View.setVisibility(View.GONE);
                scroll_View_2.setVisibility(View.VISIBLE);
            }
            if (page_number == 40){
                text_view.setText(getString(R.string.mod4pt1pg40title));
                text_view_2.setText("");
                scroll_View.setVisibility(View.GONE);
                scroll_View_2.setVisibility(View.GONE);
                scroll_View_3.setVisibility(View.VISIBLE);
            }
            if (page_number == 41){
                text_view.setText(getString(R.string.mod4pt1pg41title));
                text_view_2.setText("");
                scroll_View.setVisibility(View.GONE);
                scroll_View_2.setVisibility(View.GONE);
                scroll_View_3.setVisibility(View.GONE);
                scroll_View_4.setVisibility(View.VISIBLE);
            }

            if (page_number == 42){
                text_view.setText(getString(R.string.mod4pt1pg42title));
                text_view_2.setText(getString(R.string.mod4pt1pg42));
                scroll_View.setVisibility(View.GONE);
                scroll_View_2.setVisibility(View.GONE);
                scroll_View_3.setVisibility(View.GONE);
                scroll_View_4.setVisibility(View.GONE);
            }








        }
    }
}
