package by.itacademy.stetsko.service;

import by.itacademy.stetsko.dao.UserDao;
import by.itacademy.stetsko.entity.User;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class UserService {
    private static final UserDao INSTANCE = new UserDao();

    public List<User> findAll() {
        return UserDao.getInstance().findAll();
    }

    public static UserService getInstance() {
        return INSTANCE;
    }
}

