package my.study.service.impl;

import my.study.dao.BookDao;
import my.study.entity.Book;
import my.study.entity.Category;
import my.study.service.BookService;
import my.study.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService  {
    @Autowired
    private BookDao bookDao;
    @Autowired
    private CategoryService categoryService;

    @Override
    public Boolean isExist(Book book) {
        Book bookExist = bookDao.findById(book.getId());
        return bookExist!=null;
    }

    @Override
    public List<Book> list() {
        return bookDao.findAll();
    }

    @Override
    public void save(Book book) {
        bookDao.save(book);
    }

    @Override
    public void updateById(Book book) {
        bookDao.updateById(book);
    }

    @Override
    public void saveOrUpdate(Book book) {
        if(isExist(book)){
            updateById(book);
        }else {
            save(book);
        }
    }

    @Override
    public void deleteById(int id) {
        bookDao.deleteById(id);
    }

    @Override
    public List<Book> listByCategory(int cid) {
        Category category = categoryService.getById(cid);
        return bookDao.findAllByCategory(category);
    }

    @Override
    public List<Book> Search(String keyword) {
        return bookDao.findAllByTitleOrAuthorLike(keyword);
    }

//    @Override
//    public List<Book> listByCategory(int cid) {
//        HashMap<String,Object> map = new HashMap<>();
//        map.put("cid",cid);
//        List<Book> bookList = bookDao.selectByMap(map);
//        return bookList;
//    }
}
