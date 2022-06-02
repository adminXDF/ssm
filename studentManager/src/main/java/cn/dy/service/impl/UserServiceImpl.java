package cn.dy.service.impl;

import cn.dy.dao.UserDao;
import cn.dy.pojo.Admin;
import cn.dy.service.UserService;
import cn.dy.util.DaoMapperFactory;

/**
 * @author xdf
 * 明天的你的会感谢今天努力的自己！
 * 2022-05-13 10:09
 */
public class UserServiceImpl implements UserService {

    private UserDao dao=(UserDao)DaoMapperFactory.getDao(UserDao.class);
    //登录
    @Override
    public Admin login(String username, String password) {
        return dao.login(username,password);
    }
}
