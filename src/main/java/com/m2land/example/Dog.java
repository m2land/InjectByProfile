package com.m2land.example;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
class Dog implements Talkative {
    public String talk() {
        return "Woof!";
    }
}