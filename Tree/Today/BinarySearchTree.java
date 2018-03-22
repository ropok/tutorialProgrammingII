

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

    public boolean contains(int value){
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
        System.out.println(data);
        if (right != null) {
            right.printInOrder();
        }
    }

    public void printPreOrder(){
        // PreOrder = 10 5 8 15
        System.out.println(data);
        if (left != null){
            left.printInOrder();
        }
        if (right != null) {
            right.printInOrder();
        }
    }

    // public void find(int value){
    //     if (value == data) System.out.println("We found the data!");
    //     else if (value < data){
    //         if (left == null){
    //             return false;
    //         }
    //     }
    // }
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
        System.out.println("GOOD");
        BinarySearchTree tree = new BinarySearchTree();
        tree.root = new Node(10);
        tree.root.insert(5);
        tree.root.insert(8);
        tree.root.insert(15);
        tree.root.printPreOrder();
    }
}