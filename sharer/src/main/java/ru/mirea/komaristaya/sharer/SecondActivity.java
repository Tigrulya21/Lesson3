package ru.mirea.komaristaya.sharer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SecondActivity extends AppCompatActivity {

    private TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        String texx = (String) getIntent().getSerializableExtra("mirea");
        text = findViewById(R.id.textView1);
        text.setText(texx);
    }
}