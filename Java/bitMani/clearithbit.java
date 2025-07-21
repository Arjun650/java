public class clearithbit {
    public static void main(String[] args) {
        int n = 14; 
        int i = 2; 

        int res = n & ~(1 << i); 

        System.out.println(res);
    }
}
