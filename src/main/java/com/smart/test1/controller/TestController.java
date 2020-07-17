package com.smart.test1.controller;

import javafx.scene.input.DataFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class TestController {

    @GetMapping(value = "/test")
    public Date show(@RequestParam int a){
        String s="你输入的是"+String.valueOf(a);
        Date date=new Date();
        System.out.println(date);
        return date;
    }
}
