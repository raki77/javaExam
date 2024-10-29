package arraylist.crud;

import java.util.ArrayList;
import java.util.Iterator;

public class EmpService {

    private ArrayList<Employee> list;

    public EmpService() {
        list = new ArrayList<Employee>();
    }
    public void addEmployee(Employee e) {
        boolean flag = false;
        for(Employee emp : list) {
            if(e.getEmpno() == emp.getEmpno()) {
                flag = true;
                System.out.println(e.getEmpno() + "이 존재 합니다.");
                return;
            }
        }
        if(flag == false) {
            list.add(e);
            System.out.println(e.getEmpno() + "가 저장 됨.");
        }
    }

    public void deleteEmployee(int empno) {
        boolean flag = false;
        for(Employee e: list){
            if(String.valueOf(empno).equals(e.getEmpno())) {
                System.out.println(e.getEmpno() + "이 삭제 됨.");
                list.remove(e);
                return;
            }
        }
        if(flag == false) {
            System.out.println("삭제할 대상이 존재하지 않음");
        }
    }

    public void updateEmployee(Employee prmEmployee) {
        boolean flag = false;
        for(int i=0; i<list.size() ; i++){
            Employee e = (Employee) list.get(i);
            if(String.valueOf(prmEmployee.getEmpno()).equals(e.getEmpno())) {
                flag = true;
                list.set(i, e);
                System.out.println(e.getEmpno() + "이 수정 됨.");
                return;
            }
        }
        if(flag == false) {
            System.out.println("갱신할 대상이 존재하지 않음");
        }
    }


    public ArrayList<Employee> getList() {
        return list;
    }

    public void setList(ArrayList<Employee> list) {
        this.list = list;
    }


    public ArrayList<Employee> findEmployee(String name) {
        ArrayList<Employee> lEmp = new ArrayList<Employee>();
        for(Employee emp : list) {
            if(emp.getEmpno().equals(name)) {
                lEmp.add(emp);
            }
        }
        return lEmp;
    }
}
