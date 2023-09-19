package com.infinium.um.login.entity;


import com.infinium.um.login.util.Constants;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.HashMap;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoginBaseEntity {

    private Date createTime;
    private Date modifyTime;
    //1 正常 2 删除 其他自定义
    private Integer status;
    //数据签名
    private String sign;

    // 内存中的状态，标记对象是否已加密
    private Constants.CryptState _cryptState;

    private HashMap<String,Object> decryptMap;

    private HashMap<String,Object> signHashMap;

    /**
     * DB常用状态 1 正常 2 不正常 一般为删除意思
     */
    public static Integer STATUS_NORMAL = 1;
    public static Integer STATUS_UNNORMAL = 2;
    public static final String YES = "Y";
    public static final String NO = "N";
/*
    public LoginBaseEntity() {
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Constants.CryptState get_cryptState() {
        return _cryptState;
    }

    public void set_cryptState(Constants.CryptState _cryptState) {
        this._cryptState = _cryptState;
    }

    public void setDecryptMap(HashMap<String,Object> decryptMap){
        this.decryptMap = decryptMap;
    }

    public HashMap<String ,Object> getDecryptMap(){
        return decryptMap;
    }

    public void setSignHashMap(HashMap<String,Object> signHashMap){
        this.signHashMap = signHashMap;
    }

    public HashMap<String ,Object> getSignHashMap(){
        return signHashMap;
    }*/
}
