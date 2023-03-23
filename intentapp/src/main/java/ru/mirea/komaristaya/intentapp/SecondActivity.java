package ru.mirea.komaristaya.intentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView textView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        String txt = (String) getIntent().getSerializableExtra("mirea");
        textView1 = findViewById(R.id.textView1);
        int number = 13*13;
        String p = "КВАДРАТ ЗНАЧЕНИЯ МОЕГО НОМЕРА ПО СПИСКУ В ГРУППЕ СОСТАВЛЯЕТ ЧИСЛО: "
                +number+", А ТЕКУЩЕЕ ВРЕМЯ: "+txt;
        textView1.setText(p);
    }
}