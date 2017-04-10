package com.bing.bingblog.web.ctrl;

import com.bing.bingblog.busi.service.TestLog4j2Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 博客首页
 * Created by zhaobing on 2017/4/10.
 */
@Controller
@RequestMapping("main")
public class IndexController {

    private static final Logger LOG = LoggerFactory.getLogger(IndexController.class);
    @Autowired
    private TestLog4j2Service testLog4j2Service;

    @RequestMapping(value = "index", method = RequestMethod.GET, produces = "application/json")
    public String toIndex() {
        LOG.trace("1、我是trace信息{}{}","用户信息","业务代码");
        LOG.debug("2、我是debug信息");
        LOG.info("3、我是info信息");
        LOG.warn("4、我是warn信息");
        LOG.error("5、我是error信息");
        testLog4j2Service.testLog4j2();
        return "index/index";
    }
}
