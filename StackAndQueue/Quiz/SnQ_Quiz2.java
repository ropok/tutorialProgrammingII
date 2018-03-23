import java.util.LinkedList;
import java.util.Scanner;


public class SnQ_Quiz2{
    public static void main(String[] args){
        String bus;
        int quantity;
        Scanner input = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();
        // input.close();
        // bus = input.next();
        // while(!bus.isEmpty()) {bus = input.next(); break;}
        // for(bus = input.nextLine(); !bus.isEmpty();){
        //     bus = input.next();
        // }
        // bus = input.next();
        // while(bus = input.hasNext()) bus = input.next();
        // while(true){
        //     bus = input.nextLine();
        //     if (bus == "stop") break;
        // }
        // // while(bus != "stop"){
        // //     bus = input.next();
        // // }

        // System.out.println("done");

        // if(bus == "pop") list.removeFirst();
        // else if (bus == "stop") System.out.println(list);
        // else {
        //     bus = input.next();
        //     list.addFirst(bus);
        // }
        quantity = input.nextInt();
        for(int i = 0;i<quantity;i++){
            bus = input.next();
            if(bus.equals("pop")) list.removeFirst();
                else list.addFirst(bus);
        }
        System.out.println(list);

    }
}