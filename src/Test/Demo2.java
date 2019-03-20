package Test;

import bean.User2;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)//帮我们创建容器
//指定创建容器时使用哪个配置文件
@ContextConfiguration("classpath:applicationContext.xml")
public class Demo2 {

    @Test
    public void fun1(){

        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        User2 user2 = (User2) ac.getBean("user2");
        System.out.println(user2);

        ((ClassPathXmlApplicationContext) ac).close();
    }

}
