package Day11.Test;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello World!");

        ThreadOne threadOne = new ThreadOne();
        threadOne.start();
        threadOne.join();
        ThreadTwo threadTwo = new ThreadTwo();
        threadTwo.start();
//        try {
//            Thread.sleep(5000);
//            threadOne.stop();
//            threadTwo.stop();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        System.out.println("goodbye World!");
    }
}
