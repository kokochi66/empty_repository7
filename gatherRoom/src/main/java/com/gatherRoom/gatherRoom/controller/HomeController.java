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
//        HttpSession session = request.getSession();
//        Enumeration<String> attributeNames = request.getSession().getAttributeNames();
//        while(attributeNames.hasMoreElements()) {
//            String attributeName = attributeNames.nextElement();
//            Object attribute = session.getAttribute(attributeName);
//            log.info("TEST :: attributeName = " + attributeName);
//            log.info("TEST :: session = " + attribute);
//            log.info("====================================================");
//        }
        SessionUser user = (SessionUser) request.getSession().getAttribute("user");
        log.info("TEST :: user = " + user);
        log.info("/ - mainPage");
        return "index";
    }
}
