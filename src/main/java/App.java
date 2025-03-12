import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        // Получаем бин HelloWorld
        HelloWorld helloWorldBean1 = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld helloWorldBean2 = (HelloWorld) applicationContext.getBean("helloworld");

        // Сравниваем два экземпляра HelloWorld
        System.out.println("Comparing HelloWorld beans:");
        System.out.println("Are both HelloWorld beans the same instance? " + (helloWorldBean1 == helloWorldBean2));

        System.out.println("Message from HelloWorld bean 1: " + helloWorldBean1.getMessage());
        System.out.println("Message from HelloWorld bean 2: " + helloWorldBean2.getMessage());

        // Получаем бин Cat дважды
        Cat firstCat = (Cat) applicationContext.getBean("cat");
        Cat secondCat = (Cat) applicationContext.getBean("cat");

        // Сравниваем два экземпляра Cat
        System.out.println("\nComparing Cat beans:");
        System.out.println("Are both Cat beans the same instance? " + (firstCat == secondCat));

        System.out.println("First Cat: " + firstCat);
        System.out.println("Second Cat: " + secondCat);
    }
}