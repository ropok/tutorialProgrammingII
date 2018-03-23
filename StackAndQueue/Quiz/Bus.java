import java.util.LinkedList;
import java.util.Scanner;

public class Bus{
    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        int quantity = sc.nextInt();
        for(int i = 0; i < quantity;i++){
            String bus = sc.next();
            if (bus.equals("pop")) list.removeFirst(); // pop
                else list.addFirst(bus); // push
        }
        System.out.println(list);
    }
}