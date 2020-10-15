package utils.database;

import App.Application;
import USER.User;

import java.util.List;

public interface IUserDao {
    public List<User> findall();

    public Application findbyName(String studentname);

    public Application findByStuId(String studentid);

    public void deleteuser(User user);

    public void addUser(User user);
}
