package CR;

import java.util.ArrayList;
import java.util.List;

public class ClassroomList {
    public List<Classroom> classroomList;

    public ClassroomList() {
        classroomList=new ArrayList<>();
    }
    public void addClassroom(Classroom classroom){
        classroomList.add(classroom);
    }

    public void deleteClassroom(Classroom classroom){
        classroomList.remove(classroom);
    }
}
