package com.ww.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author linweiwei
 * @version 1.0
 * @date 2020-09-21 15:32
 * @describe:   模板引擎
 */

@Controller
@RequestMapping("/thymeleaf")
public class ThymeleafController_5 {

    @RequestMapping("/test1")
    public String test1(Model model) {
        model.addAttribute("msg", "Hello,Thymeleaf");
        //返回到resources/templates/hello.html
        return "hello";
    }

}
