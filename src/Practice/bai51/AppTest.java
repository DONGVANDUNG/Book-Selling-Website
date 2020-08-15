package Practice.bai51;

public class AppTest {
    public static void main(String[] args) {
        BookManagement bookManagement = new BookManagement(3);
        bookManagement.print();
        System.out.println("\t+Tong so sach BestterSeller: " + bookManagement.CoutBook());
        System.out.println("\t+Cuon sach ban chay nhat la: \n\t\t" + bookManagement.BestTotalSold());

    }
}
