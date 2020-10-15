package USER;

import App.Application;
import utils.IApplication;
import utils.ICheckList;
import utils.IFeedBack;
import utils.ILog;

import java.io.Serializable;

public class User implements IApplication, ICheckList, IFeedBack, ILog, Serializable {
    private  String StudentID;
    private String StudentName;
    private String StudentPassWord;

    public String getStudentID() {
        return StudentID;
    }

    public void setStudentID(String studentId) {
        StudentID = studentId;
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
        if(account.equals(StudentID)&&password.equals(StudentPassWord))
            return true;
        else return false;
    }

    @Override
    public boolean logout() {
        return false;
    }

    @Override
    public String toString() {
        return "User{" +
                "StudentID='" + StudentID + '\'' +
                ", StudentName='" + StudentName + '\'' +
                ", StudentPassWord='" + StudentPassWord + '\'' +
                '}';
    }
}
