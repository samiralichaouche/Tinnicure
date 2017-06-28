package com.example.tinnicure;

import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.view.Menu;
import android.view.MenuItem;

public class Main2Activity extends AppCompatActivity {

    Thread t;
    int sr = 44100;
    boolean isRunning = true;
    SeekBar fSlider;
    private static TextView text_view;
    int sliderval;
    private Button enterButton;
    private EditText enteredText;
    Switch switch1;

    //NEED TO FIX PLAYING IN BACKGROUND

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        fSlider = (SeekBar) findViewById(R.id.frequency);
        text_view = (TextView) findViewById(R.id.textView);
        text_view.setText("Frequency : " + fSlider.getProgress() + " / " + fSlider.getMax());
        SeekBar.OnSeekBarChangeListener listener = new SeekBar.OnSeekBarChangeListener() {
            public void onStopTrackingTouch(SeekBar seekBar) {
                text_view.setText("Frequency : " + fSlider.getProgress() + " / " + fSlider.getMax());
            }
            public void onStartTrackingTouch(SeekBar seekBar) { }
            public void onProgressChanged(SeekBar seekBar,
                                          int progress,
                                          boolean fromUser) {
                text_view.setText("Frequency : " + fSlider.getProgress() + " / " + fSlider.getMax());
                if(fromUser) sliderval = progress;
            }
        };
        fSlider.setOnSeekBarChangeListener(listener);

        Button firstButton = (Button) findViewById(R.id.button);
        firstButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                text_view.setText("Frequency : " + fSlider.getProgress() + " / " + fSlider.getMax());
                fSlider.setProgress(sliderval + 1);
                sliderval = sliderval + 1;
            }
        });

        Button secondButton = (Button) findViewById(R.id.button2);
        secondButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                text_view.setText("Frequency : " + fSlider.getProgress() + " / " + fSlider.getMax());
                fSlider.setProgress(sliderval + 10);
                sliderval = sliderval + 10;
            }
        });

        Button thirdButton = (Button) findViewById(R.id.button3);
        thirdButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                text_view.setText("Frequency : " + fSlider.getProgress() + " / " + fSlider.getMax());
                fSlider.setProgress(sliderval + 50);
                sliderval = sliderval + 50;
            }
        });

        Button fourthButton = (Button) findViewById(R.id.button4);
        fourthButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                text_view.setText("Frequency : " + fSlider.getProgress() + " / " + fSlider.getMax());
                fSlider.setProgress(sliderval + 100);
                sliderval = sliderval + 100;
            }
        });

        Button fifthButton = (Button) findViewById(R.id.button5);
        fifthButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                text_view.setText("Frequency : " + fSlider.getProgress() + " / " + fSlider.getMax());
                fSlider.setProgress(sliderval - 1);
                sliderval = sliderval - 1;
            }
        });

        Button sixthButton = (Button) findViewById(R.id.button6);
        sixthButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                text_view.setText("Frequency : " + fSlider.getProgress() + " / " + fSlider.getMax());
                fSlider.setProgress(sliderval - 10);
                sliderval = sliderval - 10;
            }
        });

        Button seventhButton = (Button) findViewById(R.id.button7);
        seventhButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                text_view.setText("Frequency : " + fSlider.getProgress() + " / " + fSlider.getMax());
                fSlider.setProgress(sliderval - 50);
                sliderval = sliderval - 50;
            }
        });

        Button eighthButton = (Button) findViewById(R.id.button8);
        eighthButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                text_view.setText("Frequency : " + fSlider.getProgress() + " / " + fSlider.getMax());
                fSlider.setProgress(sliderval - 100);
                sliderval = sliderval - 100;
            }
        });

        enterButton = (Button)findViewById(R.id.enterbutton);
        enteredText = (EditText) findViewById(R.id.edittexts);

        switch1 = (Switch)findViewById(R.id.switch1);
        switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    isRunning = true;
                    t = new Thread() {
                        public void run() {
                            setPriority(Thread.MAX_PRIORITY);
                            int buffsize = AudioTrack.getMinBufferSize(sr,
                                    AudioFormat.CHANNEL_OUT_MONO, AudioFormat.ENCODING_PCM_16BIT);
                            AudioTrack audioTrack = new AudioTrack(AudioManager.STREAM_MUSIC,
                                    sr, AudioFormat.CHANNEL_OUT_MONO,
                                    AudioFormat.ENCODING_PCM_16BIT, buffsize,
                                    AudioTrack.MODE_STREAM);
                            short samples[] = new short[buffsize];
                            int amp = 10000;
                            double fr;
                            double ph = 0.0;
                            audioTrack.play();
                            while(isRunning){
                                fr =  sliderval;
                                for(int i=0; i < buffsize; i++){
                                    samples[i] = (short) (amp*Math.sin(ph));
                                    ph += 2.0*Math.PI*fr/sr;
                                }
                                audioTrack.write(samples, 0, buffsize);
                            }
                            audioTrack.stop();
                            audioTrack.release();
                        }
                    };
                    t.start();
                }
                else{
                    isRunning = false;
                }
            }
        });
    }

    public void onEnterButtonClick(View view) {
        int myNum = 0;
        try {
            myNum = Integer.parseInt(enteredText.getText().toString());
            if (myNum > 20000){
                Toast.makeText(this,"Enter a number between 0-20000",Toast.LENGTH_LONG).show();
            }
            else{
                text_view.setText("Frequency : " + myNum + " / " + fSlider.getMax());
                fSlider.setProgress(myNum);
                sliderval = myNum;
                enteredText.getText().clear();
            }
        } catch(NumberFormatException nfe) {
            System.out.println("Could not parse " + nfe);
        }
    }

    //Until shared preferences are installed
    public void onPause(){
        super.onPause();
        sliderval = 0;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_2, menu);
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
        return super.onOptionsItemSelected(item);
    }

}