package com.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope //使用该注解的类，会在接到SpringCloud配置中心配置刷新的时候，自动更新配置到该类内对应字段上
@RestController
public class ConfigTestController {

    @Value("${foo}")
    String foo;

    @RequestMapping("/hi")
    public String test() {
        return this.foo;
    }
}
