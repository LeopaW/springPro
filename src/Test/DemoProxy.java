package Test;

import Proxy.UserServiceProxyFactory;
import Proxy.UserServiceProxyFactory2;
import org.junit.jupiter.api.Test;
import service.UserService;
import service.UserServiceImpl;

public class DemoProxy {

    @Test
    //动态代理
    public void fun1(){
        UserServiceProxyFactory factory = new UserServiceProxyFactory(new UserServiceImpl());
        UserService usProxy = factory.getUserServiceProxy();
        usProxy.save();

        //代理对象与被代理对象实现了相同的接口
        //代理对象与被代理对象没有继承关系
        System.out.println(usProxy instanceof UserServiceImpl);//false
    }

    @Test
    //cglib代理
    public void fun2(){
        UserServiceProxyFactory2 factory2 = new UserServiceProxyFactory2();

        UserService usProxy = factory2.getUserServiceProxy();

        usProxy.save();

        //判断代理对象是否属于被代理对象类型
        //代理对象继承了被代理对象=>true
        System.out.println(usProxy instanceof UserServiceImpl);
    }
}
