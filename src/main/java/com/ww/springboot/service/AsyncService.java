package com.ww.springboot.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @author linweiwei
 * @version 1.0
 * @date 2020-09-25 14:21
 * @describe:   异步方法测试
 */

@Service
public class AsyncService {
    /**
     * 加了这个注释就不会等待3秒了,SpringBoot就会自己开一个线程池3秒后来执行这个方法后续代码。
     * controller就是直接返回success不会等待3秒在返回success了。
     * 记得配置也要@EnableAsync允许异步处理
     */
    @Async
    public void hello() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("业务进行中……");
    }
}
