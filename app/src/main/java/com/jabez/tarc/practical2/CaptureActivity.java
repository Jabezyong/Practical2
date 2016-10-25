package com.jabez.tarc.practical2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CaptureActivity extends AppCompatActivity {
    public final static String CAPTURE=
        "com.tarc.jabez.CaptureMessage";
    private TextView mTVID;
    private TextView mTVName;
    private Button mBtnSend;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capture);
        initView();
    }

    private void initView() {
        mTVID = (TextView) findViewById(R.id.editTextID);
        mTVName = (TextView) findViewById(R.id.editTextName1);
        mBtnSend = (Button) findViewById(R.id.buttonSend);
    }

    public void msgSend(View view){
        String id = mTVID.getText().toString();
        String name = mTVName.getText().toString();
        Intent intent = new Intent(this,RetrieveActivity.class);
        intent.putExtra("ID",id);
        intent.putExtra("NAME",name);
        startActivity(intent);
    }
}
