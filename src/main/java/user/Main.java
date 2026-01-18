package user;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        User user = context.getBean(User.class);

        System.out.println("User name: " + user.getName() + ", gender: " + user.getGender() + ", age: " + user.getAge() + ", status: " + user.getStatus());

    }
}
