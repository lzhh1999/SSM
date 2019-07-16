package cn.itcast.dao;

import cn.itcast.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    public User findUser(@Param("username") String username,
                         @Param("password") String password);

    public void addUser(User user);
}
