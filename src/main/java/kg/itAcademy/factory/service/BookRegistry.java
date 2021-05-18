package kg.itAcademy.factory.service;

public interface BookRegistry {
    BookService getServiceBean(String serviceName);
}
