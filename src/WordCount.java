import java.util.*;
import java.io.*;

public class WordCount {
    public static void main(String[] args) throws FileNotFoundException {
        //map of (word, count) pairs
        Map<String, Integer> wordCounts = new TreeMap<String, Integer>();


        Scanner input  = new Scanner(new File ("src/MobyDick.txt"));
        while(input.hasNext()){
            String word = input.next();

            if(! wordCounts.containsKey(word)){
                wordCounts.put(word, 1); // seen the word once
            }else{
                // some existing word count pair
                // "the" -> 27 -> 28
                int oldValue = wordCounts.get(word);
                wordCounts.put(word, oldValue + 1);
            }
        }

        //print all words that occur 500 times or more
        for ( String word : wordCounts.keySet()){
            int count = wordCounts.get(word);
            if (count >= 2000) {
                System.out.println(word + " occurs" + wordCounts.get(word) + " times");

            }
        }
    }
}
