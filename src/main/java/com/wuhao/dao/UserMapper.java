package com.wuhao.dao;

import com.wuhao.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @description: dao接口类
 * @author: wuhao
 * @create: 2020-06-17 22:38
 **/
@Mapper
@Component
public interface UserMapper {

    void addUser(User user);

    List<User> queryAllUser();

    User getUserById(@Param(value = "id") Long id);
}
