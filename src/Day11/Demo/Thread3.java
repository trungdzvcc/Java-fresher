package Day11.Demo;

public class Thread3 extends Thread{
    SharedData sharedData;

    public Thread3(SharedData sharedData) {
        this.sharedData = sharedData;
    }

    @Override
    public void run() {

            while (sharedData.checkAvaiable()){
                synchronized (sharedData) {
                sharedData.notifyAll();
                try {
                    while (sharedData.getIndex()!=3)
                    sharedData.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                int rad = sharedData.getRad();
                if(rad%2==0){
                    if(rad%4==0){
                        System.out.println(rad+ " chia het cho 4");
                    }else {
                        System.out.println(rad+ " ko chia het cho 4");
                    }
                }else {
                    System.out.println("ko le");
                }
                sharedData.setIndex(1);
            }

        }

    }
}
