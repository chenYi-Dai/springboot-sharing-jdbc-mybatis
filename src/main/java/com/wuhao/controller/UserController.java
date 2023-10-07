package com.wuhao.controller;

import com.sankuai.inf.leaf.common.Result;
import com.sankuai.inf.leaf.common.Status;
import com.sankuai.inf.leaf.service.SegmentService;
import com.wuhao.domain.User;
import com.wuhao.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @description: userController
 * @author: wuhao
 * @create: 2020-06-17 22:21
 **/
@Slf4j
@RestController
@Api(value = "UserController",tags = "用户测试")
public class UserController {

    @Resource
    private UserService userService;

    @Resource
    private SegmentService segmentService;
    
    /***
    * @Description: 添加用戶数据
    * @Author: wuhao
    * @Date: 2020/6/17 22:31
    */
    @ApiOperation(value = "测试",notes = "testInsertUser")
    @RequestMapping(value = "/testInsertUser",method = RequestMethod.GET)
    public void testInsertUser(){
        for(int i=0; i<20 ;i++){
            User user = new User();
            //user.setUserId(IDUtil.getRandomId());
            Result result = segmentService.getId("leaf-segment-test");
            if (result.getStatus().equals(Status.EXCEPTION)) {
                continue;
            }
            user.setUserId(result.getId());
            user.setRemark("北京市通州区");
            user.setPassword("10+i"+i);
            user.setRemark("1992-01-01");
            user.setUserName("小吴"+i);
            user.setSex(i%2+1);
            userService.addUser(user);
        }
    }

    @ApiOperation(value = "获取用户id",notes = "getUserInfo")
    @RequestMapping(value = "/getUserInfo",method = RequestMethod.GET)
    public User getUserInfo(@RequestParam Long id){
        User userInfoById = userService.getUserInfoById(id);
        log.info("user info |{}",userInfoById);
        return userInfoById;
    }


    @ApiOperation(value = "获取列表信息",notes = "getListInfo")
    @RequestMapping(value = "/api/get-list",method = RequestMethod.GET)
    public List<User> getListInfo(){
        Long id = 12L;
        User userInfoById = userService.getUserInfoById(id);
        log.info("user info |{}",userInfoById);
        List list = new ArrayList<>();
        list.add(userInfoById);
        return list;
    }




}
