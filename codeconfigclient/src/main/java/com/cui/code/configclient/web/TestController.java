package com.cui.code.configclient.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author cuishixiang
 * @date 2018-04-17
 */
@RestController
public class TestController {

    @Value("${name}")
    private String name;

    /**
     * 可通过@Value或Environment对象来获取配置数据
     */
    @Resource
    private Environment environment;

    @GetMapping("/name")
    public String name() {
        return name;
    }

    @GetMapping("/env")
    public String env() {
        return environment.getProperty("name", "hehe") + environment.getProperty("author", "鲁迅");
    }


}
