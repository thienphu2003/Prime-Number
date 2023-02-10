public class Main2 {
    public static void main(String[] args) {
        OptimizedPrimeFactorization optimizedPrimeFactorization = new OptimizedPrimeFactorization(6);
        Thread thread = new Thread(optimizedPrimeFactorization);
        thread.start();
    }
}
