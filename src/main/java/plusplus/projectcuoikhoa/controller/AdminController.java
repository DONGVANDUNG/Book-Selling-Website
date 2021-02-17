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

    @PostMapping(value = "/registerBook")
    public Book registerBook(@RequestBody Book request) {
        Book book = new Book();
        book.setTitle(request.getTitle());
        book.setLinkImage(request.getLinkImage());
        book.setReleaseYear(request.getReleaseYear());
        book.setDescribe(request.getDescribe());
        book.setAuthor(request.getAuthor());
        book.setCategory(request.getCategory());
        book.setPriceBook(request.getPriceBook());
        book.setContactInformation(request.getContactInformation());
        book.setUserName(request.getUserName());
        book=bookRepository.save(book);
        return book;
    }

    @PutMapping(value = "updateBook/{id}")
    public Book updateBookById(@PathVariable(name = "id") Integer id, @RequestBody Book request) {
        Book book = bookRepository.findOneById(id);
        if (bookRepository.findOneById(id) == null) {
            return null;
        }
        book.setTitle(request.getTitle());
        book.setLinkImage(request.getLinkImage());
        book.setReleaseYear(request.getReleaseYear());
        book.setDescribe(request.getDescribe());
        book.setAuthor(request.getAuthor());
        book.setCategory(request.getCategory());
        book.setPriceBook(request.getPriceBook());
        book.setContactInformation(request.getContactInformation());
        book.setUserName(request.getUserName());
        book = bookRepository.save(book);
        return book;
    }

    @PostMapping(value = "registerUser")
    public User registerUser(@RequestBody User request) {
        User user = new User();
        user.setUserName(request.getUserName());
        user.setPhoneNumber(request.getPhoneNumber());
        user.setEmail(request.getEmail());
        user.setPassWord(request.getPassWord());
        user.setGender(request.getGender());
        user.setNationality(request.getNationality());
        user.setAge(request.getAge());
        user.setBirthday(request.getBirthday());
        user = userRepository.save(user);
        return user;
    }

    @PutMapping(value = "updateUser/{id}")
    public String updateUser(@PathVariable(name = "id") Integer id, @RequestBody User request) {
        User user = userRepository.findOneById(id);
        if (userRepository.findOneById(id) == null) {
            return "User not exist";
        }
        user.setUserName(request.getUserName());
        user.setPhoneNumber(request.getPhoneNumber());
        user.setEmail(request.getEmail());
        user.setPassWord(request.getPassWord());
        user.setGender(request.getGender());
        user.setNationality(request.getNationality());
        user.setAge(request.getAge());
        user.setBirthday(request.getBirthday());
        user = userRepository.save(user);
        return "Update Success";
    }

    @PutMapping(value = "/changePass/{id}/{pass}")
    public String changePassword(@PathVariable(name = "id") Integer id, @PathVariable(name = "pass") String pass) {
        User user = userRepository.findOneById(id);
        if (user == null) {
            return "User not exist";
        }

        user.setPassWord(pass);
        user = userRepository.save(user);
        return "Success";
    }
    @DeleteMapping(value = "deleteBook/{id}")
    public String deleteBookById(@PathVariable(name = "id")Integer id){
        Book book=bookRepository.findOneById(id);
        if(book==null){
            return "Book not exist";
        }
        bookRepository.delete(book);
        return "Delete success";
    }
    @DeleteMapping(value = "deleteUser/{id}")
    public String deleteUserById(@PathVariable(name = "id")Integer id){
        User user=userRepository.findOneById(id);
        if(user==null){
            return "User not exist";
        }
        userRepository.delete(user);
        return "Delete success";
    }
}
