package EXAM2.MODEL;

public class ClassRoom {
    public static int idx = 0;
    private String className;
    private String teacherName;
    private  int idClass;

    public int getIdClass() {
         return idClass;
    }

    public void setIdClass(int idClass) {
        this.idClass = idClass;
    }

    public ClassRoom(String className, String teacherName) {
        idx++;
        this.idClass=idx;
        System.out.println("id class " + idClass);
        this.className = className;
        this.teacherName = teacherName;
    }
    public ClassRoom() {
    }
    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    @Override
    public String toString() {
        return
                "className='" + className ;
    }
}
