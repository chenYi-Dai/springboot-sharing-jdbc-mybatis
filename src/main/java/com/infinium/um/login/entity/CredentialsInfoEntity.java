package com.infinium.um.login.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.models.auth.In;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "证件类返回对象")
public class CredentialsInfoEntity {

    private Long uid;
    /**
     * 证件号码
     */
    private String cardNo;
    //1 正常 2 删除 其他自定义
    private Integer status;

    /**
     * 主证件 Y 是 N 否
     */
    private String main;

    /**
     * 重新生成的签名
     */
    private String signData;

    /**
     * 存储在数据库中的签名
     */
    private String oldSignData;
}
