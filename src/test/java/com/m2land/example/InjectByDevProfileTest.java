package com.m2land.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext-test.xml"})
@ActiveProfiles(value = "dev")
public class InjectByDevProfileTest
{
    @Autowired
    Talkative talkative;

    @Test
    public void TestTalkative() {
        String result = talkative.talk();
        Assert.assertEquals("Meow.", result);

    }
}
