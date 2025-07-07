import java.util.ArrayList;

public class subset {

    public static void generateSubsets(int[] arr, ArrayList<Integer> current, int index) {
        if (index == arr.length) {
            System.out.println(current); // Print the current subset
            return;
        }

        // Include the current element
        current.add(arr[index]);
        System.out.println("Before generate subset" + index); 
        generateSubsets(arr, current, index + 1);
        System.out.println("before remove" + index);
        // Backtrack and exclude the current element
        current.remove(current.size() - 1);
        System.out.println("After remove" + index); 
        generateSubsets(arr, current, index + 1);
        System.out.println("After generate subset" + index); 
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println("Subsets of the array:");
        ArrayList<Integer> current = new ArrayList<>();
        generateSubsets(arr, current, 0);
    }
}
