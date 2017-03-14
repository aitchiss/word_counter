package com.codeclan.wordcounter;

import java.util.HashMap;

/**
 * Created by user on 14/03/2017.
 */

public class WordCounter {

    HashMap<String, Integer> occurences;

    public WordCounter(){
        this.occurences = new HashMap<String, Integer>();
    }

    public int countWords(String text){
        String[] words = text.split(" ");
        return words.length;
    }

    public String countOccurences(String text){
        this.occurences.clear();
        checkOccurences(text);
        String result = "Individual word count: ";
        for (String key : this.occurences.keySet()){
            result = result + "'" + key + "': ";
            result = result + Integer.toString(this.occurences.get(key)) + ", ";
        }
        String formattedResult = result.substring(0, (result.length()-2));
        return formattedResult;

    }

    public void checkOccurences(String text){
        String[] words = text.split(" ");

        for (String word : words){
            if (this.occurences.containsKey(word) != true){
                this.occurences.put(word, 1);
            } else {
                this.occurences.put(word, (this.occurences.get(word) + 1));
            }
        }
    }

    public Integer returnOccurenceValue(String word){
        return this.occurences.get(word);
    }
}
