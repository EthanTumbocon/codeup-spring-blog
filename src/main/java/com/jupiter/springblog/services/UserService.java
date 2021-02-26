package com.jupiter.springblog.services;

import com.jupiter.springblog.models.User;
import com.jupiter.springblog.repositories.UserRepository;
import org.springframework.security.core.context.SecurityContextHolder;

public class UserService {
    private final UserRepository usersDao;

    public UserService(UserRepository usersDao) {
        this.usersDao = usersDao;
    }

    //Temporary placeholder
    // In the future we will replace this with the current logged in user
    public User getLoggedInUser() {
        User loggedInUser = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return usersDao.findById(loggedInUser.getId()).get();
    }
}
