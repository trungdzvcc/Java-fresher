package Day11.Excercise.FindPrime;

public class OptimizedPrimeFactorization implements  Runnable{

    @Override
    public void run() {
        int n = 100;
        System.out.println("Optimized Prime Factorization");
        for(int i = 0; i < n; i++){
            if (isPrime(i)){
                System.out.println("Prime OptimizedPrimeFactorization: " + i);
            }
        }

    }

    public boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
