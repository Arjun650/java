import java.util.Arrays;

public class AsteroidCollision {
    public static void main(String[] args) {
        int[] arr = {5, 10, -5}; 
        int[] res = new int[arr.length]; 
        int j = 0;  // pointer to last element in res
        res[j] = arr[0]; 

        for (int i = 1; i < arr.length; i++) {
            int asteroid = arr[i];

            // collision handling
            while (j >= 0 && asteroid < 0 && res[j] > 0) {
                if (res[j] < -asteroid) {
                    // previous asteroid explodes
                    j--;
                } else if (res[j] == -asteroid) {
                    // both explode
                    j--;
                    asteroid = 0; // current asteroid also destroyed
                    break;
                } else {
                    // current asteroid explodes
                    asteroid = 0;
                    break;
                }
            }

            if (asteroid != 0) {
                res[++j] = asteroid; // place surviving asteroid
            }
        }

        // print surviving asteroids
        System.out.println(Arrays.toString(Arrays.copyOf(res, j + 1)));
    }
}
