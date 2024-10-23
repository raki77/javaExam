package oop.second;

public class StudentService {
    final int MAX_SIZE = 50;
    Student[] infoSt = new Student[MAX_SIZE];
    int count = 0;
    public void inputData() {
        System.out.println("데이터 입력을 시작 합니다.");
        System.out.print("이름 : ");
        String name = ScanData.sc.next();
        System.out.print("학년 : ");
        int grade = ScanData.sc.nextInt();
        // 입력한 내용을 인스턴스 생성 한다.
        infoSt[count++] = new Student(name, grade);
        System.out.println("데이터 입력 성공!!!");
    }

    public void searchData() {
        System.out.println("데이터 검색을 시작 합니다.");
        System.out.print("이름:");
        String name = ScanData.sc.next();
        // int idx = 5 데이터가 존재.
        // 데이터 존재 않음.
        int idx = search(name);
        if(idx<0) {
            System.out.println("해당하는 데이터가 존재하지 않습니다. \n");
        }
        else {
            System.out.println("데이터 검색이 완료 되었습니다. \n");
        }
    }

    private int search(String name) {
        // 입력한 값, 배열에 저장되어 있는 이름과 비교하여 존재하면 이름
        for(int i=0; i<count; i++) {
            Student curSt = infoSt[i];
            if(name.compareTo(curSt.getName()) == 0) {
                return i;
            }
        }
        return -1;
    }

    public void deleteData() {
        System.out.println("데이터 삭제를 시작 합니다.");
        System.out.print("이름:");
        String name = ScanData.sc.next();
        int idx = search(name);
        if(idx < 0) {
            System.out.println("해당하는 데이터가 존재하지 않습니다. \n");
        }
        else {
            for(int i=idx; i< (count-1) ;i++)
                // 배열 이동
                infoSt[i] = infoSt[i + 1];
            // 배열 요소를 1감소
            count--;
            // 삭제가 완료 되었습니다.
            System.out.println("데이터 삭제가 완료 되었습니다. \n");
        }
    }

}
