package oop.company;

public class EmployeeTest {
    public static void main(String[] args) {

        Regular r = new Regular("java", 20, 3);
        int totalPay = r.calcTotalPay();
        System.out.println("정규직 급여 : " + totalPay);


        // 업케스팅 : upcasting
        // 부모 클래스로 자식 클래스 인스턴스 생성
        Employee emp = new Regular("python", 20, 2);    // upcasting
        totalPay = emp.calcTotalPay();
        System.out.println("정규직 급여 : " + totalPay);


        ////////////////////////////////////////////////
        Employee temp;
        temp = new Temporary("web", 10, 2, 50);
        totalPay = temp.calcTotalPay();
        String strName = temp.name;
        System.out.println("사원이름: " + strName + ", 급여: " + totalPay);

    }
}
