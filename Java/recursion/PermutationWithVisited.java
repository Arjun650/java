
import java.util.ArrayList;
import java.util.List;

public class PermutationWithVisited {
    public static void permute(int[] nums, boolean[] visited, List<Integer> current, List<List<Integer>> result) {
        if (current.size() == nums.length) {
            System.out.println("Added to result"); 
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.println("inside loop"+ i); 
            if (!visited[i]) {
                System.out.println("inside if" + i); 
                visited[i] = true;
                System.out.println(visited[i]  + "  " + i); 
                System.out.println("before current add" + i); 
                current.add(nums[i]);
                System.out.println(current); 
                System.out.println("after current add" + i); 
                
                permute(nums, visited, current, result);
                System.out.println("before remove" + i); 
                current.remove(current.size() - 1); // backtrack
                System.out.println("after remove" + i); 
                visited[i] = false;
                System.out.println(visited[i]  + "  " + i); 

            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = new ArrayList<>();
        permute(nums, new boolean[nums.length], new ArrayList<>(), result);

        for (List<Integer> p : result) {
            System.out.println(p);
        }
    }
}
