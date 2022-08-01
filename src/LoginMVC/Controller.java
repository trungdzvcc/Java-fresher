package LoginMVC;

public class Controller {
    private View view;

    public Controller(View view) {
        this.view = view;
    }

    public void login() {
        System.out.println("Vao login controller  ");
        while (true) {
            Model user = view.getUserInfo();
            if (checkLogin(user)) {
                view.showMessage("success!");
                break;
            } else {
                view.showMessage("wrong username or password!");
            }
        }
    }

    private boolean checkLogin(Model user) {
        System.out.println("Vao checklogin controoler  ");
        if ((user.getUserName().equals("admin"))
                && (user.getPassword().equals("admin"))) {
            return true;
        }
        return false;
    }

    public View getView() {
        System.out.println("Vao get view controller ");
        return view;
    }

    public void setView(View view) {
        System.out.println("Vao set view controller ");
        this.view = view;
    }
}
