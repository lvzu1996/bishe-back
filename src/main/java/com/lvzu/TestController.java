package com.lvzu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lvzu
 * @version 1.0, 2017/12/6
 */
@Controller
//@RequestMapping(value="/api")
public class TestController {

    @Autowired
    private TestService testService;

    public final static String SUCCEED="show";


    @RequestMapping(value="/testRestGet/{id}",method= RequestMethod.GET, produces = "application/json;charset=utf-8")
    @ResponseBody
    public Map<String, String> testRestGet(@PathVariable("id") Integer id){
        testService.test();
        System.out.println("rest 风格的GET请求..........id=" +id);
        Map<String, String> map = new HashMap<String,String>();
        map.put("success", "true");
        map.put("data", id.toString());
        return map;
    }

    @RequestMapping(value="/testRestPost",method=RequestMethod.POST)
    public String testRestPost(){
        System.out.println("rest 风格的POST请求.......... ");
        return SUCCEED;
    }
}
