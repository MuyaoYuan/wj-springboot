package my.study.controller;

import my.study.entity.Book;
import my.study.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LibraryController {
    @Autowired
    private BookService bookService;

    @GetMapping("/api/books")
    public List<Book> list(){
        return bookService.list();
    }

    @PostMapping("/api/books")
    public Book saveOrUpdate(@RequestBody Book book){
        bookService.saveOrUpdate(book);
        return book;
    }

    @PostMapping("/api/delete")
    public void delete(@RequestBody Book book){
        bookService.deleteById(book.getId());
    }

    @GetMapping("/api/categories/{cid}/books")
    public List<Book> listByCategory(@PathVariable("cid") int cid){
        if (0 != cid) {
            return bookService.listByCategory(cid);
        } else {
            return list();
        }
    }
}
