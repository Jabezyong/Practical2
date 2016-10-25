package com.jabez.tarc.practical2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class RetrieveActivity extends AppCompatActivity {
    private TextView mTV1;
    private TextView mTV2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retrieve);
        mTV1 = (TextView) findViewById(R.id.textView2);
        mTV2 = (TextView) findViewById(R.id.textView3);
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String id = extras.getString("ID");
        String name = extras.getString("NAME");
        mTV1.setText(id);
        mTV2.setText(name);
    }
}
