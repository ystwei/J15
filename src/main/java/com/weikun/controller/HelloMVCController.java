package com.weikun.controller;

import com.weikun.po.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2016/12/9.
 */

@Controller
@RequestMapping({"/mvc","mvc2"})
public class HelloMVCController {
    @RequestMapping("/hello")
    public ModelAndView hello() {
        ModelAndView mv=new ModelAndView();
        mv.setViewName("success");
        mv.addObject("user","MIKE");
        return mv;
    }
    @RequestMapping("/add/username/{username}/pwd/{pwd}")
    public ModelAndView add(
            @PathVariable("username") String name,
            @PathVariable("pwd") String pwd){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("success");
        mv.addObject("user",name+"/"+pwd);
        return mv;
    }
    @RequestMapping(value = "/del",method = RequestMethod.GET)
    public ModelAndView del(User user){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("success");
        mv.addObject("user",user.getUsername());
        return mv;
    }

    @RequestMapping(value ="/go1/price/{price:\\d+}-{id:\\d+}")
    public ModelAndView go(@PathVariable("price") int price,@PathVariable("id") int id){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("success");
        mv.addObject("user","price"+price+":id"+id);
        return mv;
    }


}
