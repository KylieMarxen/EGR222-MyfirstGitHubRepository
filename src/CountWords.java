import java.io.*;
import java.util.*;

public class CountWords {
    public static void main(String[] args) throws FileNotFoundException{
        Set<String>words = new TreeSet<String>();

        Scanner input = new Scanner(new File("Src/small.txt"));
        while(input.hasNext()){
            String word = input.next();
            //if (!words.contains(word)){
                words.add(word);
            }
        System.out.println(words.size() + " unique words");
        for (String word : words) {
            System.out.println(word);
        }
        }

    }

