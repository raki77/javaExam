package oop.company;

public class Temporary extends Employee {

    private int workedHour;

    public Temporary(String name, int payPerMonth, int commsion, int workedHour) {
        super(name, payPerMonth, commsion);
        this.workedHour = workedHour;
    }
    protected int calcTotalPay() {
        int temp = super.calcTotalPay();
        int tempTotalPay = temp + workedHour * 2000;
        return tempTotalPay;
    }


}
