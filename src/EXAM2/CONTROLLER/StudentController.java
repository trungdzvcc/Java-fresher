package EXAM2.CONTROLLER;

import EXAM2.MODEL.ClassRoom;
import EXAM2.MODEL.Student;
import EXAM2.VIEW.ViewStudent;
import EXAM2.Interface.interfaceStudent;

import java.text.ParseException;
import java.util.*;

public class StudentController implements interfaceStudent {
    public ViewStudent view = new ViewStudent();
    List<ClassRoom> classRoomList = new ArrayList<ClassRoom>();
    List<EXAM2.MODEL.Student> studentList = new ArrayList<Student>();
    public static Scanner scanner = new Scanner(System.in);

    //constructor
    public StudentController(ViewStudent view) {
    }

    //check is number
    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }


    @Override
    public void enterStudent() {
        Scanner scanner = new Scanner(System.in);
        String choose = null;
        boolean exit = false;

        ClassRoom room1 = new ClassRoom("1A", "Nguyen Thi Huyen");
        ClassRoom room2 = new ClassRoom("1B", "Nguyen Thi Thom");
        ClassRoom room3 = new ClassRoom("1C", "Nguyen Thi Lan");
        classRoomList.add(room1);
        classRoomList.add(room2);
        classRoomList.add(room3);

        while (true) {
            view.showMenu();
            choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    try {
                        setStudentInfo();
                        break;
                    } catch (ParseException e) {
                        throw new RuntimeException(e);
                    }
                case "2":
                    getStudentInfo();
                    break;
                case "3":
                    editStudent();
                    break;
                case "4":
                    deleteStudent();
                    break;
                case "5":
                    System.out.print("\n" + searchStudentByName());
                    System.out.println();
                    break;
                case "6":
                    sortByNameStudent();
                    for (Student st : studentList) {
                        System.out.println(st);
                    }
                    break;
                case "7":
                    searchStudentByBirthDay();
                    for (Student st : studentList) {
                        System.out.println(st);
                    }

                    break;
                case "0":
                    System.out.println("exited!");
                    exit = true;
                    break;
                default:
                    System.out.println("invalid! please choose action in below menu:");
                    break;
            }
            if (exit) {
                break;
            }
        }
    }

    @Override
    public void getStudentInfo() {
        for (EXAM2.MODEL.Student student : studentList) {
            System.out.println(student.toString());
        }
    }

    @Override
    public void editStudent() {
        System.out.print("Enter the id of element edit :");
        int id = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getIdStudent() == id) {
                boolean checkEnter = true;
                do {
                    System.out.print("\nFull Name: ");
                    String name = scanner.nextLine();
                    if (StudentController.isNumeric(name)) {
                        System.out.print(" Full name Cannot enter by number: ");
                        checkEnter = false;
                        continue;
                    } else if (!StudentController.isNumeric(name)) {
                        System.out.print("day: ");
                        int day = scanner.nextInt();
                        scanner.nextLine();
                        if (day <= 0 || day > 32) {
                            System.out.print(" 0 <day <32");
                            checkEnter = false;
                            continue;
                        }
                        System.out.print("month: ");
                        int month = scanner.nextInt();
                        scanner.nextLine();
                        if (month <= 0 || month > 12) {
                            System.out.print(" 0 <month <13");
                            checkEnter = false;
                            continue;
                        }
                        System.out.print("year: ");
                        int year = scanner.nextInt();
                        scanner.nextLine();
                        if (year <= 0) {
                            System.out.print(" 0 <year");
                            checkEnter = false;
                            continue;
                        }
                        String dateBirthDay = day + "/" + month + "/" + year;
                        studentList.get(i).setFullName(name);
                        studentList.get(i).setBirthDay(dateBirthDay);
                        checkEnter = true;
                        System.out.print("Successfully");
                    } else {
                        System.out.println("Cannot find id :");
                    }
                } while (checkEnter == false);
            }
        }
    }

    public void setStudentInfo() throws ParseException {
        System.out.println("List class room:");
        for (ClassRoom classroom : classRoomList) {
            System.out.println("ID :" + classroom.getIdClass() + " | Class Name : " + classroom.getClassName() + " | Teacher :" + classroom.getTeacherName());
        }
        int n;
        int day = 0;
        int month = 0;
        int year = 0;
        do {
            System.out.print("Enter the number of students: ");
            n = scanner.nextInt();
            if (n <= 0) {
                System.out.println("You must enter a number  >0 ");
                continue;
            }
            scanner.nextLine();
            int i = 0;
            int count = 0;
            while (i < n) {
                Student st = new Student();
                System.out.print("\nStudent " + (i + 1) + " :");
                System.out.print("\nFull Name: ");
                String name = scanner.nextLine();
                if (StudentController.isNumeric(name)) {
                    System.out.print(" Full name Cannot enter by number: ");
                    continue;
                } else if (!StudentController.isNumeric(name)) {
                    System.out.print("day: ");
                    day = scanner.nextInt();
                    scanner.nextLine();
                    if (day <= 0 || day > 32) {
                        i = count;
                        System.out.print(" 0 <day <32");
                        continue;
                    }
                    System.out.print("month: ");
                    month = scanner.nextInt();
                    scanner.nextLine();
                    if (month <= 0 || month > 12) {
                        System.out.print(" 0 <month <13");
                        i = count;
                        continue;
                    }
                    System.out.print("year: ");
                    year = scanner.nextInt();
                    scanner.nextLine();
                    if (year < 1950) {
                        System.out.print(" 1950 <year");
                        i = count;
                        continue;
                    }
                    String dateBirthDay = day + "/" + month + "/" + year;
                    st.setFullName(name);
                    st.setBirthDay(dateBirthDay);
                    int choose = 0;
                    System.out.println("1:  1A");
                    System.out.println("2:  1B");
                    System.out.println("3:  1C");
                    System.out.println("Choose a Class Room: ");
                    choose = scanner.nextInt();
                    scanner.nextLine();
                    switch (choose) {
                        case 1:
                            st.setClassRoom(classRoomList.get(0));
                            System.out.println("Successfully");
                            break;
                        case 2:
                            st.setClassRoom(classRoomList.get(1));
                            System.out.println("Successfully");
                            break;
                        case 3:
                            st.setClassRoom(classRoomList.get(2));
                            System.out.println("Successfully");
                            break;
                        default:
                            System.out.println("Invalid choice");
                            break;
                    }
                    studentList.add(st);
                    count++;
                }
                i = count;
            }
        } while (n <= 0);
    }

    @Override
    public void deleteStudent() {
        System.out.print("Enter the id of element delete :");
        int id = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getIdStudent() == id) {
                studentList.remove(i);
                System.out.print("Successfully");
            } else {
                System.out.print("Cannot find id");
            }
        }
    }

    @Override
    public List<Student> searchStudentByName() {
        List<Student> searchNameList = new ArrayList<>();
        System.out.print("\nFull Name: ");
        String name = scanner.nextLine();
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getFullName().toLowerCase().equals(name.toLowerCase())) {
                searchNameList.add(studentList.get(i));
            }
        }
        if (searchNameList == null) {
            System.out.println("Cannot find name");
        }
        return searchNameList;
    }


    @Override
    public void sortByNameStudent() {
        Collections.sort(studentList, new SortByName());
    }

    @Override
    public void searchStudentByBirthDay() {
        Collections.sort(studentList, new SortByYear());
    }
}
