import java.io.*;
import java.util.*;

public class UseList {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("src/MobyDick.txt") );
        List<String> words = new LinkedList<String>();
        readFile(input,  words);

        System.out.println("removing the words");
        while(! words.isEmpty()){ // while the list called words is not empty
            words.remove(0); //remove the value at index 0(the first element in the list)
        }
        System.out.println("done");

    }
    public static void everyOther(List<String> words){
        Iterator <String> itr = words.iterator();
        while (itr.hasNext()){
            itr.next();
            if (itr.hasNext()){
                itr.remove();
                itr.next();
            }
        }
    }
    public static void readFile(Scanner input, List<String> words) {
        System.out.println("reading the file");
        while(input.hasNext()) {
            String word = input.next();
            words.add(word);
        }
    }
}
