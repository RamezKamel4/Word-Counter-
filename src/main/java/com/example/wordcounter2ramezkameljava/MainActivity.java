package com.example.wordcounter2ramezkameljava;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText inputEditText;
    private TextView characterCountTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputEditText = findViewById(R.id.inputEditText);
        characterCountTextView = findViewById(R.id.characterCountTextView);
    }

    public void countCharacters(View view) {
        String inputText = inputEditText.getText().toString();
        int charCount = TextUtilis.getCharsCount(inputText);
        int wordCount = TextUtilis.getWordsCount(inputText);

        characterCountTextView.setText("Character count: " + charCount + "\nWord count: " + wordCount);
    }
}
