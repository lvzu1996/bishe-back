package com.lvzu;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author tyq
 * @version 1.0, 2017/12/6
 */
@Controller
//@RequestMapping(value="/api")
public class TestController {

    public final static String SUCCEED="show";


    @RequestMapping(value="/testRestGet/{id}",method= RequestMethod.GET)
    @ResponseBody
    public String testRestGet(@PathVariable("id") Integer id){
        System.out.println("rest 风格的GET请求..........id=" +id);
        return SUCCEED;
    }

    @RequestMapping(value="/testRestPost",method=RequestMethod.POST)
    public String testRestPost(){
        System.out.println("rest 风格的POST请求.......... ");
        return SUCCEED;
    }
}
