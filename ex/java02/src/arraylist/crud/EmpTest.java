package arraylist.crud;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class EmpTest {
    public static void main(String[] args) {
        EmpService empService = new EmpService();
        EmpMapService map = new EmpMapService();
        Regular r1 = new Regular("1000", "java1", 100, 5);
        Regular r2 = new Regular("1001", "java2", 100, 4);
        Regular r3 = new Regular("10033", "java33", 1200, 12);
        Regular r4 = new Regular("10044", "java44", 1200, 11);

        Employee temp = new Temporary("5000","web", 10, 2, 50);
        empService.addEmployee(r1);
        empService.addEmployee(r2);
        empService.addEmployee(r3);
        empService.addEmployee(r4);
        empService.addEmployee(temp);
        empService.deleteEmployee(1001);
        empService.updateEmployee(new Regular("3000", "java3", 100, 6));
        ArrayList<Employee> empList = empService.findEmployee("java1");
        // System.out.println("empList : " + empList);
        /*
        map.addEmployee(r1);
        map.addEmployee(r2);
        map.addEmployee(r3);
        map.addEmployee(r4);
        map.deleteEmployee("java1");
        map.update2Employee("java2", new Regular("4000", "java4", 900, 900));
        map.getEmployee();
        */

        Iterator<Employee> it = empList.iterator();
        while(it.hasNext()) {
            Employee emp = it.next();
            String str = emp.toString();
            System.out.println("str:" + str);
        }


    }
}
