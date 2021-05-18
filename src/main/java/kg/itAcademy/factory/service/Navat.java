package kg.itAcademy.factory.service;

import kg.itAcademy.factory.dto.Book;
import org.springframework.stereotype.Service;

@Service("Navat")
public class Navat implements BookService{
    @Override
    public String getBook(Book book) {
        return book.getName() + ", " + book.getAdress() + ", " + book.getSignatureDish() + ", " + book.getWebsite();
    }

    @Override
    public String getInfo() {
        return null;
    }
}
