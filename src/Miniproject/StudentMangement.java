package Miniproject;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentMangement implements StudentInteface {
    @Override
    public List<Student> readAllStudentFormDB() {
        List<Student> students = new ArrayList<>();
        Student student;
        String line="";
        try {
            String file=new File("Data/student.txt").getAbsolutePath();
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            line = bufferedReader.readLine();
            while(line != null){
                String []s=line.split("/");
                student=new Student(s[0],Integer.parseInt(s[1]),s[2],s[3],s[4],s[5]);
                students.add(student);
                line = bufferedReader.readLine();
            }
            } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Doc file bi loi!!");
        }
        return students;
    }

    @Override
    public void writeAllStudenttoDB(List<Student> students) {
        String file = new File("Data/student.txt").getAbsolutePath();
        try(FileWriter fileWriter = new FileWriter(file, false);
        PrintWriter printWriter=new PrintWriter(fileWriter)){
            for (Student s:students){
                printWriter.println(s.getName()+"/"+s.getAge()+"/"+s.getMssv()+"/"+
                        s.getLopMh()+"/"+s.getGioitinh()+"/"+s.getQuequan());
            }
        }catch (Exception e){
            System.out.println("Ghi file bi loi!!!");
        }
    }
    @Override
    public boolean verifyAge(int age) {
        if (age > 0 && age < 120) {
            return true;
        }
        return false;
    }

    @Override
    public boolean verifygioitinh(String gioitinh) {
        if (gioitinh.equalsIgnoreCase("Nam") ||gioitinh.equalsIgnoreCase("Nu")) {
            return true;
        }
        return false;
    }

    @Override
    public Student findStudentByname(String name) {
        List<Student> students = readAllStudentFormDB();
        for (Student s : students) {
            if (s.getName().equalsIgnoreCase(name)) {
                return s;
            }
        }
        return null;
    }

    @Override
    public List<Student> findStudentByquequan(String quequan) {
        List<Student> students = readAllStudentFormDB();
        List<Student> samequequan = new ArrayList<>();
        for (Student s : students) {
            if (!s.getQuequan().equalsIgnoreCase(quequan)) {
                samequequan.add(s);
            }
        }
        return samequequan;
    }

    @Override
    public Student findStudentByMSSV(String MSSV) {
        List<Student> students = readAllStudentFormDB();
        for (Student s : students) {
            if (s.getMssv().equalsIgnoreCase(MSSV)) {
                return s;
            }
        }
        return null;
    }

    @Override
    public List<Student> findStudentByGioiTinh(String gender) {
        List<Student> students = readAllStudentFormDB();
        List<Student> samegender = new ArrayList<>();
        for (Student s : students) {
            if (!s.getGioitinh().equalsIgnoreCase(gender)) {
                samegender.add(s);
            }
        }
        return samegender;
    }

    @Override
    public List<Student> findStudentByLopMH(String LopMH) {
        List<Student> students = readAllStudentFormDB();
        List<Student> samelopMH = new ArrayList<>();
        for (Student s : students) {
            if (!s.getLopMh().equalsIgnoreCase(LopMH)) {
                samelopMH.add(s);
            }
        }
        return samelopMH;
    }

    @Override
    public void ChangeInforStudent(Student student, String MSSV, String gender, String quequan, String LopMH, int age) {
        List<Student> students1 = readAllStudentFormDB();
        for (Student s : students1) {
            if (s.getName().equalsIgnoreCase(student.getName())) {
                s.setAge(age);
                s.setMssv(MSSV);
                s.setGioitinh(gender);
                s.setQuequan(quequan);
                s.setLopMh(LopMH);
            }
        }
        writeAllStudenttoDB(students1);
    }

    @Override
    public void RemoveStudentInforinDB(Student students) {
        List<Student> students1 = readAllStudentFormDB();
        List<Student> students2 = new ArrayList<>();
        for (Student s : students1) {
            if (!s.getName().equalsIgnoreCase(students.getName())) {
                students2.add(s);
            }
        }
        writeAllStudenttoDB(students2);
    }
    public void saveinfo(Student student){
        List<Student>students=readAllStudentFormDB();
        students.add(student);
        writeAllStudenttoDB(students);
    }
}
