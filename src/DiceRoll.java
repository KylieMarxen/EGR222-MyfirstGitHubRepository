import java.util.*;

public class DiceRoll {
    public static void main(String[] args) {
        System.out.println(" Let's roll some dice!");
        Random rand = new Random();
        int odds = 0;
        int rolls = 0;
        while (odds < 3) {
            //roll die, print its value
            //you rolled a 5
            int roll = rand.nextInt(6) + 1; //1-6
            rolls ++;
            System.out.println("you rolled " + roll);
            if (roll % 2 == 1) {
                odds++;
            } else {
                odds = 0;
            }
        }
        System.out.println("Three in a row after " + rolls + " rolls");
    }
}


