package Day8.Excercise;

import Day8.Excercise.Controller.ControllerProduct;
import Day8.Excercise.Controller.ControllerProductLinkedList;
import Day8.Excercise.View.ViewProduct;

public class MainProduct {
    public static void main(String[] args) {
        // Arraylist controller
//        ControllerProduct c = new ControllerProduct();
//        c.enterChoice();
        // LinkedList controller
        ControllerProductLinkedList controllerProductLinkedList = new ControllerProductLinkedList();
        controllerProductLinkedList.enterChoice();
}
}
