package c_injection;

import bean.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

    @Test
    public void fun1(){

        //1.首先创建容器对象。
        ApplicationContext ac = new ClassPathXmlApplicationContext("c_injection/applicationContext.xml");
        //2.向容器“要”user对象
        User u = (User) ac.getBean("user4");
        //3.打印user对象
        System.out.println(u);

    }
    @Test
    public void fun2(){

        //1.首先创建容器对象。
        ApplicationContext ac = new ClassPathXmlApplicationContext("c_injection/applicationContext.xml");
        //2.向容器“要”user对象
        CollectionBean cb = (CollectionBean) ac.getBean("cb");
        //3.打印user对象
        System.out.println(cb);

    }
}
