package com.gatherRoom.gatherRoom.controller;

import com.gatherRoom.gatherRoom.domain.test.ResponseTest;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Log4j2
public class HomeController {

    @GetMapping("/")
    public String home() {
        log.info("/ - mainPage");
        return "index";
    }

    @GetMapping("/userdata")
    @ResponseBody
    public ResponseTest userdata() {
        return ResponseTest.builder()
                .key("kokochikochi")
                .value("kimjaewon")
                .intValue(123)
                .floatValue(12F)
                .build();
    }

}
