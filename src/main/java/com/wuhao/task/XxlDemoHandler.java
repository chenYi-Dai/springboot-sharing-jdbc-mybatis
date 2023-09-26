package com.wuhao.task;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.context.XxlJobHelper;
import com.xxl.job.core.handler.annotation.XxlJob;
import org.springframework.stereotype.Component;

@Component
public class XxlDemoHandler {
    //该名称与调度中心的任务管理的任务配置的JobHandler 需要一致才会生效
    @XxlJob("Demo")
    public ReturnT<String> demo(){
        String param = XxlJobHelper.getJobParam();
        XxlJobHelper.log("测试开始");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(param);
        System.out.println("测试完成！！！！！！！！！！！！！！！！！！！！！！！！！！！！");
        System.out.println();
        System.out.println();
        System.out.println();
        XxlJobHelper.log("测试开结束");
        return ReturnT.SUCCESS;
    }
}
