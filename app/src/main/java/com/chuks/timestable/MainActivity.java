package com.chuks.timestable;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SeekBar;

public class MainActivity extends Activity {

    private ListView listView;
    private SeekBar seekBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView);
        seekBar = (SeekBar) findViewById(R.id.seekBar);
        
    }
}
