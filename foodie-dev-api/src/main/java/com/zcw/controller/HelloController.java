package com.zcw.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: foodie-dev
 * @description:
 * @author: Zhaocunwei
 * @create: 2020-10-30 14:46
 **/
@RestController
public class HelloController {

    @GetMapping("/hello")
    public Object hello(){
        return "Hello World";
    }
}
