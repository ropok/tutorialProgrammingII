import java.util.Stack;

public class djikstra3{
    public static void main(String[] args){
        System.out.println("Hello Djikstra");

        // Stack
        Stack<Integer> best = new Stack<Integer>();

        // Variable Array to store the edge's value
        // [vert1][vert2]
        int[][] route;
        int start, finish;
        int destination, currVert;
        int size = 4;
        int newEdge;
        int[] edge,pointEdge;
        edge = new int[size];
        pointEdge = new int[size];
        route = new int[size][size];
        // edgeTable = new int[size][size];
        // anArray[1][1] = 100;
        // System.out.println(anArray[1][2]);

        // -- Init edges (the route)
        route[0][1] = 1;
        route[0][2] = 2;
        route[0][3] = 10;
        route[2][3] = 2;

        // -- Start the tabeling
        start = 0;
        finish = 2;
        for (int i=0;i<size;i++){ // currVert
            currVert = i;
            // System.out.print(currVert);
                for (int j=0;j<size;j++){ // the destination
                    destination = j;
                if(destination != start){
                    if(route[currVert][destination]!=0){
                        newEdge = edge[currVert] + route[currVert][destination];
                        System.out.println(currVert + " -> " + destination + " " + newEdge);
                        
                        if(newEdge <= edge[destination]){ // Found the shorter one
                            edge[destination] = newEdge;
                            // best.push(currVert);
                            
                        }
                        else edge[destination] = newEdge;
                        // if(newEdge != 0 && newEdge <= edge[destination]){
                        //     edge[destination] = newEdge;
                        //     // pointEdge[currVert] = currVert;
                        // }
                            // System.out.println(destination + " " + newEdge);
                        // System.out.println(edge[currVert]);
                        // System.out.println(route[currVert][destination]);
                    }
                }
            }
        }
        System.out.println(edge[finish]);

        // best.push(3);
        // best.push(0);
        // best.push(1);
        // System.out.println(best);

        // if(anArray[1][2] == 0){
        //     System.out.println("'null'");
        // }
    }
}