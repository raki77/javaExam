package arraylist.crud;



public class Temporary extends Employee {

    private int workedHour;
    private String empno;
    public Temporary(String empno, String name, int payPerMonth, int commsion, int workedHour) {
        super(empno, name, payPerMonth, commsion);
        this.workedHour = workedHour;
    }

}
