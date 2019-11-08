package com.jbs.finance.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @created by wjf
 * @date 2019/11/8 10:05
 * @description:
 */
@Controller
public class DemoController {

//    @Resource
//    private TestService testService;

    @RequestMapping("test")
    public String test() {
        return "aaa";
    }

   /* @RequestMapping("/user")
    @ResponseBody
    public User user() {
        User user = new User();
        user.setAge(111).setName("1111");
        return testRpcService.user(user);
    }*/

}
