package my.study.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import my.study.dao.BookDao;
import my.study.entity.Book;
import my.study.entity.User;
import my.study.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class BookServiceImpl extends ServiceImpl<BookDao, Book> implements BookService  {
    @Autowired
    private BookDao bookDao;

    @Override
    public List<Book> listByCategory(int cid) {
        HashMap<String,Object> map = new HashMap<>();
        map.put("cid",cid);
        List<Book> bookList = bookDao.selectByMap(map);
        return bookList;
    }
}
