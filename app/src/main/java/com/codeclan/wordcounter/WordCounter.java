package com.codeclan.wordcounter;

/**
 * Created by user on 14/03/2017.
 */

public class WordCounter {

    public int countWords(String text){
        String[] words = text.split(" ");
        return words.length;
    }
}
