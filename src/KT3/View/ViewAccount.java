package KT3.View;

public class ViewAccount {
    public static void showMenu() {
        System.out.println("-----------menu------------");
        System.out.println("1. Enter account into file");
        System.out.println("2. Print account list from file");
        System.out.println("3. Edit account ID");
        System.out.println("4. Delete account ID");
        System.out.println("5. Search account by name");
        System.out.println("6. Sort account by name");
        System.out.println("7. Deduction  (synchronize)");
        System.out.println("8. Raise   (synchronize)");
        System.out.println("0. exit.");
        System.out.println("---------------------------");
        System.out.print("Please choose: ");
    }
}
