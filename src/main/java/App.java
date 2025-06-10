import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld bean1 = (HelloWorld) context.getBean("helloWorld");
        HelloWorld bean2 = (HelloWorld) context.getBean("helloWorld");

        Cat cat1 = (Cat) context.getBean("cat");
        Cat cat2 = (Cat) context.getBean("cat");

        System.out.println("HelloWorld beans equal: " + (bean1 == bean2));
        System.out.println("Cat beans equal: " + (cat1 == cat2));
    }
}