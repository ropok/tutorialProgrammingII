
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
        // list.print();
        list.remove("30");
        list.remove("DANK");

        // list.deleteLast();
        // list.deleteLast();
        // list.deleteFirst();
        // list.deleteFirst();
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

        // public E deleteLast(){
        //     aNode<E> last = tail.data;
        //     tail.next = last.next;
        //     return last.data;
        // }

        public E deleteFirst(){
            aNode<E> first  = head.next;
            head.next = first.next;
            return first.data;
        }

        // public E remove(){
        //     // // System.out.println("bomo");
        //     // return "class";
            
        // }

        //         public void print(){
        //     //curr = current;
        //     aNode<E> curr = head.next;
        //     while(curr.next != null){    
        //         System.out.println(curr.data);
        //         curr = curr.next;
        //     }
        // }


        // private aNode<E> curr1 = head.next;
        // private aNode<E> del = curr1.next;

        // public void remove(E e){
        //     while(curr1.next != null){
        //         if(curr1.data == e){
        //             curr1.next = del.next;
        //             delData();
        //         }
        //     }
        // }
        // public E delData(){
        //     return del.data;

        // }

        // public void remove(E e){
        //     aNode<E> curr = head.next;
        //     curr = null;
        //     // while(curr.next != null){
        //     //     if(curr.data == e){
        //     //         aNode<E> del = curr.next;
        //     //         curr.next = del.next;
        //     //         // return del.data;
        //     //     }
        //     // }
        // }

        // private E abc;
        // public E remove(String abc){
        //     aNode<E> curr = head.next;
        //     aNode<E> prev = curr;
        //     // aNode<E> trash = new aNode<E>();
        //     while(curr.next != null){
        //         if(curr.data == abc){
        //             // trash.data = curr.data;
        //             prev.next = curr.next;
        //             return curr.data;
        //         }
        //         prev = curr;
        //         curr = curr.next;
        //     }
        // }

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