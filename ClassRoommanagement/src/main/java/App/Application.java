package App;

import sun.security.jca.GetInstance;

import java.io.Serializable;
import java.util.Date;

public class Application implements Serializable {
    public String AppID;
    public String StudentID;
    public String ClassroomID;
    public Date DemandTime;
    public int Priority;
    public String Message;

    public String getAppID() {
        return AppID;
    }

    public void setAppID(String appID) {
        AppID = appID;
    }

    public String getStudentID() {
        return StudentID;
    }

    public void setStudentID(String studentID) {
        StudentID = studentID;
    }

    public String getClassroomID() {
        return ClassroomID;
    }

    public void setClassroomID(String classRoomID) {
        ClassroomID = classRoomID;
    }

    public Date getDemandTime() {
        return DemandTime;
    }

    public void setDemandTime(Date demandTime) {
        DemandTime = demandTime;
    }

    public int getPriority() {
        return Priority;
    }

    public void setPriority(int priority) {
        Priority = priority;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }

    @Override
    public String toString() {
        return "Application{" +
                "AppId=" + AppID +
                ", StudentID=" + StudentID +
                ", ClassRoomID=" + ClassroomID +
                ", DemandTime=" + DemandTime +
                ", Priority=" + Priority +
                ", Message='" + Message + '\'' +
                '}';
    }

}
