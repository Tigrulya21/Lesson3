package ru.mirea.komaristaya.favoritebook;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ShareActivity extends AppCompatActivity {
        private EditText edText;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_share);
            // Получение данных из MainActivity
            Bundle extras = getIntent().getExtras();
            if (extras != null) {
                TextView ageView = findViewById(R.id.textView2);
                String university = extras.getString(MainActivity.KEY);
                ageView.setText(String.format("Мой любимая книга: %s", university));
            }
        }
        public void onClickBtn2(View view) {
            edText = findViewById(R.id.editTextTextPerson);
            String text = edText.getText().toString();
            Intent data = new Intent();
            data.putExtra(MainActivity.USER_MESSAGE, text);
            setResult(Activity.RESULT_OK, data);
            finish();
        }
    }
