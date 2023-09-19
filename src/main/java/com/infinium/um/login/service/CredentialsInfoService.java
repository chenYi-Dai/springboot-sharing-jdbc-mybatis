package com.infinium.um.login.service;

import com.infinium.um.login.dao.CredentialsInfoDaoMapper;
import com.infinium.um.login.dao.UserMapper;
import com.infinium.um.login.dao.dto.UserInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Slf4j
@Service
public class CredentialsInfoService<T> {

    @Resource
    private CredentialsInfoDaoMapper credentialsInfoDaoMapper;

    @Resource
    private UserMapper userMapper;

    public void getList() {
        // List<CredentialsInfo> list = credentialsInfoDaoMapper.getList();
        List<UserInfo> list = userMapper.list();
        log.info("list | {}",list);
    }

}
