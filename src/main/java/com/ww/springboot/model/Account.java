package com.ww.springboot.model;

import lombok.Data;

/**
 * @author linweiwei
 * @version 1.0
 * @date 2020-09-07 14:16
 * @describe:  测试整合Mybatis实体类
 */

@Data
public class Account {
    private int id ;
    private String name ;
    private double money;

    public Account() {

    }

    
}
