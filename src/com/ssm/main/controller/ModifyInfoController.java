package com.ssm.main.controller;

import com.ssm.main.pojo.RetMeg;
import com.ssm.main.pojo.UserInfo;
import com.ssm.mapper.ModifyInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import java.io.*;

@Controller
@RequestMapping("/ModifyInformation")
public class ModifyInfoController {

    @Autowired
    private ModifyInformation modifyInformation;

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public RetMeg modifyInformation(@RequestBody  UserInfo user) throws IOException {
        RetMeg result=new RetMeg("更改错误");

        if (notValid(user))
            return result;

        modifyInformation.modifyInformation(user);
        result.setMeg("更改成功");
        return result;
    }

    public boolean notValid(UserInfo user){
//        System.out.println(user);
        if(user.getAge()<=0||user.getAge()>=100)    return true;
        if(!(user.getGender().equals("男")||user.getGender().equals("女")))    return true;
        return false;
    }
}
