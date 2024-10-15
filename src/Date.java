public class Date {
    //fields
    int year;
    int month;
    int day;

    //constructors - initialize the state of created objects

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public Date(Date other){
        this(other.year, other.month, other.day);
        year = other.year;
        month = other.month;
        day = other.day;
    }


    //methods
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

    public boolean isLeapYear(){
        return ( year % 400 == 0  || (year % 4 == 0 && year % 100 != 0 ));

        }
    }


