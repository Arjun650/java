public class toggleithbit {
    public static void main(String[] args) {
        int n = 10; 
        int i = 3; 

        int res = n ^ (1 << i); 

        System.out.println(res); 
    }
}
