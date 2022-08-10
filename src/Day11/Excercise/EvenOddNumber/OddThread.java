package Day11.Excercise.EvenOddNumber;

public class OddThread extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for (int i = 0; i < 10; i++) {
            if(i%2!=0){
                System.out.println("Odd number : "+i);
            }
        }
    }
}
