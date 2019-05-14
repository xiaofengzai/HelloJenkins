package com.example.demo;

import com.example.demo.config.ProfileConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by fengwen on 14/05/2019.
 */
@RestController
@RequestMapping("/")
public class TestController {
    @Autowired
    private ProfileConfig profileConfig;

    @GetMapping("test")
    public String testEnv(){
        return profileConfig.getEnv().name();
    }
}
