package com.codeclan.wordcounter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class WordCounterActivity extends AppCompatActivity {

    EditText inputText;
    Button wordCountButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_counter);

        inputText = (EditText) findViewById(R.id.input_text);
        wordCountButton = (Button) findViewById(R.id.word_count_button);
    }

    public void onWordCountButtonClick(View button){
        Log.d(getClass().toString(), "button was clicked");
        String wordsToCount = inputText.getText().toString();

        Intent intent = new Intent(this, AnswerActivity.class);
        intent.putExtra("words", wordsToCount);
        startActivity(intent);
    }
}
