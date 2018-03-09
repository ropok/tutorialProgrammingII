import java.util.LinkedList;

public class SnQ{
    public static void main(String[] args){
        System.out.println("Great");
    }
}

class StackAndQueue<E>{

    LinkedList list = new LinkedList();
    public void push(E e){
        list.addFirst(e);
    }
}