package com.xiaoxiya.test;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * Created by zhangxibin on 2018/7/31.
 */
public class ApplicationTest {
    Logger logger = LoggerFactory.getLogger(this.getClass());
    @Test
    public void bCryptPasswordEncoder(){
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        String passwd = "123456";
        logger.info("加密前：{}",passwd);
        String finalPassword = "{bcrypt}"+bCryptPasswordEncoder.encode(passwd);
        logger.info("加密后：{}",finalPassword);
    }

}
