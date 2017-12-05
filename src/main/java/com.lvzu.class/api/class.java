package com.lvzu.class

@Controller
@RequestMapping(value="/api")
public class RestService {

    public final static String SUCCEEDD="show";


    @RequestMapping(value="/testRestGet/{id}",method=RequestMethod.GET)
    public String testRestGet(@PathVariable("id") Integer id){
        System.out.println("rest 风格的GET请求..........id=" +id);
        return SUCCEEDD;
    }

    @RequestMapping(value="/testRestPost",method=RequestMethod.POST)
    public String testRestPost(){
        System.out.println("rest 风格的POST请求.......... ");
        return SUCCEEDD;
    }



}
