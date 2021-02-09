package com.jupiter.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MathController {
    @RequestMapping(path="/add/{number}/{number2}", method = RequestMethod.GET)
    @ResponseBody
    public String addOne(@PathVariable int number, int number2){
        return number + " plus one is " + (number2 + 1) + "!";
    }
//    @RequestMapping(path = "/subtract/{number}", method = RequestMethod.GET)
//    @ResponseBody
//    public String subtract(@PathVariable int number){
//        return number + " minus one is " + (number - 1) + "!";
//    }
//    @RequestMapping(path = "/divide/{number}", method = RequestMethod.GET)
//    @ResponseBody
//    public String divide(@PathVariable int number){
//        return number + "divided by " + (number / 2) + "!";
//    }
//    @RequestMapping(path = "/multiply/{number}", method = RequestMethod.GET)
//    @ResponseBody
//    public String multiply(@PathVariable int number){
//        return number + "multiplied by 2 is " + (number * 2) + "!";
//    }
}
