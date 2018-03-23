
class Node{
    int key; // Data
    Node left, right;

    public Node(int item){
        key = item;
        left = right = null;
    }
}

public class BasicTree{
    Node root;

    BasicTree(int key){
        root = new Node(key);
    }

    BasicTree(){
        root = null;
    }

    public static void main(String[] args){
        BasicTree tree = new BasicTree();
        
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);

        tree.root.left.left = new Node(4);


        System.out.println("Hello");
        
    }
}