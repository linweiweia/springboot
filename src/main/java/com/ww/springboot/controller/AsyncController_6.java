package com.ww.springboot.controller;

import com.ww.springboot.service.AccountService;
import com.ww.springboot.service.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author linweiwei
 * @version 1.0
 * @date 2020-09-25 14:23
 * @describe:  异步任务（不会等待）
 */
@RestController
public class AsyncController_6 {

    @Autowired
    private AsyncService asyncService;

    @GetMapping("/async")
    public String hello() {
        asyncService.hello();
        return "success";
    }

}
