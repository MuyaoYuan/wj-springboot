package my.study.dao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CategoryDaoTest {
    @Autowired
    CategoryDao categoryDao;

    @Test
    void findAll(){
        categoryDao.selectList(null);
    }

    @Test
    void findById(){
        categoryDao.selectById(1);
    }
}
