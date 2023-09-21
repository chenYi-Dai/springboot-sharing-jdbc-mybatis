package com.wuhao.configuration;

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