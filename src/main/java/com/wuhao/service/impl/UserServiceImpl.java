package com.wuhao.service.impl;

import com.wuhao.dao.UserMapper;
import com.wuhao.domain.User;
import com.wuhao.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @description: 用户接口
 * @author: wuhao
 * @create: 2020-06-17 22:38
 **/
@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    public void addUser(User user) {
        userMapper.addUser(user);
    }

    public List<User> queryAllUser() {
        return userMapper.queryAllUser();
    }

    @Override
    public User getUserInfoById(Long id){
        return userMapper.getUserById(id);
    }

}
