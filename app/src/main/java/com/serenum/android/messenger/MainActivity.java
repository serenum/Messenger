package com.serenum.android.messenger;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view){
        Intent intent = new Intent(this, ReceiveMessageActivity.class);
        EditText message = (EditText) findViewById(R.id.message);
        intent.putExtra("message", message.getText().toString());
        startActivity(intent);
    }
}
