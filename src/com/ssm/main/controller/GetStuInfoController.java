package com.ssm.main.controller;

import com.ssm.main.pojo.UserInfo;
import com.ssm.mapper.GetStuInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.FileNotFoundException;

@Controller
@RequestMapping("/GetStudentInformation")
public class GetStuInfoController {

    @Autowired
    private GetStuInfo getStuInfo;

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public UserInfo getStudentInformation(@RequestParam String username) throws FileNotFoundException {
        UserInfo info = getStuInfo.getStuInfo(username);

        String lastLoginTime = info.getLastLogTime();
        lastLoginTime = lastLoginTime.substring(0, lastLoginTime.length() - 2);

        if (lastLoginTime.equals("2000-01-01 00:00:00"))
            info.setLastLogTime("您是第一次登录哦,祝您使用愉快。YoY");
        else
            info.setLastLogTime("上次登录的时间为：" + lastLoginTime);

        getStuInfo.setLastLoginTime(username);
        return info;
    }
}
