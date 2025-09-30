public class UniquePathRecursion {
    public static void main(String[] args) {
        int m = 3; 
        int n = 7; 

        System.out.println(findUniquepath(m - 1, n - 1));
    }

    public static int findUniquepath(int m, int n){
        if(m == 0 && n == 0){
            return 1;
        }
        if( m < 0 || n < 0){
            return 0; 
        }

        int up = findUniquepath(m - 1, n); 
        int left = findUniquepath(m, n - 1); 


        return left + up; 
    }
}
