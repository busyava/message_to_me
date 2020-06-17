package com.example.messenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CreateMessageActivity extends AppCompatActivity {
    private EditText editTextMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);
        editTextMessage = findViewById(R.id.editTextMessage);
    }

//    кнопка отправляющая в activity_received_message:
    public void onClickSendMsg(View view) {
        String msg = editTextMessage.getText().toString(); // получаем введеное в editTextMessage пользователем сообщение

        Intent intent = new Intent(this, ReceivedMessageActivity.class);  // ReceivedMessageActivity.class - куда переходим
        intent.putExtra("Message", msg);  // отправляется обязательно парой: ключ значение
        startActivity(intent);  // отправка
    }
}