package oop.company;

public class Employee {
    String name ;   // 사원명
    int payPerMonth;    // 월급여
    int commsion;   // 보너스

    public Employee(String name, int payPerMonth, int commsion) {
        this.name = name;
        this.payPerMonth = payPerMonth;
        this.commsion = commsion;
    }
    // 정규직 총 급여 구하기
    int calcTotalPay() {
        int totalPay = 12*payPerMonth + commsion;
        return totalPay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPayPerMonth() {
        return payPerMonth;
    }

    public void setPayPerMonth(int payPerMonth) {
        this.payPerMonth = payPerMonth;
    }

    public int getCommsion() {
        return commsion;
    }

    public void setCommsion(int commsion) {
        this.commsion = commsion;
    }
}
