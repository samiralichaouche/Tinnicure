package com.example.tinnicure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Module1Part2 extends AppCompatActivity {

    TextView text_view;
    TextView text_view_2;
    TextView text_view_3;
    int page_number = 1;
    ImageView my_image_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module1_part2);
        my_image_view = (ImageView) findViewById(R.id.ivmod1pt2);
        text_view = (TextView) findViewById(R.id.text_view_mod1pt2);
        text_view_2 = (TextView) findViewById(R.id.text_view_mod1pt2_2);
        text_view_3 = (TextView) findViewById(R.id.text_view_mod1pt2_3);
        if (savedInstanceState != null) {
            page_number = Integer.parseInt(savedInstanceState.getString("NUM"));
            if (page_number == 1) {
                my_image_view.setVisibility(View.GONE);
                text_view.setText(getString(R.string.mod1pt2pg1title));
                text_view_2.setText(getString(R.string.mod1pt2pg1));
                text_view_3.setText("1 of 11");
                my_image_view.setImageDrawable(null);
            }
            if (page_number == 2) {
                my_image_view.setVisibility(View.GONE);
                text_view.setText(getString(R.string.mod1pt2pg2title));
                text_view_2.setText(getString(R.string.mod1pt2pg2));
                text_view_3.setText("2 of 11");
                my_image_view.setImageDrawable(null);
            }
            if (page_number == 3) {
                my_image_view.setVisibility(View.GONE);
                text_view.setText(getString(R.string.mod1pt2pg3title));
                text_view_2.setText(getString(R.string.mod1pt2pg3));
                text_view_3.setText("3 of 11");
                my_image_view.setImageDrawable(null);
            }
            if (page_number == 4) {
                my_image_view.setVisibility(View.GONE);
                text_view.setText(getString(R.string.mod1pt2pg4title));
                text_view_2.setText(getString(R.string.mod1pt2pg4));
                text_view_3.setText("4 of 11");
                my_image_view.setImageDrawable(null);
            }
            if (page_number == 5) {
                my_image_view.setVisibility(View.GONE);
                text_view.setText(getString(R.string.mod1pt2pg5title));
                text_view_2.setText(getString(R.string.mod1pt2pg5));
                text_view_3.setText("5 of 11");
                my_image_view.setImageDrawable(null);
            }
            if (page_number == 6) {
                my_image_view.setVisibility(View.VISIBLE);
                text_view.setText(getString(R.string.mod1pt2pg6title));
                text_view_2.setText(getString(R.string.mod1pt2pg6));
                text_view_3.setText("6 of 11");
                my_image_view.setImageResource(R.drawable.aerobic);
            }
            if (page_number == 7) {
                my_image_view.setVisibility(View.GONE);
                text_view.setText(getString(R.string.mod1pt2pg7title));
                text_view_2.setText(getString(R.string.mod1pt2pg7));
                text_view_3.setText("7 of 11");
                my_image_view.setImageDrawable(null);
            }
            if (page_number == 8) {
                my_image_view.setVisibility(View.VISIBLE);
                text_view.setText(getString(R.string.mod1pt2pg8title));
                text_view_2.setText(getString(R.string.mod1pt2pg8));
                text_view_3.setText("8 of 11");
                my_image_view.setImageResource(R.drawable.rope);
            }
            if (page_number == 9) {
                my_image_view.setVisibility(View.VISIBLE);
                text_view.setText(getString(R.string.mod1pt2pg9title));
                text_view_2.setText(getString(R.string.mod1pt2pg9));
                text_view_3.setText("9 of 11");
                my_image_view.setImageResource(R.drawable.armweight);

            }
            if (page_number == 10) {
                my_image_view.setVisibility(View.VISIBLE);
                text_view.setText(getString(R.string.mod1pt2pg10title));
                text_view_2.setText(getString(R.string.mod1pt2pg10));
                text_view_3.setText("10 of 11");
                my_image_view.setImageResource(R.drawable.hopscotch);
            }
            if (page_number == 11) {
                my_image_view.setVisibility(View.VISIBLE);
                text_view.setText(getString(R.string.mod1pt2pg11title));
                text_view_2.setText(getString(R.string.mod1pt2pg11));
                text_view_3.setText("11 of 11");
                my_image_view.setImageResource(R.drawable.yoga);
            }
        }
        else{
            page_number = 1;
            my_image_view.setVisibility(View.GONE);
            text_view.setText(getString(R.string.mod1pt2pg1title));
            text_view_2.setText(getString(R.string.mod1pt2pg1));
            text_view_3.setText("1 of 11");
            my_image_view.setImageDrawable(null);
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("NUM",Integer.toString(page_number));
    }

    public void mod2Back(View view) {
        page_number -= 1;
        if (page_number >= 0) {
            if (page_number == 0){
                finish();
            }
            if (page_number == 1) {
                my_image_view.setVisibility(View.GONE);
                text_view.setText(getString(R.string.mod1pt2pg1title));
                text_view_2.setText(getString(R.string.mod1pt2pg1));
                text_view_3.setText("1 of 11");
                my_image_view.setImageDrawable(null);
            }
            if (page_number == 2) {
                my_image_view.setVisibility(View.GONE);
                text_view.setText(getString(R.string.mod1pt2pg2title));
                text_view_2.setText(getString(R.string.mod1pt2pg2));
                text_view_3.setText("2 of 11");
                my_image_view.setImageDrawable(null);
            }
            if (page_number == 3) {
                my_image_view.setVisibility(View.GONE);
                text_view.setText(getString(R.string.mod1pt2pg3title));
                text_view_2.setText(getString(R.string.mod1pt2pg3));
                text_view_3.setText("3 of 11");
                my_image_view.setImageDrawable(null);
            }
            if (page_number == 4) {
                my_image_view.setVisibility(View.GONE);
                text_view.setText(getString(R.string.mod1pt2pg4title));
                text_view_2.setText(getString(R.string.mod1pt2pg4));
                text_view_3.setText("4 of 11");
                my_image_view.setImageDrawable(null);
            }
            if (page_number == 5) {
                my_image_view.setVisibility(View.GONE);
                text_view.setText(getString(R.string.mod1pt2pg5title));
                text_view_2.setText(getString(R.string.mod1pt2pg5));
                text_view_3.setText("5 of 11");
                my_image_view.setImageDrawable(null);
            }
            if (page_number == 6) {
                my_image_view.setVisibility(View.VISIBLE);
                text_view.setText(getString(R.string.mod1pt2pg6title));
                text_view_2.setText(getString(R.string.mod1pt2pg6));
                text_view_3.setText("6 of 11");
                my_image_view.setImageResource(R.drawable.aerobic);
            }
            if (page_number == 7) {
                my_image_view.setVisibility(View.GONE);
                text_view.setText(getString(R.string.mod1pt2pg7title));
                text_view_2.setText(getString(R.string.mod1pt2pg7));
                text_view_3.setText("7 of 11");
                my_image_view.setImageDrawable(null);
            }
            if (page_number == 8) {
                my_image_view.setVisibility(View.VISIBLE);
                text_view.setText(getString(R.string.mod1pt2pg8title));
                text_view_2.setText(getString(R.string.mod1pt2pg8));
                text_view_3.setText("8 of 11");
                my_image_view.setImageResource(R.drawable.rope);
            }
            if (page_number == 9) {
                my_image_view.setVisibility(View.VISIBLE);
                text_view.setText(getString(R.string.mod1pt2pg9title));
                text_view_2.setText(getString(R.string.mod1pt2pg9));
                text_view_3.setText("9 of 11");
                my_image_view.setImageResource(R.drawable.armweight);

            }
            if (page_number == 10) {
                my_image_view.setVisibility(View.VISIBLE);
                text_view.setText(getString(R.string.mod1pt2pg10title));
                text_view_2.setText(getString(R.string.mod1pt2pg10));
                text_view_3.setText("10 of 11");
                my_image_view.setImageResource(R.drawable.hopscotch);
            }
        }
    }

    public void mod2Next(View view) {
        page_number += 1;
        if (page_number < 13 ) {
            if (page_number == 2) {
                my_image_view.setVisibility(View.GONE);
                text_view.setText(getString(R.string.mod1pt2pg2title));
                text_view_2.setText(getString(R.string.mod1pt2pg2));
                text_view_3.setText("2 of 11");
                my_image_view.setImageDrawable(null);
            }
            if (page_number == 3) {
                my_image_view.setVisibility(View.GONE);
                text_view.setText(getString(R.string.mod1pt2pg3title));
                text_view_2.setText(getString(R.string.mod1pt2pg3));
                text_view_3.setText("3 of 11");
                my_image_view.setImageDrawable(null);
            }
            if (page_number == 4) {
                my_image_view.setVisibility(View.GONE);
                text_view.setText(getString(R.string.mod1pt2pg4title));
                text_view_2.setText(getString(R.string.mod1pt2pg4));
                text_view_3.setText("4 of 11");
                my_image_view.setImageDrawable(null);
            }
            if (page_number == 5) {
                my_image_view.setVisibility(View.GONE);
                text_view.setText(getString(R.string.mod1pt2pg5title));
                text_view_2.setText(getString(R.string.mod1pt2pg5));
                text_view_3.setText("5 of 11");
                my_image_view.setImageDrawable(null);
            }
            if (page_number == 6) {
                my_image_view.setVisibility(View.VISIBLE);
                text_view.setText(getString(R.string.mod1pt2pg6title));
                text_view_2.setText(getString(R.string.mod1pt2pg6));
                text_view_3.setText("6 of 11");
                my_image_view.setImageResource(R.drawable.aerobic);
            }
            if (page_number == 7) {
                my_image_view.setVisibility(View.GONE);
                text_view.setText(getString(R.string.mod1pt2pg7title));
                text_view_2.setText(getString(R.string.mod1pt2pg7));
                text_view_3.setText("7 of 11");
                my_image_view.setImageDrawable(null);
            }
            if (page_number == 8) {
                my_image_view.setVisibility(View.VISIBLE);
                text_view.setText(getString(R.string.mod1pt2pg8title));
                text_view_2.setText(getString(R.string.mod1pt2pg8));
                text_view_3.setText("8 of 11");
                my_image_view.setImageResource(R.drawable.rope);
            }
            if (page_number == 9) {
                my_image_view.setVisibility(View.VISIBLE);
                text_view.setText(getString(R.string.mod1pt2pg9title));
                text_view_2.setText(getString(R.string.mod1pt2pg9));
                text_view_3.setText("9 of 11");
                my_image_view.setImageResource(R.drawable.armweight);

            }
            if (page_number == 10) {
                my_image_view.setVisibility(View.VISIBLE);
                text_view.setText(getString(R.string.mod1pt2pg10title));
                text_view_2.setText(getString(R.string.mod1pt2pg10));
                text_view_3.setText("10 of 11");
                my_image_view.setImageResource(R.drawable.hopscotch);
            }
            if (page_number == 11) {
                my_image_view.setVisibility(View.VISIBLE);
                text_view.setText(getString(R.string.mod1pt2pg11title));
                text_view_2.setText(getString(R.string.mod1pt2pg11));
                text_view_3.setText("11 of 11");
                my_image_view.setImageResource(R.drawable.yoga);
            }
            if (page_number == 12) {
                finish();
            }
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.mod1pt2_main, menu);
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
            my_image_view.setVisibility(View.GONE);
            text_view.setText(getString(R.string.mod1pt2pg1title));
            text_view_2.setText(getString(R.string.mod1pt2pg1));
            text_view_3.setText("1 of 11");
            my_image_view.setImageDrawable(null);
        }
        if (id == R.id.Page2) {
            page_number = 2;
            my_image_view.setVisibility(View.GONE);
            text_view.setText(getString(R.string.mod1pt2pg2title));
            text_view_2.setText(getString(R.string.mod1pt2pg2));
            text_view_3.setText("2 of 11");
            my_image_view.setImageDrawable(null);
        }
        if (id == R.id.Page3) {
            page_number = 3;
            my_image_view.setVisibility(View.GONE);
            text_view.setText(getString(R.string.mod1pt2pg3title));
            text_view_2.setText(getString(R.string.mod1pt2pg3));
            text_view_3.setText("3 of 11");
            my_image_view.setImageDrawable(null);
        }
        if (id == R.id.Page4) {
            page_number = 4;
            my_image_view.setVisibility(View.GONE);
            text_view.setText(getString(R.string.mod1pt2pg4title));
            text_view_2.setText(getString(R.string.mod1pt2pg4));
            text_view_3.setText("4 of 11");
            my_image_view.setImageDrawable(null);
        }
        if (id == R.id.Page5) {
            page_number = 5;
            my_image_view.setVisibility(View.GONE);
            text_view.setText(getString(R.string.mod1pt2pg5title));
            text_view_2.setText(getString(R.string.mod1pt2pg5));
            text_view_3.setText("5 of 11");
            my_image_view.setImageDrawable(null);
        }
        if (id == R.id.Page6) {
            page_number = 6;
            my_image_view.setVisibility(View.VISIBLE);
            text_view.setText(getString(R.string.mod1pt2pg6title));
            text_view_2.setText(getString(R.string.mod1pt2pg6));
            text_view_3.setText("6 of 11");
            my_image_view.setImageResource(R.drawable.aerobic);
        }
        if (id == R.id.Page7) {
            page_number = 7;
            my_image_view.setVisibility(View.GONE);
            text_view.setText(getString(R.string.mod1pt2pg7title));
            text_view_2.setText(getString(R.string.mod1pt2pg7));
            text_view_3.setText("7 of 11");
            my_image_view.setImageDrawable(null);
        }
        if (id == R.id.Page8) {
            page_number = 8;
            my_image_view.setVisibility(View.VISIBLE);
            text_view.setText(getString(R.string.mod1pt2pg8title));
            text_view_2.setText(getString(R.string.mod1pt2pg8));
            text_view_3.setText("8 of 11");
            my_image_view.setImageResource(R.drawable.rope);
        }
        if (id == R.id.Page9) {
            page_number = 9;
            my_image_view.setVisibility(View.VISIBLE);
            text_view.setText(getString(R.string.mod1pt2pg9title));
            text_view_2.setText(getString(R.string.mod1pt2pg9));
            text_view_3.setText("9 of 11");
            my_image_view.setImageResource(R.drawable.armweight);

        }
        if (id == R.id.Page10) {
            page_number = 10;
            my_image_view.setVisibility(View.VISIBLE);
            text_view.setText(getString(R.string.mod1pt2pg10title));
            text_view_2.setText(getString(R.string.mod1pt2pg10));
            text_view_3.setText("10 of 11");
            my_image_view.setImageResource(R.drawable.hopscotch);
        }
        if (id == R.id.Page11) {
            page_number = 11;
            my_image_view.setVisibility(View.VISIBLE);
            text_view.setText(getString(R.string.mod1pt2pg11title));
            text_view_2.setText(getString(R.string.mod1pt2pg11));
            text_view_3.setText("11 of 11");
            my_image_view.setImageResource(R.drawable.yoga);
        }
        return super.onOptionsItemSelected(item);
    }


}
