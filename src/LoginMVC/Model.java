package LoginMVC;

public class Model {

    private String userName;
    private String password;

    public Model(String userName, String password) {
        System.out.println("Vao model  ");
        this.userName = userName;
        this.password = password;
    }

    public Model() {
        System.out.println("Vao model  ");

    }

    public String getUserName() {
        System.out.println("Vao getusername model  ");

        return userName;
    }

    public void setUserName(String userName) {
        System.out.println("Vao set username model  ");
        this.userName = userName;
    }

    public String getPassword() {
        System.out.println("Vao getuser pass model  ");
        return password;
    }

    public void setPassword(String password) {
        System.out.println("Vao set pass model  ");
        this.password = password;
    }



}
