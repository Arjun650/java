import java.util.Arrays;

public class PrimeFactorization {
    public static void main(String[] args) {
        int n = 30; 

        int[] arr = new int[n + 1]; 
        Arrays.fill(arr, 1); 
        arr[0] = arr[1] = 0; // 0 and 1 are not prime

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (arr[i] == 1) {
                for (int j = i * 2; j <= n; j += i) {
                    arr[j] = 0; 
                }
            }
        }

        // Print primes
        System.out.print("Primes up to " + n + ": ");
        for (int i = 2; i <= n; i++) {
            if (arr[i] == 1) {
                System.out.print(i + " ");
            }
        }
    }
}
