public class Tree3<E>{
    BinaryNode<E> root;

    // Tree3(E data){
    //     root = new BinaryNode(data);
    // }

    Tree3(){
        root = null;
    }

    // public static void main(String[] args){
    //     root.left = 1;
    // }
}


class BinaryNode<E>{
    E data;
    BinaryNode<E> left;
    BinaryNode<E> right;

    public BinaryNode(E data){
        this.data = data;
    }
}