// This program demonstrates for loops.
public class LoopsExample {
    public static void main(String[] args) {
        System.out.println("Hello");
        for(int i = 10;
            i >= 1;
            i--) {
            System.out.println(i + " squared = " + (i * i));
        }
        System.out.println("Goodbye");
    }
}
