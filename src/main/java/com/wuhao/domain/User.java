package com.wuhao.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description: User实体类
 * @author: wuhao
 * @create: 2020-06-17 22:38
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private Long userId;

    private String userName;

    private String password;

    private Integer sex;

    private String remark;


}
