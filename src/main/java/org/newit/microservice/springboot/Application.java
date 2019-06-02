package org.newit.microservice.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class Application {

    @Autowired
    private Book book;

    @RequestMapping("/book")
    @ResponseBody
    public Book book(){
        return book;
    }

    @Value("${newit.title}")
    private String customValue;

    @RequestMapping("/customValue")
    @ResponseBody
    public String customValue(){
        return customValue;
    }
    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "Hello world";
    }

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping("/currentTime")
    @ResponseBody
    public MyTime currentTime(){
        MyTime myTime = new MyTime();
        myTime.setCurrentTime(System.currentTimeMillis());
        return myTime;
    }

    public static void main(String[] args){
        SpringApplication.run(Application.class);
    }
}
