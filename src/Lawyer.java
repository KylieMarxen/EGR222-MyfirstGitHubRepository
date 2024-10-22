// a class to represent lawyers

public class Lawyer extends Employee {
    public Lawyer(int initialYears){
        super(initialYears);
    }

    public int getVacationDays(){
        return 2 * super.getVacationDays(); //twice the normal vacation
    }

    public double getSalary(){
        return super.getSalary() + 5000  ; //45,000 a year
    }

    public void sue(){
        System.out.println("I'll see you in court");
    }
}
