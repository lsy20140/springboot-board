package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class DateController {
    @GetMapping("/date")
    public String date(){
        return "현재 날짜는: "+ new Date();
    }
}
