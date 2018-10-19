package com.example.piotrkrzeminski.myfirstapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayInfo(View view){

        TextView showCountTextView = (TextView) findViewById(R.id.textView2);

        String str = "xD";

        showCountTextView.setText(str);


    }
}
