class ithbitsetornot{
    public static void main(String[] args) {
        int n = 12; 
        int i = 1; 
        boolean result = (n & (1 << i)) != 0; 
        System.out.println(result); 
    }
}