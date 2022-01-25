package my.study.dao;

import my.study.entity.Book;
import my.study.entity.Category;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface BookDao {

    @Select("select * from book")
    @Results(id = "BookMap", value ={
            @Result(column = "id", property = "id"),
            @Result(column = "cover", property = "cover"),
            @Result(column = "title", property = "title"),
            @Result(column = "author", property = "author"),
            @Result(column = "date", property = "date"),
            @Result(column = "press", property = "press"),
            @Result(column = "abs", property = "abs"),
            @Result(
                    property = "category",
                    javaType = Category.class,
                    column = "cid",
                    one = @One(select = "my.study.dao.CategoryDao.selectById")
            )
    })
    List<Book> findAll();

    @Select("select * from book where id=#{id}")
    @ResultMap("BookMap")
    Book findById(int id);

//    @Select("select * from Student where 1=1 and " +
//            "${ew.sqlSegment}")
//    @ResultMap(value = "BookMap")
//    List<Book> findByWrapper(@Param("ew") QueryWrapper<Book> wrapper);


    //#{id} will find the corresponding property in the entity class
    @Select("select * from book where cid=#{id}")
    @ResultMap("BookMap")
    List<Book> findAllByCategory(Category category);

    @Insert("insert into book values(#{id},#{cover},#{title},#{author},#{date},#{press},#{abs},#{category.id})")
    void save(Book book);

    @Update("update book set cover=#{cover},title=#{title},author=#{author},date=#{date},press=#{press},abs=#{abs},cid=#{category.id} where id=#{id}")
    void updateById(Book book);

    @Delete("delete from book where id=#{id}")
    void deleteById(int id);

//    List<Book> findAllByTitleLikeOrAuthorLike(String keyword1, String keyword2);
}
