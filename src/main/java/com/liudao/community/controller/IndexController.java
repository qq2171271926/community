package com.liudao.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author:liudao
 * @company:meiyou
 */
@Controller
public class IndexController {
    @GetMapping("/")
    public String hello() {
        return "index";
    }
}
