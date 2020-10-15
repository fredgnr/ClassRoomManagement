package App;

import java.io.Serializable;
import java.util.Date;

public class Application implements Serializable {
    public int AppId;
    public int StudentID;
    public int ClassRoomID;
    public Date DemandTime;
    public int Priority;
    public String Message;

    public int getAppId() {
        return AppId;

    }

    public void setAppId(int appId) {
        AppId = appId;
    }

    public int getStudentID() {
        return StudentID;
    }

    public void setStudentID(int studentID) {
        StudentID = studentID;
    }

    public int getClassRoomID() {
        return ClassRoomID;
    }

    public void setClassRoomID(int classRoomID) {
        ClassRoomID = classRoomID;
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
                "AppId=" + AppId +
                ", StudentID=" + StudentID +
                ", ClassRoomID=" + ClassRoomID +
                ", DemandTime=" + DemandTime +
                ", Priority=" + Priority +
                ", Message='" + Message + '\'' +
                '}';
    }

}
