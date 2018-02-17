package repository;

import model.User;

public interface IUserRepository {
    User getUser(long userId);
    User getUser(String userName);
    boolean updateUser(long userId,User user);
    boolean deleteUser(long userId);
}
