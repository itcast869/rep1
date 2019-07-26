package com.itheima.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.itheima.domain.User;
import com.itheima.domain.VO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

@Controller()
@RequestMapping("/user")
public class UserController11 {

    @RequestMapping("/quick17")
    @ResponseBody
    public void save17(String name, MultipartFile[] uplaodFile) throws IOException {
        System.out.println(name);
        for(MultipartFile uplaodFile1 :uplaodFile) {
            String originalFilename = uplaodFile1.getOriginalFilename();
            uplaodFile1.transferTo(new File("D:\\upload",originalFilename));
        }


    }

    @RequestMapping("/quick16")
    @ResponseBody
    public void save16(String name, MultipartFile uplaodFile) {
        System.out.println(name);
        System.out.println(uplaodFile);

    }

    @RequestMapping("/quick15")
    @ResponseBody
    public void save15(Date date) {
        System.out.println(date);

    }

    @RequestMapping("/quick14/{name}")
    @ResponseBody
    public void save14(@PathVariable(value ="name") String username) {
        System.out.println(username);

    }


    @RequestMapping("/quick13")
    @ResponseBody
    public void save13(@RequestParam(value ="name",required = false,defaultValue = "itcast") String username) {
        System.out.println(username);

    }

    @RequestMapping("/quick12")
    @ResponseBody
    public void save12(@RequestBody List<User> list) {
        System.out.println(list);

    }

    @RequestMapping("/quick11")
    @ResponseBody
    public void save11(VO vo) {
        System.out.println(vo);

    }

    @RequestMapping("/quick10")
    @ResponseBody
    public void save10(String name,int age) {
        System.out.println(name);
        System.out.println(age);

    }

    @RequestMapping("/quick9")
    @ResponseBody
    public User save9() {
        User user = new User();
        user.setAge(18);
        user.setName("zhuagsan");
        return user;
    }


    @RequestMapping(value="/quiek8")
    @ResponseBody
    public String quiekMethod8() throws JsonProcessingException {
        User user =new User();
        user.setAge(18);
        user.setName("李四");
        //把user对象进行序列化成String格式
        ObjectMapper objectMapper =new ObjectMapper();
        String string = objectMapper.writeValueAsString(user);
        return string;

    }

    @RequestMapping(value="/quiek7")
    @ResponseBody
    public String quiekMethod7()  {
       return "hello world";

    }

    @RequestMapping(value="/quiek6")
    public void quiekMethod6(HttpServletResponse model) throws IOException {
        model.getWriter().println("hello world");

    }

    @RequestMapping(value="/quiek5")
    public String quiekMethod5(HttpServletRequest model){
       model.setAttribute("username","刘贵光");
        return "index11";
    }

    @RequestMapping(value="/quiek4")
    public ModelAndView quiekMethod4(ModelAndView model){
        model.setViewName("index11");
        return model;
    }

    @RequestMapping(value="/quiek3")
    public String quiekMethod2(Model model){
        model.addAttribute("username","王伟");
        return "index11";
    }

    @RequestMapping(value="/quiek",method = RequestMethod.GET)
    public String quiekMethod(){
        System.out.println("quiekMethod  方法执行1");
        return "redirect:index11.jsp";
    }

    @RequestMapping(value="/quiek1")
    public ModelAndView quiekMethod1(){
        System.out.println("quiekMethod  方法执行2");
       //设置视图
        ModelAndView m =new ModelAndView();
        m.setViewName("index11");
        //设置参数
        m.addObject("username","，同桌");
        return m;
    }

}
