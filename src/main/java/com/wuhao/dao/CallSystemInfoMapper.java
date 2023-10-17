package com.wuhao.dao;

import com.wuhao.domain.CallSystemInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface CallSystemInfoMapper {

    List<CallSystemInfo> getCallList();
}
