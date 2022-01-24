package my.study.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import my.study.entity.Book;
import my.study.entity.Category;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface BookDao extends BaseMapper<Book> {

//    @Select("select * from book")
//    @Results({
//            @Result(column = "id", property = "id"),
//            @Result(column = "cover", property = "cover"),
//            @Result(column = "title", property = "title"),
//            @Result(column = "author", property = "author"),
//            @Result(column = "date", property = "date"),
//            @Result(column = "press", property = "press"),
//            @Result(column = "abs", property = "abs"),
//            @Result(
//                    property = "category",
//                    javaType = Category.class,
//                    column = "cid",
//                    one = @One(select = "my.study.dao.CategoryDao.selectById")
//            )
//    })
//    List<Book> findAll();
//    List<Book> findAllByCategory(Category category);
//    List<Book> findAllByTitleLikeOrAuthorLike(String keyword1, String keyword2);
}
