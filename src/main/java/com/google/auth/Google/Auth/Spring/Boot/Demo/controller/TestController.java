package com.google.auth.Google.Auth.Spring.Boot.Demo.controller;

import com.google.auth.Google.Auth.Spring.Boot.Demo.model.TestUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
public class TestController {
    @GetMapping("/")
    public String test()
    {
        return "This is to test access without google auth login";
    }
    @GetMapping("/auth")
    public String authtest(TestUser user)
    {
        user.setId(20L);
        user.setName("Nonso");
        user.setEmail("sparkzilla7@gmail.com");
        user.setBirthDay(LocalDate.of(2000, Month.JANUARY, 5));
        return user.toString();
    }
}
