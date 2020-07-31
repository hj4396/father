package com.hujun.test;

import com.hujun.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * @author huj
 * @create 2020-07-31 16:58
 */
public class TestSpring {

    @Test
    public void run1(){
       ApplicationContext ac=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
       AccountService as=(AccountService) ac.getBean("accountService");
       as.findAll();
    }
}
