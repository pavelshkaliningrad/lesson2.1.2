import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld beanHelloworld1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld beanHelloworld2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        Cat beanCat1 =
                (Cat) applicationContext.getBean("cat");
        Cat beanCat2 =
                (Cat) applicationContext.getBean("cat");
        System.out.println(beanHelloworld1.equals(beanHelloworld2));
        System.out.println(beanCat1.equals(beanCat2));
    }
}