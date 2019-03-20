package Test;


import bean.User;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContext;

public class Demo extends ActionSupport {


    public static void main(String[] args){
        //获得spring容器，从application域获得即可

        //1.获得servletContext对象
        ServletContext sc = ServletActionContext.getServletContext();
        //2.从sc中获得ac容器
        WebApplicationContext ac = WebApplicationContextUtils.getWebApplicationContext(sc);
        //3.从容器中获得对象
//        User user = (User) ac.getBean("user");
//        System.out.println(user);
    }
}
