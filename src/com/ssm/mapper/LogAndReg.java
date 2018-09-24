package com.ssm.mapper;

import org.apache.ibatis.annotations.Param;

public interface LogAndReg {
    //@Select("SELECT #{password} FROM studentinformation WHERE stu_id= #{username}")
    String login(@Param("username") long username);

//    @Select("UPDATE studentinformation SET stu_password=#{password} WHERE stu_id=#{username}")
    void register(@Param("username") long username, @Param("password")String password);

//    @Select("SELECT COUNT(*) FROM studentinformation WHERE stu_id=#{username}")
    int hasId(@Param("username") long username);
}
