package com.example.tinnicure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    //Need to make buttons in scrollview
    //Need to save user's page if they force quit (onRestoreSavedInstanceState)
    //Need to saved instance after changing orientation

    public void mod1 (View view){
        startActivity(new Intent(getApplicationContext(),Module1Selection.class));
    }
    public void mod2 (View view){
        startActivity(new Intent(getApplicationContext(),Module2.class));
    }
    public void hom2 (View view){
        //Need to add mindful breathing to homework
        startActivity(new Intent(getApplicationContext(),Module2Homework.class));
    }

    public void mod3(View view){
        startActivity(new Intent(getApplicationContext(),Module3Selection.class));
    }

    public void mod4(View view){
        startActivity(new Intent(getApplicationContext(),Module4Selection.class));
    }

    public void hom4 (View view){
        //Need to add mindful breathing to homework
        startActivity(new Intent(getApplicationContext(),Module2Homework.class));
    }

    public void mod5 (View view){
        startActivity(new Intent(getApplicationContext(),Module5Selection.class));
    }

    public void hom7 (View view)
    {
        startActivity(new Intent(getApplicationContext(),Module2Homework.class));
    }

    public void mod6 (View view){
        startActivity(new Intent(getApplicationContext(),Module6.class));
    }

    public void mod8(View view){
        startActivity(new Intent(getApplicationContext(),Module8.class));
    }

}
