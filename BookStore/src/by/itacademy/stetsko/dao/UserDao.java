package by.itacademy.stetsko.dao;

import by.itacademy.stetsko.connection.ConnectionPool;
import by.itacademy.stetsko.entity.User;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class UserDao {
    private static final UserDao INSTANCE = new UserDao();

    private static final String FIND_ALL = "SELECT id, name FROM book_storage.users";

    public List<User> findAll() {
        List<User> abilities = new ArrayList<>();
        try (Connection connection = ConnectionPool.getConnection();
             Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(FIND_ALL);
            while (resultSet.next()) {
                User user = User.builder()
                        .id(resultSet.getLong("id"))
                        .first_name(resultSet.getString("first name"))
                        .last_name (resultSet.getString("last name"))
                        .email (resultSet.getString("e-mail"))
                        .password (resultSet.getString("password"))
                        .build();
                abilities.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return abilities;
    }

    public static UserDao getInstance() {
        return INSTANCE;
    }
}

