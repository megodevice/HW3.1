package com.geeks.hw31;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    private EditText editTextEmail;
    private EditText editTextTheme;
    private EditText editTextText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextEmail = findViewById(R.id.edit_text_email);
        editTextTheme = findViewById(R.id.edit_text_theme);
        editTextText = findViewById(R.id.edit_text_text);
    }

    public void onSendButtonClick(View view) {
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:"));
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{editTextEmail.getText().toString()});
        intent.putExtra(Intent.EXTRA_SUBJECT, editTextTheme.getText().toString());
        intent.putExtra(Intent.EXTRA_TEXT, editTextText.getText().toString());
        startActivity(intent);
    }

    public void onNextButtonClick(View view) {
        finish();
    }
}