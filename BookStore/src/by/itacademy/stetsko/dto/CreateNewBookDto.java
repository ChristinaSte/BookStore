package by.itacademy.stetsko.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateNewBookDto {
    private String title;
    private String author;
    private String genre_name;
    private String description;
    private int pages;
    private int publication_date;
    private double price;
}
