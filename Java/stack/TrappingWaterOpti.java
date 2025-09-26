public class TrappingWaterOpti {
    public static void main(String[] args) {
        int[] heights = {4,2,0,3,2,5}; 

        int lmax = heights[0]; 
        int rmax = heights[heights.length - 1]; 

        int l = 0; 
        int r = heights.length - 1; 
        int total = 0; 

        while(l < r){
            if(heights[l] <= heights[r]){
                if(lmax > heights[l]){
                    total += (lmax - heights[l]); 
                }
                else{
                    lmax = heights[l]; 
                }
                l++; 
            }
            else{
                if(rmax > heights[r]){
                    total += (rmax - heights[r]); 
                }
                else{
                    rmax = heights[r]; 
                }
                r--; 
            }
        }

        System.out.println(total);
    }
}
