package com.zhangcx.user.controller;

import com.zhangcx.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "/freezequery", produces = "text/html;charset=UTF-8")
    public ModelAndView freezequery(HttpServletRequest request) {
        ModelAndView mv = new ModelAndView();
        // 接收参数
        String freezeflag = request.getParameter("freezeflag");
        mv.setViewName("/webapp/index.html");
        return mv;
    }
}
