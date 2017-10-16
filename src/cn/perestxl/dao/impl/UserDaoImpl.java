package cn.perestxl.dao.impl;

import cn.perestxl.bean.User;
import cn.perestxl.dao.UserDao;

/**
 * Created by ACER on 2017/10/12.
 */
public class UserDaoImpl implements UserDao {
    @Override
    public void add(User user) {
       String username =  user.getName();

    }
}
