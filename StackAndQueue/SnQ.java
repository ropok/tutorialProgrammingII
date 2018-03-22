import java.util.LinkedList;

public class SnQ{
    public static void main(String[] args){
        System.out.println("Great");
        StackAndQueue<String> snq = new StackAndQueue<String>();
        snq.push("A");
        snq.push("A");
        // System.out.println(snq);
        // snq.print();
    }
}

class StackAndQueue<E>{

    LinkedList<E> list = new LinkedList<E>();
    public void push(E e){
        list.add(e);
    }

    // public void print(){
    //     list.print();
    // }
}