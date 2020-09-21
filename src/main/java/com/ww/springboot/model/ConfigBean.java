package com.ww.springboot.model;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author linweiwei
 * @version 1.0
 * @date 2020-09-07 11:10
 * @describe:  配置文件属性   测试读取application配置文件属性自动注入IOC
 */

@Data
@Component
@ConfigurationProperties(prefix = "my")  //指定前缀
public class ConfigBean {
    private String name;
    private int age;
}
