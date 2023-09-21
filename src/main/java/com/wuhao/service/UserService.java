package com.wuhao.service;

import com.wuhao.dao.UserMapper;
import com.wuhao.domain.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description: 用户接口
 * @author: wuhao
 * @create: 2020-06-17 22:38
 **/
public interface UserService {

     void addUser(User user);

     List<User> queryAllUser();

     User getUserInfoById(Long id);

}
