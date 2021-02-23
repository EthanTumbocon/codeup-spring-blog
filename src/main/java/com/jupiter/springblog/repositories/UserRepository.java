package com.jupiter.springblog.repositories;

import com.jupiter.springblog.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public class UserRepository extends JpaRepository<User, Long> {
}
