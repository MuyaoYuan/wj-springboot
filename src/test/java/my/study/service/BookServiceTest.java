package my.study.service;

import my.study.entity.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class BookServiceTest {
    @Autowired
    BookService bookService;

    @Test
    void listByCategory(){
        List<Book> bookList = bookService.listByCategory(1);
        System.out.println(bookList);
    }
}
