import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Node {
    int data; 
    Node left; 
    Node right; 

    Node(int data){
        this.data = data; 
    }

    public static void preOrder(Node node){
        if(node == null){
            return; 
        }

        System.out.println(node.data);
        preOrder(node.left);
        preOrder(node.right);
    }

    public static void postOrder(Node node){
        if(node == null){
            return; 
        }

        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.data);
    }

    public static void inOrder(Node node){
        if(node == null){
            return; 
        }
        inOrder(node.left);
        System.out.println(node.data);
        inOrder(node.right);
    }

    public static List<List<Integer>> levelOrder(Node node){
        Queue<Node> queue = new LinkedList<>(); 
        List<List<Integer>> wraplist = new ArrayList<>(); 

        if(node == null) return wraplist;

        queue.offer(node); 

        while(!queue.isEmpty()){
            int levelNum = queue.size(); 

            List<Integer> subList = new ArrayList<>(); 

            for(int i = 0; i < levelNum; i++){
                if(queue.peek().left != null){
                    queue.offer(queue.peek().left); 
                }
                if(queue.peek().right != null){
                    queue.offer(queue.peek().right); 
                }

                subList.add(queue.poll().data); 
            }
            wraplist.add(subList); 
        }

        return wraplist; 
    }



}

public class Tree1{
    public static void main(String[] args) {
        Node root = new Node(1); 
        root.left = new Node(2); 
        root.right = new Node(3); 
        root.left.left = new Node(4); 
        root.left.right = new Node(5); 
        root.right.left = new Node(6); 
        root.right.right = new Node(7); 

        List<List<Integer>> res = Node.levelOrder(root);
        System.out.println(res);

    }
}


