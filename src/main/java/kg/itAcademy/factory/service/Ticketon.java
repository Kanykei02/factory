package kg.itAcademy.factory.service;

import kg.itAcademy.factory.dto.Book;
import org.springframework.stereotype.Service;

@Service("Ticketon")
public class Ticketon implements BookService{
    @Override
    public String getBook(Book book) {
        return book.getName() + ", " + book.getWebsite() + ", " + book.getFee();
    }

    @Override
    public String getInfo() {
        return null;
    }
}
