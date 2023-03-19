package com.nowcoder.community;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author Nastume
 * @create 2023-03-19 10:10
 */

@SpringBootTest
public class LoggerTests {
    private static final Logger logger = LoggerFactory.getLogger(LoggerTests.class);

    @Test
    public void testLogger(){
        System.out.println(logger.getName());
        logger.trace("hello trace");
        //程序调试日志
        logger.debug("hello debug");
        //普通级别日志
        logger.info("hello info");
        logger.warn("hello warn");
        //错误日志
        logger.error("hello log");
    }

}
