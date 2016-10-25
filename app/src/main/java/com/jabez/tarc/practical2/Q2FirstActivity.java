package com.jabez.tarc.practical2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Q2FirstActivity extends AppCompatActivity {
    private EditText mETID;
    private EditText mETName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q2_first);
        mETID = (EditText) findViewById(R.id.editTextQ2_1);
        mETName = (EditText) findViewById(R.id.editTextQ2_2);
    }

    public void sendResult(View v){
        String id = mETID.getText().toString();
        String name = mETName.getText().toString();

        Intent intentMessage = new Intent();
        intentMessage.putExtra("ID",id);
        intentMessage.putExtra("NAME",name);
        setResult(2,intentMessage);
        finish();
    }
}
