package USER;

import App.Application;
import utils.IApplication;
import utils.ICheckList;
import utils.IFeedBack;
import utils.ILog;

public class SuperUser implements IApplication, ICheckList, IFeedBack, ILog {
    private String SuperUserId;
    private String SuperUserPassword;

    public void setSuperUserId(String superUserId) {
        SuperUserId = superUserId;
    }

    public void setSuperUserPassword(String superUserPassword) {
        SuperUserPassword = superUserPassword;
    }

    @Override
    public void CommitApplication(Application application) {

    }

    @Override
    public void DeleteApplication(Application application) {

    }

    @Override
    public void checklist() {

    }

    @Override
    public void CommitFeedBack() {

    }

    @Override
    public void CheckFeedBack() {

    }

    @Override
    public boolean login(String account, String password) {
       if(account.equals(SuperUserId)&&password.equals(SuperUserPassword))
           return true;
       else return false;
    }

    @Override
    public boolean logout() {
        return false;
    }
}
