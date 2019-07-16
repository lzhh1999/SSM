package cn.itcast.service.impl;

import cn.itcast.dao.UserMapper;
import cn.itcast.pojo.User;
import cn.itcast.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    public User findUser(String username, String password) {
        return this.userMapper.findUser(username, password);
    }

    @Override
    public void addUser(User user) {
        this.userMapper.addUser(user);
    }
}
