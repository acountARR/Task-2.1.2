import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld beanHW1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(beanHW1.getMessage());

        HelloWorld beanHW2 = (HelloWorld) applicationContext.getBean("helloworld");

        Cat catBean1 = (Cat) applicationContext.getBean("cat");
        Cat catBean2 = (Cat) applicationContext.getBean("cat");

        boolean comparisonHW = beanHW1 == beanHW2;
        boolean comparisonCat = catBean1 == catBean2;

        System.out.println(comparisonHW + " - результат сравнения HelloWorld");
        System.out.println(comparisonCat + " - результат сравнения Cat");
    }
}