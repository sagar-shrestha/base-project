package com.sagar.baseproject.security.service;

import com.sagar.baseproject.security.entity.UserInfo;
import com.sagar.baseproject.security.repository.UserInfoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserInfoServiceImpl implements UserInfoService{


    private final UserInfoRepository userInfoRepository;
   //  private final BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public void saveUserInfo(UserInfo userInfo) {

        userInfoRepository.save(userInfo);
    }
}
