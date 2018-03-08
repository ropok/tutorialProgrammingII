
import java.util.LinkedList;

public class LinkedListDemo{
    public static void main(String[] args){

        LinkedList<String> llist = new LinkedList<>();

        /*
            STACK
            Push
        */
        llist.add("purple");
        llist.add("red");
        llist.add("green");
        llist.add("blue");
        llist.add("green");
        llist.add("yellow");
        // System.out.println("Size:" + llist.size());
        System.out.println("Push to the stack " + llist);
        /*
            STACK
            Pop
        */
        llist.removeLast();
        System.out.println("First Pop on Stack will be : " + llist);

        llist.clear();
        System.out.println();

        /*
            QUEUE
            Enqueue
        */
        llist.add("purple");
        llist.add("red");
        llist.add("green");
        llist.add("blue");
        llist.add("green");
        llist.add("yellow");
        // System.out.println("Size:" + llist.size());
        System.out.println("Enqueue to the stack " + llist);
        /*
            QUEUE
            Dequeue
        */
        llist.removeFirst();
        System.out.println("First Dequeue on Stack will be : " + llist);
    }
}

/*
    Stack and Queue Concept

    Stack - Last in First Out
    Push : LinkedList.add()
    Pop  : LinkedList.removeLast()

    Queue - First in First out
    Enqueue : LinkedList.add()
    Dequeue : LinkedList.removeFirst()
*/