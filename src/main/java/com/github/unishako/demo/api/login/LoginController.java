package com.github.unishako.demo.api.login;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("")
public class LoginController {

    @GetMapping("/")
    public String init() {
        return "login/login";
    }

    @GetMapping("/login")
    public String login() {
        return "login/login";
    }
}
