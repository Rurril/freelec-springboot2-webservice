package com.jojoldu.book.springboot.web.web;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControllerTest {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

}
