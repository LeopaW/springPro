package d_springAop;

import bean.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import service.UserService;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)//帮我们创建容器
//指定创建容器时使用哪个配置文件
@ContextConfiguration("classpath:d_springAop/applicationContext.xml")
public class Demo3 {
    //将名为user2的对象注入到user2变量中
    @Resource(name = "userService")
    private UserService u;

    @Test
    public void fun1(){

        u.save();
    }

}
