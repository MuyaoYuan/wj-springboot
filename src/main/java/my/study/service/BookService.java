package my.study.service;

import com.baomidou.mybatisplus.extension.service.IService;
import my.study.entity.Book;

import java.util.List;

public interface BookService{
    Boolean isExist(Book book);
    List<Book> list();
    void save(Book book);
    void updateById(Book book);
    void saveOrUpdate(Book book);
    void deleteById(int id);
    List<Book> listByCategory(int cid);
}
