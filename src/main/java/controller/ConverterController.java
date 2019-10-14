package controller;

import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import pojo.Role;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * Author: 于锦江
 * Date: 2019/6/28
 * Time: 20:15
 */
@Controller
public class ConverterController {


    @RequestMapping("/addRole")
    @ResponseBody
    public Map<String,Role> addRole(@RequestParam("role") Role role){
        Map<String,Role> map=new HashMap<>(0);
        map.put(role.getId().toString(),role);
        return map;
    }
}
