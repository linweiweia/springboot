package com.ww.springboot.controller;

import com.ww.springboot.model.ConfigBean;
import com.ww.springboot.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author linweiwei
 * @version 1.0
 * @date 2020-09-07 10:56
 * @describe:
 */
@RestController()
@RequestMapping("/yml")
public class YmlController_1 {

    @Value("${my.name}")
    private String name;


    @Autowired
    private ConfigBean configBean;

    @Autowired
    private User user;


    /**
     * 读取application配置文件内容
     * @return
     */
    @GetMapping("/mylTest")
    public String readYml() {
        return name;
    }


    /**
     * 测试读取application配置文件属性自动注入IOC
     * 有点厉害哦
     * @return
     */
    @GetMapping("/ymlToBeanTest")
    public String ymlToBean() {
        return configBean.toString();
    }


    /**
     * 从自己编写的配置类读取数据封装到user并注入ioc中
     */
    @GetMapping("/myProToBean")
    public String myProToBean() {
        return user.toString();
    }

}
