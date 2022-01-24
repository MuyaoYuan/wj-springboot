package my.study.service;

import com.baomidou.mybatisplus.extension.service.IService;
import my.study.entity.Book;

import java.util.List;

public interface BookService extends IService<Book> {
    List<Book> listByCategory(int cid);
}
