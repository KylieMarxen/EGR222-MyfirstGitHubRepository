// this client program uses the Date class
public class DateMain {
    public static void main(String[] args) {
        Date d1 = new Date();
        d1.year = 2009;
        d1.month = 10;
        d1.day = 17;
        Date d2 = new Date();
        d2.year = 2008;
        d2.month = 2;
        d2.day = 3;
        System.out.println(d1.getDaysInMonth());
        System.out.println(d1.getDaysInYear());
        System.out.println(d1.isLeapYear());
        System.out.println(d2.getDaysInMonth());
        System.out.println(d2.getDaysInYear());
    }

}
