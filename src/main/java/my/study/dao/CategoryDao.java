package my.study.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import my.study.entity.Category;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface CategoryDao extends BaseMapper<Category> {
}
