package EXAM2.VIEW;
import EXAM2.CONTROLLER.StudentController;
import EXAM2.MODEL.ClassRoom;
import EXAM2.MODEL.Student;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ViewStudent {

    public void showMessage(String smg) {
        System.out.println(smg);
    }
    public static void showMenu() {
        System.out.println("-----------menu------------");
        System.out.println("1. Nhap hoc sinh vao cac lop");
        System.out.println("2. In ra danh sach hoc sinh cua cac lop 1A,B,C");
        System.out.println("3. Sua hoc sinh theo ID");
        System.out.println("4. Xoa hoc sinh theo ID");
        System.out.println("5. Tim kiem theo ten da nhap");
        System.out.println("6. In ra danh sach sap xep theo ten");
        System.out.println("7. In ra danh sach theo nam sinh nhap vao");
        System.out.println("0. exit.");
        System.out.println("---------------------------");
        System.out.print("Please choose: ");
    }



}
