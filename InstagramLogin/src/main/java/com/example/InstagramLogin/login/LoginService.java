package com.example.InstagramLogin.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LoginService {

    private final LoginRepository loginRepository;

    @Autowired
    public LoginService(LoginRepository loginRepository) {
        this.loginRepository = loginRepository;
    }

    public List<Login> getLogin() {
        return loginRepository.findAll();
    }

    public Login checkUsernameAndPassword(String username, String password) {
       Login user = loginRepository.findLoginByUsernameAndPassword(username, password);
       return user;
    }
}
