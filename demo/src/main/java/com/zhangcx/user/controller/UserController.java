package com.zhangcx.user.controller;

import com.zhangcx.user.pojo.User;
import com.zhangcx.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "/uuid", produces = "text/html;charset=UTF-8")
    public String queryByUuid(HttpServletRequest request) {
        // 接收参数
        String uuid = request.getParameter("uuid");
        User user = userService.queryByUuid(uuid);
        return user.getNickname();
    }
}
