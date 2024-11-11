import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ClientUseList {
    public static void main(String[] args) throws FileNotFoundException {
        // Read words from the file and store them in a list
        Scanner input = new Scanner(new File("src/MobyDick.txt"));
        List<String> words = new LinkedList<String>();
        UseList.readFile(input, words);

        // Display the original list of words
        System.out.println("Original words list:");
        System.out.println(words);

        // Call everyOther to remove every other word
        UseList.everyOther(words);

        //  Display the modified list after every other word removal
        System.out.println("List after removing every other word:");
        System.out.println(words);

        //Clear the list and confirm it's empty
        words.clear();
        System.out.println("List after clearing all words:");
        System.out.println(words.isEmpty() ? "List is empty" : words);
    }
}

