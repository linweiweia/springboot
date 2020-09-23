package com.ww.springboot;

import com.alibaba.druid.pool.DruidDataSource;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author linweiwei
 * @version 1.0
 * @date 2020-09-21 14:26
 * @describe:  连接池测试类
 */

@SpringBootTest
public class DruidTest_4 {

    @Autowired
    DataSource dataSource;

    @Test
    public void druidTest() throws SQLException {
        //先查看数据源
        System.out.println(dataSource.getClass());

        //获取连接
        Connection connection = dataSource.getConnection();
        System.out.println(connection);

        DruidDataSource druidDataSource = (DruidDataSource) dataSource;
        System.out.println("druidDataSource 数据池最大连接数" + druidDataSource.getMaxActive());
        System.out.println("druidDataSource 数据源初始化连接数" + druidDataSource.getInitialSize());

        //关闭连接
        connection.close();
    }

}
