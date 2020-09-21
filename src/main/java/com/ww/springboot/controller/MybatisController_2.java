package com.ww.springboot.controller;

import com.ww.springboot.model.Account;
import com.ww.springboot.model.User;
import com.ww.springboot.service.AccountService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.sql.DataSource;

/**
 * @author linweiwei
 * @version 1.0
 * @date 2020-09-07 14:11
 * @describe: 整合mybatis
 */

@RestController
@RequestMapping("/mybatis")
public class MybatisController_2 {

    @Autowired
    private AccountService accountService;

    @Autowired
    private DataSource dataSource;

    /**
     * 测试集成mybatis  注意测试id直接写在url后面不用restFuTool的json
     */
    @GetMapping("/findUserByID/{id}")
    public Account findAccByID(@PathVariable("id") Integer id) {
        return accountService.findAccByID(id);
    }



    /**
     * 学习事物控制
     * @param money
     * @param id
     */
    @PutMapping("/update")
    public void update(@Param("money") double money, @Param("id") int id) {
        accountService.updateAccount(money, id);
    }
}
