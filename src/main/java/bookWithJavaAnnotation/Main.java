package bookWithJavaAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Book book = context.getBean("book", Book.class);
        System.out.print("The book " + book.getTitle() + " by " + book.getAuthor() + " has " + book.getPages() + " pages");
    }
}
