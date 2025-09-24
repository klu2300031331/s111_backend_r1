package lms;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/books")
@CrossOrigin(origins = "*") // Allow frontend to call API
public class BookController {

    private final BookService service;

    public BookController(BookService service) {
        this.service = service;
    }

    @GetMapping
    public List<Book> getAllBooks() {
        return service.getAllBooks();
    }

    @PostMapping
    public Book addBook(@RequestBody Book book) {
        return service.addBook(book);
    }

    @PutMapping("/{id}")
    public Book updateBook(@PathVariable Long id, @RequestBody Book book) {
        return service.updateBook(id, book);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id) {
        service.deleteBook(id);
    }
}





// package lms;

// import org.springframework.web.bind.annotation.*;

// import java.util.List;

// @RestController
// @RequestMapping("/api/books")
// @CrossOrigin(origins = "*")
// public class BookController {

//     private final BookService service;

//     public BookController(BookService service) {
//         this.service = service;
//     }

//     @GetMapping
//     public List<Book> getAllBooks() {
//         return service.getAllBooks();
//     }

//     @PostMapping
//     public Book addBook(@RequestBody Book book) {
//         return service.addBook(book);
//     }

    
//     @PutMapping("/{id}")
//     public Book updateBook(@PathVariable Long id, @RequestBody Book book) {
//         return service.updateBook(id, book);
//     }

//     @DeleteMapping("/{id}")
//     public void deleteBook(@PathVariable Long id) {
//         service.deleteBook(id);
//     }
// }
