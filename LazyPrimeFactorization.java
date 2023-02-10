import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LazyPrimeFactorization implements Runnable {
    @Override
    public void run() {
        int number = Integer.parseInt(new Scanner(System.in).nextLine());
        List<Integer> factors = new ArrayList<>();
        synchronized (factors) {
            for (int i = 2; i <= number; i++) {
                while (number % i == 0) {
                    factors.add(i);
                    number /= i;
                }
            }
        }
            // Log or print the prime factors
            System.out.println(factors);
    }


}
