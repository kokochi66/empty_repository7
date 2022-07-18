package com.gatherRoom.gatherRoom.controller;

import com.gatherRoom.gatherRoom.service.oauth2.Oauth2Service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Controller
@Slf4j
public class LoginController {

    @Autowired
    private Oauth2Service oauth2Service;

    @GetMapping("/login")
    public void loginPage() throws IOException {
        log.info("/login - 로그인 페이지 이동하기");
        oauth2Service.request();
    }

}
