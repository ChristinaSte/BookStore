package by.itacademy.stetsko.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Book {

    private int id;
    private String title;
    private String author;
    private String genre_name;
    private String description;
    private int pages;
    private int publication_date;
    private double price;
}

