package com.ww.springboot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

/**
 * @author linweiwei
 * @version 1.0
 * @date 2020-09-25 15:43
 * @describe:  使用自己邮箱向别人发送邮件
 */

@SpringBootTest
public class MailTest_8 {

    @Autowired
    JavaMailSenderImpl javaMailSender;

    /**
     * 简单邮件发送
     */
    @Test
    public void sendMail() {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setSubject("我是发送的标题");
        simpleMailMessage.setText("我是发送的内容");
        simpleMailMessage.setTo("m15260337535@163.com");
        simpleMailMessage.setFrom("1013232063@qq.com");
        javaMailSender.send(simpleMailMessage);
    }

    /**
     * 没测试通过看看视屏附件是什么
     * @throws MessagingException
     */
    @Test
    public void sendComplexMail() throws MessagingException {
        //邮件设置2：一个复杂的邮件
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);

        helper.setSubject("通知-我是发送的标题");
        helper.setText("<b style='color:red'>我是发送的内容</b>",true);

        //发送附件
        helper.addAttachment("1.jpg",new File(""));
        helper.addAttachment("2.jpg",new File(""));

        helper.setTo("m15260337535@163.com");
        helper.setFrom("1013232063@qq.com");

        javaMailSender.send(mimeMessage);
    }

}
