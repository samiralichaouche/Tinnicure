package com.example.tinnicure;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;

public class Module5Part1 extends AppCompatActivity {

    TextView text_view_1;
    TextView text_view_2;
    TextView text_view_3;
    int page_number = 1;
    EditText notesEditText_ex1_1;
    EditText notesEditText_ex1_2;
    EditText notesEditText_ex1_3;
    EditText notesEditText_ex1_4;
    EditText notesEditText_ex1_5;
    EditText notesEditText_ex1_6;

    EditText notesEditText_ex2_1;
    EditText notesEditText_ex2_2;
    EditText notesEditText_ex2_3;
    EditText notesEditText_ex2_4;
    EditText notesEditText_ex2_5;
    EditText notesEditText_ex2_6;
    EditText notesEditText_ex2_7;
    EditText notesEditText_ex2_8;
    EditText notesEditText_ex2_9;

    EditText notesEditText_ex3_1;
    EditText notesEditText_ex3_2;
    EditText notesEditText_ex3_3;
    EditText notesEditText_ex3_4;
    EditText notesEditText_ex3_5;
    EditText notesEditText_ex3_6;
    EditText notesEditText_ex3_7;
    EditText notesEditText_ex3_8;
    EditText notesEditText_ex3_9;

    EditText notesEditText_ex4_1;
    EditText notesEditText_ex4_2;
    EditText notesEditText_ex4_3;
    EditText notesEditText_ex4_4;
    EditText notesEditText_ex4_5;
    EditText notesEditText_ex4_6;

    EditText notesEditText_ex5_1;
    EditText notesEditText_ex5_2;
    EditText notesEditText_ex5_3;
    EditText notesEditText_ex5_4;
    EditText notesEditText_ex5_5;
    EditText notesEditText_ex5_6;
    EditText notesEditText_ex5_7;
    EditText notesEditText_ex5_8;
    EditText notesEditText_ex5_9;

    EditText notesEditText_ex6_1;
    EditText notesEditText_ex6_2;
    EditText notesEditText_ex6_3;
    EditText notesEditText_ex6_4;
    EditText notesEditText_ex6_5;
    EditText notesEditText_ex6_6;
    EditText notesEditText_ex6_7;
    EditText notesEditText_ex6_8;
    EditText notesEditText_ex6_9;
    EditText notesEditText_ex6_10;
    EditText notesEditText_ex6_11;
    EditText notesEditText_ex6_12;

