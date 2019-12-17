package com.phn.springboot01.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;


/**
 * @author Penghenan
 * @create 2019-12-14 21:00:53
 */
@Slf4j
@Controller
public class IndexController {

    @ResponseBody
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public Map<String,Object> home(){
        System.out.println("hello springBoot");
        Map<String,Object> json = new HashMap<>();
        json.put("success",true);
        json.put("msg","hello springBoot hhhh");
        return json;
    }

    @ResponseBody
    @RequestMapping(value="/{id}", method=RequestMethod.GET)
    public Map<String,Object> getUser(@PathVariable Integer id) {
        // 处理"/users/{id}"的GET请求，用来获取url中id值的User信息
        // url中的id可通过@PathVariable绑定到函数的参数中
        System.out.println("url的id  >>>>>>>>"+id);
        Map<String,Object> json = new HashMap<>();
        json.put("id",id);
        json.put("datas","user");

        return json;
    }


    @RequestMapping("/index.do")
    public String toIndex(){
        log.info(">>>>>  hello index");
        return "index";
    }



}
