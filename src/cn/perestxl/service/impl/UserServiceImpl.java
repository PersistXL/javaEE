package cn.perestxl.service.impl;

import cn.perestxl.bean.User;
import cn.perestxl.dao.UserDao;
import cn.perestxl.dao.impl.UserDaoImpl;
import cn.perestxl.service.UserService;

/**
 * Created by ACER on 2017/10/12.
 */
public class UserServiceImpl implements UserService {
    UserDao userDao = new UserDaoImpl();

    @Override
    public void add(User user) {
        userDao.add(user);
    }
}
