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
@RequestMapping("test")
public class TestUserController {
    @Autowired
    UserService userService;

    /**
     * 返回自定义结果
     * @return
     */
    @GetMapping("user")
    @ResponseBody
    public R listUser(){
        List<User> users = userService.listUser();
        System.out.println(users);
        return R.ok(users);
    }

    /**
     * 返回ResponseEntity
     * @param id
     * @return
     */
    @GetMapping("user/{id}")
    @ResponseBody
    public ResponseEntity<User> getUser(@PathVariable int id){
        User user = userService.getUser(id);
        return ResponseEntity.ok(user);
    }

    /**
     * 返回成功页面
     * @param user
     * @return
     */
    @PostMapping("user")
    public String add(User user, Model model){
        int add = userService.add(user);
        model.addAttribute("msg","add "+add+" records");
        return "success";
    }

    /**
     * 返回ModelAndView
     * @param id
     * @return
     */
//    @DeleteMapping("user/delete/{id}")
    @GetMapping("user/delete/{id}")
    public ModelAndView delete(@RequestBody @PathVariable int id){
        int delete = userService.delete(id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("msg","delete "+delete+" records");
        modelAndView.setViewName("success");
        return modelAndView;
    }

    /**
     * 返回void
     * @param user
     * @return
     */
    @PutMapping("user")
    public void update(User user, HttpServletRequest request, HttpServletResponse response){
        int update = userService.update(user);
        System.out.println("update "+update+" records");
        try {
//            request.getRequestDispatcher("test").forward(request,response);
            response.sendRedirect("test");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
