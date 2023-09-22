package com.wuhao.configuration;

import com.sankuai.inf.leaf.IDGen;
import com.sankuai.inf.leaf.common.Result;
import com.sankuai.inf.leaf.common.Status;

import javax.annotation.Resource;

/**
 * @description: id工具类
 * @author: wuhao
 * @create: 2020-06-17 22:38
 **/
public class IDUtil {

    /**
     * 随机id生成，使用雪花算法
     */
    public static long getRandomId() {
        SnowflakeIdWorker sf = new SnowflakeIdWorker();
        long id = sf.nextId();
        return id;
    }

}