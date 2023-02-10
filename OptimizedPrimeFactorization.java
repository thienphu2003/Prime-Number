import java.util.ArrayList;
import java.util.List;

public class OptimizedPrimeFactorization implements Runnable{
    private int number;
    private List<Integer> factors;

    public OptimizedPrimeFactorization(int number) {
        this.number = number;
        this.factors = new ArrayList<>();
    }

    @Override
    public void run() {
        synchronized (factors) {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                while (number % i == 0) {
                    factors.add(i);
                    number /= i;
                }
            }
            if (number > 2) {
                factors.add(number);
            }
        }
        // Log or print the prime factors
        System.out.println(factors);
    }
}

