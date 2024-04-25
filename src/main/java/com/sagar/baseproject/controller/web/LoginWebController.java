package com.sagar.baseproject.controller.web;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class LoginWebController {

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/loginbak")
    public String loginbak() {
        return "login-bak";
    }

}
