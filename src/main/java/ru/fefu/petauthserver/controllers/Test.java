package ru.fefu.petauthserver.controllers;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.fefu.petauthserver.entity.UserEntity;

import java.security.Principal;

@RestController
@RequestMapping("/test")
public class Test {

    @GetMapping
    public UserEntity test(Authentication authentication) {
        return (UserEntity) authentication.getPrincipal();
    }

}
