package com.example.tinnicure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

public class Module1Part1 extends AppCompatActivity {

    TextView text_view;
    TextView text_view_3;
    TextView text_view_4;
    int page_number = 1;
    ImageView my_image_view_2;
    ImageView my_image_view_3;
    ScrollView scroll_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module1_part1);
        my_image_view_2 = (ImageView) findViewById(R.id.image_view_mod1pt1_2);
        my_image_view_3 = (ImageView) findViewById(R.id.image_view_mod1pt1_3);
        scroll_view = (ScrollView) findViewById(R.id.scrollview1);
        text_view = (TextView) findViewById(R.id.text_view_mod1pt1);
        text_view_3 = (TextView) findViewById(R.id.text_view_mod1pt1_3);
        text_view_4 = (TextView) findViewById(R.id.textviewmod1pt1_4);
        if (savedInstanceState != null) {
            page_number = Integer.parseInt(savedInstanceState.getString("NUM"));
            if (page_number == 1){
                page_number = 1;
                my_image_view_2.setVisibility(View.GONE);
                my_image_view_3.setVisibility(View.INVISIBLE);
                text_view.setText(getString(R.string.outline));
                text_view_3.setText(getString(R.string.tinedoutline));
                text_view_4.setText("Page 1");
            }
            if (page_number == 2) {
                my_image_view_2.setVisibility(View.GONE);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.whatis));
                text_view_3.setText(getString(R.string.tinnitus));
                text_view_4.setText("Page 2");
            }
            if (page_number == 3) {
                my_image_view_2.setVisibility(View.VISIBLE);
                my_image_view_2.setImageResource(R.drawable.ears);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.howhear));
                text_view_3.setText(getString(R.string.soundwaves));
                text_view_4.setText("Page 3");
            }
            if (page_number == 4) {
                my_image_view_2.setVisibility(View.GONE);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.causes));
                text_view_3.setText(getString(R.string.mod1pg4));
                text_view_4.setText("Page 4");
            }
            if (page_number == 5) {
                my_image_view_2.setVisibility(View.GONE);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.causes));
                text_view_3.setText(getString(R.string.mod1pg5));
                text_view_4.setText("Page 5");
            }
            if (page_number == 6) {
                my_image_view_2.setVisibility(View.GONE);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.sounds));
                text_view_3.setText(getString(R.string.mod1pg6));
                text_view_4.setText("Page 6");
            }
            if (page_number == 7) {
                my_image_view_2.setVisibility(View.GONE);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.affect));
                text_view_3.setText(getString(R.string.mod1pg7));
                text_view_4.setText("Page 7");
            }
            if (page_number == 8) {
                my_image_view_2.setVisibility(View.GONE);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg8title));
                text_view_3.setText(getString(R.string.mod1pg8));
                text_view_4.setText("Page 8");
            }
            if (page_number == 9) {
                my_image_view_2.setVisibility(View.GONE);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg9title));
                text_view_3.setText(getString(R.string.mod1pg9));
                text_view_4.setText("Page 9");
            }
            if (page_number == 10) {
                my_image_view_2.setVisibility(View.GONE);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg10title));
                text_view_3.setText(getString(R.string.mod1pg10));
                text_view_4.setText("Page 10");
            }
            if (page_number == 11) {
                my_image_view_2.setVisibility(View.GONE);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg11title));
                text_view_3.setText(getString(R.string.mod1pg11));
                text_view_4.setText("Page 11");
            }
            if (page_number == 12) {
                my_image_view_2.setVisibility(View.GONE);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg11title));
                text_view_3.setText(getString(R.string.mod1pg12));
                text_view_4.setText("Page 12");
            }
            if (page_number == 13) {
                my_image_view_2.setVisibility(View.GONE);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg13title));
                text_view_3.setText(getString(R.string.mod1pg13));
                text_view_4.setText("Page 13");
            }
            if (page_number == 14) {
                my_image_view_2.setVisibility(View.GONE);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg14title));
                text_view_3.setText(getString(R.string.mod1pg14));
                text_view_4.setText("Page 14");
            }
            if (page_number == 15) {
                my_image_view_2.setVisibility(View.GONE);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg15title));
                text_view_3.setText(getString(R.string.mod1pg15));
                text_view_4.setText("Page 15");
            }
            if (page_number == 16) {
                my_image_view_2.setVisibility(View.GONE);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg16title));
                text_view_3.setText(getString(R.string.mod1pg16));
                text_view_4.setText("Page 16");
            }
            if (page_number == 17) {
                my_image_view_2.setVisibility(View.GONE);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg17title));
                text_view_3.setText(getString(R.string.mod1pg17));
                text_view_4.setText("Page 17");
            }
            if (page_number == 18) {
                my_image_view_2.setVisibility(View.GONE);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg18title));
                text_view_3.setText(getString(R.string.mod1pg18));
                text_view_4.setText("Page 18");
            }
            if (page_number == 19) {
                my_image_view_2.setVisibility(View.GONE);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg19title));
                text_view_3.setText(getString(R.string.mod1pg19));
                text_view_4.setText("Page 19");
            }
            if (page_number == 20) {
                my_image_view_2.setVisibility(View.GONE);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg20title));
                text_view_3.setText(getString(R.string.mod1pg20));
                text_view_4.setText("Page 20");
            }
            if (page_number == 21) {
                my_image_view_2.setVisibility(View.GONE);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg21title));
                text_view_3.setText(getString(R.string.mod1pg21));
                text_view_4.setText("Page 21");
            }
            if (page_number == 22) {
                my_image_view_2.setVisibility(View.GONE);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg22title));
                text_view_3.setText(getString(R.string.mod1pg22));
                text_view_4.setText("Page 22");
            }
            if (page_number == 23) {
                my_image_view_2.setVisibility(View.GONE);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg23title));
                text_view_3.setText(getString(R.string.mod1pg23));
                text_view_4.setText("Page 23");
            }
            if (page_number == 24) {
                my_image_view_2.setVisibility(View.GONE);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg24title));
                text_view_3.setText(getString(R.string.mod1pg24));
                text_view_4.setText("Page 24");
            }
            if (page_number == 25) {
                my_image_view_2.setVisibility(View.VISIBLE);
                my_image_view_2.setImageResource(R.drawable.womn);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg25title));
                text_view_3.setText(getString(R.string.mod1pg25));
                text_view_4.setText("Page 25");
            }
            if (page_number == 26) {
                my_image_view_2.setVisibility(View.GONE);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg26title));
                text_view_3.setText(getString(R.string.mod1pg26));
                text_view_4.setText("Page 26");
            }
            if (page_number == 27) {
                my_image_view_2.setVisibility(View.VISIBLE);
                my_image_view_2.setImageResource(R.drawable.candle);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg27title));
                text_view_3.setText(getString(R.string.mod1pg27));
                text_view_4.setText("Page 27");
            }
            if (page_number == 28) {
                my_image_view_2.setVisibility(View.VISIBLE);
                my_image_view_2.setImageResource(R.drawable.table);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg28title));
                text_view_3.setText(getString(R.string.mod1pg28));
                text_view_4.setText("Page 28");
            }
            if (page_number == 29) {
                my_image_view_2.setVisibility(View.VISIBLE);
                my_image_view_2.setImageResource(R.drawable.candletable);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg29title));
                text_view_3.setText(getString(R.string.mod1pg29));
                text_view_4.setText("Page 29");
            }
            if (page_number == 30) {
                my_image_view_2.setVisibility(View.VISIBLE);
                my_image_view_2.setImageResource(R.drawable.tin);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg30title));
                text_view_3.setText(getString(R.string.mod1pg30));
                text_view_4.setText("Page 30");
            }
            if (page_number == 31) {
                my_image_view_2.setVisibility(View.VISIBLE);
                my_image_view_2.setImageResource(R.drawable.pic);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg31title));
                text_view_3.setText(getString(R.string.mod1pg31));
                text_view_4.setText("Page 31");
            }
            if (page_number == 32) {
                my_image_view_3.setVisibility(View.VISIBLE);
                my_image_view_3.setImageResource(R.drawable.tinpic);
                my_image_view_2.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg32title));
                text_view_3.setText("");
                text_view_4.setText("Page 32");
            }
            if (page_number == 33) {
                my_image_view_2.setVisibility(View.VISIBLE);
                my_image_view_2.setImageResource(R.drawable.tinpic);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg33title));
                text_view_3.setText(getString(R.string.mod1pg33));
                text_view_4.setText("Page 33");
            }
            if (page_number == 34) {
                my_image_view_2.setVisibility(View.GONE);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg34title));
                text_view_3.setText(getString(R.string.mod1pg34));
                text_view_4.setText("Page 34");
            }
            if (page_number == 35) {
                my_image_view_2.setVisibility(View.VISIBLE);
                my_image_view_3.setVisibility(View.INVISIBLE);
                my_image_view_2.setImageResource(R.drawable.janet);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg35title));
                text_view_3.setText(getString(R.string.mod1pg35));
                text_view_4.setText("Page 35");
            }
            if (page_number == 36) {
                my_image_view_2.setVisibility(View.GONE);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg36title));
                text_view_3.setText(getString(R.string.mod1pg36));
                text_view_4.setText("Page 36");
            }
            if (page_number == 37) {
                my_image_view_2.setVisibility(View.GONE);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg37title));
                text_view_3.setText(getString(R.string.mod1pg37));
                text_view_4.setText("Page 37");
            }
            if (page_number == 38) {
                my_image_view_2.setVisibility(View.VISIBLE);
                my_image_view_2.setImageResource(R.drawable.patrick);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg38title));
                text_view_3.setText(getString(R.string.mod1pg38));
                text_view_4.setText("Page 38");
            }
            if (page_number == 39) {
                my_image_view_2.setVisibility(View.GONE);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg39title));
                text_view_3.setText(getString(R.string.mod1pg39));
                text_view_4.setText("Page 39");
            }
            if (page_number == 40) {
                my_image_view_2.setVisibility(View.VISIBLE);
                my_image_view_2.setImageResource(R.drawable.fan);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg40title));
                text_view_3.setText(getString(R.string.mod1pg40));
                text_view_4.setText("Page 40");
            }
            if (page_number == 41) {
                my_image_view_2.setVisibility(View.VISIBLE);
                my_image_view_2.setImageResource(R.drawable.music);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg41title));
                text_view_3.setText(getString(R.string.mod1pg41));
                text_view_4.setText("Page 41");
            }
            if (page_number == 42) {
                my_image_view_2.setVisibility(View.GONE);
                my_image_view_3.setVisibility(View.INVISIBLE);
                text_view.setText(getString(R.string.mod1pg42title));
                scroll_view.scrollTo(0,0);
                text_view_3.setText(getString(R.string.mod1pg42));
                text_view_4.setText("Page 42");
            }
            if (page_number == 43) {
                my_image_view_2.setVisibility(View.GONE);
                my_image_view_3.setVisibility(View.VISIBLE);
                my_image_view_3.setImageResource(R.drawable.graph);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg43title));
                text_view_3.setText("");
                text_view_4.setText("Page 43");
            }
            if (page_number == 44) {
                my_image_view_2.setVisibility(View.GONE);
                my_image_view_3.setVisibility(View.INVISIBLE);
                text_view.setText(getString(R.string.mod1pg44title));
                scroll_view.scrollTo(0,0);
                text_view_3.setText(getString(R.string.mod1pg44));
                text_view_4.setText("Page 44");
            }
            if (page_number == 45) {
                my_image_view_2.setVisibility(View.VISIBLE);
                my_image_view_2.setImageResource(R.drawable.bob);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg45title));
                text_view_3.setText(getString(R.string.mod1pg45));
                text_view_4.setText("Page 45");
            }
            if (page_number == 46) {
                my_image_view_2.setVisibility(View.GONE);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg46title));
                text_view_3.setText(getString(R.string.mod1pg46));
                text_view_4.setText("Page 46");
            }
            if (page_number == 47) {
                my_image_view_2.setVisibility(View.GONE);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg47title));
                text_view_3.setText(getString(R.string.mod1pg47));
                text_view_4.setText("Page 47");
            }
            if (page_number == 48) {
                my_image_view_2.setVisibility(View.VISIBLE);
                my_image_view_2.setImageResource(R.drawable.bob_slep);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg48title));
                text_view_3.setText(getString(R.string.mod1pg48));
                text_view_4.setText("Page 48");
            }
            if (page_number == 49) {
                my_image_view_2.setVisibility(View.GONE);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg49title));
                text_view_3.setText(getString(R.string.mod1pg49));
                text_view_4.setText("Page 49");
            }
            if (page_number == 50) {
                my_image_view_2.setVisibility(View.GONE);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg50title));
                text_view_3.setText(getString(R.string.mod1pg50));
                text_view_4.setText("Page 50");
            }
        }
        else{
            page_number = 1;
            my_image_view_2.setVisibility(View.GONE);
            my_image_view_3.setVisibility(View.INVISIBLE);
            scroll_view.scrollTo(0,0);
            text_view.setText(getString(R.string.outline));
            text_view_3.setText(getString(R.string.tinedoutline));
            text_view_4.setText("Page 1");
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("NUM",Integer.toString(page_number));
    }

    public void mod1Pt1Back(View view) {
        page_number -= 1;
        if (page_number >= 0) {
            if (page_number == 0){
                finish();
            }
            if (page_number == 1){
                page_number = 1;
                my_image_view_2.setVisibility(View.GONE);
                my_image_view_3.setVisibility(View.INVISIBLE);
                text_view.setText(getString(R.string.outline));
                text_view_3.setText(getString(R.string.tinedoutline));
                text_view_4.setText("Page 1");
            }
            if (page_number == 2) {
                my_image_view_2.setVisibility(View.GONE);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.whatis));
                text_view_3.setText(getString(R.string.tinnitus));
                text_view_4.setText("Page 2");
            }
            if (page_number == 3) {
                my_image_view_2.setVisibility(View.VISIBLE);
                my_image_view_2.setImageResource(R.drawable.ears);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.howhear));
                text_view_3.setText(getString(R.string.soundwaves));
                text_view_4.setText("Page 3");
            }
            if (page_number == 4) {
                my_image_view_2.setVisibility(View.GONE);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.causes));
                text_view_3.setText(getString(R.string.mod1pg4));
                text_view_4.setText("Page 4");
            }
            if (page_number == 5) {
                my_image_view_2.setVisibility(View.GONE);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.causes));
                text_view_3.setText(getString(R.string.mod1pg5));
                text_view_4.setText("Page 5");
            }
            if (page_number == 6) {
                my_image_view_2.setVisibility(View.GONE);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.sounds));
                text_view_3.setText(getString(R.string.mod1pg6));
                text_view_4.setText("Page 6");
            }
            if (page_number == 7) {
                my_image_view_2.setVisibility(View.GONE);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.affect));
                text_view_3.setText(getString(R.string.mod1pg7));
                text_view_4.setText("Page 7");
            }
            if (page_number == 8) {
                my_image_view_2.setVisibility(View.GONE);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg8title));
                text_view_3.setText(getString(R.string.mod1pg8));
                text_view_4.setText("Page 8");
            }
            if (page_number == 9) {
                my_image_view_2.setVisibility(View.GONE);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg9title));
                text_view_3.setText(getString(R.string.mod1pg9));
                text_view_4.setText("Page 9");
            }
            if (page_number == 10) {
                my_image_view_2.setVisibility(View.GONE);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg10title));
                text_view_3.setText(getString(R.string.mod1pg10));
                text_view_4.setText("Page 10");
            }
            if (page_number == 11) {
                my_image_view_2.setVisibility(View.GONE);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg11title));
                text_view_3.setText(getString(R.string.mod1pg11));
                text_view_4.setText("Page 11");
            }
            if (page_number == 12) {
                my_image_view_2.setVisibility(View.GONE);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg11title));
                text_view_3.setText(getString(R.string.mod1pg12));
                text_view_4.setText("Page 12");
            }
            if (page_number == 13) {
                my_image_view_2.setVisibility(View.GONE);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg13title));
                text_view_3.setText(getString(R.string.mod1pg13));
                text_view_4.setText("Page 13");
            }
            if (page_number == 14) {
                my_image_view_2.setVisibility(View.GONE);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg14title));
                text_view_3.setText(getString(R.string.mod1pg14));
                text_view_4.setText("Page 14");
            }
            if (page_number == 15) {
                my_image_view_2.setVisibility(View.GONE);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg15title));
                text_view_3.setText(getString(R.string.mod1pg15));
                text_view_4.setText("Page 15");
            }
            if (page_number == 16) {
                my_image_view_2.setVisibility(View.GONE);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg16title));
                text_view_3.setText(getString(R.string.mod1pg16));
                text_view_4.setText("Page 16");
            }
            if (page_number == 17) {
                my_image_view_2.setVisibility(View.GONE);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg17title));
                text_view_3.setText(getString(R.string.mod1pg17));
                text_view_4.setText("Page 17");
            }
            if (page_number == 18) {
                my_image_view_2.setVisibility(View.GONE);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg18title));
                text_view_3.setText(getString(R.string.mod1pg18));
                text_view_4.setText("Page 18");
            }
            if (page_number == 19) {
                my_image_view_2.setVisibility(View.GONE);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg19title));
                text_view_3.setText(getString(R.string.mod1pg19));
                text_view_4.setText("Page 19");
            }
            if (page_number == 20) {
                my_image_view_2.setVisibility(View.GONE);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg20title));
                text_view_3.setText(getString(R.string.mod1pg20));
                text_view_4.setText("Page 20");
            }
            if (page_number == 21) {
                my_image_view_2.setVisibility(View.GONE);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg21title));
                text_view_3.setText(getString(R.string.mod1pg21));
                text_view_4.setText("Page 21");
            }
            if (page_number == 22) {
                my_image_view_2.setVisibility(View.GONE);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg22title));
                text_view_3.setText(getString(R.string.mod1pg22));
                text_view_4.setText("Page 22");
            }
            if (page_number == 23) {
                my_image_view_2.setVisibility(View.GONE);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg23title));
                text_view_3.setText(getString(R.string.mod1pg23));
                text_view_4.setText("Page 23");
            }
            if (page_number == 24) {
                my_image_view_2.setVisibility(View.GONE);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg24title));
                text_view_3.setText(getString(R.string.mod1pg24));
                text_view_4.setText("Page 24");
            }
            if (page_number == 25) {
                my_image_view_2.setVisibility(View.VISIBLE);
                my_image_view_2.setImageResource(R.drawable.womn);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg25title));
                text_view_3.setText(getString(R.string.mod1pg25));
                text_view_4.setText("Page 25");
            }
            if (page_number == 26) {
                my_image_view_2.setVisibility(View.GONE);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg26title));
                text_view_3.setText(getString(R.string.mod1pg26));
                text_view_4.setText("Page 26");
            }
            if (page_number == 27) {
                my_image_view_2.setVisibility(View.VISIBLE);
                my_image_view_2.setImageResource(R.drawable.candle);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg27title));
                text_view_3.setText(getString(R.string.mod1pg27));
                text_view_4.setText("Page 27");
            }
            if (page_number == 28) {
                my_image_view_2.setVisibility(View.VISIBLE);
                my_image_view_2.setImageResource(R.drawable.table);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg28title));
                text_view_3.setText(getString(R.string.mod1pg28));
                text_view_4.setText("Page 28");
            }
            if (page_number == 29) {
                my_image_view_2.setVisibility(View.VISIBLE);
                my_image_view_2.setImageResource(R.drawable.candletable);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg29title));
                text_view_3.setText(getString(R.string.mod1pg29));
                text_view_4.setText("Page 29");
            }
            if (page_number == 30) {
                my_image_view_2.setVisibility(View.VISIBLE);
                my_image_view_2.setImageResource(R.drawable.tin);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg30title));
                text_view_3.setText(getString(R.string.mod1pg30));
                text_view_4.setText("Page 30");
            }
            if (page_number == 31) {
                my_image_view_2.setVisibility(View.VISIBLE);
                my_image_view_2.setImageResource(R.drawable.pic);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg31title));
                text_view_3.setText(getString(R.string.mod1pg31));
                text_view_4.setText("Page 31");
            }
            if (page_number == 32) {
                my_image_view_3.setVisibility(View.VISIBLE);
                my_image_view_3.setImageResource(R.drawable.tinpic);
                my_image_view_2.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg32title));
                text_view_3.setText("");
                text_view_4.setText("Page 32");
            }
            if (page_number == 33) {
                my_image_view_2.setVisibility(View.VISIBLE);
                my_image_view_2.setImageResource(R.drawable.tinpic);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg33title));
                text_view_3.setText(getString(R.string.mod1pg33));
                text_view_4.setText("Page 33");
            }
            if (page_number == 34) {
                my_image_view_2.setVisibility(View.GONE);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg34title));
                text_view_3.setText(getString(R.string.mod1pg34));
                text_view_4.setText("Page 34");
            }
            if (page_number == 35) {
                my_image_view_2.setVisibility(View.VISIBLE);
                my_image_view_3.setVisibility(View.INVISIBLE);
                my_image_view_2.setImageResource(R.drawable.janet);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg35title));
                text_view_3.setText(getString(R.string.mod1pg35));
                text_view_4.setText("Page 35");
            }
            if (page_number == 36) {
                my_image_view_2.setVisibility(View.GONE);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg36title));
                text_view_3.setText(getString(R.string.mod1pg36));
                text_view_4.setText("Page 36");
            }
            if (page_number == 37) {
                my_image_view_2.setVisibility(View.GONE);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg37title));
                text_view_3.setText(getString(R.string.mod1pg37));
                text_view_4.setText("Page 37");
            }
            if (page_number == 38) {
                my_image_view_2.setVisibility(View.VISIBLE);
                my_image_view_2.setImageResource(R.drawable.patrick);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg38title));
                text_view_3.setText(getString(R.string.mod1pg38));
                text_view_4.setText("Page 38");
            }
            if (page_number == 39) {
                my_image_view_2.setVisibility(View.GONE);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg39title));
                text_view_3.setText(getString(R.string.mod1pg39));
                text_view_4.setText("Page 39");
            }
            if (page_number == 40) {
                my_image_view_2.setVisibility(View.VISIBLE);
                my_image_view_2.setImageResource(R.drawable.fan);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg40title));
                text_view_3.setText(getString(R.string.mod1pg40));
                text_view_4.setText("Page 40");
            }
            if (page_number == 41) {
                my_image_view_2.setVisibility(View.VISIBLE);
                my_image_view_2.setImageResource(R.drawable.music);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg41title));
                text_view_3.setText(getString(R.string.mod1pg41));
                text_view_4.setText("Page 41");
            }
            if (page_number == 42) {
                my_image_view_2.setVisibility(View.GONE);
                my_image_view_3.setVisibility(View.INVISIBLE);
                text_view.setText(getString(R.string.mod1pg42title));
                scroll_view.scrollTo(0,0);
                text_view_3.setText(getString(R.string.mod1pg42));
                text_view_4.setText("Page 42");
            }
            if (page_number == 43) {
                my_image_view_2.setVisibility(View.GONE);
                my_image_view_3.setVisibility(View.VISIBLE);
                my_image_view_3.setImageResource(R.drawable.graph);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg43title));
                text_view_3.setText("");
                text_view_4.setText("Page 43");
            }
            if (page_number == 44) {
                my_image_view_2.setVisibility(View.GONE);
                my_image_view_3.setVisibility(View.INVISIBLE);
                text_view.setText(getString(R.string.mod1pg44title));
                scroll_view.scrollTo(0,0);
                text_view_3.setText(getString(R.string.mod1pg44));
                text_view_4.setText("Page 44");
            }
            if (page_number == 45) {
                my_image_view_2.setVisibility(View.VISIBLE);
                my_image_view_2.setImageResource(R.drawable.bob);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg45title));
                text_view_3.setText(getString(R.string.mod1pg45));
                text_view_4.setText("Page 45");
            }
            if (page_number == 46) {
                my_image_view_2.setVisibility(View.GONE);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg46title));
                text_view_3.setText(getString(R.string.mod1pg46));
                text_view_4.setText("Page 46");
            }
            if (page_number == 47) {
                my_image_view_2.setVisibility(View.GONE);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg47title));
                text_view_3.setText(getString(R.string.mod1pg47));
                text_view_4.setText("Page 47");
            }
            if (page_number == 48) {
                my_image_view_2.setVisibility(View.VISIBLE);
                my_image_view_2.setImageResource(R.drawable.bob_slep);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg48title));
                text_view_3.setText(getString(R.string.mod1pg48));
                text_view_4.setText("Page 48");
            }
            if (page_number == 49) {
                my_image_view_2.setVisibility(View.GONE);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg49title));
                text_view_3.setText(getString(R.string.mod1pg49));
                text_view_4.setText("Page 49");
            }
        }
    }

    public void mod1Pt1Next(View view) {
        page_number += 1;
        if (page_number < 52) {
            if (page_number == 2) {
                my_image_view_2.setVisibility(View.GONE);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.whatis));
                text_view_3.setText(getString(R.string.tinnitus));
                text_view_4.setText("Page 2");
            }
            if (page_number == 3) {
                my_image_view_2.setVisibility(View.VISIBLE);
                my_image_view_2.setImageResource(R.drawable.ears);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.howhear));
                text_view_3.setText(getString(R.string.soundwaves));
                text_view_4.setText("Page 3");
            }
            if (page_number == 4) {
                my_image_view_2.setVisibility(View.GONE);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.causes));
                text_view_3.setText(getString(R.string.mod1pg4));
                text_view_4.setText("Page 4");
            }
            if (page_number == 5) {
                my_image_view_2.setVisibility(View.GONE);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.causes));
                text_view_3.setText(getString(R.string.mod1pg5));
                text_view_4.setText("Page 5");
            }
            if (page_number == 6) {
                my_image_view_2.setVisibility(View.GONE);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.sounds));
                text_view_3.setText(getString(R.string.mod1pg6));
                text_view_4.setText("Page 6");
            }
            if (page_number == 7) {
                my_image_view_2.setVisibility(View.GONE);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.affect));
                text_view_3.setText(getString(R.string.mod1pg7));
                text_view_4.setText("Page 7");
            }
            if (page_number == 8) {
                my_image_view_2.setVisibility(View.GONE);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg8title));
                text_view_3.setText(getString(R.string.mod1pg8));
                text_view_4.setText("Page 8");
            }
            if (page_number == 9) {
                my_image_view_2.setVisibility(View.GONE);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg9title));
                text_view_3.setText(getString(R.string.mod1pg9));
                text_view_4.setText("Page 9");
            }
            if (page_number == 10) {
                my_image_view_2.setVisibility(View.GONE);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg10title));
                text_view_3.setText(getString(R.string.mod1pg10));
                text_view_4.setText("Page 10");
            }
            if (page_number == 11) {
                my_image_view_2.setVisibility(View.GONE);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg11title));
                text_view_3.setText(getString(R.string.mod1pg11));
                text_view_4.setText("Page 11");
            }
            if (page_number == 12) {
                my_image_view_2.setVisibility(View.GONE);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg11title));
                text_view_3.setText(getString(R.string.mod1pg12));
                text_view_4.setText("Page 12");
            }
            if (page_number == 13) {
                my_image_view_2.setVisibility(View.GONE);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg13title));
                text_view_3.setText(getString(R.string.mod1pg13));
                text_view_4.setText("Page 13");
            }
            if (page_number == 14) {
                my_image_view_2.setVisibility(View.GONE);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg14title));
                text_view_3.setText(getString(R.string.mod1pg14));
                text_view_4.setText("Page 14");
            }
            if (page_number == 15) {
                my_image_view_2.setVisibility(View.GONE);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg15title));
                text_view_3.setText(getString(R.string.mod1pg15));
                text_view_4.setText("Page 15");
            }
            if (page_number == 16) {
                my_image_view_2.setVisibility(View.GONE);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg16title));
                text_view_3.setText(getString(R.string.mod1pg16));
                text_view_4.setText("Page 16");
            }
            if (page_number == 17) {
                my_image_view_2.setVisibility(View.GONE);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg17title));
                text_view_3.setText(getString(R.string.mod1pg17));
                text_view_4.setText("Page 17");
            }
            if (page_number == 18) {
                my_image_view_2.setVisibility(View.GONE);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg18title));
                text_view_3.setText(getString(R.string.mod1pg18));
                text_view_4.setText("Page 18");
            }
            if (page_number == 19) {
                my_image_view_2.setVisibility(View.GONE);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg19title));
                text_view_3.setText(getString(R.string.mod1pg19));
                text_view_4.setText("Page 19");
            }
            if (page_number == 20) {
                my_image_view_2.setVisibility(View.GONE);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg20title));
                text_view_3.setText(getString(R.string.mod1pg20));
                text_view_4.setText("Page 20");
            }
            if (page_number == 21) {
                my_image_view_2.setVisibility(View.GONE);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg21title));
                text_view_3.setText(getString(R.string.mod1pg21));
                text_view_4.setText("Page 21");
            }
            if (page_number == 22) {
                my_image_view_2.setVisibility(View.GONE);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg22title));
                text_view_3.setText(getString(R.string.mod1pg22));
                text_view_4.setText("Page 22");
            }
            if (page_number == 23) {
                my_image_view_2.setVisibility(View.GONE);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg23title));
                text_view_3.setText(getString(R.string.mod1pg23));
                text_view_4.setText("Page 23");
            }
            if (page_number == 24) {
                my_image_view_2.setVisibility(View.GONE);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg24title));
                text_view_3.setText(getString(R.string.mod1pg24));
                text_view_4.setText("Page 24");
            }
            if (page_number == 25) {
                my_image_view_2.setVisibility(View.VISIBLE);
                my_image_view_2.setImageResource(R.drawable.womn);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg25title));
                text_view_3.setText(getString(R.string.mod1pg25));
                text_view_4.setText("Page 25");
            }
            if (page_number == 26) {
                my_image_view_2.setVisibility(View.GONE);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg26title));
                text_view_3.setText(getString(R.string.mod1pg26));
                text_view_4.setText("Page 26");
            }
            if (page_number == 27) {
                my_image_view_2.setVisibility(View.VISIBLE);
                my_image_view_2.setImageResource(R.drawable.candle);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg27title));
                text_view_3.setText(getString(R.string.mod1pg27));
                text_view_4.setText("Page 27");
            }
            if (page_number == 28) {
                my_image_view_2.setVisibility(View.VISIBLE);
                my_image_view_2.setImageResource(R.drawable.table);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg28title));
                text_view_3.setText(getString(R.string.mod1pg28));
                text_view_4.setText("Page 28");
            }
            if (page_number == 29) {
                my_image_view_2.setVisibility(View.VISIBLE);
                my_image_view_2.setImageResource(R.drawable.candletable);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg29title));
                text_view_3.setText(getString(R.string.mod1pg29));
                text_view_4.setText("Page 29");
            }
            if (page_number == 30) {
                my_image_view_2.setVisibility(View.VISIBLE);
                my_image_view_2.setImageResource(R.drawable.tin);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg30title));
                text_view_3.setText(getString(R.string.mod1pg30));
                text_view_4.setText("Page 30");
            }
            if (page_number == 31) {
                my_image_view_2.setVisibility(View.VISIBLE);
                my_image_view_2.setImageResource(R.drawable.pic);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg31title));
                text_view_3.setText(getString(R.string.mod1pg31));
                text_view_4.setText("Page 31");
            }
            if (page_number == 32) {
                my_image_view_3.setVisibility(View.VISIBLE);
                my_image_view_3.setImageResource(R.drawable.tinpic);
                my_image_view_2.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg32title));
                text_view_3.setText("");
                text_view_4.setText("Page 32");
            }
            if (page_number == 33) {
                my_image_view_2.setVisibility(View.VISIBLE);
                my_image_view_2.setImageResource(R.drawable.tinpic);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg33title));
                text_view_3.setText(getString(R.string.mod1pg33));
                text_view_4.setText("Page 33");
            }
            if (page_number == 34) {
                my_image_view_2.setVisibility(View.GONE);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg34title));
                text_view_3.setText(getString(R.string.mod1pg34));
                text_view_4.setText("Page 34");
            }
            if (page_number == 35) {
                my_image_view_2.setVisibility(View.VISIBLE);
                my_image_view_3.setVisibility(View.INVISIBLE);
                my_image_view_2.setImageResource(R.drawable.janet);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg35title));
                text_view_3.setText(getString(R.string.mod1pg35));
                text_view_4.setText("Page 35");
            }
            if (page_number == 36) {
                my_image_view_2.setVisibility(View.GONE);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg36title));
                text_view_3.setText(getString(R.string.mod1pg36));
                text_view_4.setText("Page 36");
            }
            if (page_number == 37) {
                my_image_view_2.setVisibility(View.GONE);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg37title));
                text_view_3.setText(getString(R.string.mod1pg37));
                text_view_4.setText("Page 37");
            }
            if (page_number == 38) {
                my_image_view_2.setVisibility(View.VISIBLE);
                my_image_view_2.setImageResource(R.drawable.patrick);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg38title));
                text_view_3.setText(getString(R.string.mod1pg38));
                text_view_4.setText("Page 38");
            }
            if (page_number == 39) {
                my_image_view_2.setVisibility(View.GONE);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg39title));
                text_view_3.setText(getString(R.string.mod1pg39));
                text_view_4.setText("Page 39");
            }
            if (page_number == 40) {
                my_image_view_2.setVisibility(View.VISIBLE);
                my_image_view_2.setImageResource(R.drawable.fan);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg40title));
                text_view_3.setText(getString(R.string.mod1pg40));
                text_view_4.setText("Page 40");
            }
            if (page_number == 41) {
                my_image_view_2.setVisibility(View.VISIBLE);
                my_image_view_2.setImageResource(R.drawable.music);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg41title));
                text_view_3.setText(getString(R.string.mod1pg41));
                text_view_4.setText("Page 41");
            }
            if (page_number == 42) {
                my_image_view_2.setVisibility(View.GONE);
                my_image_view_3.setVisibility(View.INVISIBLE);
                text_view.setText(getString(R.string.mod1pg42title));
                scroll_view.scrollTo(0,0);
                text_view_3.setText(getString(R.string.mod1pg42));
                text_view_4.setText("Page 42");
            }
            if (page_number == 43) {
                my_image_view_2.setVisibility(View.GONE);
                my_image_view_3.setVisibility(View.VISIBLE);
                my_image_view_3.setImageResource(R.drawable.graph);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg43title));
                text_view_3.setText("");
                text_view_4.setText("Page 43");
            }
            if (page_number == 44) {
                my_image_view_2.setVisibility(View.GONE);
                my_image_view_3.setVisibility(View.INVISIBLE);
                text_view.setText(getString(R.string.mod1pg44title));
                scroll_view.scrollTo(0,0);
                text_view_3.setText(getString(R.string.mod1pg44));
                text_view_4.setText("Page 44");
            }
            if (page_number == 45) {
                my_image_view_2.setVisibility(View.VISIBLE);
                my_image_view_2.setImageResource(R.drawable.bob);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg45title));
                text_view_3.setText(getString(R.string.mod1pg45));
                text_view_4.setText("Page 45");
            }
            if (page_number == 46) {
                my_image_view_2.setVisibility(View.GONE);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg46title));
                text_view_3.setText(getString(R.string.mod1pg46));
                text_view_4.setText("Page 46");
            }
            if (page_number == 47) {
                my_image_view_2.setVisibility(View.GONE);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg47title));
                text_view_3.setText(getString(R.string.mod1pg47));
                text_view_4.setText("Page 47");
            }
            if (page_number == 48) {
                my_image_view_2.setVisibility(View.VISIBLE);
                my_image_view_2.setImageResource(R.drawable.bob_slep);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg48title));
                text_view_3.setText(getString(R.string.mod1pg48));
                text_view_4.setText("Page 48");
            }
            if (page_number == 49) {
                my_image_view_2.setVisibility(View.GONE);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg49title));
                text_view_3.setText(getString(R.string.mod1pg49));
                text_view_4.setText("Page 49");
            }
            if (page_number == 50) {
                my_image_view_2.setVisibility(View.GONE);
                my_image_view_3.setVisibility(View.INVISIBLE);
                scroll_view.scrollTo(0,0);
                text_view.setText(getString(R.string.mod1pg50title));
                text_view_3.setText(getString(R.string.mod1pg50));
                text_view_4.setText("Page 50");
            }
            if (page_number == 51){
                finish();
            }

        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.mod1pt1_main, menu);
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
            my_image_view_2.setVisibility(View.GONE);
            my_image_view_3.setVisibility(View.INVISIBLE);
            text_view.setText(getString(R.string.outline));
            text_view_3.setText(getString(R.string.tinedoutline));
            text_view_4.setText("Page 1");
        }
        if (id == R.id.Page2) {
            page_number = 2;
            my_image_view_2.setVisibility(View.GONE);
            my_image_view_3.setVisibility(View.INVISIBLE);
            scroll_view.scrollTo(0,0);
            text_view.setText(getString(R.string.whatis));
            text_view_3.setText(getString(R.string.tinnitus));
            text_view_4.setText("Page 2");
        }
        if (id == R.id.Page3) {
            page_number = 3;
            my_image_view_2.setVisibility(View.VISIBLE);
            my_image_view_2.setImageResource(R.drawable.ears);
            my_image_view_3.setVisibility(View.INVISIBLE);
            scroll_view.scrollTo(0,0);
            text_view.setText(getString(R.string.howhear));
            text_view_3.setText(getString(R.string.soundwaves));
            text_view_4.setText("Page 3");
        }
        if (id == R.id.Page4) {
            page_number = 4;
            my_image_view_2.setVisibility(View.GONE);
            my_image_view_3.setVisibility(View.INVISIBLE);
            scroll_view.scrollTo(0,0);
            text_view.setText(getString(R.string.causes));
            text_view_3.setText(getString(R.string.mod1pg4));
            text_view_4.setText("Page 4");
        }
        if (id == R.id.Page5) {
            page_number = 5;
            my_image_view_2.setVisibility(View.GONE);
            my_image_view_3.setVisibility(View.INVISIBLE);
            scroll_view.scrollTo(0,0);
            text_view.setText(getString(R.string.causes));
            text_view_3.setText(getString(R.string.mod1pg5));
            text_view_4.setText("Page 5");
        }
        if (id == R.id.Page6) {
            page_number = 6;
            my_image_view_2.setVisibility(View.GONE);
            my_image_view_3.setVisibility(View.INVISIBLE);
            scroll_view.scrollTo(0,0);
            text_view.setText(getString(R.string.sounds));
            text_view_3.setText(getString(R.string.mod1pg6));
            text_view_4.setText("Page 6");
        }
        if (id == R.id.Page7) {
            page_number = 7;
            my_image_view_2.setVisibility(View.GONE);
            my_image_view_3.setVisibility(View.INVISIBLE);
            scroll_view.scrollTo(0,0);
            text_view.setText(getString(R.string.affect));
            text_view_3.setText(getString(R.string.mod1pg7));
            text_view_4.setText("Page 7");
        }
        if (id == R.id.Page8) {
            page_number = 8;
            my_image_view_2.setVisibility(View.GONE);
            my_image_view_3.setVisibility(View.INVISIBLE);
            scroll_view.scrollTo(0,0);
            text_view.setText(getString(R.string.mod1pg8title));
            text_view_3.setText(getString(R.string.mod1pg8));
            text_view_4.setText("Page 8");
        }
        if (id == R.id.Page9) {
            page_number = 9;
            my_image_view_2.setVisibility(View.GONE);
            my_image_view_3.setVisibility(View.INVISIBLE);
            scroll_view.scrollTo(0,0);
            text_view.setText(getString(R.string.mod1pg9title));
            text_view_3.setText(getString(R.string.mod1pg9));
            text_view_4.setText("Page 9");
        }
        if (id == R.id.Page10) {
            page_number = 10;
            my_image_view_2.setVisibility(View.GONE);
            my_image_view_3.setVisibility(View.INVISIBLE);
            scroll_view.scrollTo(0,0);
            text_view.setText(getString(R.string.mod1pg10title));
            text_view_3.setText(getString(R.string.mod1pg10));
            text_view_4.setText("Page 10");
        }
        if (id == R.id.Page11) {
            page_number = 11;
            my_image_view_2.setVisibility(View.GONE);
            my_image_view_3.setVisibility(View.INVISIBLE);
            scroll_view.scrollTo(0,0);
            text_view.setText(getString(R.string.mod1pg11title));
            text_view_3.setText(getString(R.string.mod1pg11));
            text_view_4.setText("Page 11");
        }
        if (id == R.id.Page12) {
            page_number = 12;
            my_image_view_2.setVisibility(View.GONE);
            my_image_view_3.setVisibility(View.INVISIBLE);
            scroll_view.scrollTo(0,0);
            text_view.setText(getString(R.string.mod1pg11title));
            text_view_3.setText(getString(R.string.mod1pg12));
            text_view_4.setText("Page 12");
        }
        if (id == R.id.Page13) {
            page_number = 13;
            my_image_view_2.setVisibility(View.GONE);
            my_image_view_3.setVisibility(View.INVISIBLE);
            scroll_view.scrollTo(0,0);
            text_view.setText(getString(R.string.mod1pg13title));
            text_view_3.setText(getString(R.string.mod1pg13));
            text_view_4.setText("Page 13");
        }
        if (id == R.id.Page14) {
            page_number = 14;
            my_image_view_2.setVisibility(View.GONE);
            my_image_view_3.setVisibility(View.INVISIBLE);
            scroll_view.scrollTo(0,0);
            text_view.setText(getString(R.string.mod1pg14title));
            text_view_3.setText(getString(R.string.mod1pg14));
            text_view_4.setText("Page 14");
        }
        if (id == R.id.Page15) {
            page_number = 15;
            my_image_view_2.setVisibility(View.GONE);
            my_image_view_3.setVisibility(View.INVISIBLE);
            scroll_view.scrollTo(0,0);
            text_view.setText(getString(R.string.mod1pg15title));
            text_view_3.setText(getString(R.string.mod1pg15));
            text_view_4.setText("Page 15");
        }
        if (id == R.id.Page16) {
            page_number = 16;
            my_image_view_2.setVisibility(View.GONE);
            my_image_view_3.setVisibility(View.INVISIBLE);
            scroll_view.scrollTo(0,0);
            text_view.setText(getString(R.string.mod1pg16title));
            text_view_3.setText(getString(R.string.mod1pg16));
            text_view_4.setText("Page 16");
        }
        if (id == R.id.Page17) {
            page_number = 17;
            my_image_view_2.setVisibility(View.GONE);
            my_image_view_3.setVisibility(View.INVISIBLE);
            scroll_view.scrollTo(0,0);
            text_view.setText(getString(R.string.mod1pg17title));
            text_view_3.setText(getString(R.string.mod1pg17));
            text_view_4.setText("Page 17");
        }
        if (id == R.id.Page18) {
            page_number = 18;
            my_image_view_2.setVisibility(View.GONE);
            my_image_view_3.setVisibility(View.INVISIBLE);
            scroll_view.scrollTo(0,0);
            text_view.setText(getString(R.string.mod1pg18title));
            text_view_3.setText(getString(R.string.mod1pg18));
            text_view_4.setText("Page 18");
        }
        if (id == R.id.Page19) {
            page_number = 19;
            my_image_view_2.setVisibility(View.GONE);
            my_image_view_3.setVisibility(View.INVISIBLE);
            scroll_view.scrollTo(0,0);
            text_view.setText(getString(R.string.mod1pg19title));
            text_view_3.setText(getString(R.string.mod1pg19));
            text_view_4.setText("Page 19");
        }
        if (id == R.id.Page20) {
            page_number = 20;
            my_image_view_2.setVisibility(View.GONE);
            my_image_view_3.setVisibility(View.INVISIBLE);
            scroll_view.scrollTo(0,0);
            text_view.setText(getString(R.string.mod1pg20title));
            text_view_3.setText(getString(R.string.mod1pg20));
            text_view_4.setText("Page 20");
        }
        if (id == R.id.Page21) {
            page_number = 21;
            my_image_view_2.setVisibility(View.GONE);
            my_image_view_3.setVisibility(View.INVISIBLE);
            scroll_view.scrollTo(0,0);
            text_view.setText(getString(R.string.mod1pg21title));
            text_view_3.setText(getString(R.string.mod1pg21));
            text_view_4.setText("Page 21");
        }
        if (id == R.id.Page22) {
            page_number = 22;
            my_image_view_2.setVisibility(View.GONE);
            my_image_view_3.setVisibility(View.INVISIBLE);
            scroll_view.scrollTo(0,0);
            text_view.setText(getString(R.string.mod1pg22title));
            text_view_3.setText(getString(R.string.mod1pg22));
            text_view_4.setText("Page 22");
        }
        if (id == R.id.Page23) {
            page_number = 23;
            my_image_view_2.setVisibility(View.GONE);
            my_image_view_3.setVisibility(View.INVISIBLE);
            scroll_view.scrollTo(0,0);
            text_view.setText(getString(R.string.mod1pg23title));
            text_view_3.setText(getString(R.string.mod1pg23));
            text_view_4.setText("Page 23");
        }
        if (id == R.id.Page24) {
            page_number = 24;
            my_image_view_2.setVisibility(View.GONE);
            my_image_view_3.setVisibility(View.INVISIBLE);
            scroll_view.scrollTo(0,0);
            text_view.setText(getString(R.string.mod1pg24title));
            text_view_3.setText(getString(R.string.mod1pg24));
            text_view_4.setText("Page 24");
        }
        if (id == R.id.Page25) {
            page_number = 25;
            my_image_view_2.setVisibility(View.VISIBLE);
            my_image_view_2.setImageResource(R.drawable.womn);
            my_image_view_3.setVisibility(View.INVISIBLE);
            scroll_view.scrollTo(0,0);
            text_view.setText(getString(R.string.mod1pg25title));
            text_view_3.setText(getString(R.string.mod1pg25));
            text_view_4.setText("Page 25");
        }
        if (id == R.id.Page26) {
            page_number = 26;
            my_image_view_2.setVisibility(View.GONE);
            my_image_view_3.setVisibility(View.INVISIBLE);
            scroll_view.scrollTo(0,0);
            text_view.setText(getString(R.string.mod1pg26title));
            text_view_3.setText(getString(R.string.mod1pg26));
            text_view_4.setText("Page 26");
        }
        if (id == R.id.Page27) {
            page_number = 27;
            my_image_view_2.setVisibility(View.VISIBLE);
            my_image_view_2.setImageResource(R.drawable.candle);
            my_image_view_3.setVisibility(View.INVISIBLE);
            scroll_view.scrollTo(0,0);
            text_view.setText(getString(R.string.mod1pg27title));
            text_view_3.setText(getString(R.string.mod1pg27));
            text_view_4.setText("Page 27");
        }
        if (id == R.id.Page28) {
            page_number = 28;
            my_image_view_2.setVisibility(View.VISIBLE);
            my_image_view_2.setImageResource(R.drawable.table);
            my_image_view_3.setVisibility(View.INVISIBLE);
            scroll_view.scrollTo(0,0);
            text_view.setText(getString(R.string.mod1pg28title));
            text_view_3.setText(getString(R.string.mod1pg28));
            text_view_4.setText("Page 28");
        }
        if (id == R.id.Page29) {
            page_number = 29;
            my_image_view_2.setVisibility(View.VISIBLE);
            my_image_view_2.setImageResource(R.drawable.candletable);
            my_image_view_3.setVisibility(View.INVISIBLE);
            scroll_view.scrollTo(0,0);
            text_view.setText(getString(R.string.mod1pg29title));
            text_view_3.setText(getString(R.string.mod1pg29));
            text_view_4.setText("Page 29");
        }
        if (id == R.id.Page30) {
            page_number = 30;
            my_image_view_2.setVisibility(View.VISIBLE);
            my_image_view_2.setImageResource(R.drawable.tin);
            my_image_view_3.setVisibility(View.INVISIBLE);
            scroll_view.scrollTo(0,0);
            text_view.setText(getString(R.string.mod1pg30title));
            text_view_3.setText(getString(R.string.mod1pg30));
            text_view_4.setText("Page 30");
        }
        if (id == R.id.Page31) {
            page_number = 31;
            my_image_view_2.setVisibility(View.VISIBLE);
            my_image_view_2.setImageResource(R.drawable.pic);
            my_image_view_3.setVisibility(View.INVISIBLE);
            scroll_view.scrollTo(0,0);
            text_view.setText(getString(R.string.mod1pg31title));
            text_view_3.setText(getString(R.string.mod1pg31));
            text_view_4.setText("Page 31");
        }
        if (id == R.id.Page32) {
            page_number = 32;
            my_image_view_3.setVisibility(View.VISIBLE);
            my_image_view_3.setImageResource(R.drawable.tinpic);
            my_image_view_2.setVisibility(View.INVISIBLE);
            scroll_view.scrollTo(0,0);
            text_view.setText(getString(R.string.mod1pg32title));
            text_view_3.setText("");
            text_view_4.setText("Page 32");
        }
        if (id == R.id.Page33) {
            page_number = 33;
            my_image_view_2.setVisibility(View.VISIBLE);
            my_image_view_2.setImageResource(R.drawable.tinpic);
            my_image_view_3.setVisibility(View.INVISIBLE);
            scroll_view.scrollTo(0,0);
            text_view.setText(getString(R.string.mod1pg33title));
            text_view_3.setText(getString(R.string.mod1pg33));
            text_view_4.setText("Page 33");
        }
        if (id == R.id.Page34) {
            page_number = 34;
            my_image_view_2.setVisibility(View.GONE);
            my_image_view_3.setVisibility(View.INVISIBLE);
            scroll_view.scrollTo(0,0);
            text_view.setText(getString(R.string.mod1pg34title));
            text_view_3.setText(getString(R.string.mod1pg34));
            text_view_4.setText("Page 34");
        }
        if (id == R.id.Page35) {
            page_number = 35;
            my_image_view_2.setVisibility(View.VISIBLE);
            my_image_view_3.setVisibility(View.INVISIBLE);
            my_image_view_2.setImageResource(R.drawable.janet);
            scroll_view.scrollTo(0,0);
            text_view.setText(getString(R.string.mod1pg35title));
            text_view_3.setText(getString(R.string.mod1pg35));
            text_view_4.setText("Page 35");
        }
        if (id == R.id.Page36) {
            page_number = 36;
            my_image_view_2.setVisibility(View.GONE);
            my_image_view_3.setVisibility(View.INVISIBLE);
            scroll_view.scrollTo(0,0);
            text_view.setText(getString(R.string.mod1pg36title));
            text_view_3.setText(getString(R.string.mod1pg36));
            text_view_4.setText("Page 36");
        }
        if (id == R.id.Page37) {
            page_number = 37;
            my_image_view_2.setVisibility(View.GONE);
            my_image_view_3.setVisibility(View.INVISIBLE);
            scroll_view.scrollTo(0,0);
            text_view.setText(getString(R.string.mod1pg37title));
            text_view_3.setText(getString(R.string.mod1pg37));
            text_view_4.setText("Page 37");
        }
        if (id == R.id.Page38) {
            page_number = 38;
            my_image_view_2.setVisibility(View.VISIBLE);
            my_image_view_2.setImageResource(R.drawable.patrick);
            my_image_view_3.setVisibility(View.INVISIBLE);
            scroll_view.scrollTo(0,0);
            text_view.setText(getString(R.string.mod1pg38title));
            text_view_3.setText(getString(R.string.mod1pg38));
            text_view_4.setText("Page 38");
        }
        if (id == R.id.Page39) {
            page_number = 39;
            my_image_view_2.setVisibility(View.GONE);
            my_image_view_3.setVisibility(View.INVISIBLE);
            scroll_view.scrollTo(0,0);
            text_view.setText(getString(R.string.mod1pg39title));
            text_view_3.setText(getString(R.string.mod1pg39));
            text_view_4.setText("Page 39");
        }
        if (id == R.id.Page40) {
            page_number = 40;
            my_image_view_2.setVisibility(View.VISIBLE);
            my_image_view_2.setImageResource(R.drawable.fan);
            my_image_view_3.setVisibility(View.INVISIBLE);
            scroll_view.scrollTo(0,0);
            text_view.setText(getString(R.string.mod1pg40title));
            text_view_3.setText(getString(R.string.mod1pg40));
            text_view_4.setText("Page 40");
        }
        if (id == R.id.Page41) {
            page_number = 41;
            my_image_view_2.setVisibility(View.VISIBLE);
            my_image_view_2.setImageResource(R.drawable.music);
            my_image_view_3.setVisibility(View.INVISIBLE);
            scroll_view.scrollTo(0,0);
            text_view.setText(getString(R.string.mod1pg41title));
            text_view_3.setText(getString(R.string.mod1pg41));
            text_view_4.setText("Page 41");
        }
        if (id == R.id.Page42) {
            page_number = 42;
            my_image_view_2.setVisibility(View.GONE);
            my_image_view_3.setVisibility(View.INVISIBLE);
            text_view.setText(getString(R.string.mod1pg42title));
            scroll_view.scrollTo(0,0);
            text_view_3.setText(getString(R.string.mod1pg42));
            text_view_4.setText("Page 42");
        }
        if (id == R.id.Page43) {
            page_number = 43;
            my_image_view_2.setVisibility(View.GONE);
            my_image_view_3.setVisibility(View.VISIBLE);
            my_image_view_3.setImageResource(R.drawable.graph);
            scroll_view.scrollTo(0,0);
            text_view.setText(getString(R.string.mod1pg43title));
            text_view_3.setText("");
            text_view_4.setText("Page 43");
        }
        if (id == R.id.Page44) {
            page_number = 44;
            my_image_view_2.setVisibility(View.GONE);
            my_image_view_3.setVisibility(View.INVISIBLE);
            text_view.setText(getString(R.string.mod1pg44title));
            scroll_view.scrollTo(0,0);
            text_view_3.setText(getString(R.string.mod1pg44));
            text_view_4.setText("Page 44");
        }
        if (id == R.id.Page45) {
            page_number = 45;
            my_image_view_2.setVisibility(View.VISIBLE);
            my_image_view_2.setImageResource(R.drawable.bob);
            my_image_view_3.setVisibility(View.INVISIBLE);
            scroll_view.scrollTo(0,0);
            text_view.setText(getString(R.string.mod1pg45title));
            text_view_3.setText(getString(R.string.mod1pg45));
            text_view_4.setText("Page 45");
        }
        if (id == R.id.Page46) {
            page_number = 46;
            my_image_view_2.setVisibility(View.GONE);
            my_image_view_3.setVisibility(View.INVISIBLE);
            scroll_view.scrollTo(0,0);
            text_view.setText(getString(R.string.mod1pg46title));
            text_view_3.setText(getString(R.string.mod1pg46));
            text_view_4.setText("Page 46");
        }
        if (id == R.id.Page47) {
            page_number = 47;
            my_image_view_2.setVisibility(View.GONE);
            my_image_view_3.setVisibility(View.INVISIBLE);
            scroll_view.scrollTo(0,0);
            text_view.setText(getString(R.string.mod1pg47title));
            text_view_3.setText(getString(R.string.mod1pg47));
            text_view_4.setText("Page 47");
        }
        if (id == R.id.Page48) {
            page_number = 48;
            my_image_view_2.setVisibility(View.VISIBLE);
            my_image_view_2.setImageResource(R.drawable.bob_slep);
            my_image_view_3.setVisibility(View.INVISIBLE);
            scroll_view.scrollTo(0,0);
            text_view.setText(getString(R.string.mod1pg48title));
            text_view_3.setText(getString(R.string.mod1pg48));
            text_view_4.setText("Page 48");
        }
        if (id == R.id.Page49) {
            page_number = 49;
            my_image_view_2.setVisibility(View.GONE);
            my_image_view_3.setVisibility(View.INVISIBLE);
            scroll_view.scrollTo(0,0);
            text_view.setText(getString(R.string.mod1pg49title));
            text_view_3.setText(getString(R.string.mod1pg49));
            text_view_4.setText("Page 49");
        }
        if (id == R.id.Page50) {
            page_number = 50;
            my_image_view_2.setVisibility(View.GONE);
            my_image_view_3.setVisibility(View.INVISIBLE);
            scroll_view.scrollTo(0,0);
            text_view.setText(getString(R.string.mod1pg50title));
            text_view_3.setText(getString(R.string.mod1pg50));
            text_view_4.setText("Page 50");
        }
        return super.onOptionsItemSelected(item);
    }





}
