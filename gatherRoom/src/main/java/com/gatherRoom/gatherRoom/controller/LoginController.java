package com.gatherRoom.gatherRoom.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller(value = "/")
@Slf4j
public class LoginController {

    @GetMapping("/")
    public String loginPage() {
        return "login";
    }

}
