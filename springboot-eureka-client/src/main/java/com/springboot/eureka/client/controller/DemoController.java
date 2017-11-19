package com.springboot.eureka.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Administrator on 2017/11/19.
 */
@RestController
@RequestMapping("demo")
public class DemoController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("add")
    public Integer getServer(@RequestParam Integer a, @RequestParam Integer b){
        return restTemplate.getForObject("http://EUREKA-PROVIDER/demo/add?a="+a+"&b="+b,Integer.class);
    }
}
