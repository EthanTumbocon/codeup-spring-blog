package com.jupiter.springblog.controllers;


import com.jupiter.springblog.models.Post;
import com.jupiter.springblog.repositories.PostRepository;
import com.jupiter.springblog.services.EmailService;
import com.jupiter.springblog.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class PostController {

    private final PostRepository postsDao;
    private final EmailService emailService;
    private final UserService userService;


    public PostController(PostRepository postsDao, EmailService emailService, UserService userService) {
        this.postsDao = postsDao;
        this.emailService = emailService;
        this.userService = userService;
    }

    @GetMapping("/posts")
    public String jpaIndex() {
        return "posts/index";
    }


    @GetMapping("/posts/jpa/{id}")
    @ResponseBody
    public String viewJpaPost(@PathVariable long id) {
        return postsDao.getOne(id).toString();
    }


    @GetMapping("/posts/create")
    @ResponseBody
    public String postForm(){
        return "Create a post here!";
    }

    @PostMapping("/posts/create")
    public String createPost(@ModelAttribute Post post) {

        Post savedPost = postsDao.save(post);

        String subject = "New Post Created!" + savedPost.getTitle();
        String body = "Dear " + savedPost.getUser().getUsername()
                + ". Thank you for creating an ad. Your ad id is "
                + savedPost.getId();
        emailService.prepareAndSend(savedPost, subject, body);

        return "redirect:/posts";
    }

}