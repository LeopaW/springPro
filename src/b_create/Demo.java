package b_create;

import bean.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

    @Test
    //创建方式1：空参构造
    public void fun1(){

        //1.首先创建容器对象。
        ApplicationContext ac = new ClassPathXmlApplicationContext("b_create/applicationContext.xml");
        //2.向容器“要”user对象
        //User u = (User) ac.getBean("user");
        //3.打印user对象
        //System.out.println(u);

    }
    @Test
    //创建方式2：静态工厂
    public void fun2(){

        //1.首先创建容器对象。
        ApplicationContext ac = new ClassPathXmlApplicationContext("b_create/applicationContext.xml");
        //2.向容器“要”user对象
        User u = (User) ac.getBean("user2");
        //3.打印user对象
        System.out.println(u);

    }
    @Test
    //创建方式3：实例工厂
    public void fun3(){

        //1.首先创建容器对象。
        ApplicationContext ac = new ClassPathXmlApplicationContext("b_create/applicationContext.xml");
        //2.向容器“要”user对象
        User u = (User) ac.getBean("user3");
        //3.打印user对象
        System.out.println(u);

    }
    @Test
    //scope:singleton
    //scope:prototype
    public void fun4(){

        //1.首先创建容器对象。
        ApplicationContext ac = new ClassPathXmlApplicationContext("b_create/applicationContext.xml");
        //2.向容器“要”user对象
        User u = (User) ac.getBean("user");
        User u2 = (User) ac.getBean("user");
        User u3 = (User) ac.getBean("user");
        User u4 = (User) ac.getBean("user");
        //3.打印user对象
        System.out.println(u==u2);//prototype 多例 结果为false
                                    //singleton 单例 结果为true

    }
    @Test
    //测试生命周期方法
    public void fun5(){

        //1.首先创建容器对象。
        ApplicationContext ac = new ClassPathXmlApplicationContext("b_create/applicationContext.xml");
        //2.向容器“要”user对象
        User u = (User) ac.getBean("user");
        //3.打印user对象
        System.out.println(u);
        //关闭容器，触发销毁方法
        ((ClassPathXmlApplicationContext) ac).close();

    }
}
