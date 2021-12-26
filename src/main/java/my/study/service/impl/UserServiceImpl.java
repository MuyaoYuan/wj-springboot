package my.study.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import my.study.dao.UserDao;
import my.study.entity.User;
import my.study.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public boolean isExist(String username) {
        User user = getByName(username);
        return user!=null;
    }

    @Override
    public User getByName(String username) {
        HashMap<String,Object> map = new HashMap<>();
        map.put("username",username);
        List<User> userList = userDao.selectByMap(map);
        return userList.get(0);
    }

    @Override
    public User getByNameAndPassword(String username, String password) {
        HashMap<String,Object> map = new HashMap<>();
        map.put("username",username);
        map.put("password",password);
        List<User> userList = userDao.selectByMap(map);
        return userList.get(0);
    }

}
