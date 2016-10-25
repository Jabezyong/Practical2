package com.jabez.tarc.practical2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE =
            "com.tarc.jabez.MESSAGE";
    private EditText editTextMessage;
    private Button mBtnSend;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        editTextMessage = (EditText) findViewById(R.id.editTextMessage);
        mBtnSend = (Button) findViewById(R.id.btnSend);
    }

    public void sendMessage(View view){

        Intent intent = new Intent(this,DisplayActivity.class);
        String msg = editTextMessage.getText().toString();
        Log.d("Jabez",msg);
        intent.putExtra(EXTRA_MESSAGE,msg);
        startActivity(intent);
    }

}
