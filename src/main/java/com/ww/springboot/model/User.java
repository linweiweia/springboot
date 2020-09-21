package com.ww.springboot.model;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author linweiwei
 * @version 1.0
 * @date 2020-09-07 11:10
 * @describe:  User类用于测试读取自定义配置文件 并注入IOC
 */


@Data
@Component  //或者@Configuration就是要注入IOC
@PropertySource("classpath:myconfig.properties")
@ConfigurationProperties(prefix = "com.user")   //指定前缀
public class User {
    private String name;
    private int age;
}
