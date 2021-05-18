package kg.itAcademy.factory.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;


@Data
@AllArgsConstructor
@Builder
public class Book {
    private String name;
    private String adress;
    private String website;
    private String signatureDish;
    private Long capacity;
    private BigDecimal fee;

    private static Book instance;

    private Book(){}

    public static Book getInstance(){
        if (instance == null){
            instance = new Book();
        }
        return instance;
    }
}
