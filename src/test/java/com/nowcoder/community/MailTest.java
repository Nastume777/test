package com.nowcoder.community;

import com.nowcoder.community.util.MailClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

/**
 * @author Nastume
 * @create 2023-03-19 15:34
 */

@SpringBootTest
public class MailTest {
    @Autowired
    private MailClient mailClient;
    @Autowired
    private TemplateEngine templateEngine;

    @Test
    public void testMail(){
        mailClient.sendMail("romancely@sina.com", "Test", "hello world");
    }

    @Test
    public void testHtmlMail(){
        Context context = new Context();
        context.setVariable("username", "romancely");
        String html = templateEngine.process("mail/demo", context);
        mailClient.sendMail("romancely@sina.com", "Testhtml", html);
    }
}
