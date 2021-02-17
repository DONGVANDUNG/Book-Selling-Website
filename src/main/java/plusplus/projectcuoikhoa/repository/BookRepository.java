package plusplus.projectcuoikhoa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import plusplus.projectcuoikhoa.entiy.Book;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
    List<Book> findAll();

    Book findOneById(Integer id);

    Book findOneByTitle(String title);

    List<Book> findAllByAuthor(String author);

    List<Book> findAllByCategory(String category);

    List<Book> findAllByUserName(String username);

    List<Book> findAllByPriceBook(Long price);

    List<Book> findAllByPriceBookGreaterThan(Long price);

    List<Book> findAllByPriceBookLessThan(Long price);

    List<Book> findAllByReleaseYear(Integer year);

    List<Book> findAllByReleaseYearGreaterThan(Integer year);

    List<Book> findAllByReleaseYearLessThan(Integer year);
}
