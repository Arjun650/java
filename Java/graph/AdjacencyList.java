import java.util.ArrayList;
import java.util.List;

public class AdjacencyList {
    public static void main(String[] args) {
        int[][] adjMatrix = {
            {0, 1, 1, 0, 0, 0},
            {1, 0, 0, 1, 1, 0},
            {1, 0, 0, 0, 1, 0},
            {0, 1, 0, 0, 0, 1},
            {0, 1, 1, 0, 0, 1},
            {0, 0, 0, 1, 1, 0}
        };

        int len = adjMatrix.length; 
        List<Integer>[] adjL = new ArrayList[len]; 

        for(int i = 0; i < len; i++){
            adjL[i] = new ArrayList<>(); 
        }

        for(int i = 0; i < len; i++){
            for(int j = i + 1; j < len; j++){
                if(adjMatrix[i][j] == 1){
                    adjL[i].add(j); 
                    adjL[j].add(i); 
                }
            }
        }

        for(List<Integer> lst: adjL){
            System.out.println(lst);
        }
    }
}
