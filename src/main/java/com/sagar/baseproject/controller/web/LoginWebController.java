package com.sagar.baseproject.controller.web;

import com.sagar.baseproject.common.util.ApplicationHelper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class LoginWebController {

    @GetMapping({"", "/", "/login"})
    public String index() {
        return "redirect:/base/login";
    }

    @GetMapping("/base/login")
    public String login() {
    if (ApplicationHelper.isAuthenticated()){
        return "redirect:/web/home";
    }
        return "login";
    }

    @GetMapping("/loginbak")
    public String loginbak() {
        return "login-bak";
    }

}
