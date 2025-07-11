package  trees; 
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class iterativePreorder {

    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
            left = right = null;
        }
    }

    public static List<Integer> preOrderTraversal(TreeNode root, List<Integer> res){
        if(root == null){
            return res;
        }

        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        while(!st.isEmpty()){
            TreeNode temp = st.pop();
            res.add(temp.val);

            if(temp.right != null){
                st.push(temp.right);
            }

            if(temp.left != null){
                st.push(temp.left);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1); 
        root.left = new TreeNode(2); 
        root.right = new TreeNode(7); 
        root.left.left = new TreeNode(3); 
        root.left.right = new TreeNode(4); 
        root.left.right.left = new TreeNode(5); 
        root.left.right.right = new TreeNode(6); 

        List<Integer> res = new ArrayList<>(); 
        preOrderTraversal(root, res); 
        System.out.println(res); 
    }
}
