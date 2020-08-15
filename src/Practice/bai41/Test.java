package Practice.bai41;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-Moi ban nhap vao cac thong so!!");
        System.out.print("\t-Width is:\t");
        float width = sc.nextFloat();
        System.out.print("\t-Height is:\t");
        float height = sc.nextFloat();
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("\t\t+Chu vi hinh chu nhat la: " + rectangle.tinhchuvi());
        System.out.println("\t\t+Dien tich hinh chu nhat la: " + rectangle.tinhdientich());
    }
}