    ScrollView scroll_view;
    ScrollView scroll_view_ex1_1;
    ScrollView scroll_view_ex2_1;
    ScrollView scroll_view_ex3_1;
    ScrollView scroll_view_ex4_1;
    ScrollView scroll_view_ex5_1;
    ScrollView scroll_view_ex6_1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module5_part1);
        text_view_1 = (TextView) findViewById(R.id.text_view_mod5);
        text_view_2 = (TextView) findViewById(R.id.text_view_mod5_2);
        text_view_3 = (TextView) findViewById(R.id.textviewmod5_3);
        notesEditText_ex1_1 = (EditText) findViewById(R.id.notesEditText_1);
        notesEditText_ex1_2 = (EditText) findViewById(R.id.notesEditText_2);
        notesEditText_ex1_3 = (EditText) findViewById(R.id.notesEditText_3);
        notesEditText_ex1_4 = (EditText) findViewById(R.id.notesEditText_4);
        notesEditText_ex1_5 = (EditText) findViewById(R.id.notesEditText_5);
        notesEditText_ex1_6 = (EditText) findViewById(R.id.notesEditText_6);

        notesEditText_ex2_1 = (EditText) findViewById(R.id.notesEditText_ex2_1);
        notesEditText_ex2_2 = (EditText) findViewById(R.id.notesEditText_ex2_2);
        notesEditText_ex2_3 = (EditText) findViewById(R.id.notesEditText_ex2_3);
        notesEditText_ex2_4 = (EditText) findViewById(R.id.notesEditText_ex2_4);
        notesEditText_ex2_5 = (EditText) findViewById(R.id.notesEditText_ex2_5);
        notesEditText_ex2_6 = (EditText) findViewById(R.id.notesEditText_ex2_6);
        notesEditText_ex2_7 = (EditText) findViewById(R.id.notesEditText_ex2_7);
        notesEditText_ex2_8 = (EditText) findViewById(R.id.notesEditText_ex2_8);
        notesEditText_ex2_9 = (EditText) findViewById(R.id.notesEditText_ex2_9);

        notesEditText_ex3_1 = (EditText) findViewById(R.id.notesEditText_ex3_1);
        notesEditText_ex3_2 = (EditText) findViewById(R.id.notesEditText_ex3_2);
        notesEditText_ex3_3 = (EditText) findViewById(R.id.notesEditText_ex3_3);
        notesEditText_ex3_4 = (EditText) findViewById(R.id.notesEditText_ex3_4);
        notesEditText_ex3_5 = (EditText) findViewById(R.id.notesEditText_ex3_5);
        notesEditText_ex3_6 = (EditText) findViewById(R.id.notesEditText_ex3_6);
        notesEditText_ex3_7 = (EditText) findViewById(R.id.notesEditText_ex3_7);
        notesEditText_ex3_8 = (EditText) findViewById(R.id.notesEditText_ex3_8);
        notesEditText_ex3_9 = (EditText) findViewById(R.id.notesEditText_ex3_9);

        notesEditText_ex4_1 = (EditText) findViewById(R.id.notesEditText_ex4_1);
        notesEditText_ex4_2 = (EditText) findViewById(R.id.notesEditText_ex4_2);
        notesEditText_ex4_3 = (EditText) findViewById(R.id.notesEditText_ex4_3);
        notesEditText_ex4_4 = (EditText) findViewById(R.id.notesEditText_ex4_4);
        notesEditText_ex4_5 = (EditText) findViewById(R.id.notesEditText_ex4_5);
        notesEditText_ex4_6 = (EditText) findViewById(R.id.notesEditText_ex4_6);

        notesEditText_ex5_1 = (EditText) findViewById(R.id.notesEditText_ex5_1);
        notesEditText_ex5_2 = (EditText) findViewById(R.id.notesEditText_ex5_2);
        notesEditText_ex5_3 = (EditText) findViewById(R.id.notesEditText_ex5_3);
        notesEditText_ex5_4 = (EditText) findViewById(R.id.notesEditText_ex5_4);
        notesEditText_ex5_5 = (EditText) findViewById(R.id.notesEditText_ex5_5);
        notesEditText_ex5_6 = (EditText) findViewById(R.id.notesEditText_ex5_6);
        notesEditText_ex5_7 = (EditText) findViewById(R.id.notesEditText_ex5_7);
        notesEditText_ex5_8 = (EditText) findViewById(R.id.notesEditText_ex5_8);
        notesEditText_ex5_9 = (EditText) findViewById(R.id.notesEditText_ex5_9);

        notesEditText_ex6_1 = (EditText) findViewById(R.id.notesEditText_ex6_1);
        notesEditText_ex6_2 = (EditText) findViewById(R.id.notesEditText_ex6_2);
        notesEditText_ex6_3 = (EditText) findViewById(R.id.notesEditText_ex6_3);
        notesEditText_ex6_4 = (EditText) findViewById(R.id.notesEditText_ex6_4);
        notesEditText_ex6_5 = (EditText) findViewById(R.id.notesEditText_ex6_5);
        notesEditText_ex6_6 = (EditText) findViewById(R.id.notesEditText_ex6_6);
        notesEditText_ex6_7 = (EditText) findViewById(R.id.notesEditText_ex6_7);
        notesEditText_ex6_8 = (EditText) findViewById(R.id.notesEditText_ex6_8);
        notesEditText_ex6_9 = (EditText) findViewById(R.id.notesEditText_ex6_9);
        notesEditText_ex6_10 = (EditText) findViewById(R.id.notesEditText_ex6_10);
        notesEditText_ex6_11 = (EditText) findViewById(R.id.notesEditText_ex6_11);
        notesEditText_ex6_12 = (EditText) findViewById(R.id.notesEditText_ex6_12);

        scroll_view = (ScrollView) findViewById(R.id.sv1);
        scroll_view_ex1_1 = (ScrollView) findViewById(R.id.sv_ex1);
        scroll_view_ex2_1 = (ScrollView) findViewById(R.id.sv_ex2);
        scroll_view_ex3_1 = (ScrollView) findViewById(R.id.sv_ex3);
        scroll_view_ex4_1 = (ScrollView) findViewById(R.id.sv_ex4);
        scroll_view_ex5_1 = (ScrollView) findViewById(R.id.sv_ex5);
        scroll_view_ex6_1 = (ScrollView) findViewById(R.id.sv_ex6);

        if (savedInstanceState != null) {
            page_number = Integer.parseInt(savedInstanceState.getString("NUM"));
            notesEditText_ex1_1.setText(savedInstanceState.getString("NOTES"));
            notesEditText_ex1_2.setText(savedInstanceState.getString("NOTES_2"));
            notesEditText_ex1_3.setText(savedInstanceState.getString("NOTES_3"));
            notesEditText_ex1_4.setText(savedInstanceState.getString("NOTES_4"));
            notesEditText_ex1_5.setText(savedInstanceState.getString("NOTES_5"));
            notesEditText_ex1_6.setText(savedInstanceState.getString("NOTES_6"));

            notesEditText_ex2_1.setText(savedInstanceState.getString("NOTES_EX2"));
            notesEditText_ex2_2.setText(savedInstanceState.getString("NOTES_EX2_2"));
            notesEditText_ex2_3.setText(savedInstanceState.getString("NOTES_EX2_3"));
            notesEditText_ex2_4.setText(savedInstanceState.getString("NOTES_EX2_4"));
            notesEditText_ex2_5.setText(savedInstanceState.getString("NOTES_EX2_5"));
            notesEditText_ex2_6.setText(savedInstanceState.getString("NOTES_EX2_6"));
            notesEditText_ex2_7.setText(savedInstanceState.getString("NOTES_EX2_7"));
            notesEditText_ex2_8.setText(savedInstanceState.getString("NOTES_EX2_8"));
            notesEditText_ex2_9.setText(savedInstanceState.getString("NOTES_EX2_9"));

            notesEditText_ex3_1.setText(savedInstanceState.getString("NOTES_EX3"));
            notesEditText_ex3_2.setText(savedInstanceState.getString("NOTES_EX3_2"));
            notesEditText_ex3_3.setText(savedInstanceState.getString("NOTES_EX3_3"));
            notesEditText_ex3_4.setText(savedInstanceState.getString("NOTES_EX3_4"));
            notesEditText_ex3_5.setText(savedInstanceState.getString("NOTES_EX3_5"));
            notesEditText_ex3_6.setText(savedInstanceState.getString("NOTES_EX3_6"));
            notesEditText_ex3_7.setText(savedInstanceState.getString("NOTES_EX3_7"));
            notesEditText_ex3_8.setText(savedInstanceState.getString("NOTES_EX3_8"));
            notesEditText_ex3_9.setText(savedInstanceState.getString("NOTES_EX3_9"));

            notesEditText_ex4_1.setText(savedInstanceState.getString("NOTES_EX4"));
            notesEditText_ex4_2.setText(savedInstanceState.getString("NOTES_EX4_2"));
            notesEditText_ex4_3.setText(savedInstanceState.getString("NOTES_EX4_3"));
            notesEditText_ex4_4.setText(savedInstanceState.getString("NOTES_EX4_4"));
            notesEditText_ex4_5.setText(savedInstanceState.getString("NOTES_EX4_5"));
            notesEditText_ex4_6.setText(savedInstanceState.getString("NOTES_EX4_6"));

            notesEditText_ex5_1.setText(savedInstanceState.getString("NOTES_EX5"));
            notesEditText_ex5_2.setText(savedInstanceState.getString("NOTES_EX5_2"));
            notesEditText_ex5_3.setText(savedInstanceState.getString("NOTES_EX5_3"));
            notesEditText_ex5_4.setText(savedInstanceState.getString("NOTES_EX5_4"));
            notesEditText_ex5_5.setText(savedInstanceState.getString("NOTES_EX5_5"));
            notesEditText_ex5_6.setText(savedInstanceState.getString("NOTES_EX5_6"));
            notesEditText_ex5_7.setText(savedInstanceState.getString("NOTES_EX5_7"));
            notesEditText_ex5_8.setText(savedInstanceState.getString("NOTES_EX5_8"));
            notesEditText_ex5_9.setText(savedInstanceState.getString("NOTES_EX5_9"));

            notesEditText_ex6_1.setText(savedInstanceState.getString("NOTES_EX6"));
            notesEditText_ex6_2.setText(savedInstanceState.getString("NOTES_EX6_2"));
            notesEditText_ex6_3.setText(savedInstanceState.getString("NOTES_EX6_3"));
            notesEditText_ex6_4.setText(savedInstanceState.getString("NOTES_EX6_4"));
            notesEditText_ex6_5.setText(savedInstanceState.getString("NOTES_EX6_5"));
            notesEditText_ex6_6.setText(savedInstanceState.getString("NOTES_EX6_6"));
            notesEditText_ex6_1.setText(savedInstanceState.getString("NOTES_EX6_7"));
            notesEditText_ex6_2.setText(savedInstanceState.getString("NOTES_EX6_8"));
            notesEditText_ex6_3.setText(savedInstanceState.getString("NOTES_EX6_9"));
            notesEditText_ex6_4.setText(savedInstanceState.getString("NOTES_EX6_10"));
            notesEditText_ex6_5.setText(savedInstanceState.getString("NOTES_EX6_11"));
            notesEditText_ex6_6.setText(savedInstanceState.getString("NOTES_EX6_12"));

            if (page_number == 1) {
                text_view_1.setText(getString(R.string.mod5pg1title));
                text_view_2.setText(getString(R.string.mod5pg1));
            }

        }
        else{
            page_number = 1;
            scroll_view_ex1_1.setVisibility(View.GONE);
            scroll_view_ex2_1.setVisibility(View.GONE);
            scroll_view_ex3_1.setVisibility(View.GONE);
            scroll_view_ex4_1.setVisibility(View.GONE);
            scroll_view_ex5_1.setVisibility(View.GONE);
            scroll_view_ex6_1.setVisibility(View.GONE);
            text_view_1.setText(getString(R.string.mod5pg1title));
            text_view_2.setText(getString(R.string.mod5pg1));
        }

        String sPNotes = getPreferences(Context.MODE_PRIVATE).getString("NOTES", "EMPTY");
        if (!sPNotes.equals("EMPTY")) {
            notesEditText_ex1_1.setText(sPNotes);
        }
        String sPNotes_2 = getPreferences(Context.MODE_PRIVATE).getString("NOTES_2", "EMPTY");
        if (!sPNotes_2.equals("EMPTY")) {
            notesEditText_ex1_2.setText(sPNotes_2);
        }
        String sPNotes_3 = getPreferences(Context.MODE_PRIVATE).getString("NOTES_3", "EMPTY");
        if (!sPNotes_3.equals("EMPTY")) {
            notesEditText_ex1_3.setText(sPNotes_3);
        }
        String sPNotes_4 = getPreferences(Context.MODE_PRIVATE).getString("NOTES_4", "EMPTY");
        if (!sPNotes_4.equals("EMPTY")) {
            notesEditText_ex1_4.setText(sPNotes_4);
        }
        String sPNotes_5 = getPreferences(Context.MODE_PRIVATE).getString("NOTES_5", "EMPTY");
        if (!sPNotes_5.equals("EMPTY")) {
            notesEditText_ex1_5.setText(sPNotes_5);
        }
        String sPNotes_6 = getPreferences(Context.MODE_PRIVATE).getString("NOTES_6", "EMPTY");
        if (!sPNotes_6.equals("EMPTY")) {
            notesEditText_ex1_6.setText(sPNotes_6);
        }

        String sPNotes_ex2_1 = getPreferences(Context.MODE_PRIVATE).getString("NOTES_EX2", "EMPTY");
        if (!sPNotes_ex2_1.equals("EMPTY")) {
            notesEditText_ex2_1.setText(sPNotes_ex2_1);
        }
        String sPNotes_ex2_2 = getPreferences(Context.MODE_PRIVATE).getString("NOTES_EX2_2", "EMPTY");
        if (!sPNotes_ex2_2.equals("EMPTY")) {
            notesEditText_ex2_2.setText(sPNotes_ex2_2);
        }
        String sPNotes_ex2_3 = getPreferences(Context.MODE_PRIVATE).getString("NOTES_EX2_3", "EMPTY");
        if (!sPNotes_ex2_3.equals("EMPTY")) {
            notesEditText_ex2_3.setText(sPNotes_ex2_3);
        }
        String sPNotes_ex2_4 = getPreferences(Context.MODE_PRIVATE).getString("NOTES_EX2_4", "EMPTY");
        if (!sPNotes_ex2_4.equals("EMPTY")) {
            notesEditText_ex2_4.setText(sPNotes_ex2_4);
        }
        String sPNotes_ex2_5 = getPreferences(Context.MODE_PRIVATE).getString("NOTES_EX2_5", "EMPTY");
        if (!sPNotes_ex2_5.equals("EMPTY")) {
            notesEditText_ex2_5.setText(sPNotes_ex2_5);
        }
        String sPNotes_ex2_6 = getPreferences(Context.MODE_PRIVATE).getString("NOTES_EX2_6", "EMPTY");
        if (!sPNotes_ex2_6.equals("EMPTY")) {
            notesEditText_ex2_6.setText(sPNotes_ex2_6);
        }
        String sPNotes_ex2_7 = getPreferences(Context.MODE_PRIVATE).getString("NOTES_EX2_7", "EMPTY");
        if (!sPNotes_ex2_7.equals("EMPTY")) {
            notesEditText_ex2_7.setText(sPNotes_ex2_7);
        }
        String sPNotes_ex2_8 = getPreferences(Context.MODE_PRIVATE).getString("NOTES_EX2_8", "EMPTY");
        if (!sPNotes_ex2_8.equals("EMPTY")) {
            notesEditText_ex2_8.setText(sPNotes_ex2_8);
        }
        String sPNotes_ex2_9 = getPreferences(Context.MODE_PRIVATE).getString("NOTES_EX2_9", "EMPTY");
        if (!sPNotes_ex2_9.equals("EMPTY")) {
            notesEditText_ex2_9.setText(sPNotes_ex2_9);
        }

        String sPNotes_ex3_1 = getPreferences(Context.MODE_PRIVATE).getString("NOTES_EX3", "EMPTY");
        if (!sPNotes_ex3_1.equals("EMPTY")) {
            notesEditText_ex3_1.setText(sPNotes_ex3_1);
        }
        String sPNotes_ex3_2 = getPreferences(Context.MODE_PRIVATE).getString("NOTES_EX3_2", "EMPTY");
        if (!sPNotes_ex3_2.equals("EMPTY")) {
            notesEditText_ex3_2.setText(sPNotes_ex3_2);
        }
        String sPNotes_ex3_3 = getPreferences(Context.MODE_PRIVATE).getString("NOTES_EX3_3", "EMPTY");
        if (!sPNotes_ex3_3.equals("EMPTY")) {
            notesEditText_ex3_3.setText(sPNotes_ex3_3);
        }
        String sPNotes_ex3_4 = getPreferences(Context.MODE_PRIVATE).getString("NOTES_EX3_4", "EMPTY");
        if (!sPNotes_ex3_4.equals("EMPTY")) {
            notesEditText_ex3_4.setText(sPNotes_ex3_4);
        }
        String sPNotes_ex3_5 = getPreferences(Context.MODE_PRIVATE).getString("NOTES_EX3_5", "EMPTY");
        if (!sPNotes_ex3_5.equals("EMPTY")) {
            notesEditText_ex3_5.setText(sPNotes_ex3_5);
        }
        String sPNotes_ex3_6 = getPreferences(Context.MODE_PRIVATE).getString("NOTES_EX3_6", "EMPTY");
        if (!sPNotes_ex3_6.equals("EMPTY")) {
            notesEditText_ex3_6.setText(sPNotes_ex3_6);
        }
        String sPNotes_ex3_7 = getPreferences(Context.MODE_PRIVATE).getString("NOTES_EX3_7", "EMPTY");
        if (!sPNotes_ex3_7.equals("EMPTY")) {
            notesEditText_ex3_7.setText(sPNotes_ex3_7);
        }
        String sPNotes_ex3_8 = getPreferences(Context.MODE_PRIVATE).getString("NOTES_EX3_8", "EMPTY");
        if (!sPNotes_ex3_8.equals("EMPTY")) {
            notesEditText_ex3_8.setText(sPNotes_ex3_8);
        }
        String sPNotes_ex3_9 = getPreferences(Context.MODE_PRIVATE).getString("NOTES_EX3_9", "EMPTY");
        if (!sPNotes_ex3_9.equals("EMPTY")) {
            notesEditText_ex3_9.setText(sPNotes_ex3_9);
        }

        String sPNotes_ex4_1 = getPreferences(Context.MODE_PRIVATE).getString("NOTES_EX4", "EMPTY");
        if (!sPNotes_ex4_1.equals("EMPTY")) {
            notesEditText_ex4_1.setText(sPNotes_ex4_1);
        }
        String sPNotes_ex4_2 = getPreferences(Context.MODE_PRIVATE).getString("NOTES_EX4_2", "EMPTY");
        if (!sPNotes_ex4_2.equals("EMPTY")) {
            notesEditText_ex4_2.setText(sPNotes_ex4_2);
        }
        String sPNotes_ex4_3 = getPreferences(Context.MODE_PRIVATE).getString("NOTES_EX4_3", "EMPTY");
        if (!sPNotes_ex4_3.equals("EMPTY")) {
            notesEditText_ex4_3.setText(sPNotes_ex4_3);
        }
        String sPNotes_ex4_4 = getPreferences(Context.MODE_PRIVATE).getString("NOTES_EX4_4", "EMPTY");
        if (!sPNotes_ex4_4.equals("EMPTY")) {
            notesEditText_ex4_4.setText(sPNotes_ex4_4);
        }
        String sPNotes_ex4_5 = getPreferences(Context.MODE_PRIVATE).getString("NOTES_EX4_5", "EMPTY");
        if (!sPNotes_ex4_5.equals("EMPTY")) {
            notesEditText_ex4_5.setText(sPNotes_ex4_5);
        }
        String sPNotes_ex4_6 = getPreferences(Context.MODE_PRIVATE).getString("NOTES_EX4_6", "EMPTY");
        if (!sPNotes_ex4_6.equals("EMPTY")) {
            notesEditText_ex4_6.setText(sPNotes_ex4_6);
        }

        String sPNotes_ex5_1 = getPreferences(Context.MODE_PRIVATE).getString("NOTES_EX5", "EMPTY");
        if (!sPNotes_ex5_1.equals("EMPTY")) {
            notesEditText_ex5_1.setText(sPNotes_ex5_1);
        }
        String sPNotes_ex5_2 = getPreferences(Context.MODE_PRIVATE).getString("NOTES_EX5_2", "EMPTY");
        if (!sPNotes_ex5_2.equals("EMPTY")) {
            notesEditText_ex5_2.setText(sPNotes_ex5_2);
        }
        String sPNotes_ex5_3 = getPreferences(Context.MODE_PRIVATE).getString("NOTES_EX5_3", "EMPTY");
        if (!sPNotes_ex5_3.equals("EMPTY")) {
            notesEditText_ex5_3.setText(sPNotes_ex5_3);
        }
        String sPNotes_ex5_4 = getPreferences(Context.MODE_PRIVATE).getString("NOTES_EX5_4", "EMPTY");
        if (!sPNotes_ex5_4.equals("EMPTY")) {
            notesEditText_ex5_4.setText(sPNotes_ex5_4);
        }
        String sPNotes_ex5_5 = getPreferences(Context.MODE_PRIVATE).getString("NOTES_EX5_5", "EMPTY");
        if (!sPNotes_ex5_5.equals("EMPTY")) {
            notesEditText_ex5_5.setText(sPNotes_ex5_5);
        }
        String sPNotes_ex5_6 = getPreferences(Context.MODE_PRIVATE).getString("NOTES_EX5_6", "EMPTY");
        if (!sPNotes_ex5_6.equals("EMPTY")) {
            notesEditText_ex5_6.setText(sPNotes_ex5_6);
        }
        String sPNotes_ex5_7 = getPreferences(Context.MODE_PRIVATE).getString("NOTES_EX5_7", "EMPTY");
        if (!sPNotes_ex5_7.equals("EMPTY")) {
            notesEditText_ex5_7.setText(sPNotes_ex5_7);
        }
        String sPNotes_ex5_8 = getPreferences(Context.MODE_PRIVATE).getString("NOTES_EX5_8", "EMPTY");
        if (!sPNotes_ex5_8.equals("EMPTY")) {
            notesEditText_ex5_8.setText(sPNotes_ex5_8);
        }
        String sPNotes_ex5_9 = getPreferences(Context.MODE_PRIVATE).getString("NOTES_EX5_9", "EMPTY");
        if (!sPNotes_ex5_9.equals("EMPTY")) {
            notesEditText_ex5_9.setText(sPNotes_ex5_9);
        }


        String sPNotes_ex6_1 = getPreferences(Context.MODE_PRIVATE).getString("NOTES_EX6", "EMPTY");
        if (!sPNotes_ex6_1.equals("EMPTY")) {
            notesEditText_ex6_1.setText(sPNotes_ex6_1);
        }
        String sPNotes_ex6_2 = getPreferences(Context.MODE_PRIVATE).getString("NOTES_EX6_2", "EMPTY");
        if (!sPNotes_ex6_2.equals("EMPTY")) {
            notesEditText_ex6_2.setText(sPNotes_ex6_2);
        }
        String sPNotes_ex6_3 = getPreferences(Context.MODE_PRIVATE).getString("NOTES_EX6_3", "EMPTY");
        if (!sPNotes_ex6_3.equals("EMPTY")) {
            notesEditText_ex6_3.setText(sPNotes_ex6_3);
        }
        String sPNotes_ex6_4 = getPreferences(Context.MODE_PRIVATE).getString("NOTES_EX6_4", "EMPTY");
        if (!sPNotes_ex6_4.equals("EMPTY")) {
            notesEditText_ex6_4.setText(sPNotes_ex6_4);
        }
        String sPNotes_ex6_5 = getPreferences(Context.MODE_PRIVATE).getString("NOTES_EX6_5", "EMPTY");
        if (!sPNotes_ex6_5.equals("EMPTY")) {
            notesEditText_ex6_5.setText(sPNotes_ex6_5);
        }
        String sPNotes_ex6_6 = getPreferences(Context.MODE_PRIVATE).getString("NOTES_EX6_6", "EMPTY");
        if (!sPNotes_ex6_6.equals("EMPTY")) {
            notesEditText_ex6_6.setText(sPNotes_ex6_6);
        }
        String sPNotes_ex6_7 = getPreferences(Context.MODE_PRIVATE).getString("NOTES_EX6_7", "EMPTY");
        if (!sPNotes_ex6_7.equals("EMPTY")) {
            notesEditText_ex6_7.setText(sPNotes_ex6_7);
        }
        String sPNotes_ex6_8 = getPreferences(Context.MODE_PRIVATE).getString("NOTES_EX6_8", "EMPTY");
        if (!sPNotes_ex6_8.equals("EMPTY")) {
            notesEditText_ex6_8.setText(sPNotes_ex6_8);
        }
        String sPNotes_ex6_9 = getPreferences(Context.MODE_PRIVATE).getString("NOTES_EX6_9", "EMPTY");
        if (!sPNotes_ex6_9.equals("EMPTY")) {
            notesEditText_ex6_9.setText(sPNotes_ex6_9);
        }
        String sPNotes_ex6_10 = getPreferences(Context.MODE_PRIVATE).getString("NOTES_EX6_10", "EMPTY");
        if (!sPNotes_ex6_10.equals("EMPTY")) {
            notesEditText_ex6_10.setText(sPNotes_ex6_10);
        }
        String sPNotes_ex6_11 = getPreferences(Context.MODE_PRIVATE).getString("NOTES_EX6_11", "EMPTY");
        if (!sPNotes_ex6_11.equals("EMPTY")) {
            notesEditText_ex6_11.setText(sPNotes_ex6_11);
        }
        String sPNotes_ex6_12 = getPreferences(Context.MODE_PRIVATE).getString("NOTES_EX6_12", "EMPTY");
        if (!sPNotes_ex6_12.equals("EMPTY")) {
            notesEditText_ex6_12.setText(sPNotes_ex6_12);
        }



    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putString("NOTES",
                notesEditText_ex1_1.getText().toString());
        outState.putString("NOTES_2",
                notesEditText_ex1_2.getText().toString());
        outState.putString("NOTES_3",
                notesEditText_ex1_3.getText().toString());
        outState.putString("NOTES_4",
                notesEditText_ex1_4.getText().toString());
        outState.putString("NOTES_5",
                notesEditText_ex1_5.getText().toString());
        outState.putString("NOTES_6",
                notesEditText_ex1_6.getText().toString());

        outState.putString("NOTES_EX2",
                notesEditText_ex2_1.getText().toString());
        outState.putString("NOTES_EX2_2",
                notesEditText_ex2_2.getText().toString());
        outState.putString("NOTES_EX2_3",
                notesEditText_ex2_3.getText().toString());
        outState.putString("NOTES_EX2_4",
                notesEditText_ex2_4.getText().toString());
        outState.putString("NOTES_EX2_5",
                notesEditText_ex2_5.getText().toString());
        outState.putString("NOTES_EX2_6",
                notesEditText_ex2_6.getText().toString());
        outState.putString("NOTES_EX2_7",
                notesEditText_ex2_7.getText().toString());
        outState.putString("NOTES_EX2_8",
                notesEditText_ex2_8.getText().toString());
        outState.putString("NOTES_EX2_9",
                notesEditText_ex2_9.getText().toString());

        outState.putString("NOTES_EX3",
                notesEditText_ex3_1.getText().toString());
        outState.putString("NOTES_EX3_2",
                notesEditText_ex3_2.getText().toString());
        outState.putString("NOTES_EX2_3",
                notesEditText_ex3_3.getText().toString());
        outState.putString("NOTES_EX3_4",
                notesEditText_ex3_4.getText().toString());
        outState.putString("NOTES_EX3_5",
                notesEditText_ex3_5.getText().toString());
        outState.putString("NOTES_EX3_6",
                notesEditText_ex3_6.getText().toString());
        outState.putString("NOTES_EX3_7",
                notesEditText_ex3_7.getText().toString());
        outState.putString("NOTES_EX3_8",
                notesEditText_ex3_8.getText().toString());
        outState.putString("NOTES_EX3_9",
                notesEditText_ex3_9.getText().toString());

        outState.putString("NOTES_EX4",
                notesEditText_ex4_1.getText().toString());
        outState.putString("NOTES_EX4_2",
                notesEditText_ex4_2.getText().toString());
        outState.putString("NOTES_EX4_3",
                notesEditText_ex4_3.getText().toString());
        outState.putString("NOTES_EX4_4",
                notesEditText_ex4_4.getText().toString());
        outState.putString("NOTES_EX4_5",
                notesEditText_ex4_5.getText().toString());
        outState.putString("NOTES_EX4_6",
                notesEditText_ex4_6.getText().toString());

        outState.putString("NOTES_EX5",
                notesEditText_ex5_1.getText().toString());
        outState.putString("NOTES_EX5_2",
                notesEditText_ex5_2.getText().toString());
        outState.putString("NOTES_EX5_3",
                notesEditText_ex5_3.getText().toString());
        outState.putString("NOTES_EX5_4",
                notesEditText_ex5_4.getText().toString());
        outState.putString("NOTES_EX5_5",
                notesEditText_ex5_5.getText().toString());
        outState.putString("NOTES_EX5_6",
                notesEditText_ex5_6.getText().toString());
        outState.putString("NOTES_EX5_7",
                notesEditText_ex5_7.getText().toString());
        outState.putString("NOTES_EX5_8",
                notesEditText_ex5_8.getText().toString());
        outState.putString("NOTES_EX5_9",
                notesEditText_ex5_9.getText().toString());

        outState.putString("NOTES_EX6",
                notesEditText_ex6_1.getText().toString());
        outState.putString("NOTES_EX6_2",
                notesEditText_ex6_2.getText().toString());
        outState.putString("NOTES_EX6_3",
                notesEditText_ex6_3.getText().toString());
        outState.putString("NOTES_EX6_4",
                notesEditText_ex6_4.getText().toString());
        outState.putString("NOTES_EX6_5",
                notesEditText_ex6_5.getText().toString());
        outState.putString("NOTES_EX6_6",
                notesEditText_ex6_6.getText().toString());
        outState.putString("NOTES_EX6_7",
                notesEditText_ex6_7.getText().toString());
        outState.putString("NOTES_EX6_8",
                notesEditText_ex6_8.getText().toString());
        outState.putString("NOTES_EX6_9",
                notesEditText_ex6_9.getText().toString());
        outState.putString("NOTES_EX6_10",
                notesEditText_ex6_10.getText().toString());
        outState.putString("NOTES_EX6_11",
                notesEditText_ex6_11.getText().toString());
        outState.putString("NOTES_EX6_12",
                notesEditText_ex6_12.getText().toString());


        outState.putString("NUM",Integer.toString(page_number));
        super.onSaveInstanceState(outState);
    }

    private void saveSettings(){
        SharedPreferences.Editor sPEditor = getPreferences(Context.MODE_PRIVATE).edit();
        sPEditor.putString("NOTES", notesEditText_ex1_1.getText().toString());
        sPEditor.putString("NOTES_2", notesEditText_ex1_2.getText().toString());
        sPEditor.putString("NOTES_3", notesEditText_ex1_3.getText().toString());
        sPEditor.putString("NOTES_4", notesEditText_ex1_4.getText().toString());
        sPEditor.putString("NOTES_5", notesEditText_ex1_5.getText().toString());
        sPEditor.putString("NOTES_6", notesEditText_ex1_6.getText().toString());

        sPEditor.putString("NOTES_EX2", notesEditText_ex2_1.getText().toString());
        sPEditor.putString("NOTES_EX2_2", notesEditText_ex2_2.getText().toString());
        sPEditor.putString("NOTES_EX2_3", notesEditText_ex2_3.getText().toString());
        sPEditor.putString("NOTES_EX2_4", notesEditText_ex2_4.getText().toString());
        sPEditor.putString("NOTES_EX2_5", notesEditText_ex2_5.getText().toString());
        sPEditor.putString("NOTES_EX2_6", notesEditText_ex2_6.getText().toString());
        sPEditor.putString("NOTES_EX2_7", notesEditText_ex2_7.getText().toString());
        sPEditor.putString("NOTES_EX2_8", notesEditText_ex2_8.getText().toString());
        sPEditor.putString("NOTES_EX2_9", notesEditText_ex2_9.getText().toString());

        sPEditor.putString("NOTES_EX3", notesEditText_ex3_1.getText().toString());
        sPEditor.putString("NOTES_EX3_2", notesEditText_ex3_2.getText().toString());
        sPEditor.putString("NOTES_EX3_3", notesEditText_ex3_3.getText().toString());
        sPEditor.putString("NOTES_EX3_4", notesEditText_ex3_4.getText().toString());
        sPEditor.putString("NOTES_EX3_5", notesEditText_ex3_5.getText().toString());
        sPEditor.putString("NOTES_EX3_6", notesEditText_ex3_6.getText().toString());
        sPEditor.putString("NOTES_EX3_7", notesEditText_ex3_7.getText().toString());
        sPEditor.putString("NOTES_EX3_8", notesEditText_ex3_8.getText().toString());
        sPEditor.putString("NOTES_EX3_9", notesEditText_ex3_9.getText().toString());

        sPEditor.putString("NOTES_EX4", notesEditText_ex4_1.getText().toString());
        sPEditor.putString("NOTES_EX4_2", notesEditText_ex4_2.getText().toString());
        sPEditor.putString("NOTES_EX4_3", notesEditText_ex4_3.getText().toString());
        sPEditor.putString("NOTES_EX4_4", notesEditText_ex4_4.getText().toString());
        sPEditor.putString("NOTES_EX4_5", notesEditText_ex4_5.getText().toString());
        sPEditor.putString("NOTES_EX4_6", notesEditText_ex4_6.getText().toString());

        sPEditor.putString("NOTES_EX5", notesEditText_ex5_1.getText().toString());
        sPEditor.putString("NOTES_EX5_2", notesEditText_ex5_2.getText().toString());
        sPEditor.putString("NOTES_EX5_3", notesEditText_ex5_3.getText().toString());
        sPEditor.putString("NOTES_EX5_4", notesEditText_ex5_4.getText().toString());
        sPEditor.putString("NOTES_EX5_5", notesEditText_ex5_5.getText().toString());
        sPEditor.putString("NOTES_EX5_6", notesEditText_ex5_6.getText().toString());
        sPEditor.putString("NOTES_EX5_7", notesEditText_ex5_7.getText().toString());
        sPEditor.putString("NOTES_EX5_8", notesEditText_ex5_8.getText().toString());
        sPEditor.putString("NOTES_EX5_9", notesEditText_ex5_9.getText().toString());

        sPEditor.putString("NOTES_EX6", notesEditText_ex6_1.getText().toString());
        sPEditor.putString("NOTES_EX6_2", notesEditText_ex6_2.getText().toString());
        sPEditor.putString("NOTES_EX6_3", notesEditText_ex6_3.getText().toString());
        sPEditor.putString("NOTES_EX6_4", notesEditText_ex6_4.getText().toString());
        sPEditor.putString("NOTES_EX6_5", notesEditText_ex6_5.getText().toString());
        sPEditor.putString("NOTES_EX6_6", notesEditText_ex6_6.getText().toString());
        sPEditor.putString("NOTES_EX6_7", notesEditText_ex6_7.getText().toString());
        sPEditor.putString("NOTES_EX6_8", notesEditText_ex6_8.getText().toString());
        sPEditor.putString("NOTES_EX6_9", notesEditText_ex6_9.getText().toString());
        sPEditor.putString("NOTES_EX6_10", notesEditText_ex6_10.getText().toString());
        sPEditor.putString("NOTES_EX6_11", notesEditText_ex6_11.getText().toString());
        sPEditor.putString("NOTES_EX6_12", notesEditText_ex6_12.getText().toString());

        sPEditor.commit();
    }

    @Override
    protected void onStop() {
        saveSettings();
        super.onStop();
    }

    public void mod6Next(View view){
        page_number += 1;
        if (page_number < 33){
            if (page_number == 2){
                text_view_1.setText(getString(R.string.mod5pg2title));
                text_view_2.setText(getString(R.string.mod5pg2));
                scroll_view_ex1_1.setVisibility(View.GONE);
                scroll_view_ex2_1.setVisibility(View.GONE);
                scroll_view_ex3_1.setVisibility(View.GONE);
                scroll_view_ex4_1.setVisibility(View.GONE);
                scroll_view_ex5_1.setVisibility(View.GONE);
            }
            if (page_number == 3){
                text_view_1.setText(getString(R.string.mod5pg3title));
                text_view_2.setText(getString(R.string.mod5pg3));
                scroll_view_ex1_1.setVisibility(View.GONE);
                scroll_view_ex2_1.setVisibility(View.GONE);
                scroll_view_ex3_1.setVisibility(View.GONE);
                scroll_view_ex4_1.setVisibility(View.GONE);
                scroll_view_ex5_1.setVisibility(View.GONE);
            }
            if (page_number == 4){
                text_view_1.setText(getString(R.string.mod5pg4title));
                text_view_2.setText(getString(R.string.mod5pg4));
                scroll_view_ex1_1.setVisibility(View.GONE);
                scroll_view_ex2_1.setVisibility(View.GONE);
                scroll_view_ex3_1.setVisibility(View.GONE);
                scroll_view_ex4_1.setVisibility(View.GONE);
                scroll_view_ex5_1.setVisibility(View.GONE);
            }
            if (page_number == 5){
                text_view_1.setText(getString(R.string.mod5pg57title));
                text_view_2.setText(getString(R.string.mod5pg5));
                scroll_view_ex1_1.setVisibility(View.GONE);
                scroll_view_ex2_1.setVisibility(View.GONE);
                scroll_view_ex3_1.setVisibility(View.GONE);
                scroll_view_ex4_1.setVisibility(View.GONE);
                scroll_view_ex5_1.setVisibility(View.GONE);
            }
            if (page_number == 6){
                text_view_1.setText(getString(R.string.mod5pg57title));
                text_view_2.setText(getString(R.string.mod5pg6));
                scroll_view_ex1_1.setVisibility(View.GONE);
                scroll_view_ex2_1.setVisibility(View.GONE);
                scroll_view_ex3_1.setVisibility(View.GONE);
                scroll_view_ex4_1.setVisibility(View.GONE);
                scroll_view_ex5_1.setVisibility(View.GONE);
            }
            if (page_number == 7){
                text_view_1.setText(getString(R.string.mod5pg57title));
                text_view_2.setText(getString(R.string.mod5pg7));
                scroll_view_ex1_1.setVisibility(View.GONE);
                scroll_view_ex2_1.setVisibility(View.GONE);
                scroll_view_ex3_1.setVisibility(View.GONE);
                scroll_view_ex4_1.setVisibility(View.GONE);
                scroll_view_ex5_1.setVisibility(View.GONE);
            }
            if (page_number == 8){
                text_view_1.setText(getString(R.string.mod5pg8title));
                text_view_2.setText("");
                scroll_view_ex1_1.setVisibility(View.VISIBLE);
                scroll_view_ex2_1.setVisibility(View.GONE);
                scroll_view_ex3_1.setVisibility(View.GONE);
                scroll_view_ex4_1.setVisibility(View.GONE);
                scroll_view_ex5_1.setVisibility(View.GONE);
            }
            if (page_number == 9){
                text_view_1.setText(getString(R.string.mod5pg9title));
                text_view_2.setText(getString(R.string.mod5pg9));
                scroll_view_ex1_1.setVisibility(View.GONE);
                scroll_view_ex2_1.setVisibility(View.GONE);
                scroll_view_ex3_1.setVisibility(View.GONE);
                scroll_view_ex4_1.setVisibility(View.GONE);
                scroll_view_ex5_1.setVisibility(View.GONE);
            }
            if (page_number == 10){
                text_view_1.setText(getString(R.string.mod5pg10title));
                text_view_2.setText(getString(R.string.mod5pg10));
                scroll_view_ex1_1.setVisibility(View.GONE);
                scroll_view_ex2_1.setVisibility(View.GONE);
                scroll_view_ex3_1.setVisibility(View.GONE);
                scroll_view_ex4_1.setVisibility(View.GONE);
                scroll_view_ex5_1.setVisibility(View.GONE);
            }
            if (page_number == 11){
                text_view_1.setText("");
                text_view_2.setText(getString(R.string.mod5pg11));
                scroll_view_ex1_1.setVisibility(View.GONE);
                scroll_view_ex2_1.setVisibility(View.GONE);
                scroll_view_ex3_1.setVisibility(View.GONE);
                scroll_view_ex4_1.setVisibility(View.GONE);
                scroll_view_ex5_1.setVisibility(View.GONE);
            }
            if (page_number == 12){
                text_view_1.setText(getString(R.string.mod5pg12title));
                text_view_2.setText(getString(R.string.mod5pg12));
                scroll_view_ex1_1.setVisibility(View.GONE);
                scroll_view_ex2_1.setVisibility(View.GONE);
                scroll_view_ex3_1.setVisibility(View.GONE);
                scroll_view_ex4_1.setVisibility(View.GONE);
                scroll_view_ex5_1.setVisibility(View.GONE);
            }
            if (page_number == 13){
                text_view_1.setText(getString(R.string.mod5pg12title));
                text_view_2.setText("");
                scroll_view_ex1_1.setVisibility(View.GONE);
                scroll_view_ex2_1.setVisibility(View.VISIBLE);
                scroll_view_ex3_1.setVisibility(View.GONE);
                scroll_view_ex4_1.setVisibility(View.GONE);
                scroll_view_ex5_1.setVisibility(View.GONE);
            }
            if (page_number == 14){
                text_view_1.setText(getString(R.string.mod5pg13title));
                text_view_2.setText(getString(R.string.mod5pg13));
                scroll_view_ex1_1.setVisibility(View.GONE);
                scroll_view_ex2_1.setVisibility(View.GONE);
                scroll_view_ex3_1.setVisibility(View.GONE);
                scroll_view_ex4_1.setVisibility(View.GONE);
                scroll_view_ex5_1.setVisibility(View.GONE);
            }
            if (page_number == 15){
                text_view_1.setText(getString(R.string.mod5pg14title));
                text_view_2.setText(getString(R.string.mod5pg14));
                scroll_view_ex1_1.setVisibility(View.GONE);
                scroll_view_ex2_1.setVisibility(View.GONE);
                scroll_view_ex3_1.setVisibility(View.GONE);
                scroll_view_ex4_1.setVisibility(View.GONE);
                scroll_view_ex5_1.setVisibility(View.GONE);
            }
            if (page_number == 16){
                text_view_1.setText(getString(R.string.mod5pg15title));
                text_view_2.setText(getString(R.string.mod5pg15));
                scroll_view_ex1_1.setVisibility(View.GONE);
                scroll_view_ex2_1.setVisibility(View.GONE);
                scroll_view_ex3_1.setVisibility(View.GONE);
                scroll_view_ex4_1.setVisibility(View.GONE);
                scroll_view_ex5_1.setVisibility(View.GONE);
            }
            if (page_number == 17){
                text_view_1.setText("Please Describe");
                text_view_2.setText("");
                scroll_view_ex1_1.setVisibility(View.GONE);
                scroll_view_ex2_1.setVisibility(View.GONE);
                scroll_view_ex3_1.setVisibility(View.VISIBLE);
                scroll_view_ex4_1.setVisibility(View.GONE);
                scroll_view_ex5_1.setVisibility(View.GONE);
            }
            if (page_number == 18){
                text_view_1.setText(getString(R.string.mod5pg16title));
                text_view_2.setText(getString(R.string.mod5pg16));
                scroll_view_ex1_1.setVisibility(View.GONE);
                scroll_view_ex2_1.setVisibility(View.GONE);
                scroll_view_ex3_1.setVisibility(View.GONE);
                scroll_view_ex4_1.setVisibility(View.GONE);
                scroll_view_ex5_1.setVisibility(View.GONE);
            }
            if (page_number == 19){
                text_view_1.setText(getString(R.string.mod5pg17title));
                text_view_2.setText(getString(R.string.mod5pg17));
                scroll_view_ex1_1.setVisibility(View.GONE);
                scroll_view_ex2_1.setVisibility(View.GONE);
                scroll_view_ex3_1.setVisibility(View.GONE);
                scroll_view_ex4_1.setVisibility(View.GONE);
                scroll_view_ex5_1.setVisibility(View.GONE);
            }
            if (page_number == 20){
                text_view_1.setText(getString(R.string.mod5pg18title));
                text_view_2.setText(getString(R.string.mod5pg18));
                scroll_view_ex1_1.setVisibility(View.GONE);
                scroll_view_ex2_1.setVisibility(View.GONE);
                scroll_view_ex3_1.setVisibility(View.GONE);
                scroll_view_ex4_1.setVisibility(View.GONE);
                scroll_view_ex5_1.setVisibility(View.GONE);
            }
            if (page_number == 21){
                text_view_1.setText(getString(R.string.mod5pg19title));
                text_view_2.setText(getString(R.string.mod5pg19));
                scroll_view_ex1_1.setVisibility(View.GONE);
                scroll_view_ex2_1.setVisibility(View.GONE);
                scroll_view_ex3_1.setVisibility(View.GONE);
                scroll_view_ex4_1.setVisibility(View.GONE);
                scroll_view_ex5_1.setVisibility(View.GONE);
            }
            if (page_number == 22){
                text_view_1.setText(getString(R.string.mod5pg20title));
                text_view_2.setText("");
                scroll_view_ex1_1.setVisibility(View.GONE);
                scroll_view_ex2_1.setVisibility(View.GONE);
                scroll_view_ex3_1.setVisibility(View.GONE);
                scroll_view_ex4_1.setVisibility(View.VISIBLE);
                scroll_view_ex5_1.setVisibility(View.GONE);
            }
            if (page_number == 23){
                text_view_1.setText(getString(R.string.mod5pg21title));
                text_view_2.setText(getString(R.string.mod5pg21));
                scroll_view_ex1_1.setVisibility(View.GONE);
                scroll_view_ex2_1.setVisibility(View.GONE);
                scroll_view_ex3_1.setVisibility(View.GONE);
                scroll_view_ex4_1.setVisibility(View.GONE);
                scroll_view_ex5_1.setVisibility(View.GONE);
            }
            if (page_number == 24){
                text_view_1.setText(getString(R.string.mod5pg22title));
                text_view_2.setText(getString(R.string.mod5pg22));
                scroll_view_ex1_1.setVisibility(View.GONE);
                scroll_view_ex2_1.setVisibility(View.GONE);
                scroll_view_ex3_1.setVisibility(View.GONE);
                scroll_view_ex4_1.setVisibility(View.GONE);
                scroll_view_ex5_1.setVisibility(View.GONE);
            }
            if (page_number == 25){
                text_view_1.setText(getString(R.string.mod5pg23title));
                text_view_2.setText(getString(R.string.mod5pg23));
                scroll_view_ex1_1.setVisibility(View.GONE);
                scroll_view_ex2_1.setVisibility(View.GONE);
                scroll_view_ex3_1.setVisibility(View.GONE);
                scroll_view_ex4_1.setVisibility(View.GONE);
                scroll_view_ex5_1.setVisibility(View.GONE);
            }
            if (page_number == 26){
                text_view_1.setText(getString(R.string.mod5pg23title));
                text_view_2.setText("");
                scroll_view_ex1_1.setVisibility(View.GONE);
                scroll_view_ex2_1.setVisibility(View.GONE);
                scroll_view_ex3_1.setVisibility(View.GONE);
                scroll_view_ex4_1.setVisibility(View.GONE);
                scroll_view_ex5_1.setVisibility(View.VISIBLE);
            }
            if (page_number == 27){
                text_view_1.setText(getString(R.string.mod5pg24title));
                text_view_2.setText(getString(R.string.mod5pg24));
                scroll_view_ex1_1.setVisibility(View.GONE);
                scroll_view_ex2_1.setVisibility(View.GONE);
                scroll_view_ex3_1.setVisibility(View.GONE);
                scroll_view_ex4_1.setVisibility(View.GONE);
                scroll_view_ex5_1.setVisibility(View.GONE);
            }
            if (page_number == 28){
                text_view_1.setText(getString(R.string.mod5pg25title));
                text_view_2.setText(getString(R.string.mod5pg25));
                scroll_view_ex1_1.setVisibility(View.GONE);
                scroll_view_ex2_1.setVisibility(View.GONE);
                scroll_view_ex3_1.setVisibility(View.GONE);
                scroll_view_ex4_1.setVisibility(View.GONE);
                scroll_view_ex5_1.setVisibility(View.GONE);
            }
            if (page_number == 29){
                text_view_1.setText(getString(R.string.mod5pg26title));
                text_view_2.setText(getString(R.string.mod5pg26));
                scroll_view_ex1_1.setVisibility(View.GONE);
                scroll_view_ex2_1.setVisibility(View.GONE);
                scroll_view_ex3_1.setVisibility(View.GONE);
                scroll_view_ex4_1.setVisibility(View.GONE);
                scroll_view_ex5_1.setVisibility(View.GONE);
            }

            if (page_number == 30){
                text_view_1.setText(getString(R.string.mod5pg26title));
                text_view_2.setText("");
                scroll_view_ex1_1.setVisibility(View.GONE);
                scroll_view_ex2_1.setVisibility(View.GONE);
                scroll_view_ex3_1.setVisibility(View.GONE);
                scroll_view_ex4_1.setVisibility(View.GONE);
                scroll_view_ex5_1.setVisibility(View.GONE);
                scroll_view_ex6_1.setVisibility(View.VISIBLE);
            }

        }
    }


}
