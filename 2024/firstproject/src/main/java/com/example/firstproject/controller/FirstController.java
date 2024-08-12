package com.example.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {

    @GetMapping("/hi")
    public String niceToMeetYou(Model model) {
        model.addAttribute("username", "MyGuest");
        return "greetings";  // templates/greetings.mustache >>> 브라우져로 전송해줌
    }

    @GetMapping("/bye")
    public String seeYouNext(Model model) {
        model.addAttribute("nickname", "shjung");
        return "goodbye";
    }
}
