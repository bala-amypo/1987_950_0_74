package com.example.demo.controller;
import org.springframework.web.bind.annotation.*;
@RestController
public class basics{
    @GetMappping("/home")
    public String name(){
        return "hello world";
    }
}