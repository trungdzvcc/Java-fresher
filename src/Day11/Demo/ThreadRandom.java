package Day11.Demo;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadRandom extends Thread{
    SharedData  sharedData ;

    public ThreadRandom(SharedData sharedData) {
        this.sharedData = sharedData;
    }

    @Override
    public void run() {
        Random random = new Random();
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        while (sharedData.checkAvaiable()) {
            synchronized (sharedData) {
                int rad = random.nextInt(100) + 1;
                sharedData.setRad(rad);
                sharedData.plus(rad);
                System.out.println("T1 >> " + rad);
                // thiet lap luong chay
                if (rad % 3 == 0) {
                    sharedData.setIndex(2);
                } else {
                    sharedData.setIndex(3);
                }
                //sync
                sharedData.notifyAll();
                try {
                    sharedData.wait();
                } catch (InterruptedException e) {
                    Logger.getLogger(ThreadRandom.class.getName()).log(Level.SEVERE, null, e.getMessage());
                }

            }
        }
    }
}
