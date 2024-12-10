package com.vihi.point_of_sale.controller;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("api/v1/test")
public class TestController {

    @GetMapping
    public void getMyText(){
        String myText = "This is my first spring app";
        System.out.println(myText);
    }

    @GetMapping( "/get-text-1")
    public void getMyText1(){
        String myText = "This is my first spring app";
        System.out.println(myText);
    }

    @GetMapping(path = "/get-text-2")
    public void getMyText2(){
        String myText = "This is my first spring app";
        System.out.println(myText);
    }

    @GetMapping(path = "/get-text-3")
    public String getMyText3(){
        String myText = "This is my first spring app";
        System.out.println(myText);
        return myText;
    }

}
