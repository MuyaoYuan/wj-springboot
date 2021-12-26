package my.study.service;

import com.baomidou.mybatisplus.extension.service.IService;
import my.study.entity.User;

public interface UserService extends IService<User> {
    boolean isExist(String username);
    User getByName(String username);
    User getByNameAndPassword(String username, String password);
}
