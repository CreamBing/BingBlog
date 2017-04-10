package com.bing.bingblog.busi.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 测试一下log4j2的配置
 *log4j2针对一个包的多项配置会被覆盖
 * Created by zhaobing on 2017/4/10.
 */
@Service
public class TestLog4j2Service {

    private static final Logger LOG = LoggerFactory.getLogger(TestLog4j2Service.class);

    public void testLog4j2(){
        LOG.trace("1、我是TestLog4j2Service trace信息");
        LOG.debug("2、我是TestLog4j2Service debug信息");
        LOG.info("3、我是TestLog4j2Service info信息");
        LOG.warn("4、我是TestLog4j2Service warn信息");
        LOG.error("5、我是TestLog4j2Service error信息");
    }
}
