package USER;

import App.Application;
import util.IApplication;
import util.ICheckList;
import util.IFeedBack;
import util.ILog;

public class SuperUser implements IApplication, ICheckList, IFeedBack, ILog {
    private int SuperUserId;
    private int SuperUserPassword;

    public void setSuperUserId(int superUserId) {
        SuperUserId = superUserId;
    }

    public void setSuperUserPassword(int superUserPassword) {
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
    public boolean login() {
        return false;
    }

    @Override
    public boolean logout() {
        return false;
    }
}
