package my.study.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import my.study.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserDao extends BaseMapper<User> {
}
