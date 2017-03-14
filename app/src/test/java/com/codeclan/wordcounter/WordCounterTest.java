package com.codeclan.wordcounter;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class WordCounterTest {
    WordCounter wordCounter;

    @Before
    public void before(){
        wordCounter = new WordCounter();
    }

    @Test
    public void countWordsTest(){
        String text = "How many words are in this text";
        assertEquals(7, wordCounter.countWords(text));
    }

    @Test
    public void secondCountWordsTest(){
        String text = "Great, but how many words are in this text";
        assertEquals(9, wordCounter.countWords(text));
    }

    @Test
    public void testCheckOccurences(){
        String text = "test test test banana";
        wordCounter.checkOccurences(text);
        Integer returnedValue = wordCounter.returnOccurenceValue("test");
        Integer expectedValue = 3;
        assertEquals(expectedValue, returnedValue);
    }


    @Test
    public void countOccurences(){
        String text = "test test test banana";
        String expected = "Individual word count: 'banana': 1, 'test': 3";
        assertEquals(expected, wordCounter.countOccurences(text));

    }

}