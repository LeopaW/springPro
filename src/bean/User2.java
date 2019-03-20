package bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

@Component("user2")
@Service("user2")//功能都一样，就是区分层的   service层
@Controller("user2")//web层
@Repository("user2")//dao层
//指定对象的作用范围
@Scope(scopeName = "singleton")
//<bean name="user2" class="bean.User2"/>
public class User2 {
    @Value("tom")
    private String name;
    @Value("18")
    private Integer age;
//    @Autowired//自动装配 指定属性名可以获得相应对象
//    @Qualifier("car2")//也可以配置一个@Qualifier注解告诉spring容器自动装配哪个名称的对象
    @Resource(name = "car3")//手动注入，指定注入哪个名称的对象
    private Car2 car2;

    @PostConstruct  //在对象被创建后调用，init-method
    public void init(){
        System.out.println("初始化方法");
    }
    @PreDestroy//对象销毁之前调用的， destory-method
    public void destory(){
        System.out.println("销毁方法");
    }

    public User2() {
        System.out.println("user2空参构造");
    }

    public Car2 getCar() {
        return car2;
    }

    public void setCar(Car2 car2) {
        this.car2 = car2;
    }

    public String getName() {
        return name;
    }

//    @Value("tom") 这样也是可以  一个通过反射的Field赋值(破坏了封装性)，这个是set方法赋值(推举使用)
    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", car=" + car2 +
                '}';
    }
}
