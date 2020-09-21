package com.ww.springboot.service;

import com.ww.springboot.dao.AccountDao;
import com.ww.springboot.model.Account;
import com.ww.springboot.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author linweiwei
 * @version 1.0
 * @date 2020-09-07 14:23
 * @describe:
 */
@Service
public class AccountService {

    @Autowired
    private AccountDao accountDao;



    /**
     * 事物测试
     * 如果是jdbctemplate, jpa, mybatis常见的orm框架直接加一个注解就可以 Transactional
     * @param money
     * @param id
     */
    @Transactional
    public void updateAccount(double money, int id) {
        accountDao.update(money, id);
        int i = 1 / 0;
        accountDao.update(2, 90);

    }

    /**
     * 测试使用druid连接池
     * @param id
     * @return
     */
    public Account findAccByID(int id) {
        return accountDao.findAccByID(id);
    }
}
