package my.study.dao;

import my.study.entity.Book;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class BookDaoTest {

    @Autowired
    BookDao bookDao;

    @Test
    void findAll(){
//        List<Book> all = bookDao.findAll();
//        for(Book book : all){
//            System.out.println(book);
//        }
    }
}
