public class Tree2{

    public static void main(String[] args){
        Node<E> root = new Node<E>();

        System.out.println("lets do some shits");
    }
}

class Node<E>{
    E data;
    Node left,right;

    public Node(E data){
        this.data = data;
        left = right = null;
    }
}