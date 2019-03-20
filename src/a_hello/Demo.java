package a_hello;

import bean.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

    @Test
    public void fun1(){

        //1.首先创建容器对象。
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2.向容器“要”user对象
        User u = (User) ac.getBean("user");
        //3.打印user对象
        System.out.println(u);

    }
}
