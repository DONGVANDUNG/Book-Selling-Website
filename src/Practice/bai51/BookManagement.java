package Practice.bai51;

import java.util.Scanner;

public class BookManagement {
    private int n;
    private Book[] books;

    public BookManagement(int n, Book[] books) {
        this.n = n;
        this.books = books;
    }

    public BookManagement(int n) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-Moi ban nhap thong tin cho " + n + " cuon sach!!");
        books=new Book[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\t-Nhap thong tin cho cuon sach thu" + (i + 1) + ":");
            System.out.print("\t\t+Ten sach:\t");
            String name = sc.nextLine();
            System.out.print("\t\t+Author: \t");
            String Author = sc.nextLine();
            System.out.print("\t\t+Price: \t");
            long Price = sc.nextLong();
            System.out.print("\t\t+Tong so da ban duoc: ");
            long Totalsold = sc.nextLong();
            books[i] = new Book(name, Author, Price, Totalsold);
            sc.nextLine();
        }
        sc.close();
    }

    public int CoutBook() {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (books[i].BestSeller()) {
                count++;
            }
        }
        return count;
    }

    public String BestTotalSold() {
        Book best = books[0];
        for (int i = 0; i < n; i++) {
            if (books[i].getTotalSold() > best.getTotalSold()) {
                best = books[i];
            }
        }
        return best.toString();
    }

    public void print() {
        for (int i = 0; i < n; i++) {
            System.out.println("-Cuon sach thu " + (i + 1) + ":");
            System.out.print("\t+Ten Sach: " + books[i].getName());
            System.out.print("\t+Ten Author: " + books[i].getAuthor());
            System.out.print("\t+Gia ban: " + books[i].getPrice());
            System.out.print("\t+Tong so da ban duoc: " + books[i].getTotalSold());
        }
    }
}
