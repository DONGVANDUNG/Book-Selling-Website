package plusplus.projectcuoikhoa.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import plusplus.projectcuoikhoa.entiy.Book;
import plusplus.projectcuoikhoa.entiy.User;
import plusplus.projectcuoikhoa.repository.BookRepository;
import plusplus.projectcuoikhoa.repository.UserRepository;

import java.util.List;

@RestController
@RequestMapping(value = "/prefix")
public class AdminController {
    @Autowired
    BookRepository bookRepository;
    @Autowired
    UserRepository userRepository;

    /// detail book
    @GetMapping(value = "/allBook")
    public List<Book> getAllBook() {
        return bookRepository.findAll();
    }

    @GetMapping(value = "/idBook/{id}")
    public Book getBookById(@PathVariable(name = "id") Integer id) {
        return bookRepository.findOneById(id);
    }

    @GetMapping(value = "/title/{title}")
    public Book getBookByTitle(@PathVariable(name = "title") String title) {
        return bookRepository.findOneByTitle(title);
    }

    @GetMapping(value = "/author/{author}")
    public List<Book> getBookByAuthor(@PathVariable(name = "author") String author) {
        return bookRepository.findAllByAuthor(author);
    }

    @GetMapping(value = "/category/{category}")
    public List<Book> getBookByCategory(@PathVariable(name = "category") String category) {
        return bookRepository.findAllByCategory(category);
    }

    @GetMapping(value = "/user/{user}")
    public List<Book> getBookByUserName(@PathVariable(name = "user") String username) {
        return bookRepository.findAllByUserName(username);
    }

    @GetMapping(value = "/price/{price}")
    public List<Book> getBookByPrice(@PathVariable(name = "price") Long price) {
        return bookRepository.findAllByPriceBook(price);
    }

    @GetMapping(value = "/priceGreater/{price}")
    public List<Book> getBookByPriceGreaterThan(@PathVariable(name = "price") Long price) {
        return bookRepository.findAllByPriceBookGreaterThan(price);
    }

    @GetMapping(value = "/priceLess/{{price}")
    public List<Book> getBookByPriceLessThan(@PathVariable(name = "price") Long price) {
        return bookRepository.findAllByPriceBookLessThan(price);
    }

    @GetMapping(value = "/year/{year}")
    public List<Book> getBookByReleaseYear(@PathVariable(name = "year") Integer year) {
        return bookRepository.findAllByReleaseYear(year);
    }

    @GetMapping(value = "/yearGreater/{year}")
    public List<Book> getBookByReleaseYearGreaterThan(@PathVariable(name = "year") Integer year) {
        return bookRepository.findAllByReleaseYearGreaterThan(year);
    }

    @GetMapping(value = "/yearLess/{year}")
    public List<Book> getBookByReleaseYearLessThan(@PathVariable(name = "year") Integer year) {
        return bookRepository.findAllByReleaseYearLessThan(year);
    }

    /// detail user
    @GetMapping(value = "/allUser")
    public List<User> getAllUSer() {
        return userRepository.findAll();
    }

    @GetMapping(value = "/idUser/{id}")
    public User getUserById(@PathVariable(name = "id") Integer id) {
        return userRepository.findOneById(id);
    }

    @GetMapping(value = "/userName/{username}")
    public User getUSerByUserName(@PathVariable(name = "username") String username) {
        return userRepository.findOneByUserName(username);
    }

    @GetMapping(value = "/login/{user}/{pass}")
    public String login(@PathVariable(name = "user") String user, @PathVariable(name = "pass") String pass) {
        if (userRepository.findOneByUserNameAndPassWord(user, pass) != null) {
            return "Login Success";
        }
        return null;
    }

    @GetMapping(value = "/email/{email}")
    public User getUserByEmail(@PathVariable(name = "email") String email) {
        return userRepository.findOneByEmail(email);
    }

    @GetMapping(value = "/gender/{gender}")
    public List<User> getUserByGender(@PathVariable(name = "gender") String gender) {
        return userRepository.findAllByGender(gender);
    }

    @GetMapping(value = "/age/{age}")
    public List<User> getUserByAge(@PathVariable(name = "age") Integer age) {
        return userRepository.findAllByAge(age);
    }

    @GetMapping(value = "/ageGreater/{age}")
    public List<User> getUserByAgeGreaterThan(@PathVariable(name = "age") Integer age) {
        return userRepository.findAllByAgeGreaterThan(age);
    }

    @GetMapping(value = "/ageLess/{age}")
    public List<User> getUserByAgeLessThan(@PathVariable(name = "age") Integer age) {
        return userRepository.findAllByAgeLessThan(age);
    }
}
