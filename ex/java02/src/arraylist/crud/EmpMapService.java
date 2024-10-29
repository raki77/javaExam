package arraylist.crud;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EmpMapService {
    private HashMap<String, Employee> map;

    public EmpMapService() {
        this.map = new HashMap<String, Employee>();
    }
    public void addEmployee(Employee e) {
//        boolean flag = false;
//        Set<Integer> set = map.keySet();
//        for (int key : set) {
//            if(map.get(key).getEmpno() == e.getEmpno()) {
//                flag = true;
//                System.out.println(e.getEmpno() + "존재 함");
//            }
//        }
//        if(flag == false) {
//            map.put(e.getEmpno(), e);
//            System.out.println(e.getEmpno() + "님이 등록 됨");
//            return;
//        }
        if( map.containsKey(e.getEmpno())) {
            System.out.println(e.getEmpno() + "존재 함.");
            return;
        }
        else {
            map.put(e.getEmpno(), e);
            System.out.println(e.getEmpno() + "님이 등록됨.");
        }
    }

    public void deleteEmployee(String empno) {
        Set<String> set = map.keySet();
        boolean flag = false;
//        for( String key : set ) {
//            if( key == empno) {
//                flag = true;
//                System.out.println(map.get(key).getEmpno() + "삭제 됨.");
//                map.remove(key);
//                return;
//            }
//        }
//        if(flag == false) {
//            System.out.println("삭제할 대상이 없음.");
//        }
        for(Object obj : set) {
            System.out.println(obj.toString());
        }
        Employee emp = map.remove(empno);
        if(emp == null) {
            System.out.println("삭제할 대상이 없음");
            return;
        }
        else {
            System.out.println(emp.getEmpno() + "님이 삭제됨.");
        }
    }

    public void update2Employee(String empno, Employee prmEmployee) {

        boolean flag = false;
        if (map.containsKey(empno)) {
            map.put(empno, prmEmployee);
            System.out.println(empno + "님의 정보가 변경됨.");
            flag = true;
        }
        else {
            System.out.println("변경할 대상이 없음.");
        }

        // flag를 이용하여 추가 작업 수행
        if (flag) {
            System.out.println("정보 변경이 성공적으로 완료되었습니다.");
        }
    }

    public void getEmployee() {
        // Employee 목록 출력
        System.out.println("Employee List:");
        for (Map.Entry<String, Employee> entry : map.entrySet()) {
            String key = entry.getKey();
            Employee employee = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + employee);
        }
    }


}
