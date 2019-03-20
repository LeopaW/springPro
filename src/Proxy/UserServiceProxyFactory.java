package Proxy;

import service.UserService;
import service.UserServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class UserServiceProxyFactory implements InvocationHandler {

    private UserService us;

    public UserServiceProxyFactory(UserService us) {
        this.us = us;
    }

    public UserService getUserServiceProxy(){

        UserService usProxy = (UserService) Proxy.newProxyInstance(UserServiceImpl.class.getClassLoader()
                , UserServiceImpl.class.getInterfaces(), this
        );
        return usProxy;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("打开事务");
        Object invoke = method.invoke(us, args);//需要一个方法所在的对象
        System.out.println("关闭事务");
        return invoke;
    }
}
