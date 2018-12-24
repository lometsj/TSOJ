package com.mith.tsoj.repo;

import com.mith.tsoj.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<UserEntity,Long> {

    UserEntity findByUsrname(String username);

}
