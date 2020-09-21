package com.ww.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author linweiwei
 * @version 1.0
 * @date 2020-09-21 15:32
 * @describe:   模板引擎
 */

@Controller
@RequestMapping("/thymeleaf")
public class ThymeleafController {

    @RequestMapping("test1")
    public String test1() {
        //返回到resources/templates/index.html
        return "index";
    }

}
