package com.bing.bingblog.web.ctrl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    @RequestMapping(value = "index", method = RequestMethod.GET, produces = "application/json")
    public String toIndex() {
        LOG.debug("debug");
        LOG.info("info");
        LOG.warn("warn");
        LOG.error("error");
        return "index/index";
    }
}
