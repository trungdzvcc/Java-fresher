package StudentManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListArray listArray = new ListArray();
        int luachon =0;
        do{

            System.out.println("" +
                    "Nhập Họ và tên học sinh bị trùng thì thêm A, B vào tên VD Nguyễn Văn Ninh A, Nguyễn Văn Ninh B\n" +
                    "\n" +
                    "- In ra danh sách học sinh được sắp xếp theo tên và tuổi\n" +
                    "\n" +
                    "- Xóa Học sinh theo mã học sinh được nhập vào\n" +
                    "\n" +
                    "- Cho phép sửa học sinh khi nhập vào mã học sinh.\n" +
                    "\n" +
                    "- Cho phép nhập điểm của học sinh và ghi điểm ra file format (Nguyễn Văn Ninh 8");
            System.out.println("chon :");
            luachon = scanner.nextInt();
            scanner.nextLine();
            switch(luachon)
            {
                case 1:


                    System.out.print("nhap msv");
                    String Msv = scanner.nextLine();
                        System.out.print("nhap name");
                        String names = scanner.nextLine();
                    System.out.print("nhap dia chi");
                    String diachi = scanner.nextLine();
                    Student st = new Student(Msv, names , diachi);
                    listArray.addStudent(st);
                case 2:
                    listArray.print();
                    break;
                case 7:
                    System.out.println("Today is Sunday");
                    break;
                default:
                    System.out.println("Looking forward to the Weekend");

            }


        }while (luachon!=0);
    }
}
