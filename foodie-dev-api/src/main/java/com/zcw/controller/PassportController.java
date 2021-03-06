package com.zcw.controller;

import com.zcw.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: foodie-dev
 * @description:
 * @author: Zhaocunwei
 * @create: 2020-11-02 15:28
 **/

@RestController
@RequestMapping("passport")
public class PassportController {

    @Autowired
    private UserService userService;

    @GetMapping("/usernameIsExist")
    public int usernameIsExist(@RequestParam String username){
        if(StringUtils.isBlank(username)){
            return 500;
        }
        boolean isExist = userService.queryUsernameIsExist(username);
        if(isExist){
            return 500;
        }
        return 200;
    }
}
