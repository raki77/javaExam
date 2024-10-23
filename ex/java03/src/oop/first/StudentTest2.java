package oop.first;

public class StudentTest2 {
    public static void main(String[] args) {
        StudentCRUD st = new StudentCRUD();
        st.saveStudent();
        st.studentPrint();
        st.updateStudent();
        st.studentPrint();
        st.saveStudent();
    }
}
