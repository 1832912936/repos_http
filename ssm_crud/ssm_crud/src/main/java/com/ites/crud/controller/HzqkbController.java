package com.ites.crud.controller;

import com.ites.crud.bean.Hzjbqkb;
import com.ites.crud.bean.Msg;

import com.ites.crud.service.HzqkbService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class HzqkbController {

    @Autowired
    HzqkbService hzqkbService;
    // 查询入院病历患者基本信息
    @RequestMapping("/findRybl")
    @ResponseBody
    public Msg getFindRybl (@RequestParam(value = "bah")String bah ){
      bah =  StringUtils.substringBefore(bah,"_");
        System.out.println(bah);
        List<Hzjbqkb> hzjbqkbs = hzqkbService.findRybl(bah);
        return  Msg.success().add("hzqkb",hzjbqkbs);
    }
}
