package com.wuhao.service.impl;

import com.wuhao.dao.CallSystemInfoMapper;
import com.wuhao.domain.CallSystemInfo;
import com.wuhao.service.CallSystemInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CallSystemInfoServiceImpl implements CallSystemInfoService {

    @Resource
    private CallSystemInfoMapper callSystemInfoMapper;

    @Override
    public List<CallSystemInfo> getList() {
        return callSystemInfoMapper.getCallList();
    }
}
