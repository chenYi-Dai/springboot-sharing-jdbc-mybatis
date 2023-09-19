package com.infinium.um.login.dao;


import com.infinium.um.login.dao.dto.UserInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    List<UserInfo> list();


}
