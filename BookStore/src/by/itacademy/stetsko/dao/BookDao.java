package by.itacademy.stetsko.dao;

import by.itacademy.stetsko.connection.ConnectionPool;
import by.itacademy.stetsko.entity.Book;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class BookDao {

    private static final BookDao INSTANCE = new BookDao();

    private static final String FIND_ALL = "SELECT id, title FROM book_storage.book";

    public List<Book> findAll() {
        List<Book> books = new ArrayList<>();
        try (Connection connection = ConnectionPool.getConnection();
             Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(FIND_ALL);
            while (resultSet.next()) {
                Book book = Book.builder()
                        .id(resultSet.getInt("id"))
                        .title(resultSet.getString("title"))
                        .author(resultSet.getString("author"))
                        .genre_name(resultSet.getString("genre_name"))
                        .description(resultSet.getString("description"))
                        .pages(resultSet.getInt("pages"))
                        .price(resultSet.getDouble("price"))
                        .build();
                books.add(book);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return books;
    }

    public static BookDao getInstance() {
        return INSTANCE;
    }
}
