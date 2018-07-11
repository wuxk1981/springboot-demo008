package com.camelot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>Description: [功能描述]</p>
 * Created on 2018/7/11 15:17
 *
 * @author <a href="mailto: wuxinkuan@camelotchina.com">吴心宽</a>
 * @version 1.0
 * Copyright (c) 2018 北京柯莱特科技有限公司
 */
@RestController
public class CommonController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getData() {
        return "hello world !";
    }
}
