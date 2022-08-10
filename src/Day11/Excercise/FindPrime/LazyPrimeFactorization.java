package Day11.Excercise.FindPrime;

public class LazyPrimeFactorization implements Runnable {

    public boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    @Override
    public void run() {
        System.out.println("LazyPrimeFactorization");
        int n = 100;
        for(int j = 0; j < n; j++){
            if (isPrime(j)){
                System.out.println("Prime LazyPrimeFactorization: " + j);
            }
        }
    }

}
