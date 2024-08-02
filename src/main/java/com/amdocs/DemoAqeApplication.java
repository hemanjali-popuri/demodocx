package com.amdocs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@Controller
public class DemoAqeApplication {

    @GetMapping("/")
    public String show(Model model) {
        List<String> quotes = Arrays.asList(
            "So many books, so little time. - Frank Zappa",
            "A room without books is like a body without a soul. - Marcus Tullius Cicero",
            "The person, be it gentleman or lady, who has not pleasure in a good novel, must be intolerably stupid. - Jane Austen"
        );
        model.addAttribute("quotes", quotes);
        return "welcome";
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoAqeApplication.class, args);
    }
}