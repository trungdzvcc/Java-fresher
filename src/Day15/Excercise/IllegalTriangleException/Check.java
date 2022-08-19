package Day15.Excercise.IllegalTriangleException;

public class Check{
    // Ham kiem tra tam giac hop l

    public void checkTriangleEdges(double a, double b, double c) throws IllegalTriangleException {
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalTriangleException("Loi: 3 canh tam giac khong hop le!");
        } else {
            System.out.println("Tam giac hop le!");
        }
    }
}
