package Miniproject;

import java.util.List;

public interface StudentInteface {
    List<Student> readAllStudentFormDB();

    void writeAllStudenttoDB(List<Student>students);

    boolean verifyAge(int age);

    boolean verifygioitinh(String gender);

    Student findStudentByname(String name);

    List<Student> findStudentByquequan(String quequan);

    Student findStudentByMSSV(String MSSV);

    List<Student> findStudentByGioiTinh(String gender);

    List<Student> findStudentByLopMH(String LopMH);

    void ChangeInforStudent(Student student, String MSSV, String gender, String quequan, String LopMH, int age);

    void RemoveStudentInforinDB(Student students);

    void AddStudent(Student student);

}
