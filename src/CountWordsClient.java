import java.io.FileNotFoundException;

public class CountWordsClient {
    public static void main(String[] args ) throws FileNotFoundException {
        System.out.println("Counting unique words from the file:");
       // call the main method from Count Words to do the word count
        CountWords.main(args);
    }
}
