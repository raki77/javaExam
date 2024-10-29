package arraylist.crud;

public class Employee {
    String prm1 ;   // 사원명
    String empno;
    int commsion;   // 보너스 
    int payPerMonth;

    public Employee(String prm1, String empno, int commsion, int prm4) {
        this.prm1 = prm1;
        this.empno = empno;
        this.commsion = commsion;
        this.payPerMonth = prm4;
    }

    // 정규직 총 급여 구하기
    int calcTotalPay() {
        int totalPay = 12*payPerMonth + commsion;
        return totalPay;
    }


    public String getPrm1() {
        return prm1;
    }

    public void setPrm1(String prm1) {
        this.prm1 = prm1;
    }

    public String getEmpno() {
        return empno;
    }

    public void setEmpno(String empno) {
        this.empno = empno;
    }

    public int getCommsion() {
        return commsion;
    }

    public void setCommsion(int commsion) {
        this.commsion = commsion;
    }

    public int getPayPerMonth() {
        return payPerMonth;
    }

    public void setPayPerMonth(int payPerMonth) {
        this.payPerMonth = payPerMonth;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "prm1='" + prm1 + '\'' +
                ", empno='" + empno + '\'' +
                ", commsion=" + commsion +
                ", payPerMonth=" + payPerMonth +
                ", 급여 =" + calcTotalPay() +
                '}';
    }
}
