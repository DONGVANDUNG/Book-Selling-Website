package Practice.bai54;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dictionary dictionary = new Dictionary();
        dictionary.Input();
        System.out.println("-------------------------------------------------");
        System.out.println("-Moi ban nhap vao tu ma ban muon tra nghia!!");
        System.out.print("\t+Tu trong tu dien: ");
        String key = sc.nextLine();
        System.out.print("\t+Tu " + "'" + key + "'" + " thuoc loai tu dien nao (Anh Viet|Viet Anh): ");
        String type = sc.nextLine();
        dictionary.FindWord(key, type);
        System.out.println("--------------------------------------------------");
        System.out.println("-Trong tu dien co " + dictionary.CountWordAV() + " tu vung Anh Viet");
        System.out.println("-Trong tu dien co " + dictionary.CountWordVA() + " tu vung Viet Anh");
        sc.close();
    }
}
