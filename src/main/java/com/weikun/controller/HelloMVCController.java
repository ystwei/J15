package com.weikun.controller;

import com.weikun.po.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/12/9.
 */

@Controller
@RequestMapping({"/mvc","mvc2"})
@SessionAttributes({"user","user1"})
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
    @RequestMapping("/plan")
    public String plan(User user, Map map, Model model, ModelMap modelMap){
        map.put("user",user);
        model.addAttribute("user1",user);
        modelMap.addAttribute("user2",user);
        return "success";
    }
    @RequestMapping("/black")
    public String black(@RequestParam("sex")String sex,@RequestParam("id") int id,Map map){
        map.put("user","sex:"+sex+",id:"+id);
        return "ok";
    }


    @RequestMapping("/red")
    public String red(@RequestParam("sex") String [] sexs,Map map){
        map.put("user","sex:"+sexs[0]+sexs[1]);
        return "ok";
    }


    @RequestMapping("/green1")
    public String green(@CookieValue(value = "JSESSIONID",defaultValue = "")
                             Cookie  my,HttpServletResponse response){
        my.setValue("MIKE");
       // Cookie cookie=new Cookie("my",my+"");
        //response.addCookie(cookie);
        return "cookie";
    }
    @RequestMapping("/blue")
    public String blue(@ModelAttribute("user3") User user,Map map){
        map.put("user",user);
        return "success";
    }
    @RequestMapping("/orange")
    public @ModelAttribute List<String> orange(){

        return Arrays.asList("ºì","»Æ","ÂÌ");
    }

    @RequestMapping("/yellow")
    public @ModelAttribute List<User> yellow(){

        return Arrays.asList(new User("MIKE"),new User("JACK"));
    }

    @RequestMapping("/pink")
    public @ModelAttribute Map<String,User> pink(){

        HashMap<String, User> map1=new HashMap<String, User>();
        map1.put("A", new User("weikun"));
        map1.put("B", new User("fafa"));
        return map1;
    }


    @RequestMapping("/white")
    public String  white(Map map){

        map.put("user","MIKE");
        map.put("user1","JACK");

        return "white";
    }
}
