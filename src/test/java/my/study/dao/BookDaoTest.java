package my.study.dao;

import my.study.entity.Book;
import my.study.entity.Category;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class BookDaoTest {

    @Autowired
    BookDao bookDao;

    @Test
    void findAll() {
        List<Book> all = bookDao.findAll();
        for (Book book : all) {
            System.out.println(book);
        }
    }

    @Test
    void findById() {
        Book book = bookDao.findById(104);
        System.out.println(book);
    }

    @Test
    void findAllByCategory() {
        Category category = new Category();
        category.setId(2);
        List<Book> all = bookDao.findAllByCategory(category);
        for (Book book : all) {
            System.out.println(book);
        }
    }

//    @Test
//    void findByWrapper() {
//        QueryWrapper<Book> queryWrapper = new QueryWrapper<>();
//        Category category = new Category();
//        category.setId(2);
//        queryWrapper.lambda().eq(Book::getCategory, category);
//        List<Book> all = bookDao.findByWrapper(queryWrapper);
//        for (Book book : all){
//            System.out.println(book);
//        }
//    }

    @Test
    void save() {
        Book book = new Book();
        book.setAbs("abs5");
        book.setAuthor("author5");
        book.setCategory(new Category(1, "c1"));
        book.setCover("cover5");
        book.setDate("2022-1-25");
        book.setPress("press5");
        book.setTitle("title5");
        bookDao.save(book);
    }

    @Test
    void updateById() {
        Book book = new Book();
        book.setId(108);
        book.setAbs("abs6");
        book.setAuthor("author6");
        book.setCategory(new Category(1, "c1"));
        book.setCover("cover6");
        book.setDate("2022-1-25");
        book.setPress("press6");
        book.setTitle("title6");
        bookDao.updateById(book);
    }

    @Test
    void deleteById() {
        bookDao.deleteById(108);
    }
}
