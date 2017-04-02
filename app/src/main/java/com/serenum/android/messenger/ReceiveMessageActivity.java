package com.serenum.android.messenger;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class ReceiveMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recieve_message);
        Intent intent = getIntent();
        String message = intent.getStringExtra("message");
        TextView textMessage = (TextView) findViewById(R.id.message);
        textMessage.setText(message);
    }
}
