package com.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigTestController {

    @Value("${foo}")
    String foo;

    @RequestMapping("/hi")
    public String test() {
        return foo;
    }
}
