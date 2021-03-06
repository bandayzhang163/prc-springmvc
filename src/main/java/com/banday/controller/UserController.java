package com.banday.controller;

import com.banday.pojo.User;
import com.banday.service.UserService;
import com.banday.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    /**
     * 用户列表
     * @return
     */
    @GetMapping("user")
    public String listUser(Model model){
        List<User> users = userService.listUser();
        model.addAttribute("data",users);
        return "user/user";
    }


    /**
     * 用户详情
     * @param id
     * @return
     */
    @GetMapping("user/{id}")
    public String getUser(@PathVariable int id,Model model){
        User user = userService.getUser(id);
        model.addAttribute("data",user);
        return "user/user";
    }

    /**
     * 添加用户
     * @param user
     * @return
     */
    @PostMapping("user/add")
    public String add(User user, Model model){
        int add = userService.add(user);
        model.addAttribute("msg","add "+add+" records");

        List<User> users = userService.listUser();
        model.addAttribute("data",users);
        return "user/user";
    }

    /**
     * 删除用户
     * @param id
     * @return
     */
//    @DeleteMapping("user/delete/{id}")
    @GetMapping("user/delete/{id}")
    public String delete(@PathVariable int id,Model model){
        int delete = userService.delete(id);
        model.addAttribute("msg","delete "+delete+" records");

        List<User> users = userService.listUser();
        model.addAttribute("data",users);
        return "user/user";
    }

    /**
     * 更新用户
     * @param user
     * @return
     */
    @PostMapping("user/update")
    public String update(User user, Model model){
        int update = userService.update(user);
        model.addAttribute("msg","update "+update+" records");

        List<User> users = userService.listUser();
        model.addAttribute("data",users);
        return "user/user";
    }
}
