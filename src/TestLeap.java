public class TestLeap {
    public static void main(String[] args) {
        test(1600);
        test(1700);
        test(2000);
        test(2008);
        test(2009);
        test(45);
    }

    public static void test(int year) {
        System.out.println(" is leap year (" + year + ") returns " + isLeap(year));
    }


    public static boolean isLeap(int n) {
        return ((n % 4 == 0) && (n % 100 != 0)) || (n % 400 == 0);

    }
}
/* if (n % 400 == 0) {
return true;
} else if (n % 100 == 0) {
return false
} else if (n % 4 == 0) {
}return true
} else {
return false
 */

