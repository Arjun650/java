import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void findTarget(int[] arr, int ind, int tar, List<List<Integer>> res, List<Integer> temp){
        if(tar == 0){
            res.add(new ArrayList<>(temp)); // add a copy of temp
            return;
        }
        if(ind == arr.length || tar < 0){
            return; 
        }

        temp.add(arr[ind]);
        findTarget(arr, ind, tar - arr[ind], res, temp);

        temp.remove(temp.size() - 1);

        findTarget(arr, ind + 1, tar, res, temp);
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 6, 7}; 
        int target = 7; 
        List<List<Integer>> res = new ArrayList<>(); 
        List<Integer> temp = new ArrayList<>(); 
        findTarget(arr, 0, target, res, temp); 

        System.out.println(res);
    }
}
