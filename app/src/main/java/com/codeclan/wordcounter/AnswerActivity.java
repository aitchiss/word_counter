package com.codeclan.wordcounter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity extends AppCompatActivity {

    TextView answerText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String wordsToCount = extras.getString("words");

        WordCounter wordCounter = new WordCounter();
        int answer = wordCounter.countWords(wordsToCount);
        answerText = (TextView) findViewById(R.id.answer_text);
        answerText.setText("Number of words in your text: " + String.valueOf(answer));

    }
}
