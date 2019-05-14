package com.example.demo.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
@Data
public class ProfileConfig {
    @Autowired
    private Environment environment;
    public List<String> getProfiles() {
        return Arrays.asList(environment.getActiveProfiles());
    }

    public EnvEnum getEnv(){
        if(getProfiles().contains(EnvEnum.local.name())){
            return EnvEnum.local;
        }else if(getProfiles().contains(EnvEnum.dev.name())){
            return EnvEnum.dev;
        }else if(getProfiles().contains(EnvEnum.test.name())){
            return EnvEnum.test;
        }else if(getProfiles().contains(EnvEnum.stage.name())){
            return EnvEnum.stage;
        } else if(getProfiles().contains(EnvEnum.online.name())){
            return EnvEnum.online;
        }else
            return null;
    }


}
