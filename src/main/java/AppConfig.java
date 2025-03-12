import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
 
    @Bean(name="helloworld")
    public HelloWorld getHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello World!");
        return helloWorld;
    }

    @Bean(name="cat")
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) // Создание нового экземпляра при каждом запросе
    public Cat getCat() {
        // Можно настроить создание объекта Cat с конкретными параметрами
        return new Cat("Мурзик", 3, "Мейн-кун"); // Пример значений
    }
}