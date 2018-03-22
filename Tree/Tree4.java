public class Tree4{
    Node root;

    Tree4(int data){
        root = new Node(data);
    }

    Tree4(){
        root = null;
    }

        
    public static void main(String[] args){
        Tree4 tree = new Tree4();
        tree.root = new Node(10);
        tree.root.insert(5);
        tree.root.insert(15);
        tree.root.insert(8);
        // // tree.root.insert(10);
        // tree.insert(3);
        // tree.root.contains(1);
        tree.root.printPostOrder();
        System.out.println("BOOM!");
    }
}

class Node{
    Node left, right;
    int data;
    public Node(int data) {
        this.data = data;
    }

    public void insert(int value) {
        if (value <= data){
            if (left == null) {
                left = new Node(value);
            } else {
                left.insert(value);
            }
        } else {
            if (right == null) {
                right = new Node(value);
            } else {
                right.insert(value);
            }
        }
    }

    public boolean contains(int value){
        if (value == data){
            return true;
        } else if (value < data) {
            if (left == null) {
                return false;
            } else {
                return left.contains(value);
            }
        } else {
            if (right == null) {
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
        System.out.println(data);
        if (right != null){
            right.printInOrder();
        }
    }

    public void printPreOrder(){
        System.out.println(data);
        if (left != null){
            left.printInOrder();
        }
        if (right != null){
            right.printInOrder();
        }
    }

    public void printPostOrder(){
        if (left != null){
            left.printInOrder();
        }
        if (right != null){
            right.printInOrder();
        }
        System.out.println(data);
    }

    // }
    // public void contains(int value){
    //     if (value == data){
    //         // return true;
    //         System.out.println("found");
    //     } else if (value < data) {
    //         if (left == null) {
    //             // return false;
    //         } else {
    //             // return left.contains(value);
    //         }
    //     } else {
    //         if (right == null) {
    //             // return false;
    //         } else {
    //             System.out.println("found");
    //             // return right.contains(value);
    //         }
    //     }

    
}