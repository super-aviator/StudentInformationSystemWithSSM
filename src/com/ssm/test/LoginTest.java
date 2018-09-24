package com.ssm.test;

import com.alibaba.fastjson.JSON;
import com.ssm.main.pojo.UserInfo;
import com.ssm.mapper.ModifyInformation;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "applicationContext.xml")

public class LoginTest {

//    @Autowired
//    private LogAndReg logAndReg;

    @Autowired
    ModifyInformation modifyInformation;

//    @Test
//    public void test() {
//        System.out.println(logAndReg.hasId(6504110131l));
//    }

    @Test
    public void testJson(){
        UserInfo user=new UserInfo();
        user.setAge(10);
        user.setGender("男");
        user.setName("熊乾坤");
        user.setBirthday("1999-10-20");
        user.setEnrollment("1999-10-20");
        modifyInformation.modifyInformation(user);
    }
}