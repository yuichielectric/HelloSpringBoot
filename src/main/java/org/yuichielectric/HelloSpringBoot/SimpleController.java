package org.yuichielectric.HelloSpringBoot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;

@Controller
public class SimpleController {
    @Value("${spring.application.name}")
    String appName;

    @GetMapping("/")
    public String homePage(Model model) {
        Date now = new Date();
        model.addAttribute("now", now);
        model.addAttribute("appName", appName);
        return "home";
    }
}
