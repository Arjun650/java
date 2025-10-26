import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

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
        
        List<List<Integer>> wrapList = new ArrayList<>(); 
        if(node == null){
            return wrapList; 
        }

        Queue<Node> qu = new LinkedList<>(); 

        qu.offer(node); 

        while(!qu.isEmpty()){
            int quSize = qu.size();
            List<Integer> list = new ArrayList<>(); 

            for(int i = 0; i < quSize; i++){
                Node ele = qu.poll(); 
                list.add(ele.data);  
                if(ele.left != null){
                    qu.offer(ele.left); 
                }

                if(ele.right != null){
                    qu.offer(ele.right); 
                }
            }
            wrapList.add(list); 
        }

        return wrapList; 
    }

    public static List<Integer> iterativePreOrder(Node node){
        Stack<Node> st = new Stack<>(); 
        List<Integer> list = new ArrayList<>(); 

        st.push(node);

        while(!st.isEmpty()){
            Node nd = st.pop(); 

            list.add(nd.data); 

            if(nd.right != null){
                st.push(nd.right); 
            }
            if(nd.left != null){
                st.push(nd.left); 
            }
        }

        return list; 
    }

    public static List<Integer> iterativeInOrder(Node node){
        Stack<Node> st = new Stack<>(); 
        List<Integer> list = new ArrayList<>(); 
        Node temp = node; 
        while(true){
            if(temp != null){
                st.push(temp); 
                temp = temp.left; 
            }
            else{
                if(st.isEmpty()){
                    break; 
                }
                temp = st.pop(); 
                list.add(temp.data); 
                temp = temp.right; 
            }
        }
        return list; 
    }

    public static Stack<Node> iterativePostOrder(Node node){
        Stack<Node> st1 = new Stack<>(); 
        Stack<Node> st2 = new Stack<>(); 
        st1.push(node); 

        while(!st1.isEmpty()){
            Node temp = st1.pop(); 
            st2.push(temp); 
            if(temp.left != null){
                st1.push(temp.left); 
            }
            if(temp.right != null){
                st1.push(temp.right); 
            }
        }
        return st2;  
    }

    public static List<Integer> interativePostOrder2Stack(Node node){
    Stack<Node> st = new Stack<>(); 
    List<Integer> list = new ArrayList<>(); 
    Node temp = null; // temp will track last visited node

    while(node != null || !st.isEmpty()){
        if(node != null){
            st.push(node); 
            node = node.left; 
        }
        else{
            temp = st.peek().right; 

            if(temp == null){ // right child is null, visit node
                temp = st.pop(); 
                list.add(temp.data); 

                // check if we have already visited right child of parent
                while(!st.isEmpty() && st.peek().right == temp){
                    temp = st.pop(); 
                    list.add(temp.data); 
                }
            }
            else{
                node = temp; // move to right child
            }
        }
    }

    return list; 
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

        List<Integer> res = Node.interativePostOrder2Stack(root);
        for(Integer nd: res){
            System.out.println(nd);
        }

    }
}


