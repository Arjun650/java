
import java.util.*;

// Definition of TreeNode
class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class BinaryTreeExample {


    public static void leftBoundaryTraversal(TreeNode root, List<Integer> left) {
        if (root == null || (root.left == null && root.right == null)) {
            return; // Do not include null or leaf nodes
        }

        left.add(root.val); // Add current node

        if (root.left != null) {
            leftBoundaryTraversal(root.left, left); // Prefer left
        } else {
            leftBoundaryTraversal(root.right, left); // Fallback to right if no left child
        }
    }

    public static void leafTraversal(TreeNode root, List<Integer> leaf){
        if(root == null){
            return; 
        }

        if(root.left == null && root.right == null){
            leaf.add(root.val); 
        }

        leafTraversal(root.left, leaf);
        leafTraversal(root.right, leaf);
    }

    public static void rightTraversal(TreeNode root, Stack<Integer> st){
        if (root == null || (root.left == null && root.right == null)) {
            return; // Do not include null or leaf nodes
        }

        st.push(root.val); // Add current node

        if (root.right != null) {
            rightTraversal(root.right, st); // Prefer left
        } else {
            rightTraversal(root.left, st); // Fallback to right if no left child
        }
    }

    public static void main(String[] args) {
        /*
                Sample Tree:
                      1
                     / \
                    2   3
                   / \   \
                  4   5   6
         */

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.right.right = new TreeNode(6);
        Stack<Integer> st = new Stack<>(); 

        List<Integer> lft = new ArrayList<>();
        leftBoundaryTraversal(root, lft);
        leafTraversal(root, lft);
        rightTraversal(root, st);

        while(!st.isEmpty()){
            int val = st.pop(); 
            lft.add(val);
        }
        System.out.println(lft);

    }
}
