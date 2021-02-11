package com.jupiter.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostControllers {
    @GetMapping("/post")
    @ResponseBody
    public String postsIndex(){
        return "Viewing all posts";
    }
    @GetMapping("/posts/id")
    @ResponseBody
    public String postView(){
        return "Viewing individual post";
    }
    @GetMapping("/posts/create")
    @ResponseBody
    public String postForm(){
        return "Create a post here!";
    }
}
