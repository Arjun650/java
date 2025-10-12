import java.util.Arrays;

public class AssignCookie {
    public static void main(String[] args) {
        int[] g = {2, 1, 3}; 
        int[] s = {1, 2}; 

        Arrays.sort(g); 
        Arrays.sort(s); 
        int count = 0; 
        int i = 0; 

        for(int cookie: s){
            if(i < g.length && cookie >= g[i] ){
                count++; 
                i++; 
            }
        }

        System.out.println(count);


    }
}
