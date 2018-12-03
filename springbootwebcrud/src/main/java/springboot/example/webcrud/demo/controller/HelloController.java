package springboot.example.webcrud.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import springboot.example.webcrud.demo.Exception.MyException;

import java.util.*;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(@RequestParam("user") String user) throws MyException {

        if (user.equals("aaa"))
            throw new MyException();
        return "hello world!";
    }

    @RequestMapping("/success")
    public String success(Map<String, Object> map) {
        map.put("hello", "<h1>nihao</h1>");
        map.put("users", Arrays.asList("zhangsan", "lisi", "wangwu"));
        return "success";
    }


    @RequestMapping("/show")
    @ResponseBody
    public String show() {
        String s = null;
        s.length();
        return "success";

    }


}
