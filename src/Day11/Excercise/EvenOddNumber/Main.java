package Day11.Excercise.EvenOddNumber;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        EvenThread evenThread = new EvenThread();
        OddThread oddThread = new OddThread();
        oddThread.start();
        evenThread.join();
        evenThread.start();
    }
}
