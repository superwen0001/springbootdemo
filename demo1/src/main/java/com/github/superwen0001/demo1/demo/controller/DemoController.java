package com.github.superwen0001.demo1.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by wenshiliang on 2017/2/7.
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    @RequestMapping("/d1")
    public String d1(){
        return "d1";
    }

    @RequestMapping("/error")
    public Map error(){
        throw new RuntimeException("出错了");
    }

    @RequestMapping("/json")
    public Map<String,Object> json(){
        Map<String,Object> map = new HashMap<>();
        map.put("id",1);
        map.put("name","张三");
        map.put("createDate",new Date());
        return map;
    }


}
