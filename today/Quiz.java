
// Create program linked list using java to :
// -insert first : 20,45,56,80 then display/print
// -insert last : 11,14 then display/print
// -delete last then display/print
// -delete first then display/print
// at the last delete 56 and then display/print

public class Quiz{
    public static void main (String[] args){
        // System.out.println("Test");
        Node<String> list = new Node<String>();
        list.insertFirst("80");
        list.insertFirst("56");
        list.insertFirst("45");
        list.insertFirst("20");
        
        list.insertLast("11");
        // list.insertLast("56");
        list.insertLast("14");
        // list.insertLast("56");
        // System.out.println(list);
        list.deleteLast();
        list.deleteFirst();
        list.remove("56");
        list.print();
    }
}
//  <E> : Generic Java / Abstract Data Type
class Node<E>{

    static class aNode<E>{
        E data;
        aNode<E> next;
    }

    private aNode<E> head;
    private aNode<E> tail;


    public Node(){
        this.head = new aNode<E>();
        this.tail = new aNode<E>();
        head.next = tail;
    }

    public void insertFirst(E e){
        aNode<E> node = new aNode<E>(); // make a new node
        node.next = head.next; // replace the head with the new node
        node.data = e;         // fill the data as we input
        head.next = node;      // confirmation new head.
    }

    public void insertLast(E e){
        aNode<E> node = new aNode<E>();
        tail.data = e;
        tail.next = node;
        tail = node;
    }

    public void print(){
        aNode<E> curr = head.next;
        while(curr.next != null){
            System.out.println(curr.data);
            curr = curr.next;
        }
    }

    public E deleteLast(){
        aNode<E> curr = head.next;
        aNode<E> prev = curr;
        while(curr.next != null){
            prev = curr;
            curr = curr.next;
        }
        prev.next = null;
        return prev.data;
    }

    public E deleteFirst(){
        aNode<E> first = head.next;
        head.next = first.next;
        return first.data;
    }

    public void remove(E e){
        aNode<E> curr = head.next;
        aNode<E> prev = curr;
        while(curr.next != null){
            if(curr.data == e){
                prev.next = curr.next;
            }
            prev = curr;
            curr = curr.next;
        }
    }
}