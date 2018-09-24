package com.ssm.main.controller;

import com.ssm.main.pojo.RetMeg;
import com.ssm.mapper.LogAndReg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
@RequestMapping("/Login")
public class LoginController {

    @Autowired
    private LogAndReg logAndReg;


    @RequestMapping(method = POST)
    @ResponseBody
    public RetMeg login(@RequestParam long username, @RequestParam String password) {
        RetMeg result = new RetMeg();

        if (logAndReg.hasId(username) != 1) {
            result.setMeg("账号未录入数据库");
            return result;
        }

        String pw = logAndReg.login(username);
        if (pw == null)
            result.setMeg("账号未注册");
        else if (!pw.equals(password))
            result.setMeg("密码错误");
        else result.setMeg("登录成功");
        return result;
    }
}