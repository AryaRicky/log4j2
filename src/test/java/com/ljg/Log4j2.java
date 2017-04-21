package com.ljg;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by lijianguo on 2017/4/20.
 */
public class Log4j2 {
    public static void main(String[] args) {
        //这个需要在log4j2里面定义才会生效，否则找到的还是Loggers下面的Root
        Logger logger = LogManager.getLogger(Log4j2.class);
//        Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);
        logger.trace("trace level");
        logger.debug("debug level");
        logger.info("info level");
        logger.warn("warn level");
        logger.error("error level");
        logger.fatal("fatal level");

        User user = new User();
        user.setId(12);
        user.setUsername("jack");
        user.getId();
        user.getUsername();
        System.out.println(user);
    }
}
