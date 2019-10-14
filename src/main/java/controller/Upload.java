package controller;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;

/**
 * Created by IntelliJ IDEA.
 * Author: 于锦江
 * Date: 2019/6/26
 * Time: 19:13
 */
@Controller
public class Upload {


    @Bean(name = "multipartResolver")
    public MultipartResolver initMultipartResolver(){
        return new StandardServletMultipartResolver();
    }

}
