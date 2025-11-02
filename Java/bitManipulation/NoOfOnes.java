public class NoOfOnes{
    public static void main(String[] args) {
        int n = 5;
        
        while(true){
            n = n + 1; 
            int val = getZeros(n); 

            if(val == 0){
                System.out.println("Value is " + n);
                break; 
            }

        }
    }


    public static int getZeros(int n){
        int count = 0;  

        while(n != 0){
            if((n & 1) == 0){
                count++; 
            }
            n = n >> 1;  
        }

        return count; 
    }
}