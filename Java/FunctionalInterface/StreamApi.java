import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamApi {
    public static void main(String[] args) {
        List<Integer> ar = Arrays.asList(4, 2, 6, 234, 43, 23, 66, 1); 

        // ar.forEach(n -> System.out.println(n * n));
        // Integer[] arr = {1, 2, 3, 4,5}; '
        
        
        // Stream<Integer> s1 = ar.stream(); 
        // Stream<Integer> s2 = s1.filter(n -> n % 2 == 0); 
        // Stream<Integer> s3 = s2.map(n -> n * n); 
        // int res = s3.reduce(0, (a, b) -> a + b); 

        System.out.println(ar.stream().filter(n -> n % 2 == 0).map(n -> n * n).reduce(0, (c, e) -> c + e));
    }    
}
