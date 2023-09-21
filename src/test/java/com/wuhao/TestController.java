package com.wuhao;


import com.wuhao.configuration.IDUtil;
import com.wuhao.dao.UserMapper;
import com.wuhao.domain.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class TestController {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testAdd(){
        User user = new User();
        user.setPassword("1111");
        user.setRemark("testAddiNFO");
        user.setUserName("测试");
        user.setSex(1);
        //user.setUserId(IDUtil.getRandomId());
        userMapper.addUser(user);
    }
}
