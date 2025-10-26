import java.util.ArrayList;
import java.util.List;

class Node {
    Node left;
    Node right;
    int data;

    Node(int data) {
        this.data = data;
    }

}

public class RootToNodePath {
    public static boolean findRootToNodePath(Node root, Node dest, List<Integer> res) {
        if (root == null) {
            return false;
        }

        // Add current node to path
        res.add(root.data);

        // If this is the destination node, path is complete
        if (root == dest) {
            return true;
        }

        // Recurse left and right
        if (findRootToNodePath(root.left, dest, res) || findRootToNodePath(root.right, dest, res)) {
            return true;
        }

        // Backtrack if not found
        res.remove(res.size() - 1);
        return false;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        List<Integer> arr = new ArrayList<>();

        RootToNodePath.findRootToNodePath(root, root.left.right, arr);

        System.out.println(arr);
    }
}
