public class setIthbit {
    public static void main(String[] args) {
        int n = 10; 
        int i = 2; 

        int n1 = n | (1 << i); 

        System.out.println(n1);
    }
}
