package com.infinium.um.login.controller;


import com.alibaba.fastjson.JSONObject;
import com.infinium.um.login.entity.ResponeModel;
import com.infinium.um.login.util.Constants;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/fixer")
@Api(value = "CryptoController",tags = "数据加解密相关接口")
public class CryptoController {

    /**
     * 加密解密接口
     * @param str 加密字段
     * @return 返回加密字段 以及解密字段 原生数据
     */
    @ApiOperation(value = "数据加密",notes = "enCryptData")
    @RequestMapping(value = "/enCrypt",method = RequestMethod.POST)
    public ResponeModel enCryptData(@RequestParam String str){

        return ResponeModel.ok();
    }


    @ApiOperation(value = "数据解密",notes = "deCryptData")
    @RequestMapping(value = "/deCrypt",method = RequestMethod.POST)
    public ResponeModel deCryptData(@RequestParam String str){

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("oldValue",str);
        jsonObject.put("decryptValue",JSONObject.toJSONString("sd"));
        return ResponeModel.ok(jsonObject);
    }

    public static void main(String[] args) {
            if(Constants.BASE_ACCOUNT_TYPE.equals("DP_EC01") &&
                    (Constants.IDCardType.HK_ID_CARD.value() != 3 &&
                            Constants.IDCardType.CN_ID_CARD.value() != 3)){
                System.out.println(2);;
        }
    }
}
