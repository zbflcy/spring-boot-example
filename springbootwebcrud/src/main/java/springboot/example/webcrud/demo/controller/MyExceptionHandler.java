package springboot.example.webcrud.demo.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import springboot.example.webcrud.demo.Exception.MyException;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

//@ControllerAdvice
public class MyExceptionHandler {

//    @ResponseBody
//    @ExceptionHandler(MyException.class)
//    public Map<String, Object> handler() {
//        Map<String, Object> map = new HashMap<>();
//        map.put("name", "curry");
//        return map;
//    }

    @ExceptionHandler(MyException.class)
    public String handler(Exception e, HttpServletRequest request) {
        Map<String, Object> map = new HashMap<>();
        map.put("name", e.getCause());
        request.setAttribute("cus", map);
        request.setAttribute("javax.servlet.error.status_code", 404);
        return "forward:/error";
    }

    @ExceptionHandler(RuntimeException.class)
    public String hanlder_r(Exception e, HttpServletRequest request) {
        Map<String, Object> map = new HashMap<>();
        map.put("name", e.getCause());
        request.setAttribute("cus", map);
        request.setAttribute("javax.servlet.error.status_code", 500);
        return "forward:/error";
    }

}
