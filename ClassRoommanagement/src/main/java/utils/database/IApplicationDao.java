package utils.database;

import App.Application;

import java.util.List;

public interface IApplicationDao {
    public List<Application> findall();

    public Application findbyAppId(String appid);

    public Application findByStuId(String studentid);

    public void deleteApp(Application application);

    public void addApp(Application application);
}
