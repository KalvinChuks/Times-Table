package com.chuks.timestable;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends Activity {

    private ListView listView;
    private SeekBar seekBar;
    private TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView);
        seekBar = (SeekBar) findViewById(R.id.seekBar);
        textView = (TextView) findViewById(R.id.textView);


        seekBar.setMax(12);
        seekBar.setProgress(1);


        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                int min = 1;
                int timesTableValue = 1;

                if (progress <= min) {

                    timesTableValue = 1;
                    seekBar.setProgress(min);
                } else {
                    timesTableValue = progress;
                }

                //generateTimesTable(timesTableValue);
                generateTimesTableString(timesTableValue);

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }


    public void generateTimesTable(int passedTimesTablesValue){
        final ArrayList<Integer> numbers = new ArrayList<Integer>();
        textView.setText(passedTimesTablesValue + " Times Table");

        for(int i=1;i<=seekBar.getMax();i++){
            int mmxx = passedTimesTablesValue * i;
            numbers.add(mmxx);
        }

        ArrayAdapter adapter = new ArrayAdapter(getApplicationContext(),android.R.layout.simple_list_item_1,numbers);
        listView.setAdapter(adapter);
    }

    public void generateTimesTableString(int passedTimesTablesValue){
        final ArrayList<String> numbers = new ArrayList<String>();
        textView.setText(passedTimesTablesValue + " Times Table");

        for(int i=1;i<=seekBar.getMax();i++){
            int mmxx = passedTimesTablesValue * i;
            String result = passedTimesTablesValue +" x "+ i +" = "+mmxx;
            numbers.add(result);
        }

        ArrayAdapter adapter = new ArrayAdapter(getApplicationContext(),android.R.layout.simple_list_item_1,numbers);
        listView.setAdapter(adapter);
    }

}
