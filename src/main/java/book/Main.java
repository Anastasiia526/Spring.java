package book;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("contextBook.xml");
        Book book = context.getBean("book", Book.class);

        System.out.print("The book " + book.getTitle() + " by " + book.getAuthor() + " has " + book.getPages() + " pages and costs ");
        book.init();

    }
}
