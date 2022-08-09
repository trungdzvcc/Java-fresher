package Day11.Demo;

public class Thread2 extends  Thread {
    SharedData sharedData;

    public Thread2(SharedData sharedData) {
        this.sharedData = sharedData;
    }

    @Override
    public void run() {

            while (sharedData.checkAvaiable()){
                synchronized (sharedData) {
                sharedData.notifyAll();
                try {
                    while (true){
                        sharedData.wait();
                        if(sharedData.getIndex()==2){
                            break;
                        }
                    }

                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                int rad = sharedData.getRad();
                if(rad%3==0){
                    rad*=rad;
                    System.out.println("T2 >> " + rad);
                }
            }
            new Thread(()->{
                System.out.println("hh");
            }).start();

        }

    }
}
