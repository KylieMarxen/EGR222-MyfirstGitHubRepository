// this client program uses the Date class
public class DateMain {
    public static void main(String[] args) {
        Date d1 = new Date(2008,3,1);
         Date d2 = new Date(2008,5,10);
         Date d3 = new Date(d1);
         Date d4 = new Date(2010, 12, 31);

         System.out.println(d1.year);
         System.out.println(d1.getDaysInMonth());
        System.out.println(d1.getDaysInYear());
        System.out.println(d1.isLeapYear());
        System.out.println(d1.year + "/" + d1.month + "/" + d1.day);
        d1.nextDay(); //10/18
        System.out.println(d1.year + "/" + d1.month + "/" + d1.day);
        System.out.println(d2.getDaysInMonth());
        System.out.println(d2.getDaysInYear());
        System.out.println(d2.isLeapYear());
        System.out.println(d1.year + "/" + d2.month + "/" + d2.day);
        d2.nextDay(); //10/18
        System.out.println(d1.year + "/" + d2.month + "/" + d2.day);
        System.out.println(d3.year);
        System.out.println(d3.getDaysInMonth());
        System.out.println(d3.getDaysInYear());
        System.out.println(d3.isLeapYear());

        System.out.println(d4.year + "/" + d4.month + "/" + d4.day);
        d4.nextDay(); //10/18
        System.out.println(d4.year + "/" + d4.month + "/" + d4.day);

        System.out.println(d1.daysBetween(d2));
        System.out.println(d1.daysBetween(d2));
       System.out.println(d2.daysBetween(d1));
       //System.out.println(d1.daysBetween(d1));

    }

}
