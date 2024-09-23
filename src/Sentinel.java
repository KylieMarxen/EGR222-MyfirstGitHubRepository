import java.util.Scanner;

public class Sentinel {
    public static final int SENTINEL = -1;

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        //read initial number ("place a post")
        System.out.print("Enter a number (" + SENTINEL + " to quit): ");
       int number = console.nextInt();
       int min = number;

       while ( number != SENTINEL ) {
            // is this the smallest number we've seen so far
            if(number < min) {
                min = number;
               }
            System.out.print("Enter a number (" + SENTINEL + " to quit): ");
            number = console.nextInt();
            }
        System.out.println("The minimum is " + min);
        }
    }

