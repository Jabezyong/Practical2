package com.jabez.tarc.practical2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {
    private TextView mTxtDisplay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        Intent intent = getIntent();
        String msg = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        mTxtDisplay = (TextView) findViewById(R.id.textViewDisplay);
        Log.d("jabez",msg);
        mTxtDisplay.setText(msg);

    }

    public void closeActivity(View view){
        finish();
    }
}
