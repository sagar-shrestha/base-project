package com.sagar.baseproject.security.repository;

import com.sagar.baseproject.security.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserInfoRepository extends JpaRepository<UserInfo, Integer> {


    UserInfo findByUsername(String username);
}
