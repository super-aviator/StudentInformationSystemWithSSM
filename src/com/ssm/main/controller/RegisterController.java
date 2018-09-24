package com.ssm.main.controller;

import com.ssm.main.pojo.RetMeg;
import com.ssm.mapper.LogAndReg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/Register")
public class RegisterController {

    @Autowired
    private LogAndReg lar;

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public RetMeg register(@RequestParam long username, @RequestParam String password) {

        RetMeg result = new RetMeg();

        if (lar.hasId(username) != 1) {
            result.setMeg("账号未录入数据库");
            return result;
        }

        String pw = lar.login(username);
        if (pw != null)
            result.setMeg("账号已注册");
        else{
            lar.register(username, password);
            result.setMeg("注册成功");
        }

        return result;
    }
}
