package com.wang.helloworld.gitTest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {

    @RequestMapping("/")
    public String helloworld() {
        String a = "piss off";
        System.out.println("wtf: " + a);
        return "hello world";
    }

    public void helloworld2() {
        String a;
        a = "world";
        System.out.println("hello" + a);
    }


}
