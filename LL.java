
// Create program linked list using java to :
// -insert first : 20,45,56,80 then display/print
// -insert last : 11,14 then display/print
// -delete last then display/print
// -delete first then display/print
// at the last delete 56 and then display/print

public class LL{
    public static void main(String[] args){
        Node<String> list = new Node<String>();
        // System.out.println("Send nodes");
        list.addLast("DANK");
        list.addFirst("20");
        list.addFirst("30");
        list.addFirst("40");
        list.addLast("BORN");
        list.print();

        // list.deleteLast();
        // list.deleteLast();
        list.deleteFirst();
        list.deleteFirst();
        list.print();


        // System.out.println(list);
    }
}

    class Node<E>{

        static class aNode<E>{
            E data;
            aNode<E> next;
        }

        private aNode<E> head;
        private aNode<E> tail;

        public Node(){
            // System.out.println("TEST");
            this.head = new aNode<E>();
            this.tail = new aNode<E>();
            head.next = tail;
        }
        
        public void addFirst(E e){
            aNode<E> node = new aNode<E>();
            // we want to replace the new head
            node.next = head.next;
            node.data = e;
            head.next = node;
        }

        public void addLast (E e){
            aNode<E> node = new aNode<E>();
            tail.data = e;
            tail.next = node;
            tail = node;
        }

        public void print(){
            //curr = current;
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
            aNode<E> first  = head.next;
            head.next = first.next;
            return first.data;
        }

    }