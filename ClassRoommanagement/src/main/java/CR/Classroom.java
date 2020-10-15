package CR;

import java.io.Serializable;

public class Classroom implements Serializable {
    static enum roomtype{teaching,lab,administative,library}
    private int ClassRoomID;
    private int ClassRoomCapacity;
    private String ClassRoomBuilding;
    private roomtype ClassRoomCatelog;

    public int getClassRoomID() {
        return ClassRoomID;
    }

    public void setClassRoomID(int classRoomID) {
        ClassRoomID = classRoomID;
    }

    public int getClassRoomCapacity() {
        return ClassRoomCapacity;
    }

    public void setClassRoomCapacity(int classRoomCapacity) {
        ClassRoomCapacity = classRoomCapacity;
    }

    public String getClassRoomBuilding() {
        return ClassRoomBuilding;
    }

    public void setClassRoomBuilding(String classRoomBuilding) {
        ClassRoomBuilding = classRoomBuilding;
    }

    public roomtype getClassRoomCatelog() {
        return ClassRoomCatelog;
    }

    public void setClassRoomCatelog(roomtype classRoomCatelog) {
        ClassRoomCatelog = classRoomCatelog;
    }
}
