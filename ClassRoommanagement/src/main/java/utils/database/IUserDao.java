package utils.database;

import App.Application;
import USER.User;

import java.util.List;

public interface IUserDao {
    public List<User> findall();

    public User findbyName(String studentname);

    public User findByStuId(String studentid);

    public void deleteuser(User user);

    public void addUser(User user);
}
