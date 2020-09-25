package com.ww.springboot.controller;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author linweiwei
 * @version 1.0
 * @date 2020-09-25 15:05
 * @describe:  简单的定时任务
 */

@Component
public class ScheduledTask_7 {


    @Scheduled(cron = "0/2 * * * * ?")
    public void timeTask(){
        System.out.println(new Date());
    }
}
