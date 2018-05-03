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
        tree.root = new Node(23);
        tree.root.insert(30);
        tree.root.insert(44);
        tree.root.insert(42);
        tree.root.insert(93);
        tree.root.insert(21);
        tree.root.insert(56);
        tree.root.insert(89);
        tree.root.insert(2);
        tree.root.insert(34);
        tree.root.insert(46);
        tree.root.insert(98);
        tree.root.insert(50);
        tree.root.insert(45);
        tree.root.insert(65);
        tree.root.insert(14);
        // System.out.print(tree.root.contains(24)); // Try to find 24 value
        System.out.print("PreOrder : "); tree.root.printPreOrder();
        System.out.println();
        System.out.print("InOrder : "); tree.root.printInOrder();
        System.out.println();
        System.out.print("PostOrder : "); tree.root.printPostOrder();
    }
}