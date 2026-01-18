package PersonWithMap;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("contextPerson.xml");

        NotificationService notificationService = context.getBean("notificationService", NotificationService.class);
        notificationService.printNotification();
    }
}
