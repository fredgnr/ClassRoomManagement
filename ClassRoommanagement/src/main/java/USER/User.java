package USER;

import App.Application;
import util.IApplication;
import util.ICheckList;
import util.IFeedBack;
import util.ILog;

public class User implements IApplication, ICheckList, IFeedBack, ILog {
    private  int StudentId;
    private String StudentName;
    private String StudentPassWord;

    public int getStudentId() {
        return StudentId;
    }

    public void setStudentId(int studentId) {
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
    public boolean login() {
        return false;
    }

    @Override
    public boolean logout() {
        return false;
    }
}
