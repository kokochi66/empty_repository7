package com.gatherRoom.gatherRoom.controller;

import com.gatherRoom.gatherRoom.service.oauth2.SessionUser;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@Log4j2
public class HomeController {

    @GetMapping("/")
    public String home(HttpServletRequest request) {
        SessionUser user = (SessionUser) request.getSession().getAttribute("user");
        log.info("/ - mainPage");
        return "index";
    }
}
