package com.ssm.mapper;

import com.ssm.main.pojo.UserInfo;
import org.apache.ibatis.annotations.Param;

public interface GetStuInfo {
    UserInfo getStuInfo(@Param("username") String username);

    void setLastLoginTime(@Param("username")String username);
}
