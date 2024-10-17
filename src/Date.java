public class Date {
    //fields
    private int year;
    private int month;
    private int day;

    //constructors - initialize the state of created objects

    public Date(int year, int month, int day) {
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Illegal month: " + month);
        }
        setYear(year);
        setMonth(month);
        setDay(day);
    }
    public Date(Date other){
        this(other.year, other.month, other.day);
        year = other.year;
        month = other.month;
        day = other.day;
    }
    //methods- behavior of each date object

    public int getDay(){
        return day;
    }
    public int getMonth(){
        return month;
    }
    public int getYear(){
        return year;
    }
    public void setDay(int day){
        if (day < 1 || day > getDaysInMonth()){
            throw new IllegalArgumentException("Illegal day: " + day);
        }
        this.day = day;
    }
    public void setMonth(int month){
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Illegal month: " + month);
        }
        this.month = month;
    }
    public void setYear(int year){
        this.year = year;
    }


    public int getDaysInMonth(){
        //runs "in the context" of a particular object
        // 31, 30, 28/29
        if(month == 9 || month == 4 || month == 6 || month == 6 || month == 11 ){
            return 30;
        }else if (month == 2){
            if (isLeapYear()) {
                return 29;
            } else {
                return 28;
            }
        }else{
            return 31;
        }
    }
    public int getDaysInYear(){
        if(isLeapYear()){
            return 366;
        }else {
            return 365;
        }
    }
    //accessor- return information about state of the object
    //mutator - changes the state of the object

    //returns true if this date occurs in a leap year
    public boolean isLeapYear(){
        return ( year % 400 == 0  || (year % 4 == 0 && year % 100 != 0 ));

        }
        public void nextDay(){
        // 1. within same month
            // 2. wrapping to next month
            //3. wrapping to next year
        day++;
        if (day > getDaysInMonth()) {
            //wrapping to next month
            month++;
            day = 1;
            if(month > 12){
                //wrapping to next year
                month = 1;
            }

        }

        }
        public int daysBetween(Date other){
        // count number of days
            // start at this date, move forward until we reach other
            int count = 0;

            //assumes this date comes before the other date
            if(before(other)){
                Date temp = new Date(this);
                while (temp.year != other.year || temp.month != other.month || temp.day != other.day) {
                    temp.nextDay(); //side effect
                    count++;
                }
            }else{
                // this date is >= other date
                Date temp = new Date(other);
                while (temp.year != year || temp.month != month || temp.day != day) {
                    temp.nextDay(); //side effect
                    count++;
                }
            }
            return count;
        }
        public boolean before (Date other){
        return (year < other.year ||
                (year == other.year && (month < other.month ||
                        month == other.month && day < other.day)));
        }
    }


