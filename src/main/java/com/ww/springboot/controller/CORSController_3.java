package com.ww.springboot.controller;

import org.springframework.web.bind.annotation.*;
import sun.awt.SunHints;

/**
 * @author linweiwei
 * @version 1.0
 * @date 2020-09-08 14:17
 * @describe: springboot解决跨域问题000
 * 资料在江南一点雨博客中 consumer在test工程中
 */

@RestController
@RequestMapping("/cors")
public class CORSController_3 {

    //@CrossOrigin(value = "http://localhost:8081")
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    //@CrossOrigin(value = "http://localhost:8081")
    @PostMapping("/hello")
    public String hello2() {
        return "post hello";
    }
}
