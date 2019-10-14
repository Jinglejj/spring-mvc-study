package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pojo.Role;

/**
 * Created by IntelliJ IDEA.
 * Author: 于锦江
 * Date: 2019/6/22
 * Time: 13:38
 */
@Controller
@RequestMapping("role")
public class MyController {

    @Autowired
    @Qualifier("role1")
    private  Role role;

    @RequestMapping("demo")
    public String demo(){
        return "index";
    }

    @RequestMapping("test")
    @ResponseBody
    public Role role(){
        return role;
    }

}
