package com.ssm.main.controller;

import com.alibaba.fastjson.JSONArray;

import com.ssm.main.pojo.ScoreResult;
import com.ssm.mapper.GetScore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.UnsupportedEncodingException;

@Controller
@RequestMapping("/GetScore")
public class GetScoreController {

    @Autowired
    private GetScore getScore;

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public String getScore(@RequestParam long username, @RequestParam String term) throws UnsupportedEncodingException {

        //使用FastJson来转换数据
        JSONArray result = new JSONArray();

        //计算所有学科的成绩
        for (int i = 100; i <= 112; i++) {
            ScoreResult temp = getScore.getScore(username, "term" + term, i);
            result.fluentAdd(temp);
        }

        //计算平均成绩
        double avg = getScore.getAvg(username, "term" + term);
        ScoreResult item = new ScoreResult("平均成绩", "", avg);
        result.add(item);

        return result.toJSONString();
    }
}
