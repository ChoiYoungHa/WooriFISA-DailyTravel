package com.fisa.dailytravel.user.controller.repository;

import com.fisa.dailytravel.user.controller.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUuid(String uuid);
}
