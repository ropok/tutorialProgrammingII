// From Youtube Tree - HackerRank + GeeksforGeeks Tree Traversal (link in Readme.md)

class Node {
    Node left, right;
    int data;
    public Node(int data){
        this.data = data;
    }

    public void insert(int value){
        if(value <= data){
            if(left == null) left = new Node(value);
            else left.insert(value);
        }
        else {
            if (right == null) right = new Node(value);
            else right.insert(value);
        }
    }

    public boolean contains(int value){ // Will return true if found, else false.
        if (value == data) {
            return true;
        } else if (value < data) {
            if (left == null){
                return false;
            } else {
                return left.contains(value);
            }
        } else {
            if (right == null){
                return false;
            } else {
                return right.contains(value);
            }
        }
    }

    public void printInOrder(){
        if (left != null){
            left.printInOrder();
        }
        System.out.print(data + " ");
        if (right != null) {
            right.printInOrder();
        }
    }

    public void printPreOrder(){
        // PreOrder = 10 5 8 15
        System.out.print(data + " ");
        if (left != null){
            left.printPreOrder();
        }
        if (right != null) {
            right.printPreOrder();
        }
    }

    public void printPostOrder(){
        if (left != null){
            left.printPostOrder();
        }
        if (right != null){
            right.printPostOrder();
        }
        System.out.print(data + " ");
    }
}


public class BinarySearchTree{
    Node root;

    BinarySearchTree(int data){
        root = new Node(data);
    }

    BinarySearchTree(){
        root = null;
    }

    public static void main(String[] args){
        // System.out.println("GOOD");
        BinarySearchTree tree = new BinarySearchTree();
        tree.root = new Node(25);
        tree.root.insert(15);
        tree.root.insert(50);
        tree.root.insert(10);
        tree.root.insert(22);
        tree.root.insert(35);
        tree.root.insert(70);
        tree.root.insert(4);
        tree.root.insert(12);
        tree.root.insert(18);
        tree.root.insert(24);
        tree.root.insert(31);
        tree.root.insert(44);
        tree.root.insert(66);
        tree.root.insert(90);
        System.out.print(tree.root.contains(24)); // Try to find 24 value
        // tree.root.printInOrder();
        // tree.root.printPreOrder();
        // tree.root.printPostOrder();
    }
}