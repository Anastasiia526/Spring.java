package bookWithJavaAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean(initMethod = "init")
    public Book book() {
        Book book = new Book("Тіні забутих предків", 260);
        book.setAuthor("Михайло Коцюбинський");
        return book;
    }


}
