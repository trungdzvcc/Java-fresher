package EXAM2;

import EXAM2.CONTROLLER.StudentController;
import EXAM2.VIEW.ViewStudent;

public class Main {

    public static void main(String[] args) {
        ViewStudent view = new ViewStudent();
        StudentController controller = new StudentController(view);
        controller.enterStudent();
        }
}
