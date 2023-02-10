public class Main {
    public static void main(String[] args) {
        LazyPrimeFactorization lazyPrimeFactorization = new LazyPrimeFactorization();
        Thread thread = new Thread(lazyPrimeFactorization);
        thread.start();
        LazyPrimeFactorization lazyPrimeFactorization2 = new LazyPrimeFactorization();
        Thread thread1 = new Thread(lazyPrimeFactorization2);
        thread1.start();
    }
}
