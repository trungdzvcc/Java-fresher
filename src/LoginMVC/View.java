package LoginMVC;

import java.util.Scanner;

public class View {
    public static Scanner scanner = new Scanner(System.in);
    public void showMessage(String smg) {
        System.out.println("Vao showMessage View ");
        System.out.println(smg);
    }
    public Model getUserInfo() {
        System.out.println("Vao getuserinfo View ");
        Model user = new Model();
        System.out.print("Username: ");
        user.setUserName(scanner.next());
        System.out.print("Password: ");
        user.setPassword(scanner.next());
        return user;
    }
}
