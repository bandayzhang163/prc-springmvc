package com.banday.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {

    @RequestMapping("test")
    public ModelAndView test(){
        ModelAndView model = new ModelAndView();
        model.addObject("msg","test");
        model.setViewName("test");
        return model;
    }

    @RequestMapping("test2")
    public String test2(){
        return "test";
    }
}
