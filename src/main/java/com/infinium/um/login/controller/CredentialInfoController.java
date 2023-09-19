package com.infinium.um.login.controller;

import com.infinium.um.login.entity.ResponeModel;
import com.infinium.um.login.service.CredentialsInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import lombok.extern.slf4j.Slf4j;
import javax.annotation.Resource;

@Slf4j
@RestController
@RequestMapping(value = "/credentialInfo")
@Api(value = "UserInfoController", tags = "证件信息相关接口")
public class CredentialInfoController {




    @Resource
    private CredentialsInfoService infoService;


    @ApiOperation(value = "获取证件信息",notes = "getCredentialForUpdate")
    @RequestMapping(value = "/getCredentialForUpdate",method = RequestMethod.POST)
    public ResponeModel getCredentialForUpdate(){
       infoService.getList();
        return ResponeModel.ok();
    }



}
