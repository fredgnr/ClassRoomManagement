package USER;

import App.Application;
import utils.IApplication;
import utils.ICheckList;
import utils.IFeedBack;
import utils.ILog;

import java.io.Serializable;

public class User implements IApplication, ICheckList, IFeedBack, ILog, Serializable {
    private  String StudentId;
    private String StudentName;
    private String StudentPassWord;

    public String getStudentId() {
        return StudentId;
    }

    public void setStudentId(String studentId) {
        StudentId = studentId;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public String getStudentPassWord() {
        return StudentPassWord;
    }

    public void setStudentPassWord(String studentPassWord) {
        StudentPassWord = studentPassWord;
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
        if(account.equals(StudentId)&&password.equals(StudentPassWord))
            return true;
        else return false;
    }

    @Override
    public boolean logout() {
        return false;
    }
}
