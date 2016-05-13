package com.m2land.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.AbstractEnvironment;
import org.springframework.stereotype.Component;

@Component
public class Main {

    public static void main(String[] args) {
        // Enable a "dev" profile
        System.setProperty(AbstractEnvironment.ACTIVE_PROFILES_PROPERTY_NAME, "dev");
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Main p = context.getBean(Main.class);
        p.start(args);
    }

    @Autowired
    private Talkative talkative;

    private void start(String[] args) {
        System.out.println(talkative.talk());
    }
}
