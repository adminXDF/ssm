package cn.dy.dao;

import cn.dy.pojo.Admin;
import org.apache.ibatis.annotations.Param;

public interface UserDao {

    Admin login(@Param("username") String username,@Param("password") String password);
}
