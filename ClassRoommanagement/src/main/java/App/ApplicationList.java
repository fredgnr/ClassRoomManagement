package App;


import java.util.ArrayList;
import java.util.List;

public class ApplicationList {
    public List<Application> applicationList;
    public ApplicationList() {
        applicationList=new ArrayList<>();
    }
    public void AddApplication(Application application){
        applicationList.add(application);
    }
    public void deleteApplication(Application application){
        applicationList.remove(application);
    }
}
