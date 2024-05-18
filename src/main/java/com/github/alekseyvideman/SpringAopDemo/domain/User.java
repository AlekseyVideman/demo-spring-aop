package com.github.alekseyvideman.SpringAopDemo.domain;

import lombok.extern.java.Log;
import org.springframework.stereotype.Component;

@Log(topic = "user")
@Component
public class User {

    public void sayHello() {
        log.info("HELLO");
    }

    public void say(String message) {
        log.info(message);
    }

    public int getAge() {
        return 21;
    }

}
