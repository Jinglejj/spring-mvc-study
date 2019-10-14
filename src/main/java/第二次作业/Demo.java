package 第二次作业;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.Metting;

public class Demo {


    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-config.xml");
        Metting metting=(Metting)applicationContext.getBean("metting");
        System.out.println("会议主题： "+metting.getTheme());
        metting.getBoosList().forEach(System.out::println);
    }
}
