package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> words = new HashMap<>();
        words = Solution6();
        for ( Map.Entry<String, Integer> record : words.entrySet()) {
            System.out.println(" Key = " + record.getKey() + " " + "Value = " + record.getValue());
        }
    }

    // return a list of the number of occurances of each word without punctuation and to lower case.
    public static Map<String, Integer> Solution6(){
        String s = "He is a very very good boy boy, isn't he?";
        //instantiate and initialize data structures
        int frequency;
        Map<String, Integer> words = new HashMap<>();

        // split string based on space in string
        String[] wip = s.split(" ");
        //iterate through the resulting String array of words
        for (String word : wip) {
            // for each word use replaceAll to regex out punctuation, then convert to lower case
            String result = word.replaceAll("[^\\sa-zA-Z0-9]", "").toLowerCase();
            // check if result exists in the words Map, if so increment the frequency
            if (words.containsKey(result)){
                // word exists in words Map, assign int frequency value of found word to var frequency
                frequency = words.get(result);
                //replace found word frequency with new value
                words.put(result,++frequency);
            }
            else{ // word does not yet exist in Map
                // put word in Map with initial frequency value of 1.
                words.put(result,1);
            }
        }System.out.println(words);  // print out words Map to display results to the monitor
        return  words; // return the words Map to calling method.
    }
}