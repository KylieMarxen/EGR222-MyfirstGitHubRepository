// this client program uses the Date class
public class DateMain {
    public static void main(String[] args) {
        Date d1 = new Date(2008,3,1);
         Date d2 = new Date(2008,5,10);
         Date d3 = new Date(d1);
         Date d4 = new Date(-2308947, 11, -2); //illegal date
         d4.setMonth(14);
         d4.setDay(-2);





         System.out.println(d1.getYear());
         System.out.println(d1.getDaysInMonth());
        System.out.println(d1.getDaysInYear());
        System.out.println(d1.isLeapYear());
        System.out.println(d1.getYear() + "/" + d1.getMonth() + "/" + d1.getDay());
        d1.nextDay(); //10/18
        System.out.println(d1.getYear() + "/" + d1.getMonth() + "/" + d1.getDay());
        System.out.println(d2.getDaysInMonth());
        System.out.println(d2.getDaysInYear());
        System.out.println(d2.isLeapYear());
        System.out.println(d1.getYear() + "/" + d2.getMonth() + "/" + d2.getDay());
        d2.nextDay(); //10/18
        System.out.println(d1.getYear() + "/" + d2.getMonth() + "/" + d2.getDay());
        System.out.println(d3.getYear());
        System.out.println(d3.getDaysInMonth());
        System.out.println(d3.getDaysInYear());
        System.out.println(d3.isLeapYear());

        System.out.println(d4.getYear() + "/" + d4.getMonth() + "/" + d4.getDay());
        d4.nextDay(); //10/18
        System.out.println(d4.getYear() + "/" + d4.getMonth() + "/" + d4.getDay());

        System.out.println(d1.daysBetween(d2));
        System.out.println(d1.daysBetween(d2));
       System.out.println(d2.daysBetween(d1));
       //System.out.println(d1.daysBetween(d1));

    }

}
