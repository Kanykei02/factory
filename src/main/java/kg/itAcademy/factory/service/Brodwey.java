package kg.itAcademy.factory.service;

import kg.itAcademy.factory.dto.Book;
import org.springframework.stereotype.Service;

@Service("Brodwey")
public class Brodwey implements BookService{
    @Override
    public String getBook(Book book) {
        return book.getName() + ", " + book.getCapacity() + ", " + book.getAdress() + ", " + book.getWebsite();
    }

    @Override
    public String getInfo() {
        return null;
    }
}
