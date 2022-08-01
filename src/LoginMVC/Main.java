package LoginMVC;

public class Main {
    public static void main(String[] args) {
        View view = new View();
        Controller control = new Controller(view);
        // goi ham login
        control.login();
    }
}
