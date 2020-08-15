package Practice.bai51;

public class Book {
    private String name;
    private String author;
    private long price;
    private long totalSold;

    public Book(String name, String author, long price, long totalSold) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.totalSold = totalSold;
    }

    public Book() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public long getTotalSold() {
        return totalSold;
    }

    public void setTotalSold(long totalSold) {
        this.totalSold = totalSold;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", totalSold=" + totalSold +
                '}';
    }

    public boolean BestSeller() {
        if (totalSold > 1000) {
            return true;
        } else return false;
    }
}
