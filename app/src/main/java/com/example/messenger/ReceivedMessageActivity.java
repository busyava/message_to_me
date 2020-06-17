package com.example.messenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ReceivedMessageActivity extends AppCompatActivity {
    private TextView textViewReceivedMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_received_message);
        textViewReceivedMsg = findViewById(R.id.textViewReceivedMsg);

        Intent intent = getIntent(); // получаем intent который вызвал данную активность
        String msg = intent.getStringExtra("Message"); // получаем данные которые были прикрепленны к этому intent (В случае строки). В качестве параметра указывается ключ
        textViewReceivedMsg.setText(msg);// отображаем msg в TextView
    }

    public void onClickBack(View view) {
        Intent intent = new Intent(this, CreateMessageActivity.class);
        startActivity(intent);
    }
}