package com.codeclan.wordcounter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AnswerActivity extends AppCompatActivity {

    TextView answerText;
    TextView answerBreakdownText;

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

        answerBreakdownText = (TextView) findViewById(R.id.answer_breakdown_text);
        answerBreakdownText.setText(wordCounter.countOccurences(wordsToCount));

    }

    public void onClickBackToMainScreen(View button){
        Intent intent = new Intent(this, WordCounterActivity.class);
        startActivity(intent);
    }
}
