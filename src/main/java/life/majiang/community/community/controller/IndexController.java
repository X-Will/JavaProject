package life.majiang.community.community.controller;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class IndexController {

    @GetMapping("/")
    public String index() {  return "index";
    }
}
