package Practice.bai42;

import javafx.concurrent.ScheduledService;

import java.util.Scanner;

import static jdk.nashorn.internal.runtime.regexp.joni.encoding.CharacterType.S;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManagement students = new StudentManagement(3);
        System.out.println("\t+Tong so sinh vien do la: " + students.CountDo());
        System.out.println("\t+Tong so sinh vien truot la: " + students.CountTruot());
        System.out.println("-Sinh vien co diem cao nhat: \n\t" + students.BestStudent());
        System.out.println("-Sinh vien co diem thap nhat:\n\t" + students.WorstStudent());
    }
}
