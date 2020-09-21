package com.ww.springboot.dao;

import com.ww.springboot.model.Account;
import com.ww.springboot.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


@Mapper
public interface AccountDao {
    int update(double money, int id);

    Account findAccByID(int id);
}
