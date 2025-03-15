import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld helloWorld1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(helloWorld1.getMessage());
        HelloWorld helloWorld2 = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(helloWorld1==helloWorld2);

        Cat cat1= (Cat) applicationContext.getBean("cat");
        System.out.println(cat1.getName());

        Cat cat2= (Cat) applicationContext.getBean("cat");

        System.out.println(cat1==cat2);

    }
}