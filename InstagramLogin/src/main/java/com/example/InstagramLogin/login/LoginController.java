package com.example.InstagramLogin.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping(path = "instagram/login")
public class LoginController {

    private final LoginService loginService;

    @Autowired
    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @GetMapping
    public List<Login> getLogin() {
        return loginService.getLogin();
    }

    @PostMapping
    public String userLogin(@RequestBody Login user) {
        Login oauthUser = loginService.checkUsernameAndPassword(user.getUsername(), user.getPassword());
        if(Objects.nonNull(oauthUser)) {
            return "redirect:/";
        } else {
            return "redirect:/login";
        }
    }
}
