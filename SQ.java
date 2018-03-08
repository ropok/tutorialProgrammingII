
import java.util.*;

public class SQ{
    public static void main(String[] args){
        System.out.println("TEST");
        LinkedList<String> list = new LinkedList<String>();
        list.add("22");
        System.out.println(list);

        StackQueue<Integer> snq = new StackQueue<Integer>();
        // Stack
        snq.push(1);
        snq.push(3);
        snq.pop();

        //  Queue
        snq.enqueue(2);
        snq.enqueue(7);
        snq.dequeue();
    }
}

class StackQueue<E>{
    LinkedList ll = new LinkedList();

    // Stack
    public void push(E e){
        ll.addFirst(e);
    }
    public void pop(E e){
        ll.deleteLast(e);
    }


    //  Queue
    public void enqueue(E e){
        ll.addFirst(e);
    }
    public void dequeue(E e){
        ll.deleteFirst(e);
    }
}