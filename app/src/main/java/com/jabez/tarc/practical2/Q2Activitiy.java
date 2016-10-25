package com.jabez.tarc.practical2;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Q2Activitiy extends AppCompatActivity {
    private TextView mTVID;
    private TextView mTVNum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q2_main);
    }

    public void invokeFirst(View v){
        Intent intent = new Intent(this,Q2FirstActivity.class);
        startActivityForResult(intent,2);
    }

    public void invokeSecond(View v){
        if(mTVNum.getText().toString())
        Intent intent = new Intent(Intent.ACTION_DIAL,
                Uri.parse("tel:"+mTVNum.getText().toString()));
        startActivity(intent);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode ==2){
            if(data!=null){
                String id = data.getStringExtra("ID");
                String num = data.getStringExtra("NUMBER");
                mTVID = (TextView) findViewById(R.id.textViewQ2_1);
                mTVNum = (TextView) findViewById(R.id.textViewQ2_2);
                mTVID.setText(id);
                mTVNum.setText(num);
            }
        }
    }
}
