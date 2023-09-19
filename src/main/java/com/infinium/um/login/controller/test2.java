package com.infinium.um.login.controller;

import com.alibaba.fastjson.JSONObject;
import com.infinium.um.login.entity.AccountInfo;
import com.infinium.um.login.entity.LoginBaseEntity;
import lombok.extern.slf4j.Slf4j;

import java.util.*;
import java.util.stream.Collectors;

@Slf4j
public class test2 {

    public static void main(String[] args) {
        List<AccountInfo> acctLst = new ArrayList<>();
        AccountInfo build = AccountInfo.AccountInfoBuild().acctStatus("s").build();
        HashMap<String,Object> map = new HashMap<>();
        map.put("sad","jsadf");
        build.setDecryptMap(map);
        acctLst.add(build);
        build.setDecryptMap(map);
        log.info(" build | {} |{}",build,build.getDecryptMap());
        log.info(" build | {}",JSONObject.toJSONString(acctLst));
       /* AccountInfo accountInfo2 = new AccountInfo();
        accountInfo2.setUid(2L);
        accountInfo2.setHistSeq(1);
        AccountInfo accountInfo3 = new AccountInfo();
        accountInfo3.setUid(3L);
        accountInfo3.setHistSeq(1);
        AccountInfo accountInfo4 = new AccountInfo();
        accountInfo4.setUid(4L);
        accountInfo4.setHistSeq(1);
        AccountInfo accountInfo5 = new AccountInfo();
        accountInfo5.setUid(5L);
        accountInfo5.setHistSeq(1);
        AccountInfo accountInfo = new AccountInfo();
        accountInfo.setUid(1L);
        accountInfo.setHistSeq(1);

       *//* acctLst.add(accountInfo2);
        acctLst.add(accountInfo3);
        acctLst.add(accountInfo4);
        acctLst.add(accountInfo5);
        acctLst.add(accountInfo);*//*
        Optional<AccountInfo> maxHistRecord = acctLst.stream()
                .max(Comparator.comparing(e->e.getHistSeq()));
        if(!maxHistRecord.isPresent()){
            log.info("maxHistRecord is null");
        }

        List<AccountInfo> closeAcctLst = acctLst.stream()
                .filter(e -> e.getHistSeq() == maxHistRecord.get().getHistSeq() &&
                        (e.getAcctType().equals(Constants.BASE_ACCOUNT_TYPE) ||
                                e.getAcctType().equals(Constants.SOUTH_BOUND_ACCOUNT_TPYE)))
                .collect(Collectors.toList());

        log.info("closeAcctLst |{}", JSONObject.toJSONString(closeAcctLst));*/

    }
}
