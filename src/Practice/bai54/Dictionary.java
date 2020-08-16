package Practice.bai54;

import java.util.Scanner;

public class Dictionary {
    private Word[] words;

    public Dictionary(Word[] words) {
        this.words = words;
    }

    public Dictionary() {
    }

    Scanner sc = new Scanner(System.in);

    public void FindWord(String key, String type) {
        for (int i = 0; i < words.length - 1; i++) {
            if (words[i].getKey().equalsIgnoreCase(key) && words[i].getType().equalsIgnoreCase(type)) {
                System.out.println(" -Tu " + "'" + key + "'" + " co nghia la: " + words[i].getValue());
            }
        }
    }

    public int CountWordAV() {
        int count = 0;
        for (int i = 0; i < words.length - 1; i++) {
            if (words[i].getType().equals("Anh Viet")) {
                count++;
            }
        }
        return count;
    }

    public int CountWordVA() {
        int count = 0;
        for (int i = 0; i < words.length - 1; i++) {
            if (words[i].getType().equals("Viet Anh")) {
                count++;
            }
        }
        return count;
    }

    public void Input() {
        System.out.println("-Moi ban nhap vao danh sach tu dien!!");
        words = new Word[2];
        for (int i = 0; i < 2; i++) {
            System.out.println(" -Nhap thong tin cho tu thu " + (i + 1) + ": ");
            System.out.print("\t+Loai tu dien(Anh Viet/Viet Anh): ");
            String type = sc.nextLine();
            if (type.equalsIgnoreCase("Anh Viet") || type.equalsIgnoreCase("Viet Anh")) {
                System.out.print("\t+Tu trong tu dien: ");
                String key = sc.nextLine();
                System.out.print("\t+Nghia cua tu: ");
                String value = sc.nextLine();
                this.words[i] = new Word(key, value, type);
            } else {
                System.out.println("Moi ban nhap lai loai tu dien (Anh Viet/Viet Anh");
                String type1 = sc.nextLine();
                System.out.print("\t+Tu trong tu dien: ");
                String key1 = sc.nextLine();
                System.out.print("\t+Nghia cua tu: ");
                String value = sc.nextLine();
                words[i] = new Word(key1, value, type1);
            }
        }
    }
}