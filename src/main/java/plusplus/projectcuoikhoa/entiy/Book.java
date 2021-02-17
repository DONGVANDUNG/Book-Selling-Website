package plusplus.projectcuoikhoa.entiy;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "book")
@Getter
@Setter
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    Integer id;
    @Column(name = "book_title")
    String title;
    @Column(name = "link_images")
    String linkImage;
    @Column(name = "release_year")
    Integer releaseYear;
    @Column(name = "describe")
    String describe;
    @Column(name = "author")
    String author;
    @Column(name = "category")
    String category;
    @Column(name = "price_book")
    Long priceBook;
    @Column(name = "contact_information")
    String contactInformation;
    @Column(name = "user_name")
    String userName;
}
