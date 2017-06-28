package com.example.tinnicure;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Module2 extends AppCompatActivity {

    TextView text_view;
    TextView text_view_2;
    TextView text_view_3;
    int page_number = 1;
    ImageView my_image_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module2);
        my_image_view = (ImageView) findViewById(R.id.iv);
        text_view = (TextView) findViewById(R.id.text_view_mod2);
        text_view_2 = (TextView) findViewById(R.id.text_view_mod2_2);
        text_view_3 = (TextView) findViewById(R.id.textviewmod2_3);
        if (savedInstanceState != null) {
            page_number = Integer.parseInt(savedInstanceState.getString("NUM"));
            if (page_number == 1) {
                my_image_view.setVisibility(View.VISIBLE);
                text_view.setText(getString(R.string.mechoftin));
                text_view_2.setText(getString(R.string.cochlea));
                my_image_view.setImageResource(R.drawable.cochlea);
                text_view_3.setText("1 of 7");
            }
            if (page_number == 2) {
                my_image_view.setVisibility(View.VISIBLE);
                text_view.setText(getString(R.string.mechoftin));
                text_view_2.setText(getString(R.string.ear_2));
                my_image_view.setImageResource(R.drawable.ear_2);
                text_view_3.setText("2 of 7");
            }
            if (page_number == 3) {
                my_image_view.setVisibility(View.GONE);
                text_view.setText(getString(R.string.mechoftin));
                text_view_2.setText(getString(R.string.brain));
                my_image_view.setImageDrawable(null);
                text_view_3.setText("3 of 7");
            }
            if (page_number == 4) {
                my_image_view.setVisibility(View.GONE);
                text_view.setText("");
                text_view_2.setText(getString(R.string.help));
                my_image_view.setImageDrawable(null);
                text_view_3.setText("4 of 7");
            }
            if (page_number == 5) {
                my_image_view.setVisibility(View.VISIBLE);
                text_view.setText(R.string.goal);
                text_view_2.setText(getString(R.string.soundther));
                my_image_view.setImageResource(R.drawable.headphones);
                text_view_3.setText("5 of 7");
            }
            if (page_number == 6) {
                my_image_view.setVisibility(View.GONE);
                text_view.setText(getString(R.string.types));
                text_view_2.setText(getString(R.string.typesndther));
                my_image_view.setImageDrawable(null);
                text_view_3.setText("6 of 7");
            }
            if (page_number == 7){
                my_image_view.setVisibility(View.GONE);
                text_view.setText(getString(R.string.cust));
                text_view_2.setText(R.string.custsndther);
                my_image_view.setImageDrawable(null);
                text_view_3.setText("7 of 7");
            }
        }
        else{
            page_number = 1;
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
                my_image_view.setVisibility(View.VISIBLE);
                text_view.setText(getString(R.string.mechoftin));
                text_view_2.setText(getString(R.string.cochlea));
                my_image_view.setImageResource(R.drawable.cochlea);
                text_view_3.setText("1 of 7");
            }
            if (page_number == 2) {
                my_image_view.setVisibility(View.VISIBLE);
                text_view.setText(getString(R.string.mechoftin));
                text_view_2.setText(getString(R.string.ear_2));
                my_image_view.setImageResource(R.drawable.ear_2);
                text_view_3.setText("2 of 7");
            }
            if (page_number == 3) {
                my_image_view.setVisibility(View.GONE);
                text_view.setText(getString(R.string.mechoftin));
                text_view_2.setText(getString(R.string.brain));
                my_image_view.setImageDrawable(null);
                text_view_3.setText("3 of 7");
            }
            if (page_number == 4) {
                my_image_view.setVisibility(View.GONE);
                text_view.setText("");
                text_view_2.setText(getString(R.string.help));
                my_image_view.setImageDrawable(null);
                text_view_3.setText("4 of 7");
            }
            if (page_number == 5) {
                my_image_view.setVisibility(View.VISIBLE);
                text_view.setText(R.string.goal);
                text_view_2.setText(getString(R.string.soundther));
                my_image_view.setImageResource(R.drawable.headphones);
                text_view_3.setText("5 of 7");

            }
            if (page_number == 6) {
                my_image_view.setVisibility(View.GONE);
                text_view.setText(getString(R.string.types));
                text_view_2.setText(getString(R.string.typesndther));
                my_image_view.setImageDrawable(null);
                text_view_3.setText("6 of 7");
                }
        }
    }

    public void mod2Next(View view){
        page_number += 1;
        if (page_number < 9){
            if (page_number == 2){
                my_image_view.setVisibility(View.VISIBLE);
                text_view.setText(getString(R.string.mechoftin));
                text_view_2.setText(getString(R.string.ear_2));
                my_image_view.setImageResource(R.drawable.ear_2);
                text_view_3.setText("2 of 7");
            }
            if (page_number == 3){
                my_image_view.setVisibility(View.GONE);
                text_view.setText(getString(R.string.mechoftin));
                text_view_2.setText(getString(R.string.brain));
                my_image_view.setImageDrawable(null);
                text_view_3.setText("3 of 7");
            }
            if (page_number == 4) {
                my_image_view.setVisibility(View.GONE);
                text_view.setText("");
                text_view_2.setText(R.string.help);
                my_image_view.setImageDrawable(null);
                text_view_3.setText("4 of 7");
            }
            if (page_number == 5) {
                my_image_view.setVisibility(View.VISIBLE);
                text_view.setText(R.string.goal);
                text_view_2.setText(getString(R.string.soundther));
                my_image_view.setImageResource(R.drawable.headphones);
                text_view_3.setText("5 of 7");
            }
            if (page_number == 6) {
                my_image_view.setVisibility(View.GONE);
                text_view.setText(getString(R.string.types));
                text_view_2.setText(getString(R.string.typesndther));
                my_image_view.setImageDrawable(null);
                text_view_3.setText("6 of 7");
            }
            if (page_number == 7){
                my_image_view.setVisibility(View.GONE);
                text_view.setText(getString(R.string.cust));
                text_view_2.setText(R.string.custsndther);
                my_image_view.setImageDrawable(null);
                text_view_3.setText("7 of 7");
            }
            if (page_number == 8){
                finish();
            }
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.mod2_main, menu);
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
            my_image_view.setVisibility(View.VISIBLE);
            text_view.setText(getString(R.string.mechoftin));
            text_view_2.setText(getString(R.string.cochlea));
            my_image_view.setImageResource(R.drawable.cochlea);
            text_view_3.setText("1 of 7");
            return true;
        }
        if (id == R.id.Page2) {
            page_number = 2;
            my_image_view.setVisibility(View.VISIBLE);
            text_view.setText(getString(R.string.mechoftin));
            text_view_2.setText(getString(R.string.ear_2));
            my_image_view.setImageResource(R.drawable.ear_2);
            text_view_3.setText("2 of 7");
            return true;
        }
        if (id == R.id.Page3){
            page_number = 3;
            my_image_view.setVisibility(View.GONE);
            text_view.setText(getString(R.string.mechoftin));
            text_view_2.setText(getString(R.string.brain));
            my_image_view.setImageDrawable(null);
            text_view_3.setText("3 of 7");
            return true;
        }
        if (id == R.id.Page4){
            page_number = 4;
            my_image_view.setVisibility(View.GONE);
            text_view.setText("");
            text_view_2.setText(R.string.help);
            my_image_view.setImageDrawable(null);
            text_view_3.setText("4 of 7");
            return true;
        }
        if (id == R.id.Page5){
            page_number = 5;
            my_image_view.setVisibility(View.VISIBLE);
            text_view.setText(R.string.goal);
            text_view_2.setText(getString(R.string.soundther));
            my_image_view.setImageResource(R.drawable.headphones);
            text_view_3.setText("5 of 7");
            return true;
        }
        if (id == R.id.Page6){
            page_number = 6;
            my_image_view.setVisibility(View.GONE);
            text_view.setText(getString(R.string.types));
            text_view_2.setText(getString(R.string.typesndther));
            my_image_view.setImageDrawable(null);
            text_view_3.setText("6 of 7");
            return true;
        }
        if (id == R.id.Page7){
            page_number = 7;
            my_image_view.setVisibility(View.GONE);
            text_view.setText(getString(R.string.cust));
            text_view_2.setText(R.string.custsndther);
            my_image_view.setImageDrawable(null);
            text_view_3.setText("7 of 7");
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
