package com.wuhao;


import com.sankuai.inf.leaf.common.Result;
import com.sankuai.inf.leaf.common.Status;
import com.sankuai.inf.leaf.service.SnowflakeService;
import com.wuhao.dao.UserMapper;
import com.wuhao.domain.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@Slf4j
@SpringBootTest
public class TestController {

    @Autowired
    private UserMapper userMapper;

    @Resource
    private SnowflakeService snowflakeService;

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


    public void getSnowflakeId(){
        Result result = snowflakeService.getId("id");
        if (result.getStatus().equals(Status.EXCEPTION)) {
            log.error("error |{}",result);
        }
        log.info("result Id | {}",String.valueOf(result.getId()));

    }


}
