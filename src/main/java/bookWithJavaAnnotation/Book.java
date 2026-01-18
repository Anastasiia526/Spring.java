package bookWithJavaAnnotation;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class Book {
    private String title;
    private String author;
    private int pages;
    double price;

    public Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void init(){
        System.out.println("The book costs 347 UAH");
    }
}
