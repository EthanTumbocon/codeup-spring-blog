package com.jupiter.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MathController {
    @GetMapping(path="/add/{x}/and/{y}")
    @ResponseBody
    public String add(@PathVariable int x, int y){
        return x + " + " + y + " = " + (x + y);
    }
    @GetMapping(path = "/subtract/{x}/and/{y}")
    @ResponseBody
    public String subtract(@PathVariable int x, int y){
        return x + " - " + y + " = " + (x - y);
    }
    @GetMapping(path = "/divide/{x}/and/{y}")
    @ResponseBody
    public String divide(@PathVariable int x, int y){
        return x + " / " + y + " = " + (x / y);
    }
    @GetMapping(path = "/multiply/{x}/and/{y}")
    @ResponseBody
    public String multiply(@PathVariable int x, int y){
        return x + " * " + y  + " = " + (x * y);
    }
}
