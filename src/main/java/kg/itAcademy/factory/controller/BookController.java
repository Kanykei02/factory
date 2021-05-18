package kg.itAcademy.factory.controller;

import kg.itAcademy.factory.service.BookRegistry;
import kg.itAcademy.factory.service.LogsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book-service")
public class BookController {
    @Autowired
    private BookRegistry bookRegistry;
    @Autowired
    private LogsService logsService;

    @GetMapping("/{code}")
    public String bookProcces(@RequestBody String code){
        String response = "";
        response = bookRegistry.getServiceBean(code).getInfo();
        System.out.println(response);
        logsService.save(code);
        return response;
    }
}
